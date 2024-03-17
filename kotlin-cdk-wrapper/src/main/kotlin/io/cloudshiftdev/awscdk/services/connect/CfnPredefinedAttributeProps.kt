@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPredefinedAttribute`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnPredefinedAttributeProps cfnPredefinedAttributeProps = CfnPredefinedAttributeProps.builder()
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
public interface CfnPredefinedAttributeProps {
  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The name of the predefined attribute.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-name)
   */
  public fun name(): String

  /**
   * The values of a predefined attribute.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-values)
   */
  public fun values(): Any

  /**
   * A builder for [CfnPredefinedAttributeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param name The name of the predefined attribute. 
     */
    public fun name(name: String)

    /**
     * @param values The values of a predefined attribute. 
     */
    public fun values(values: IResolvable)

    /**
     * @param values The values of a predefined attribute. 
     */
    public fun values(values: CfnPredefinedAttribute.ValuesProperty)

    /**
     * @param values The values of a predefined attribute. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58159c7d861b68f42a431a870417d2855d5730baeae8138650d7c02190a61864")
    public fun values(values: CfnPredefinedAttribute.ValuesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps.Builder =
        software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps.builder()

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param name The name of the predefined attribute. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param values The values of a predefined attribute. 
     */
    override fun values(values: IResolvable) {
      cdkBuilder.values(values.let(IResolvable::unwrap))
    }

    /**
     * @param values The values of a predefined attribute. 
     */
    override fun values(values: CfnPredefinedAttribute.ValuesProperty) {
      cdkBuilder.values(values.let(CfnPredefinedAttribute.ValuesProperty::unwrap))
    }

    /**
     * @param values The values of a predefined attribute. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58159c7d861b68f42a431a870417d2855d5730baeae8138650d7c02190a61864")
    override fun values(values: CfnPredefinedAttribute.ValuesProperty.Builder.() -> Unit): Unit =
        values(CfnPredefinedAttribute.ValuesProperty(values))

    public fun build(): software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps,
  ) : CdkObject(cdkObject), CfnPredefinedAttributeProps {
    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The name of the predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The values of a predefined attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-predefinedattribute.html#cfn-connect-predefinedattribute-values)
     */
    override fun values(): Any = unwrap(this).getValues()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPredefinedAttributeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps):
        CfnPredefinedAttributeProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnPredefinedAttributeProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPredefinedAttributeProps):
        software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps
  }
}
