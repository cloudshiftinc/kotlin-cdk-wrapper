@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cassandra

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnType`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cassandra.*;
 * CfnTypeProps cfnTypeProps = CfnTypeProps.builder()
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
public interface CfnTypeProps {
  /**
   * A list of fields that define this type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-fields)
   */
  public fun fields(): Any

  /**
   * The name of the keyspace to create the type in.
   *
   * The keyspace must already exist.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-keyspacename)
   */
  public fun keyspaceName(): String

  /**
   * The name of the user-defined type.
   *
   * UDT names must contain 48 characters or less, must begin with an alphabetic character, and can
   * only contain alpha-numeric characters and underscores. Amazon Keyspaces converts upper case
   * characters automatically into lower case characters. For more information, see [Create a
   * user-defined type (UDT) in Amazon
   * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/keyspaces-create-udt.html) in the
   * *Amazon Keyspaces Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-typename)
   */
  public fun typeName(): String

  /**
   * A builder for [CfnTypeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fields A list of fields that define this type. 
     */
    public fun fields(fields: IResolvable)

    /**
     * @param fields A list of fields that define this type. 
     */
    public fun fields(fields: List<Any>)

    /**
     * @param fields A list of fields that define this type. 
     */
    public fun fields(vararg fields: Any)

    /**
     * @param keyspaceName The name of the keyspace to create the type in. 
     * The keyspace must already exist.
     */
    public fun keyspaceName(keyspaceName: String)

    /**
     * @param typeName The name of the user-defined type. 
     * UDT names must contain 48 characters or less, must begin with an alphabetic character, and
     * can only contain alpha-numeric characters and underscores. Amazon Keyspaces converts upper case
     * characters automatically into lower case characters. For more information, see [Create a
     * user-defined type (UDT) in Amazon
     * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/keyspaces-create-udt.html) in
     * the *Amazon Keyspaces Developer Guide* .
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cassandra.CfnTypeProps.Builder =
        software.amazon.awscdk.services.cassandra.CfnTypeProps.builder()

    /**
     * @param fields A list of fields that define this type. 
     */
    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param fields A list of fields that define this type. 
     */
    override fun fields(fields: List<Any>) {
      cdkBuilder.fields(fields.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param fields A list of fields that define this type. 
     */
    override fun fields(vararg fields: Any): Unit = fields(fields.toList())

    /**
     * @param keyspaceName The name of the keyspace to create the type in. 
     * The keyspace must already exist.
     */
    override fun keyspaceName(keyspaceName: String) {
      cdkBuilder.keyspaceName(keyspaceName)
    }

    /**
     * @param typeName The name of the user-defined type. 
     * UDT names must contain 48 characters or less, must begin with an alphabetic character, and
     * can only contain alpha-numeric characters and underscores. Amazon Keyspaces converts upper case
     * characters automatically into lower case characters. For more information, see [Create a
     * user-defined type (UDT) in Amazon
     * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/keyspaces-create-udt.html) in
     * the *Amazon Keyspaces Developer Guide* .
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.cassandra.CfnTypeProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cassandra.CfnTypeProps,
  ) : CdkObject(cdkObject),
      CfnTypeProps {
    /**
     * A list of fields that define this type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-fields)
     */
    override fun fields(): Any = unwrap(this).getFields()

    /**
     * The name of the keyspace to create the type in.
     *
     * The keyspace must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-type.html#cfn-cassandra-type-keyspacename)
     */
    override fun keyspaceName(): String = unwrap(this).getKeyspaceName()

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
     */
    override fun typeName(): String = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTypeProps):
        CfnTypeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTypeProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTypeProps):
        software.amazon.awscdk.services.cassandra.CfnTypeProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cassandra.CfnTypeProps
  }
}
