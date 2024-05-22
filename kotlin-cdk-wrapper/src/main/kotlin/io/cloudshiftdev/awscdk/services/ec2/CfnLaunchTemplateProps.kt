@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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
 * Properties for defining a `CfnLaunchTemplate`.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * String userData = "MIME-Version: 1.0\nContent-Type: multipart/mixed;
 * boundary=\"==MYBOUNDARY==\"\n\n--==MYBOUNDARY==\nContent-Type: text/x-shellscript;
 * charset=\"us-ascii\"\n\n#!/bin/bash\necho \"Running custom user data
 * script\"\n\n--==MYBOUNDARY==--\\\n";
 * CfnLaunchTemplate lt = CfnLaunchTemplate.Builder.create(this, "LaunchTemplate")
 * .launchTemplateData(LaunchTemplateDataProperty.builder()
 * .instanceType("t3.small")
 * .userData(Fn.base64(userData))
 * .build())
 * .build();
 * cluster.addNodegroupCapacity("extra-ng", NodegroupOptions.builder()
 * .launchTemplateSpec(LaunchTemplateSpec.builder()
 * .id(lt.getRef())
 * .version(lt.getAttrLatestVersionNumber())
 * .build())
 * .build());
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
 */
public interface CfnLaunchTemplateProps {
  /**
   * The information for the launch template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
   */
  public fun launchTemplateData(): Any

  /**
   * A name for the launch template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename)
   */
  public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  /**
   * The tags to apply to the launch template on creation.
   *
   * To tag the launch template, the resource type must be `launch-template` .
   *
   * To specify the tags for the resources that are created when an instance is launched, you must
   * use
   * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
   */
  public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  /**
   * A description for the first version of the launch template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-versiondescription)
   */
  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  /**
   * A builder for [CfnLaunchTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param launchTemplateData The information for the launch template. 
     */
    public fun launchTemplateData(launchTemplateData: IResolvable)

    /**
     * @param launchTemplateData The information for the launch template. 
     */
    public fun launchTemplateData(launchTemplateData: CfnLaunchTemplate.LaunchTemplateDataProperty)

    /**
     * @param launchTemplateData The information for the launch template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("622b4f69c0a90c2e77ae46fdc38b9be8387439ab552cc98386a6e7fb021ea84e")
    public
        fun launchTemplateData(launchTemplateData: CfnLaunchTemplate.LaunchTemplateDataProperty.Builder.() -> Unit)

    /**
     * @param launchTemplateName A name for the launch template.
     */
    public fun launchTemplateName(launchTemplateName: String)

    /**
     * @param tagSpecifications The tags to apply to the launch template on creation.
     * To tag the launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use
     * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
     * .
     */
    public fun tagSpecifications(tagSpecifications: IResolvable)

    /**
     * @param tagSpecifications The tags to apply to the launch template on creation.
     * To tag the launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use
     * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
     * .
     */
    public fun tagSpecifications(tagSpecifications: List<Any>)

    /**
     * @param tagSpecifications The tags to apply to the launch template on creation.
     * To tag the launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use
     * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
     * .
     */
    public fun tagSpecifications(vararg tagSpecifications: Any)

    /**
     * @param versionDescription A description for the first version of the launch template.
     */
    public fun versionDescription(versionDescription: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps.Builder =
        software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps.builder()

    /**
     * @param launchTemplateData The information for the launch template. 
     */
    override fun launchTemplateData(launchTemplateData: IResolvable) {
      cdkBuilder.launchTemplateData(launchTemplateData.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param launchTemplateData The information for the launch template. 
     */
    override
        fun launchTemplateData(launchTemplateData: CfnLaunchTemplate.LaunchTemplateDataProperty) {
      cdkBuilder.launchTemplateData(launchTemplateData.let(CfnLaunchTemplate.LaunchTemplateDataProperty.Companion::unwrap))
    }

    /**
     * @param launchTemplateData The information for the launch template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("622b4f69c0a90c2e77ae46fdc38b9be8387439ab552cc98386a6e7fb021ea84e")
    override
        fun launchTemplateData(launchTemplateData: CfnLaunchTemplate.LaunchTemplateDataProperty.Builder.() -> Unit):
        Unit = launchTemplateData(CfnLaunchTemplate.LaunchTemplateDataProperty(launchTemplateData))

    /**
     * @param launchTemplateName A name for the launch template.
     */
    override fun launchTemplateName(launchTemplateName: String) {
      cdkBuilder.launchTemplateName(launchTemplateName)
    }

    /**
     * @param tagSpecifications The tags to apply to the launch template on creation.
     * To tag the launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use
     * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
     * .
     */
    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tagSpecifications The tags to apply to the launch template on creation.
     * To tag the launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use
     * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
     * .
     */
    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param tagSpecifications The tags to apply to the launch template on creation.
     * To tag the launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use
     * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
     * .
     */
    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    /**
     * @param versionDescription A description for the first version of the launch template.
     */
    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps,
  ) : CdkObject(cdkObject), CfnLaunchTemplateProps {
    /**
     * The information for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
     */
    override fun launchTemplateData(): Any = unwrap(this).getLaunchTemplateData()

    /**
     * A name for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename)
     */
    override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    /**
     * The tags to apply to the launch template on creation.
     *
     * To tag the launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use
     * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
     */
    override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    /**
     * A description for the first version of the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-versiondescription)
     */
    override fun versionDescription(): String? = unwrap(this).getVersionDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLaunchTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps):
        CfnLaunchTemplateProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLaunchTemplateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchTemplateProps):
        software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps
  }
}
