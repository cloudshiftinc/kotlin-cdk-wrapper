@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Textual or numeric value that describes an attribute.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnPredefinedAttribute cfnPredefinedAttribute = CfnPredefinedAttribute.Builder.create(this,
 * "MyCfnPredefinedAttribute")
 * .instanceArn("instanceArn")
 * .name("name")
 * .values(ValuesProperty.builder()
 * .stringList(List.of("stringList"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html)
 */
public open class CfnPredefinedAttribute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnPredefinedAttribute,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The name of the predefined attribute.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the predefined attribute.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The values of a predefined attribute.
   */
  public open fun values(): Any = unwrap(this).getValues()

  /**
   * The values of a predefined attribute.
   */
  public open fun values(`value`: IResolvable) {
    unwrap(this).setValues(`value`.let(IResolvable::unwrap))
  }

  /**
   * The values of a predefined attribute.
   */
  public open fun values(`value`: ValuesProperty) {
    unwrap(this).setValues(`value`.let(ValuesProperty::unwrap))
  }

  /**
   * The values of a predefined attribute.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c969f79d1592c06ea11474ff7965a0a5b7c4a29fb2c4eb202d8edda231d604cf")
  public open fun values(`value`: ValuesProperty.Builder.() -> Unit): Unit =
      values(ValuesProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnPredefinedAttribute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The name of the predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-name)
     * @param name The name of the predefined attribute. 
     */
    public fun name(name: String)

    /**
     * The values of a predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-values)
     * @param values The values of a predefined attribute. 
     */
    public fun values(values: IResolvable)

    /**
     * The values of a predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-values)
     * @param values The values of a predefined attribute. 
     */
    public fun values(values: ValuesProperty)

    /**
     * The values of a predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-values)
     * @param values The values of a predefined attribute. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ca05e794ede7220981b4a1b47c982b834db1d4785ca333d1e4e8f843ec36be5")
    public fun values(values: ValuesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnPredefinedAttribute.Builder =
        software.amazon.awscdk.services.connect.CfnPredefinedAttribute.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-name)
     * @param name The name of the predefined attribute. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The values of a predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-values)
     * @param values The values of a predefined attribute. 
     */
    override fun values(values: IResolvable) {
      cdkBuilder.values(values.let(IResolvable::unwrap))
    }

    /**
     * The values of a predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-values)
     * @param values The values of a predefined attribute. 
     */
    override fun values(values: ValuesProperty) {
      cdkBuilder.values(values.let(ValuesProperty::unwrap))
    }

    /**
     * The values of a predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-values)
     * @param values The values of a predefined attribute. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ca05e794ede7220981b4a1b47c982b834db1d4785ca333d1e4e8f843ec36be5")
    override fun values(values: ValuesProperty.Builder.() -> Unit): Unit =
        values(ValuesProperty(values))

    public fun build(): software.amazon.awscdk.services.connect.CfnPredefinedAttribute =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnPredefinedAttribute.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPredefinedAttribute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPredefinedAttribute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPredefinedAttribute):
        CfnPredefinedAttribute = CfnPredefinedAttribute(cdkObject)

    internal fun unwrap(wrapped: CfnPredefinedAttribute):
        software.amazon.awscdk.services.connect.CfnPredefinedAttribute = wrapped.cdkObject
  }

  /**
   * The values of a predefined attribute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * ValuesProperty valuesProperty = ValuesProperty.builder()
   * .stringList(List.of("stringList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-predefinedattribute-values.html)
   */
  public interface ValuesProperty {
    /**
     * Predefined attribute values of type string list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-predefinedattribute-values.html#cfn-connect-predefinedattribute-values-stringlist)
     */
    public fun stringList(): List<String> = unwrap(this).getStringList() ?: emptyList()

    /**
     * A builder for [ValuesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param stringList Predefined attribute values of type string list.
       */
      public fun stringList(stringList: List<String>)

      /**
       * @param stringList Predefined attribute values of type string list.
       */
      public fun stringList(vararg stringList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty.Builder =
          software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty.builder()

      /**
       * @param stringList Predefined attribute values of type string list.
       */
      override fun stringList(stringList: List<String>) {
        cdkBuilder.stringList(stringList)
      }

      /**
       * @param stringList Predefined attribute values of type string list.
       */
      override fun stringList(vararg stringList: String): Unit = stringList(stringList.toList())

      public fun build():
          software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty,
    ) : CdkObject(cdkObject), ValuesProperty {
      /**
       * Predefined attribute values of type string list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-predefinedattribute-values.html#cfn-connect-predefinedattribute-values-stringlist)
       */
      override fun stringList(): List<String> = unwrap(this).getStringList() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty):
          ValuesProperty = CdkObjectWrappers.wrap(cdkObject) as ValuesProperty

      internal fun unwrap(wrapped: ValuesProperty):
          software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty
    }
  }
}
