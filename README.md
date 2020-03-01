<h1>Java Hotel Modelling</h1>
<h2>Brief</h2>
<p>Build a booking system for a new hotel.</p>
<p>Use TDD in JUnit to model the hotel with Java classes, with separate test files for each class.</p>
<h2>MVP</h2>
<ul>
<li>Create a Guest class to represent a visitor to the hotel, they’ll at least need a name, you can add more properties later if and when they become necessary</li>
<li>Create 2 different types of rooms:
  <ul>
  <li>Bedrooms will have a room number, capacity, collection of Guests and a type (e.g. Single/Double.)
  <li>ConferenceRooms will have a capacity, collection of Guests, name and any other properties you wish.
  </ul>
</li>
<li>Create a Hotel class, which has collections of rooms of different types.</li>
<li>The Hotel will be able check guests in/out of rooms.</li>
</ul>
<h2>Extensions:</h2>
<ul>
<li>Create a Booking class which contains a Bedroom and a number of nights booked.</li>
<li>Create a bookRoom method in your Hotel. This should book a given Bedroom for a number of nights. This should return a new Booking object.</li>
<li>Add a nightly rate to your Bedrooms and write a method to return the total bill for the Booking.</li>
</ul>
<h2>Advanced Extensions:</h2>
<ul>
<li>Add functionality to the Hotel so it can return a collection of only the vacant Bedrooms.</li>
<li>Update the check-in process so that Hotel will only be able to check guests into empty Bedrooms.</li>
</ul>
