@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBillingGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnBillingGroupProps cfnBillingGroupProps = CfnBillingGroupProps.builder()
 * .billingGroupName("billingGroupName")
 * .billingGroupProperties(BillingGroupPropertiesProperty.builder()
 * .billingGroupDescription("billingGroupDescription")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html)
 */
public interface CfnBillingGroupProps {
  /**
   * The name of the billing group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupname)
   */
  public fun billingGroupName(): String? = unwrap(this).getBillingGroupName()

  /**
   * The properties of the billing group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupproperties)
   */
  public fun billingGroupProperties(): Any? = unwrap(this).getBillingGroupProperties()

  /**
   * Metadata which can be used to manage the billing group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnBillingGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param billingGroupName The name of the billing group.
     */
    public fun billingGroupName(billingGroupName: String)

    /**
     * @param billingGroupProperties The properties of the billing group.
     */
    public fun billingGroupProperties(billingGroupProperties: IResolvable)

    /**
     * @param billingGroupProperties The properties of the billing group.
     */
    public
        fun billingGroupProperties(billingGroupProperties: CfnBillingGroup.BillingGroupPropertiesProperty)

    /**
     * @param billingGroupProperties The properties of the billing group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c544bf3920ba2a8b0322d214916799d0192f909bdbfafeb33840d406b2e32f5")
    public
        fun billingGroupProperties(billingGroupProperties: CfnBillingGroup.BillingGroupPropertiesProperty.Builder.() -> Unit)

    /**
     * @param tags Metadata which can be used to manage the billing group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata which can be used to manage the billing group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnBillingGroupProps.Builder =
        software.amazon.awscdk.services.iot.CfnBillingGroupProps.builder()

    /**
     * @param billingGroupName The name of the billing group.
     */
    override fun billingGroupName(billingGroupName: String) {
      cdkBuilder.billingGroupName(billingGroupName)
    }

    /**
     * @param billingGroupProperties The properties of the billing group.
     */
    override fun billingGroupProperties(billingGroupProperties: IResolvable) {
      cdkBuilder.billingGroupProperties(billingGroupProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param billingGroupProperties The properties of the billing group.
     */
    override
        fun billingGroupProperties(billingGroupProperties: CfnBillingGroup.BillingGroupPropertiesProperty) {
      cdkBuilder.billingGroupProperties(billingGroupProperties.let(CfnBillingGroup.BillingGroupPropertiesProperty.Companion::unwrap))
    }

    /**
     * @param billingGroupProperties The properties of the billing group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c544bf3920ba2a8b0322d214916799d0192f909bdbfafeb33840d406b2e32f5")
    override
        fun billingGroupProperties(billingGroupProperties: CfnBillingGroup.BillingGroupPropertiesProperty.Builder.() -> Unit):
        Unit =
        billingGroupProperties(CfnBillingGroup.BillingGroupPropertiesProperty(billingGroupProperties))

    /**
     * @param tags Metadata which can be used to manage the billing group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the billing group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnBillingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnBillingGroupProps,
  ) : CdkObject(cdkObject), CfnBillingGroupProps {
    /**
     * The name of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupname)
     */
    override fun billingGroupName(): String? = unwrap(this).getBillingGroupName()

    /**
     * The properties of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupproperties)
     */
    override fun billingGroupProperties(): Any? = unwrap(this).getBillingGroupProperties()

    /**
     * Metadata which can be used to manage the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBillingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnBillingGroupProps):
        CfnBillingGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBillingGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBillingGroupProps):
        software.amazon.awscdk.services.iot.CfnBillingGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot.CfnBillingGroupProps
  }
}
