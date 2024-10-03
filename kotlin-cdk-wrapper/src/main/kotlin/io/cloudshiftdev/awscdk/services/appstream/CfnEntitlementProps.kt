@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEntitlement`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnEntitlementProps cfnEntitlementProps = CfnEntitlementProps.builder()
 * .appVisibility("appVisibility")
 * .attributes(List.of(AttributeProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .name("name")
 * .stackName("stackName")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html)
 */
public interface CfnEntitlementProps {
  /**
   * Specifies whether to entitle all apps or only selected apps.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-appvisibility)
   */
  public fun appVisibility(): String

  /**
   * The attributes of the entitlement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-attributes)
   */
  public fun attributes(): Any

  /**
   * The description of the entitlement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the entitlement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-name)
   */
  public fun name(): String

  /**
   * The name of the stack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-stackname)
   */
  public fun stackName(): String

  /**
   * A builder for [CfnEntitlementProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appVisibility Specifies whether to entitle all apps or only selected apps. 
     */
    public fun appVisibility(appVisibility: String)

    /**
     * @param attributes The attributes of the entitlement. 
     */
    public fun attributes(attributes: IResolvable)

    /**
     * @param attributes The attributes of the entitlement. 
     */
    public fun attributes(attributes: List<Any>)

    /**
     * @param attributes The attributes of the entitlement. 
     */
    public fun attributes(vararg attributes: Any)

    /**
     * @param description The description of the entitlement.
     */
    public fun description(description: String)

    /**
     * @param name The name of the entitlement. 
     */
    public fun name(name: String)

    /**
     * @param stackName The name of the stack. 
     */
    public fun stackName(stackName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnEntitlementProps.Builder =
        software.amazon.awscdk.services.appstream.CfnEntitlementProps.builder()

    /**
     * @param appVisibility Specifies whether to entitle all apps or only selected apps. 
     */
    override fun appVisibility(appVisibility: String) {
      cdkBuilder.appVisibility(appVisibility)
    }

    /**
     * @param attributes The attributes of the entitlement. 
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param attributes The attributes of the entitlement. 
     */
    override fun attributes(attributes: List<Any>) {
      cdkBuilder.attributes(attributes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param attributes The attributes of the entitlement. 
     */
    override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

    /**
     * @param description The description of the entitlement.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the entitlement. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param stackName The name of the stack. 
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnEntitlementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appstream.CfnEntitlementProps,
  ) : CdkObject(cdkObject),
      CfnEntitlementProps {
    /**
     * Specifies whether to entitle all apps or only selected apps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-appvisibility)
     */
    override fun appVisibility(): String = unwrap(this).getAppVisibility()

    /**
     * The attributes of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-attributes)
     */
    override fun attributes(): Any = unwrap(this).getAttributes()

    /**
     * The description of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The name of the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-stackname)
     */
    override fun stackName(): String = unwrap(this).getStackName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEntitlementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnEntitlementProps):
        CfnEntitlementProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEntitlementProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEntitlementProps):
        software.amazon.awscdk.services.appstream.CfnEntitlementProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appstream.CfnEntitlementProps
  }
}
