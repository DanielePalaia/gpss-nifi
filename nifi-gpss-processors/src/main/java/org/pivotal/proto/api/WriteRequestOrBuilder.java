// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpss.proto

package api;

public interface WriteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.WriteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.Session Session = 1;</code>
   */
  boolean hasSession();
  /**
   * <code>.api.Session Session = 1;</code>
   */
  api.Session getSession();
  /**
   * <code>.api.Session Session = 1;</code>
   */
  api.SessionOrBuilder getSessionOrBuilder();

  /**
   * <pre>
   * The data to load into the target table
   * </pre>
   *
   * <code>repeated .api.RowData Rows = 2;</code>
   */
  java.util.List<api.RowData> 
      getRowsList();
  /**
   * <pre>
   * The data to load into the target table
   * </pre>
   *
   * <code>repeated .api.RowData Rows = 2;</code>
   */
  api.RowData getRows(int index);
  /**
   * <pre>
   * The data to load into the target table
   * </pre>
   *
   * <code>repeated .api.RowData Rows = 2;</code>
   */
  int getRowsCount();
  /**
   * <pre>
   * The data to load into the target table
   * </pre>
   *
   * <code>repeated .api.RowData Rows = 2;</code>
   */
  java.util.List<? extends api.RowDataOrBuilder> 
      getRowsOrBuilderList();
  /**
   * <pre>
   * The data to load into the target table
   * </pre>
   *
   * <code>repeated .api.RowData Rows = 2;</code>
   */
  api.RowDataOrBuilder getRowsOrBuilder(
      int index);
}
