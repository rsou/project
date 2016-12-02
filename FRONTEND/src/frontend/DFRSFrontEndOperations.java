package frontend;


/**
* frontend/DFRSFrontEndOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/ramata/workspace/FRONTEND/frontend.idl
* vendredi 2 d�cembre 2016 13 h 39 EST
*/

public interface DFRSFrontEndOperations 
{
  String transferReservation (String passengerID, String currentCity, String otherCity);
  String bookFlight (String firstName, String lastName, String phoneNumber, String address, String destination, String dateOfFlight, String flightClass);
  String getBookedFlightCount (int recordType);
  String editFlightRecord (String recordID, String fieldName, String newValue);
  String allFlights ();
  String allBookings ();
  void shutDown ();
} // interface DFRSFrontEndOperations
