@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cassandra

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `CreateType` operation creates a new user-defined type in the specified keyspace.
 *
 * To configure the required permissions, see [Permissions to create a
 * UDT](https://docs.aws.amazon.com/keyspaces/latest/devguide/configure-udt-permissions.html#udt-permissions-create)
 * in the *Amazon Keyspaces Developer Guide* .
 *
 * For more information, see [User-defined types
 * (UDTs)](https://docs.aws.amazon.com/keyspaces/latest/devguide/udts.html) in the *Amazon Keyspaces
 * Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cassandra.*;
 * CfnType cfnType = CfnType.Builder.create(this, "MyCfnType")
 * .fields(List.of(FieldProperty.builder()
 * .fieldName("fieldName")
 * .fieldType("fieldType")
 * .build()))
 * .keyspaceName("keyspaceName")
 * .typeName("typeName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html)
 */
public open class CfnType(
  cdkObject: software.amazon.awscdk.services.cassandra.CfnType,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTypeProps,
  ) :
      this(software.amazon.awscdk.services.cassandra.CfnType(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTypeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTypeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTypeProps(props)
  )

  /**
   * A list of user-defined types that use this type.
   */
  public open fun attrDirectParentTypes(): List<String> = unwrap(this).getAttrDirectParentTypes()

  /**
   * A list of tables that use this type.
   */
  public open fun attrDirectReferringTables(): List<String> =
      unwrap(this).getAttrDirectReferringTables()

  /**
   * The unique identifier of the keyspace that contains this type in the format of Amazon Resource
   * Name (ARN).
   */
  public open fun attrKeyspaceArn(): String = unwrap(this).getAttrKeyspaceArn()

  /**
   * The last time this type was modified.
   */
  public open fun attrLastModifiedTimestamp(): IResolvable =
      unwrap(this).getAttrLastModifiedTimestamp().let(IResolvable::wrap)

  /**
   * The maximum nesting depth of this type.
   *
   * For more information, see [Amazon Keyspaces UDT quotas and default
   * values](https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html#quotas-udts) in the
   * *Amazon Keyspaces Developer Guide* .
   */
  public open fun attrMaxNestingDepth(): Number = unwrap(this).getAttrMaxNestingDepth()

  /**
   * A list of fields that define this type.
   */
  public open fun fields(): Any = unwrap(this).getFields()

  /**
   * A list of fields that define this type.
   */
  public open fun fields(`value`: IResolvable) {
    unwrap(this).setFields(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of fields that define this type.
   */
  public open fun fields(`value`: List<Any>) {
    unwrap(this).setFields(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of fields that define this type.
   */
  public open fun fields(vararg `value`: Any): Unit = fields(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the keyspace to create the type in.
   */
  public open fun keyspaceName(): String = unwrap(this).getKeyspaceName()

  /**
   * The name of the keyspace to create the type in.
   */
  public open fun keyspaceName(`value`: String) {
    unwrap(this).setKeyspaceName(`value`)
  }

  /**
   * The name of the user-defined type.
   */
  public open fun typeName(): String = unwrap(this).getTypeName()

  /**
   * The name of the user-defined type.
   */
  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cassandra.CfnType].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of fields that define this type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-fields)
     * @param fields A list of fields that define this type. 
     */
    public fun fields(fields: IResolvable)

    /**
     * A list of fields that define this type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-fields)
     * @param fields A list of fields that define this type. 
     */
    public fun fields(fields: List<Any>)

    /**
     * A list of fields that define this type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-fields)
     * @param fields A list of fields that define this type. 
     */
    public fun fields(vararg fields: Any)

    /**
     * The name of the keyspace to create the type in.
     *
     * The keyspace must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-keyspacename)
     * @param keyspaceName The name of the keyspace to create the type in. 
     */
    public fun keyspaceName(keyspaceName: String)

    /**
     * The name of the user-defined type.
     *
     * UDT names must contain 48 characters or less, must begin with an alphabetic character, and
     * can only contain alpha-numeric characters and underscores. Amazon Keyspaces converts upper case
     * characters automatically into lower case characters. For more information, see [Create a
     * user-defined type (UDT) in Amazon
     * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/keyspaces-create-udt.html) in
     * the *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-typename)
     * @param typeName The name of the user-defined type. 
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cassandra.CfnType.Builder =
        software.amazon.awscdk.services.cassandra.CfnType.Builder.create(scope, id)

    /**
     * A list of fields that define this type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-fields)
     * @param fields A list of fields that define this type. 
     */
    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of fields that define this type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-fields)
     * @param fields A list of fields that define this type. 
     */
    override fun fields(fields: List<Any>) {
      cdkBuilder.fields(fields.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of fields that define this type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-fields)
     * @param fields A list of fields that define this type. 
     */
    override fun fields(vararg fields: Any): Unit = fields(fields.toList())

    /**
     * The name of the keyspace to create the type in.
     *
     * The keyspace must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-keyspacename)
     * @param keyspaceName The name of the keyspace to create the type in. 
     */
    override fun keyspaceName(keyspaceName: String) {
      cdkBuilder.keyspaceName(keyspaceName)
    }

    /**
     * The name of the user-defined type.
     *
     * UDT names must contain 48 characters or less, must begin with an alphabetic character, and
     * can only contain alpha-numeric characters and underscores. Amazon Keyspaces converts upper case
     * characters automatically into lower case characters. For more information, see [Create a
     * user-defined type (UDT) in Amazon
     * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/keyspaces-create-udt.html) in
     * the *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-typename)
     * @param typeName The name of the user-defined type. 
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.cassandra.CfnType = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cassandra.CfnType.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnType {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnType(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnType): CfnType =
        CfnType(cdkObject)

    internal fun unwrap(wrapped: CfnType): software.amazon.awscdk.services.cassandra.CfnType =
        wrapped.cdkObject as software.amazon.awscdk.services.cassandra.CfnType
  }

  /**
   * The name and data type of an individual field in a user-defined type (UDT).
   *
   * In addition to a Cassandra data type, you can also use another UDT. When you nest another UDT
   * or collection data type, you have to declare them with the `FROZEN` keyword.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
   * FieldProperty fieldProperty = FieldProperty.builder()
   * .fieldName("fieldName")
   * .fieldType("fieldType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-type-field.html)
   */
  public interface FieldProperty {
    /**
     * The name of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-type-field.html#cfn-cassandra-type-field-fieldname)
     */
    public fun fieldName(): String

    /**
     * The data type of the field.
     *
     * This can be any Cassandra data type or another user-defined type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-type-field.html#cfn-cassandra-type-field-fieldtype)
     */
    public fun fieldType(): String

    /**
     * A builder for [FieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldName The name of the field. 
       */
      public fun fieldName(fieldName: String)

      /**
       * @param fieldType The data type of the field. 
       * This can be any Cassandra data type or another user-defined type.
       */
      public fun fieldType(fieldType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnType.FieldProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnType.FieldProperty.builder()

      /**
       * @param fieldName The name of the field. 
       */
      override fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
      }

      /**
       * @param fieldType The data type of the field. 
       * This can be any Cassandra data type or another user-defined type.
       */
      override fun fieldType(fieldType: String) {
        cdkBuilder.fieldType(fieldType)
      }

      public fun build(): software.amazon.awscdk.services.cassandra.CfnType.FieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnType.FieldProperty,
    ) : CdkObject(cdkObject),
        FieldProperty {
      /**
       * The name of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-type-field.html#cfn-cassandra-type-field-fieldname)
       */
      override fun fieldName(): String = unwrap(this).getFieldName()

      /**
       * The data type of the field.
       *
       * This can be any Cassandra data type or another user-defined type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-type-field.html#cfn-cassandra-type-field-fieldtype)
       */
      override fun fieldType(): String = unwrap(this).getFieldType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnType.FieldProperty):
          FieldProperty = CdkObjectWrappers.wrap(cdkObject) as? FieldProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldProperty):
          software.amazon.awscdk.services.cassandra.CfnType.FieldProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.cassandra.CfnType.FieldProperty
    }
  }
}
