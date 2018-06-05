/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.sentry.provider.db.generic.service.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class TRenamePrivilegesRequest implements org.apache.thrift.TBase<TRenamePrivilegesRequest, TRenamePrivilegesRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TRenamePrivilegesRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRenamePrivilegesRequest");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REQUESTOR_USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("requestorUserName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COMPONENT_FIELD_DESC = new org.apache.thrift.protocol.TField("component", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SERVICE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("serviceName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField OLD_AUTHORIZABLES_FIELD_DESC = new org.apache.thrift.protocol.TField("oldAuthorizables", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField NEW_AUTHORIZABLES_FIELD_DESC = new org.apache.thrift.protocol.TField("newAuthorizables", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TRenamePrivilegesRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TRenamePrivilegesRequestTupleSchemeFactory());
  }

  private int protocol_version; // required
  private String requestorUserName; // required
  private String component; // required
  private String serviceName; // required
  private List<TAuthorizable> oldAuthorizables; // required
  private List<TAuthorizable> newAuthorizables; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROTOCOL_VERSION((short)1, "protocol_version"),
    REQUESTOR_USER_NAME((short)2, "requestorUserName"),
    COMPONENT((short)3, "component"),
    SERVICE_NAME((short)4, "serviceName"),
    OLD_AUTHORIZABLES((short)5, "oldAuthorizables"),
    NEW_AUTHORIZABLES((short)6, "newAuthorizables");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROTOCOL_VERSION
          return PROTOCOL_VERSION;
        case 2: // REQUESTOR_USER_NAME
          return REQUESTOR_USER_NAME;
        case 3: // COMPONENT
          return COMPONENT;
        case 4: // SERVICE_NAME
          return SERVICE_NAME;
        case 5: // OLD_AUTHORIZABLES
          return OLD_AUTHORIZABLES;
        case 6: // NEW_AUTHORIZABLES
          return NEW_AUTHORIZABLES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PROTOCOL_VERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REQUESTOR_USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("requestorUserName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMPONENT, new org.apache.thrift.meta_data.FieldMetaData("component", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVICE_NAME, new org.apache.thrift.meta_data.FieldMetaData("serviceName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OLD_AUTHORIZABLES, new org.apache.thrift.meta_data.FieldMetaData("oldAuthorizables", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TAuthorizable.class))));
    tmpMap.put(_Fields.NEW_AUTHORIZABLES, new org.apache.thrift.meta_data.FieldMetaData("newAuthorizables", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TAuthorizable.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRenamePrivilegesRequest.class, metaDataMap);
  }

  public TRenamePrivilegesRequest() {
    this.protocol_version = 2;

  }

  public TRenamePrivilegesRequest(
    int protocol_version,
    String requestorUserName,
    String component,
    String serviceName,
    List<TAuthorizable> oldAuthorizables,
    List<TAuthorizable> newAuthorizables)
  {
    this();
    this.protocol_version = protocol_version;
    setProtocol_versionIsSet(true);
    this.requestorUserName = requestorUserName;
    this.component = component;
    this.serviceName = serviceName;
    this.oldAuthorizables = oldAuthorizables;
    this.newAuthorizables = newAuthorizables;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRenamePrivilegesRequest(TRenamePrivilegesRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.protocol_version = other.protocol_version;
    if (other.isSetRequestorUserName()) {
      this.requestorUserName = other.requestorUserName;
    }
    if (other.isSetComponent()) {
      this.component = other.component;
    }
    if (other.isSetServiceName()) {
      this.serviceName = other.serviceName;
    }
    if (other.isSetOldAuthorizables()) {
      List<TAuthorizable> __this__oldAuthorizables = new ArrayList<TAuthorizable>(other.oldAuthorizables.size());
      for (TAuthorizable other_element : other.oldAuthorizables) {
        __this__oldAuthorizables.add(new TAuthorizable(other_element));
      }
      this.oldAuthorizables = __this__oldAuthorizables;
    }
    if (other.isSetNewAuthorizables()) {
      List<TAuthorizable> __this__newAuthorizables = new ArrayList<TAuthorizable>(other.newAuthorizables.size());
      for (TAuthorizable other_element : other.newAuthorizables) {
        __this__newAuthorizables.add(new TAuthorizable(other_element));
      }
      this.newAuthorizables = __this__newAuthorizables;
    }
  }

  public TRenamePrivilegesRequest deepCopy() {
    return new TRenamePrivilegesRequest(this);
  }

  @Override
  public void clear() {
    this.protocol_version = 2;

    this.requestorUserName = null;
    this.component = null;
    this.serviceName = null;
    this.oldAuthorizables = null;
    this.newAuthorizables = null;
  }

  public int getProtocol_version() {
    return this.protocol_version;
  }

  public void setProtocol_version(int protocol_version) {
    this.protocol_version = protocol_version;
    setProtocol_versionIsSet(true);
  }

  public void unsetProtocol_version() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID);
  }

  /** Returns true if field protocol_version is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocol_version() {
    return EncodingUtils.testBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID);
  }

  public void setProtocol_versionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID, value);
  }

  public String getRequestorUserName() {
    return this.requestorUserName;
  }

  public void setRequestorUserName(String requestorUserName) {
    this.requestorUserName = requestorUserName;
  }

  public void unsetRequestorUserName() {
    this.requestorUserName = null;
  }

  /** Returns true if field requestorUserName is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestorUserName() {
    return this.requestorUserName != null;
  }

  public void setRequestorUserNameIsSet(boolean value) {
    if (!value) {
      this.requestorUserName = null;
    }
  }

  public String getComponent() {
    return this.component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public void unsetComponent() {
    this.component = null;
  }

  /** Returns true if field component is set (has been assigned a value) and false otherwise */
  public boolean isSetComponent() {
    return this.component != null;
  }

  public void setComponentIsSet(boolean value) {
    if (!value) {
      this.component = null;
    }
  }

  public String getServiceName() {
    return this.serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public void unsetServiceName() {
    this.serviceName = null;
  }

  /** Returns true if field serviceName is set (has been assigned a value) and false otherwise */
  public boolean isSetServiceName() {
    return this.serviceName != null;
  }

  public void setServiceNameIsSet(boolean value) {
    if (!value) {
      this.serviceName = null;
    }
  }

  public int getOldAuthorizablesSize() {
    return (this.oldAuthorizables == null) ? 0 : this.oldAuthorizables.size();
  }

  public java.util.Iterator<TAuthorizable> getOldAuthorizablesIterator() {
    return (this.oldAuthorizables == null) ? null : this.oldAuthorizables.iterator();
  }

  public void addToOldAuthorizables(TAuthorizable elem) {
    if (this.oldAuthorizables == null) {
      this.oldAuthorizables = new ArrayList<TAuthorizable>();
    }
    this.oldAuthorizables.add(elem);
  }

  public List<TAuthorizable> getOldAuthorizables() {
    return this.oldAuthorizables;
  }

  public void setOldAuthorizables(List<TAuthorizable> oldAuthorizables) {
    this.oldAuthorizables = oldAuthorizables;
  }

  public void unsetOldAuthorizables() {
    this.oldAuthorizables = null;
  }

  /** Returns true if field oldAuthorizables is set (has been assigned a value) and false otherwise */
  public boolean isSetOldAuthorizables() {
    return this.oldAuthorizables != null;
  }

  public void setOldAuthorizablesIsSet(boolean value) {
    if (!value) {
      this.oldAuthorizables = null;
    }
  }

  public int getNewAuthorizablesSize() {
    return (this.newAuthorizables == null) ? 0 : this.newAuthorizables.size();
  }

  public java.util.Iterator<TAuthorizable> getNewAuthorizablesIterator() {
    return (this.newAuthorizables == null) ? null : this.newAuthorizables.iterator();
  }

  public void addToNewAuthorizables(TAuthorizable elem) {
    if (this.newAuthorizables == null) {
      this.newAuthorizables = new ArrayList<TAuthorizable>();
    }
    this.newAuthorizables.add(elem);
  }

  public List<TAuthorizable> getNewAuthorizables() {
    return this.newAuthorizables;
  }

  public void setNewAuthorizables(List<TAuthorizable> newAuthorizables) {
    this.newAuthorizables = newAuthorizables;
  }

  public void unsetNewAuthorizables() {
    this.newAuthorizables = null;
  }

  /** Returns true if field newAuthorizables is set (has been assigned a value) and false otherwise */
  public boolean isSetNewAuthorizables() {
    return this.newAuthorizables != null;
  }

  public void setNewAuthorizablesIsSet(boolean value) {
    if (!value) {
      this.newAuthorizables = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocol_version();
      } else {
        setProtocol_version((Integer)value);
      }
      break;

    case REQUESTOR_USER_NAME:
      if (value == null) {
        unsetRequestorUserName();
      } else {
        setRequestorUserName((String)value);
      }
      break;

    case COMPONENT:
      if (value == null) {
        unsetComponent();
      } else {
        setComponent((String)value);
      }
      break;

    case SERVICE_NAME:
      if (value == null) {
        unsetServiceName();
      } else {
        setServiceName((String)value);
      }
      break;

    case OLD_AUTHORIZABLES:
      if (value == null) {
        unsetOldAuthorizables();
      } else {
        setOldAuthorizables((List<TAuthorizable>)value);
      }
      break;

    case NEW_AUTHORIZABLES:
      if (value == null) {
        unsetNewAuthorizables();
      } else {
        setNewAuthorizables((List<TAuthorizable>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocol_version();

    case REQUESTOR_USER_NAME:
      return getRequestorUserName();

    case COMPONENT:
      return getComponent();

    case SERVICE_NAME:
      return getServiceName();

    case OLD_AUTHORIZABLES:
      return getOldAuthorizables();

    case NEW_AUTHORIZABLES:
      return getNewAuthorizables();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROTOCOL_VERSION:
      return isSetProtocol_version();
    case REQUESTOR_USER_NAME:
      return isSetRequestorUserName();
    case COMPONENT:
      return isSetComponent();
    case SERVICE_NAME:
      return isSetServiceName();
    case OLD_AUTHORIZABLES:
      return isSetOldAuthorizables();
    case NEW_AUTHORIZABLES:
      return isSetNewAuthorizables();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TRenamePrivilegesRequest)
      return this.equals((TRenamePrivilegesRequest)that);
    return false;
  }

  public boolean equals(TRenamePrivilegesRequest that) {
    if (that == null)
      return false;

    boolean this_present_protocol_version = true;
    boolean that_present_protocol_version = true;
    if (this_present_protocol_version || that_present_protocol_version) {
      if (!(this_present_protocol_version && that_present_protocol_version))
        return false;
      if (this.protocol_version != that.protocol_version)
        return false;
    }

    boolean this_present_requestorUserName = true && this.isSetRequestorUserName();
    boolean that_present_requestorUserName = true && that.isSetRequestorUserName();
    if (this_present_requestorUserName || that_present_requestorUserName) {
      if (!(this_present_requestorUserName && that_present_requestorUserName))
        return false;
      if (!this.requestorUserName.equals(that.requestorUserName))
        return false;
    }

    boolean this_present_component = true && this.isSetComponent();
    boolean that_present_component = true && that.isSetComponent();
    if (this_present_component || that_present_component) {
      if (!(this_present_component && that_present_component))
        return false;
      if (!this.component.equals(that.component))
        return false;
    }

    boolean this_present_serviceName = true && this.isSetServiceName();
    boolean that_present_serviceName = true && that.isSetServiceName();
    if (this_present_serviceName || that_present_serviceName) {
      if (!(this_present_serviceName && that_present_serviceName))
        return false;
      if (!this.serviceName.equals(that.serviceName))
        return false;
    }

    boolean this_present_oldAuthorizables = true && this.isSetOldAuthorizables();
    boolean that_present_oldAuthorizables = true && that.isSetOldAuthorizables();
    if (this_present_oldAuthorizables || that_present_oldAuthorizables) {
      if (!(this_present_oldAuthorizables && that_present_oldAuthorizables))
        return false;
      if (!this.oldAuthorizables.equals(that.oldAuthorizables))
        return false;
    }

    boolean this_present_newAuthorizables = true && this.isSetNewAuthorizables();
    boolean that_present_newAuthorizables = true && that.isSetNewAuthorizables();
    if (this_present_newAuthorizables || that_present_newAuthorizables) {
      if (!(this_present_newAuthorizables && that_present_newAuthorizables))
        return false;
      if (!this.newAuthorizables.equals(that.newAuthorizables))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_protocol_version = true;
    list.add(present_protocol_version);
    if (present_protocol_version)
      list.add(protocol_version);

    boolean present_requestorUserName = true && (isSetRequestorUserName());
    list.add(present_requestorUserName);
    if (present_requestorUserName)
      list.add(requestorUserName);

    boolean present_component = true && (isSetComponent());
    list.add(present_component);
    if (present_component)
      list.add(component);

    boolean present_serviceName = true && (isSetServiceName());
    list.add(present_serviceName);
    if (present_serviceName)
      list.add(serviceName);

    boolean present_oldAuthorizables = true && (isSetOldAuthorizables());
    list.add(present_oldAuthorizables);
    if (present_oldAuthorizables)
      list.add(oldAuthorizables);

    boolean present_newAuthorizables = true && (isSetNewAuthorizables());
    list.add(present_newAuthorizables);
    if (present_newAuthorizables)
      list.add(newAuthorizables);

    return list.hashCode();
  }

  @Override
  public int compareTo(TRenamePrivilegesRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProtocol_version()).compareTo(other.isSetProtocol_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocol_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol_version, other.protocol_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestorUserName()).compareTo(other.isSetRequestorUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestorUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestorUserName, other.requestorUserName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComponent()).compareTo(other.isSetComponent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComponent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.component, other.component);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServiceName()).compareTo(other.isSetServiceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServiceName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serviceName, other.serviceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOldAuthorizables()).compareTo(other.isSetOldAuthorizables());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOldAuthorizables()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oldAuthorizables, other.oldAuthorizables);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNewAuthorizables()).compareTo(other.isSetNewAuthorizables());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewAuthorizables()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newAuthorizables, other.newAuthorizables);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TRenamePrivilegesRequest(");
    boolean first = true;

    sb.append("protocol_version:");
    sb.append(this.protocol_version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestorUserName:");
    if (this.requestorUserName == null) {
      sb.append("null");
    } else {
      sb.append(this.requestorUserName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("component:");
    if (this.component == null) {
      sb.append("null");
    } else {
      sb.append(this.component);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("serviceName:");
    if (this.serviceName == null) {
      sb.append("null");
    } else {
      sb.append(this.serviceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("oldAuthorizables:");
    if (this.oldAuthorizables == null) {
      sb.append("null");
    } else {
      sb.append(this.oldAuthorizables);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("newAuthorizables:");
    if (this.newAuthorizables == null) {
      sb.append("null");
    } else {
      sb.append(this.newAuthorizables);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetProtocol_version()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocol_version' is unset! Struct:" + toString());
    }

    if (!isSetRequestorUserName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'requestorUserName' is unset! Struct:" + toString());
    }

    if (!isSetComponent()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'component' is unset! Struct:" + toString());
    }

    if (!isSetServiceName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'serviceName' is unset! Struct:" + toString());
    }

    if (!isSetOldAuthorizables()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'oldAuthorizables' is unset! Struct:" + toString());
    }

    if (!isSetNewAuthorizables()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'newAuthorizables' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TRenamePrivilegesRequestStandardSchemeFactory implements SchemeFactory {
    public TRenamePrivilegesRequestStandardScheme getScheme() {
      return new TRenamePrivilegesRequestStandardScheme();
    }
  }

  private static class TRenamePrivilegesRequestStandardScheme extends StandardScheme<TRenamePrivilegesRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRenamePrivilegesRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.protocol_version = iprot.readI32();
              struct.setProtocol_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REQUESTOR_USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requestorUserName = iprot.readString();
              struct.setRequestorUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMPONENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.component = iprot.readString();
              struct.setComponentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SERVICE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serviceName = iprot.readString();
              struct.setServiceNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // OLD_AUTHORIZABLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list56 = iprot.readListBegin();
                struct.oldAuthorizables = new ArrayList<TAuthorizable>(_list56.size);
                TAuthorizable _elem57;
                for (int _i58 = 0; _i58 < _list56.size; ++_i58)
                {
                  _elem57 = new TAuthorizable();
                  _elem57.read(iprot);
                  struct.oldAuthorizables.add(_elem57);
                }
                iprot.readListEnd();
              }
              struct.setOldAuthorizablesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // NEW_AUTHORIZABLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list59 = iprot.readListBegin();
                struct.newAuthorizables = new ArrayList<TAuthorizable>(_list59.size);
                TAuthorizable _elem60;
                for (int _i61 = 0; _i61 < _list59.size; ++_i61)
                {
                  _elem60 = new TAuthorizable();
                  _elem60.read(iprot);
                  struct.newAuthorizables.add(_elem60);
                }
                iprot.readListEnd();
              }
              struct.setNewAuthorizablesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRenamePrivilegesRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
      oprot.writeI32(struct.protocol_version);
      oprot.writeFieldEnd();
      if (struct.requestorUserName != null) {
        oprot.writeFieldBegin(REQUESTOR_USER_NAME_FIELD_DESC);
        oprot.writeString(struct.requestorUserName);
        oprot.writeFieldEnd();
      }
      if (struct.component != null) {
        oprot.writeFieldBegin(COMPONENT_FIELD_DESC);
        oprot.writeString(struct.component);
        oprot.writeFieldEnd();
      }
      if (struct.serviceName != null) {
        oprot.writeFieldBegin(SERVICE_NAME_FIELD_DESC);
        oprot.writeString(struct.serviceName);
        oprot.writeFieldEnd();
      }
      if (struct.oldAuthorizables != null) {
        oprot.writeFieldBegin(OLD_AUTHORIZABLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.oldAuthorizables.size()));
          for (TAuthorizable _iter62 : struct.oldAuthorizables)
          {
            _iter62.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.newAuthorizables != null) {
        oprot.writeFieldBegin(NEW_AUTHORIZABLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.newAuthorizables.size()));
          for (TAuthorizable _iter63 : struct.newAuthorizables)
          {
            _iter63.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRenamePrivilegesRequestTupleSchemeFactory implements SchemeFactory {
    public TRenamePrivilegesRequestTupleScheme getScheme() {
      return new TRenamePrivilegesRequestTupleScheme();
    }
  }

  private static class TRenamePrivilegesRequestTupleScheme extends TupleScheme<TRenamePrivilegesRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRenamePrivilegesRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version);
      oprot.writeString(struct.requestorUserName);
      oprot.writeString(struct.component);
      oprot.writeString(struct.serviceName);
      {
        oprot.writeI32(struct.oldAuthorizables.size());
        for (TAuthorizable _iter64 : struct.oldAuthorizables)
        {
          _iter64.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.newAuthorizables.size());
        for (TAuthorizable _iter65 : struct.newAuthorizables)
        {
          _iter65.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRenamePrivilegesRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocol_version = iprot.readI32();
      struct.setProtocol_versionIsSet(true);
      struct.requestorUserName = iprot.readString();
      struct.setRequestorUserNameIsSet(true);
      struct.component = iprot.readString();
      struct.setComponentIsSet(true);
      struct.serviceName = iprot.readString();
      struct.setServiceNameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list66 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.oldAuthorizables = new ArrayList<TAuthorizable>(_list66.size);
        TAuthorizable _elem67;
        for (int _i68 = 0; _i68 < _list66.size; ++_i68)
        {
          _elem67 = new TAuthorizable();
          _elem67.read(iprot);
          struct.oldAuthorizables.add(_elem67);
        }
      }
      struct.setOldAuthorizablesIsSet(true);
      {
        org.apache.thrift.protocol.TList _list69 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.newAuthorizables = new ArrayList<TAuthorizable>(_list69.size);
        TAuthorizable _elem70;
        for (int _i71 = 0; _i71 < _list69.size; ++_i71)
        {
          _elem70 = new TAuthorizable();
          _elem70.read(iprot);
          struct.newAuthorizables.add(_elem70);
        }
      }
      struct.setNewAuthorizablesIsSet(true);
    }
  }

}

