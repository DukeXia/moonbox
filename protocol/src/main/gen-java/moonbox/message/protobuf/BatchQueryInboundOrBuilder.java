// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_message.proto

package moonbox.message.protobuf;

public interface BatchQueryInboundOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protobuf.BatchQueryInbound)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string token = 1;</code>
   */
  java.lang.String getToken();
  /**
   * <code>string token = 1;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   *Seq[String]
   * </pre>
   *
   * <code>repeated string sql = 2;</code>
   */
  java.util.List<java.lang.String>
      getSqlList();
  /**
   * <pre>
   *Seq[String]
   * </pre>
   *
   * <code>repeated string sql = 2;</code>
   */
  int getSqlCount();
  /**
   * <pre>
   *Seq[String]
   * </pre>
   *
   * <code>repeated string sql = 2;</code>
   */
  java.lang.String getSql(int index);
  /**
   * <pre>
   *Seq[String]
   * </pre>
   *
   * <code>repeated string sql = 2;</code>
   */
  com.google.protobuf.ByteString
      getSqlBytes(int index);

  /**
   * <pre>
   * or Map[String, String]
   * </pre>
   *
   * <code>string config = 3;</code>
   */
  java.lang.String getConfig();
  /**
   * <pre>
   * or Map[String, String]
   * </pre>
   *
   * <code>string config = 3;</code>
   */
  com.google.protobuf.ByteString
      getConfigBytes();
}