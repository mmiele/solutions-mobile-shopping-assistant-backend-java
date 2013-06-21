/* Copyright (c) 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samplesolutions.mobileassistant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

/**
 * An entity for messsages sent from the web console to the registered devices
 * 
 * Its associated endpoint, MessageEndpoint.java, was NOT automatically generated 
 * from this class. While it is easy to generate endpoints automatically, you can
 * write an endpoint manually without generating it. You still need to generate
 * the associated client library from the endpoint when changes are made.
 * 
 * For more information on endpoints, see
 * http://developers.google.com/eclipse/docs/cloud_endpoints.
 */

@Entity
public class MessageData {

  /*
   * Autogenerated primary key
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Key key;
  
  /*
   * The text of the message sent
   */
  private String message;

  /*
   * Timestamp indicating when this device registered with the application.
   */
  private long timestamp;
  
  public Key getKey() {
    return key;
  }
  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }
}
