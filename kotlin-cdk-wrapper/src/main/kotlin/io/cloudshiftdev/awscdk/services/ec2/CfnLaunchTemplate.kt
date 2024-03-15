@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies the properties for creating a launch template.
 *
 * The minimum required properties for specifying a launch template are as follows:
 *
 * * You must specify at least one property for the launch template data.
 * * You do not need to specify a name for the launch template. If you do not specify a name, AWS
 * CloudFormation creates the name for you.
 *
 * A launch template can contain some or all of the configuration information to launch an instance.
 * When you launch an instance using a launch template, instance properties that are not specified in
 * the launch template use default values, except the `ImageId` property, which has no default value.
 * If you do not specify an AMI ID for the launch template `ImageId` property, you must specify an AMI
 * ID for the instance `ImageId` property.
 *
 * For more information, see [Launch an instance from a launch
 * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html) in the
 * *Amazon EC2 User Guide* .
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
public open class CfnLaunchTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The default version of the launch template, such as 2.
   *
   * The default version of a launch template cannot be specified in AWS CloudFormation . The
   * default version can be set in the Amazon EC2 console or by using the `modify-launch-template` AWS
   * CLI command.
   */
  public open fun attrDefaultVersionNumber(): String = unwrap(this).getAttrDefaultVersionNumber()

  /**
   * The latest version of the launch template, such as `5` .
   */
  public open fun attrLatestVersionNumber(): String = unwrap(this).getAttrLatestVersionNumber()

  /**
   * The ID of the launch template.
   */
  public open fun attrLaunchTemplateId(): String = unwrap(this).getAttrLaunchTemplateId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The information for the launch template.
   */
  public open fun launchTemplateData(): Any = unwrap(this).getLaunchTemplateData()

  /**
   * The information for the launch template.
   */
  public open fun launchTemplateData(`value`: IResolvable) {
    unwrap(this).setLaunchTemplateData(`value`.let(IResolvable::unwrap))
  }

  /**
   * The information for the launch template.
   */
  public open fun launchTemplateData(`value`: LaunchTemplateDataProperty) {
    unwrap(this).setLaunchTemplateData(`value`.let(LaunchTemplateDataProperty::unwrap))
  }

  /**
   * The information for the launch template.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("73d58d86b183faf9c22bf4c3340228b108285241b9defded643458e84c81949d")
  public open fun launchTemplateData(`value`: LaunchTemplateDataProperty.Builder.() -> Unit): Unit =
      launchTemplateData(LaunchTemplateDataProperty(`value`))

  /**
   * A name for the launch template.
   */
  public open fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  /**
   * A name for the launch template.
   */
  public open fun launchTemplateName(`value`: String) {
    unwrap(this).setLaunchTemplateName(`value`)
  }

  /**
   * The tags to apply to the launch template on creation.
   */
  public open fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  /**
   * The tags to apply to the launch template on creation.
   */
  public open fun tagSpecifications(`value`: IResolvable) {
    unwrap(this).setTagSpecifications(`value`.let(IResolvable::unwrap))
  }

  /**
   * The tags to apply to the launch template on creation.
   */
  public open fun tagSpecifications(_idx_ac66f0: List<Any>) {
    unwrap(this).setTagSpecifications(_idx_ac66f0)
  }

  /**
   * The tags to apply to the launch template on creation.
   */
  public open fun tagSpecifications(vararg _idx_ac66f0: Any): Unit =
      tagSpecifications(_idx_ac66f0.toList())

  /**
   * A description for the first version of the launch template.
   */
  public open fun versionDescription(): String? = unwrap(this).getVersionDescription()

  /**
   * A description for the first version of the launch template.
   */
  public open fun versionDescription(`value`: String) {
    unwrap(this).setVersionDescription(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnLaunchTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The information for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
     * @param launchTemplateData The information for the launch template. 
     */
    public fun launchTemplateData(launchTemplateData: IResolvable)

    /**
     * The information for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
     * @param launchTemplateData The information for the launch template. 
     */
    public fun launchTemplateData(launchTemplateData: LaunchTemplateDataProperty)

    /**
     * The information for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
     * @param launchTemplateData The information for the launch template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fc18067754864f0fa773cab73d5bca9bb457987000eb5ce581f15be00c87a8d")
    public fun launchTemplateData(launchTemplateData: LaunchTemplateDataProperty.Builder.() -> Unit)

    /**
     * A name for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename)
     * @param launchTemplateName A name for the launch template. 
     */
    public fun launchTemplateName(launchTemplateName: String)

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
     * @param tagSpecifications The tags to apply to the launch template on creation. 
     */
    public fun tagSpecifications(tagSpecifications: IResolvable)

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
     * @param tagSpecifications The tags to apply to the launch template on creation. 
     */
    public fun tagSpecifications(tagSpecifications: List<Any>)

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
     * @param tagSpecifications The tags to apply to the launch template on creation. 
     */
    public fun tagSpecifications(vararg tagSpecifications: Any)

    /**
     * A description for the first version of the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-versiondescription)
     * @param versionDescription A description for the first version of the launch template. 
     */
    public fun versionDescription(versionDescription: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Builder =
        software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Builder.create(scope, id)

    /**
     * The information for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
     * @param launchTemplateData The information for the launch template. 
     */
    override fun launchTemplateData(launchTemplateData: IResolvable) {
      cdkBuilder.launchTemplateData(launchTemplateData.let(IResolvable::unwrap))
    }

    /**
     * The information for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
     * @param launchTemplateData The information for the launch template. 
     */
    override fun launchTemplateData(launchTemplateData: LaunchTemplateDataProperty) {
      cdkBuilder.launchTemplateData(launchTemplateData.let(LaunchTemplateDataProperty::unwrap))
    }

    /**
     * The information for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
     * @param launchTemplateData The information for the launch template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fc18067754864f0fa773cab73d5bca9bb457987000eb5ce581f15be00c87a8d")
    override
        fun launchTemplateData(launchTemplateData: LaunchTemplateDataProperty.Builder.() -> Unit):
        Unit = launchTemplateData(LaunchTemplateDataProperty(launchTemplateData))

    /**
     * A name for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename)
     * @param launchTemplateName A name for the launch template. 
     */
    override fun launchTemplateName(launchTemplateName: String) {
      cdkBuilder.launchTemplateName(launchTemplateName)
    }

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
     * @param tagSpecifications The tags to apply to the launch template on creation. 
     */
    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

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
     * @param tagSpecifications The tags to apply to the launch template on creation. 
     */
    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

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
     * @param tagSpecifications The tags to apply to the launch template on creation. 
     */
    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    /**
     * A description for the first version of the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-versiondescription)
     * @param versionDescription A description for the first version of the launch template. 
     */
    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLaunchTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLaunchTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate):
        CfnLaunchTemplate = CfnLaunchTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchTemplate):
        software.amazon.awscdk.services.ec2.CfnLaunchTemplate = wrapped.cdkObject
  }

  /**
   * Indicates whether the instance is enabled for AWS Nitro Enclaves.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * EnclaveOptionsProperty enclaveOptionsProperty = EnclaveOptionsProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enclaveoptions.html)
   */
  public interface EnclaveOptionsProperty {
    /**
     * If this parameter is set to `true` , the instance is enabled for AWS Nitro Enclaves;
     *
     * otherwise, it is not enabled for AWS Nitro Enclaves.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enclaveoptions.html#cfn-ec2-launchtemplate-enclaveoptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [EnclaveOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled If this parameter is set to `true` , the instance is enabled for AWS Nitro
       * Enclaves;.
       * otherwise, it is not enabled for AWS Nitro Enclaves.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled If this parameter is set to `true` , the instance is enabled for AWS Nitro
       * Enclaves;.
       * otherwise, it is not enabled for AWS Nitro Enclaves.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty.builder()

      /**
       * @param enabled If this parameter is set to `true` , the instance is enabled for AWS Nitro
       * Enclaves;.
       * otherwise, it is not enabled for AWS Nitro Enclaves.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled If this parameter is set to `true` , the instance is enabled for AWS Nitro
       * Enclaves;.
       * otherwise, it is not enabled for AWS Nitro Enclaves.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty,
    ) : CdkObject(cdkObject), EnclaveOptionsProperty {
      /**
       * If this parameter is set to `true` , the instance is enabled for AWS Nitro Enclaves;
       *
       * otherwise, it is not enabled for AWS Nitro Enclaves.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enclaveoptions.html#cfn-ec2-launchtemplate-enclaveoptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnclaveOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty):
          EnclaveOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnclaveOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty
    }
  }

  /**
   * The minimum and maximum number of network interfaces.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * NetworkInterfaceCountProperty networkInterfaceCountProperty =
   * NetworkInterfaceCountProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterfacecount.html)
   */
  public interface NetworkInterfaceCountProperty {
    /**
     * The maximum number of network interfaces.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterfacecount.html#cfn-ec2-launchtemplate-networkinterfacecount-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum number of network interfaces.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterfacecount.html#cfn-ec2-launchtemplate-networkinterfacecount-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [NetworkInterfaceCountProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum number of network interfaces.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum number of network interfaces.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty.builder()

      /**
       * @param max The maximum number of network interfaces.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum number of network interfaces.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceCountProperty {
      /**
       * The maximum number of network interfaces.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterfacecount.html#cfn-ec2-launchtemplate-networkinterfacecount-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum number of network interfaces.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterfacecount.html#cfn-ec2-launchtemplate-networkinterfacecount-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceCountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty):
          NetworkInterfaceCountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceCountProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty
    }
  }

  /**
   * Specifies options for Spot Instances.
   *
   * `SpotOptions` is a property of [AWS::EC2::LaunchTemplate
   * InstanceMarketOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * SpotOptionsProperty spotOptionsProperty = SpotOptionsProperty.builder()
   * .blockDurationMinutes(123)
   * .instanceInterruptionBehavior("instanceInterruptionBehavior")
   * .maxPrice("maxPrice")
   * .spotInstanceType("spotInstanceType")
   * .validUntil("validUntil")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html)
   */
  public interface SpotOptionsProperty {
    /**
     * Deprecated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html#cfn-ec2-launchtemplate-spotoptions-blockdurationminutes)
     */
    public fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

    /**
     * The behavior when a Spot Instance is interrupted.
     *
     * The default is `terminate` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html#cfn-ec2-launchtemplate-spotoptions-instanceinterruptionbehavior)
     */
    public fun instanceInterruptionBehavior(): String? =
        unwrap(this).getInstanceInterruptionBehavior()

    /**
     * The maximum hourly price you're willing to pay for the Spot Instances.
     *
     * We do not recommend using this parameter because it can lead to increased interruptions. If
     * you do not specify this parameter, you will pay the current Spot price.
     *
     *
     * If you specify a maximum price, your Spot Instances will be interrupted more frequently than
     * if you do not specify this parameter.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html#cfn-ec2-launchtemplate-spotoptions-maxprice)
     */
    public fun maxPrice(): String? = unwrap(this).getMaxPrice()

    /**
     * The Spot Instance request type.
     *
     * If you are using Spot Instances with an Auto Scaling group, use `one-time` requests, as the
     * Amazon EC2 Auto Scaling service handles requesting new Spot Instances whenever the group is
     * below its desired capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html#cfn-ec2-launchtemplate-spotoptions-spotinstancetype)
     */
    public fun spotInstanceType(): String? = unwrap(this).getSpotInstanceType()

    /**
     * The end date of the request, in UTC format ( *YYYY-MM-DD* T *HH:MM:SS* Z). Supported only for
     * persistent requests.
     *
     * * For a persistent request, the request remains active until the `ValidUntil` date and time
     * is reached. Otherwise, the request remains active until you cancel it.
     * * For a one-time request, `ValidUntil` is not supported. The request remains active until all
     * instances launch or you cancel the request.
     *
     * Default: 7 days from the current date
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html#cfn-ec2-launchtemplate-spotoptions-validuntil)
     */
    public fun validUntil(): String? = unwrap(this).getValidUntil()

    /**
     * A builder for [SpotOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockDurationMinutes Deprecated.
       */
      public fun blockDurationMinutes(blockDurationMinutes: Number)

      /**
       * @param instanceInterruptionBehavior The behavior when a Spot Instance is interrupted.
       * The default is `terminate` .
       */
      public fun instanceInterruptionBehavior(instanceInterruptionBehavior: String)

      /**
       * @param maxPrice The maximum hourly price you're willing to pay for the Spot Instances.
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your Spot Instances will be interrupted more frequently
       * than if you do not specify this parameter.
       */
      public fun maxPrice(maxPrice: String)

      /**
       * @param spotInstanceType The Spot Instance request type.
       * If you are using Spot Instances with an Auto Scaling group, use `one-time` requests, as the
       * Amazon EC2 Auto Scaling service handles requesting new Spot Instances whenever the group is
       * below its desired capacity.
       */
      public fun spotInstanceType(spotInstanceType: String)

      /**
       * @param validUntil The end date of the request, in UTC format ( *YYYY-MM-DD* T *HH:MM:SS*
       * Z). Supported only for persistent requests.
       * * For a persistent request, the request remains active until the `ValidUntil` date and time
       * is reached. Otherwise, the request remains active until you cancel it.
       * * For a one-time request, `ValidUntil` is not supported. The request remains active until
       * all instances launch or you cancel the request.
       *
       * Default: 7 days from the current date
       */
      public fun validUntil(validUntil: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty.builder()

      /**
       * @param blockDurationMinutes Deprecated.
       */
      override fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
      }

      /**
       * @param instanceInterruptionBehavior The behavior when a Spot Instance is interrupted.
       * The default is `terminate` .
       */
      override fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
        cdkBuilder.instanceInterruptionBehavior(instanceInterruptionBehavior)
      }

      /**
       * @param maxPrice The maximum hourly price you're willing to pay for the Spot Instances.
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your Spot Instances will be interrupted more frequently
       * than if you do not specify this parameter.
       */
      override fun maxPrice(maxPrice: String) {
        cdkBuilder.maxPrice(maxPrice)
      }

      /**
       * @param spotInstanceType The Spot Instance request type.
       * If you are using Spot Instances with an Auto Scaling group, use `one-time` requests, as the
       * Amazon EC2 Auto Scaling service handles requesting new Spot Instances whenever the group is
       * below its desired capacity.
       */
      override fun spotInstanceType(spotInstanceType: String) {
        cdkBuilder.spotInstanceType(spotInstanceType)
      }

      /**
       * @param validUntil The end date of the request, in UTC format ( *YYYY-MM-DD* T *HH:MM:SS*
       * Z). Supported only for persistent requests.
       * * For a persistent request, the request remains active until the `ValidUntil` date and time
       * is reached. Otherwise, the request remains active until you cancel it.
       * * For a one-time request, `ValidUntil` is not supported. The request remains active until
       * all instances launch or you cancel the request.
       *
       * Default: 7 days from the current date
       */
      override fun validUntil(validUntil: String) {
        cdkBuilder.validUntil(validUntil)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty,
    ) : CdkObject(cdkObject), SpotOptionsProperty {
      /**
       * Deprecated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html#cfn-ec2-launchtemplate-spotoptions-blockdurationminutes)
       */
      override fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

      /**
       * The behavior when a Spot Instance is interrupted.
       *
       * The default is `terminate` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html#cfn-ec2-launchtemplate-spotoptions-instanceinterruptionbehavior)
       */
      override fun instanceInterruptionBehavior(): String? =
          unwrap(this).getInstanceInterruptionBehavior()

      /**
       * The maximum hourly price you're willing to pay for the Spot Instances.
       *
       * We do not recommend using this parameter because it can lead to increased interruptions. If
       * you do not specify this parameter, you will pay the current Spot price.
       *
       *
       * If you specify a maximum price, your Spot Instances will be interrupted more frequently
       * than if you do not specify this parameter.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html#cfn-ec2-launchtemplate-spotoptions-maxprice)
       */
      override fun maxPrice(): String? = unwrap(this).getMaxPrice()

      /**
       * The Spot Instance request type.
       *
       * If you are using Spot Instances with an Auto Scaling group, use `one-time` requests, as the
       * Amazon EC2 Auto Scaling service handles requesting new Spot Instances whenever the group is
       * below its desired capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html#cfn-ec2-launchtemplate-spotoptions-spotinstancetype)
       */
      override fun spotInstanceType(): String? = unwrap(this).getSpotInstanceType()

      /**
       * The end date of the request, in UTC format ( *YYYY-MM-DD* T *HH:MM:SS* Z). Supported only
       * for persistent requests.
       *
       * * For a persistent request, the request remains active until the `ValidUntil` date and time
       * is reached. Otherwise, the request remains active until you cancel it.
       * * For a one-time request, `ValidUntil` is not supported. The request remains active until
       * all instances launch or you cancel the request.
       *
       * Default: 7 days from the current date
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html#cfn-ec2-launchtemplate-spotoptions-validuntil)
       */
      override fun validUntil(): String? = unwrap(this).getValidUntil()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpotOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty):
          SpotOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty
    }
  }

  /**
   * The information to include in the launch template.
   *
   *
   * You must specify at least one parameter for the launch template data.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * LaunchTemplateDataProperty launchTemplateDataProperty = LaunchTemplateDataProperty.builder()
   * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
   * .deviceName("deviceName")
   * .ebs(EbsProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .kmsKeyId("kmsKeyId")
   * .snapshotId("snapshotId")
   * .throughput(123)
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build())
   * .noDevice("noDevice")
   * .virtualName("virtualName")
   * .build()))
   * .capacityReservationSpecification(CapacityReservationSpecificationProperty.builder()
   * .capacityReservationPreference("capacityReservationPreference")
   * .capacityReservationTarget(CapacityReservationTargetProperty.builder()
   * .capacityReservationId("capacityReservationId")
   * .capacityReservationResourceGroupArn("capacityReservationResourceGroupArn")
   * .build())
   * .build())
   * .cpuOptions(CpuOptionsProperty.builder()
   * .amdSevSnp("amdSevSnp")
   * .coreCount(123)
   * .threadsPerCore(123)
   * .build())
   * .creditSpecification(CreditSpecificationProperty.builder()
   * .cpuCredits("cpuCredits")
   * .build())
   * .disableApiStop(false)
   * .disableApiTermination(false)
   * .ebsOptimized(false)
   * .elasticGpuSpecifications(List.of(ElasticGpuSpecificationProperty.builder()
   * .type("type")
   * .build()))
   * .elasticInferenceAccelerators(List.of(LaunchTemplateElasticInferenceAcceleratorProperty.builder()
   * .count(123)
   * .type("type")
   * .build()))
   * .enclaveOptions(EnclaveOptionsProperty.builder()
   * .enabled(false)
   * .build())
   * .hibernationOptions(HibernationOptionsProperty.builder()
   * .configured(false)
   * .build())
   * .iamInstanceProfile(IamInstanceProfileProperty.builder()
   * .arn("arn")
   * .name("name")
   * .build())
   * .imageId("imageId")
   * .instanceInitiatedShutdownBehavior("instanceInitiatedShutdownBehavior")
   * .instanceMarketOptions(InstanceMarketOptionsProperty.builder()
   * .marketType("marketType")
   * .spotOptions(SpotOptionsProperty.builder()
   * .blockDurationMinutes(123)
   * .instanceInterruptionBehavior("instanceInterruptionBehavior")
   * .maxPrice("maxPrice")
   * .spotInstanceType("spotInstanceType")
   * .validUntil("validUntil")
   * .build())
   * .build())
   * .instanceRequirements(InstanceRequirementsProperty.builder()
   * .acceleratorCount(AcceleratorCountProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
   * .acceleratorNames(List.of("acceleratorNames"))
   * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .acceleratorTypes(List.of("acceleratorTypes"))
   * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
   * .bareMetal("bareMetal")
   * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .burstablePerformance("burstablePerformance")
   * .cpuManufacturers(List.of("cpuManufacturers"))
   * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
   * .instanceGenerations(List.of("instanceGenerations"))
   * .localStorage("localStorage")
   * .localStorageTypes(List.of("localStorageTypes"))
   * .maxSpotPriceAsPercentageOfOptimalOnDemandPrice(123)
   * .memoryGiBPerVCpu(MemoryGiBPerVCpuProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .memoryMiB(MemoryMiBProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .networkBandwidthGbps(NetworkBandwidthGbpsProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .networkInterfaceCount(NetworkInterfaceCountProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .onDemandMaxPricePercentageOverLowestPrice(123)
   * .requireHibernateSupport(false)
   * .spotMaxPricePercentageOverLowestPrice(123)
   * .totalLocalStorageGb(TotalLocalStorageGBProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .vCpuCount(VCpuCountProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .build())
   * .instanceType("instanceType")
   * .kernelId("kernelId")
   * .keyName("keyName")
   * .licenseSpecifications(List.of(LicenseSpecificationProperty.builder()
   * .licenseConfigurationArn("licenseConfigurationArn")
   * .build()))
   * .maintenanceOptions(MaintenanceOptionsProperty.builder()
   * .autoRecovery("autoRecovery")
   * .rebootMigration("rebootMigration")
   * .build())
   * .metadataOptions(MetadataOptionsProperty.builder()
   * .httpEndpoint("httpEndpoint")
   * .httpProtocolIpv6("httpProtocolIpv6")
   * .httpPutResponseHopLimit(123)
   * .httpTokens("httpTokens")
   * .instanceMetadataTags("instanceMetadataTags")
   * .build())
   * .monitoring(MonitoringProperty.builder()
   * .enabled(false)
   * .build())
   * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
   * .associateCarrierIpAddress(false)
   * .associatePublicIpAddress(false)
   * .connectionTrackingSpecification(ConnectionTrackingSpecificationProperty.builder()
   * .tcpEstablishedTimeout(123)
   * .udpStreamTimeout(123)
   * .udpTimeout(123)
   * .build())
   * .deleteOnTermination(false)
   * .description("description")
   * .deviceIndex(123)
   * .enaSrdSpecification(EnaSrdSpecificationProperty.builder()
   * .enaSrdEnabled(false)
   * .enaSrdUdpSpecification(EnaSrdUdpSpecificationProperty.builder()
   * .enaSrdUdpEnabled(false)
   * .build())
   * .build())
   * .groups(List.of("groups"))
   * .interfaceType("interfaceType")
   * .ipv4PrefixCount(123)
   * .ipv4Prefixes(List.of(Ipv4PrefixSpecificationProperty.builder()
   * .ipv4Prefix("ipv4Prefix")
   * .build()))
   * .ipv6AddressCount(123)
   * .ipv6Addresses(List.of(Ipv6AddProperty.builder()
   * .ipv6Address("ipv6Address")
   * .build()))
   * .ipv6PrefixCount(123)
   * .ipv6Prefixes(List.of(Ipv6PrefixSpecificationProperty.builder()
   * .ipv6Prefix("ipv6Prefix")
   * .build()))
   * .networkCardIndex(123)
   * .networkInterfaceId("networkInterfaceId")
   * .primaryIpv6(false)
   * .privateIpAddress("privateIpAddress")
   * .privateIpAddresses(List.of(PrivateIpAddProperty.builder()
   * .primary(false)
   * .privateIpAddress("privateIpAddress")
   * .build()))
   * .secondaryPrivateIpAddressCount(123)
   * .subnetId("subnetId")
   * .build()))
   * .placement(PlacementProperty.builder()
   * .affinity("affinity")
   * .availabilityZone("availabilityZone")
   * .groupId("groupId")
   * .groupName("groupName")
   * .hostId("hostId")
   * .hostResourceGroupArn("hostResourceGroupArn")
   * .partitionNumber(123)
   * .spreadDomain("spreadDomain")
   * .tenancy("tenancy")
   * .build())
   * .privateDnsNameOptions(PrivateDnsNameOptionsProperty.builder()
   * .enableResourceNameDnsAaaaRecord(false)
   * .enableResourceNameDnsARecord(false)
   * .hostnameType("hostnameType")
   * .build())
   * .ramDiskId("ramDiskId")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .securityGroups(List.of("securityGroups"))
   * .tagSpecifications(List.of(TagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build()))
   * .userData("userData")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   */
  public interface LaunchTemplateDataProperty {
    /**
     * The block device mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings)
     */
    public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    /**
     * The Capacity Reservation targeting option.
     *
     * If you do not specify this parameter, the instance's Capacity Reservation preference defaults
     * to `open` , which enables it to run in any open Capacity Reservation that has matching
     * attributes (instance type, platform, Availability Zone).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification)
     */
    public fun capacityReservationSpecification(): Any? =
        unwrap(this).getCapacityReservationSpecification()

    /**
     * The CPU options for the instance.
     *
     * For more information, see [Optimizing CPU
     * Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-cpuoptions)
     */
    public fun cpuOptions(): Any? = unwrap(this).getCpuOptions()

    /**
     * The credit option for CPU usage of the instance.
     *
     * Valid only for T instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification)
     */
    public fun creditSpecification(): Any? = unwrap(this).getCreditSpecification()

    /**
     * Indicates whether to enable the instance for stop protection.
     *
     * For more information, see [Stop
     * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection)
     * in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapistop)
     */
    public fun disableApiStop(): Any? = unwrap(this).getDisableApiStop()

    /**
     * If you set this parameter to `true` , you can't terminate the instance using the Amazon EC2
     * console, CLI, or API;
     *
     * otherwise, you can. To change this attribute after launch, use
     * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
     * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
     * terminate the instance by running the shutdown command from the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination)
     */
    public fun disableApiTermination(): Any? = unwrap(this).getDisableApiTermination()

    /**
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all
     * instance types. Additional usage charges apply when using an EBS-optimized instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized)
     */
    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    /**
     * Deprecated.
     *
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
     * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications)
     */
    public fun elasticGpuSpecifications(): Any? = unwrap(this).getElasticGpuSpecifications()

    /**
     * An elastic inference accelerator to associate with the instance.
     *
     * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to
     * accelerate your Deep Learning (DL) inference workloads.
     *
     * You cannot specify accelerators from different generations in the same request.
     *
     *
     * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and
     * performance. After April 15, 2023, new customers will not be able to launch instances with
     * Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who
     * have used Amazon EI at least once during the past 30-day period are considered current customers
     * and will be able to continue using the service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticinferenceaccelerators)
     */
    public fun elasticInferenceAccelerators(): Any? = unwrap(this).getElasticInferenceAccelerators()

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     *
     * For more information, see [What is AWS Nitro
     * Enclaves?](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave.html) in the *AWS
     * Nitro Enclaves User Guide* .
     *
     * You can't enable AWS Nitro Enclaves and hibernation on the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-enclaveoptions)
     */
    public fun enclaveOptions(): Any? = unwrap(this).getEnclaveOptions()

    /**
     * Indicates whether an instance is enabled for hibernation.
     *
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon
     * Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-hibernationoptions)
     */
    public fun hibernationOptions(): Any? = unwrap(this).getHibernationOptions()

    /**
     * The name or Amazon Resource Name (ARN) of an IAM instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile)
     */
    public fun iamInstanceProfile(): Any? = unwrap(this).getIamInstanceProfile()

    /**
     * The ID of the AMI.
     *
     * Alternatively, you can specify a Systems Manager parameter, which will resolve to an AMI ID
     * on launch.
     *
     * Valid formats:
     *
     * * `ami-17characters00000`
     * * `resolve:ssm:parameter-name`
     * * `resolve:ssm:parameter-name:version-number`
     * * `resolve:ssm:parameter-name:label`
     *
     * For more information, see [Use a Systems Manager parameter to find an
     * AMI](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html#using-systems-manager-parameter-to-find-AMI)
     * in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid)
     */
    public fun imageId(): String? = unwrap(this).getImageId()

    /**
     * Indicates whether an instance stops or terminates when you initiate shutdown from the
     * instance (using the operating system command for system shutdown).
     *
     * Default: `stop`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior)
     */
    public fun instanceInitiatedShutdownBehavior(): String? =
        unwrap(this).getInstanceInitiatedShutdownBehavior()

    /**
     * The market (purchasing) option for the instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions)
     */
    public fun instanceMarketOptions(): Any? = unwrap(this).getInstanceMarketOptions()

    /**
     * The attributes for the instance types.
     *
     * When you specify instance attributes, Amazon EC2 will identify instance types with these
     * attributes.
     *
     * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
     * unspecified optional attribute is set to its default.
     *
     * When you specify multiple attributes, you get instance types that satisfy all of the
     * specified attributes. If you specify multiple values for an attribute, you get instance types
     * that satisfy any of the specified values.
     *
     * To limit the list of instance types from which Amazon EC2 can identify matching instance
     * types, you can use one of the following parameters, but not both in the same request:
     *
     * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance
     * types are ignored, even if they match your specified attributes.
     * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
     * your specified attributes.
     *
     *
     * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
     *
     * Attribute-based instance type selection is only supported when using Auto Scaling groups, EC2
     * Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the [launch
     * instance
     * wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html) ,
     * or with the
     * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html) API
     * or
     * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
     *
     *
     * For more information, see [Attribute-based instance type selection for EC2
     * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
     * , [Attribute-based instance type selection for Spot
     * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
     * , and [Spot placement
     * score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html) in the
     * *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancerequirements)
     */
    public fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

    /**
     * The instance type. For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * Elastic Compute Cloud User Guide* .
     *
     * If you specify `InstanceType` , you can't specify `InstanceRequirements` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The ID of the kernel.
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [User Provided
     * Kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
     * *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid)
     */
    public fun kernelId(): String? = unwrap(this).getKernelId()

    /**
     * The name of the key pair. You can create a key pair using
     * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html)
     * or
     * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html) .
     *
     *
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI
     * that is configured to allow users another way to log in.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname)
     */
    public fun keyName(): String? = unwrap(this).getKeyName()

    /**
     * The license configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-licensespecifications)
     */
    public fun licenseSpecifications(): Any? = unwrap(this).getLicenseSpecifications()

    /**
     * The maintenance options of your instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-maintenanceoptions)
     */
    public fun maintenanceOptions(): Any? = unwrap(this).getMaintenanceOptions()

    /**
     * The metadata options for the instance.
     *
     * For more information, see [Instance metadata and user
     * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions)
     */
    public fun metadataOptions(): Any? = unwrap(this).getMetadataOptions()

    /**
     * The monitoring for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-monitoring)
     */
    public fun monitoring(): Any? = unwrap(this).getMonitoring()

    /**
     * One or more network interfaces.
     *
     * If you specify a network interface, you must specify any security groups and subnets as part
     * of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces)
     */
    public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    /**
     * The placement for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-placement)
     */
    public fun placement(): Any? = unwrap(this).getPlacement()

    /**
     * The hostname type for EC2 instances launched into this subnet and how DNS A and AAAA record
     * queries should be handled.
     *
     * For more information, see [Amazon EC2 instance hostname
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-privatednsnameoptions)
     */
    public fun privateDnsNameOptions(): Any? = unwrap(this).getPrivateDnsNameOptions()

    /**
     * The ID of the RAM disk.
     *
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [User provided
     * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid)
     */
    public fun ramDiskId(): String? = unwrap(this).getRamDiskId()

    /**
     * The IDs of the security groups.
     *
     * You can specify the IDs of existing security groups and references to resources created by
     * the stack template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * One or more security group names.
     *
     * For a nondefault VPC, you must use security group IDs instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * The tags to apply to the resources that are created during instance launch.
     *
     * To tag a resource after it has been created, see
     * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
     *
     * To tag the launch template itself, use
     * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications)
     */
    public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    /**
     * The user data to make available to the instance.
     *
     * You must provide base64-encoded text. User data is limited to 16 KB. For more information,
     * see [Run commands on your Linux instance at
     * launch](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html) (Linux) or [Work
     * with instance user
     * data](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instancedata-add-user-data.html)
     * (Windows) in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * If you are creating the launch template for use with AWS Batch , the user data must be
     * provided in the [MIME multi-part archive
     * format](https://docs.aws.amazon.com/https://cloudinit.readthedocs.io/en/latest/topics/format.html#mime-multi-part-archive)
     * . For more information, see [Amazon EC2 user data in launch
     * templates](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the *AWS
     * Batch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata)
     */
    public fun userData(): String? = unwrap(this).getUserData()

    /**
     * A builder for [LaunchTemplateDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockDeviceMappings The block device mapping.
       */
      public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

      /**
       * @param blockDeviceMappings The block device mapping.
       */
      public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

      /**
       * @param blockDeviceMappings The block device mapping.
       */
      public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

      /**
       * @param capacityReservationSpecification The Capacity Reservation targeting option.
       * If you do not specify this parameter, the instance's Capacity Reservation preference
       * defaults to `open` , which enables it to run in any open Capacity Reservation that has
       * matching attributes (instance type, platform, Availability Zone).
       */
      public fun capacityReservationSpecification(capacityReservationSpecification: IResolvable)

      /**
       * @param capacityReservationSpecification The Capacity Reservation targeting option.
       * If you do not specify this parameter, the instance's Capacity Reservation preference
       * defaults to `open` , which enables it to run in any open Capacity Reservation that has
       * matching attributes (instance type, platform, Availability Zone).
       */
      public
          fun capacityReservationSpecification(capacityReservationSpecification: CapacityReservationSpecificationProperty)

      /**
       * @param capacityReservationSpecification The Capacity Reservation targeting option.
       * If you do not specify this parameter, the instance's Capacity Reservation preference
       * defaults to `open` , which enables it to run in any open Capacity Reservation that has
       * matching attributes (instance type, platform, Availability Zone).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7538c816f6b8ad00a2d467e58e27594cdd64e0cd65cc1a1e0c894ee8e5b165a0")
      public
          fun capacityReservationSpecification(capacityReservationSpecification: CapacityReservationSpecificationProperty.Builder.() -> Unit)

      /**
       * @param cpuOptions The CPU options for the instance.
       * For more information, see [Optimizing CPU
       * Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in
       * the *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun cpuOptions(cpuOptions: IResolvable)

      /**
       * @param cpuOptions The CPU options for the instance.
       * For more information, see [Optimizing CPU
       * Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in
       * the *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun cpuOptions(cpuOptions: CpuOptionsProperty)

      /**
       * @param cpuOptions The CPU options for the instance.
       * For more information, see [Optimizing CPU
       * Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in
       * the *Amazon Elastic Compute Cloud User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("259e3b5c06cb5bf8c8108e0c786375e6a9cea676a84ba635b0c1c801565c8c24")
      public fun cpuOptions(cpuOptions: CpuOptionsProperty.Builder.() -> Unit)

      /**
       * @param creditSpecification The credit option for CPU usage of the instance.
       * Valid only for T instances.
       */
      public fun creditSpecification(creditSpecification: IResolvable)

      /**
       * @param creditSpecification The credit option for CPU usage of the instance.
       * Valid only for T instances.
       */
      public fun creditSpecification(creditSpecification: CreditSpecificationProperty)

      /**
       * @param creditSpecification The credit option for CPU usage of the instance.
       * Valid only for T instances.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c519e21ccdfb01d70cdf605a898774b356db73d7a867105c93e7548d3dbbd7f5")
      public
          fun creditSpecification(creditSpecification: CreditSpecificationProperty.Builder.() -> Unit)

      /**
       * @param disableApiStop Indicates whether to enable the instance for stop protection.
       * For more information, see [Stop
       * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun disableApiStop(disableApiStop: Boolean)

      /**
       * @param disableApiStop Indicates whether to enable the instance for stop protection.
       * For more information, see [Stop
       * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun disableApiStop(disableApiStop: IResolvable)

      /**
       * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
       * instance using the Amazon EC2 console, CLI, or API;.
       * otherwise, you can. To change this attribute after launch, use
       * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
       * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
       * terminate the instance by running the shutdown command from the instance.
       */
      public fun disableApiTermination(disableApiTermination: Boolean)

      /**
       * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
       * instance using the Amazon EC2 console, CLI, or API;.
       * otherwise, you can. To change this attribute after launch, use
       * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
       * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
       * terminate the instance by running the shutdown command from the instance.
       */
      public fun disableApiTermination(disableApiTermination: IResolvable)

      /**
       * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O.
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal Amazon EBS I/O performance. This optimization isn't
       * available with all instance types. Additional usage charges apply when using an EBS-optimized
       * instance.
       */
      public fun ebsOptimized(ebsOptimized: Boolean)

      /**
       * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O.
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal Amazon EBS I/O performance. This optimization isn't
       * available with all instance types. Additional usage charges apply when using an EBS-optimized
       * instance.
       */
      public fun ebsOptimized(ebsOptimized: IResolvable)

      /**
       * @param elasticGpuSpecifications Deprecated.
       *
       * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
       * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
       */
      public fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable)

      /**
       * @param elasticGpuSpecifications Deprecated.
       *
       * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
       * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
       */
      public fun elasticGpuSpecifications(elasticGpuSpecifications: List<Any>)

      /**
       * @param elasticGpuSpecifications Deprecated.
       *
       * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
       * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
       */
      public fun elasticGpuSpecifications(vararg elasticGpuSpecifications: Any)

      /**
       * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
       * instance.
       * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances
       * to accelerate your Deep Learning (DL) inference workloads.
       *
       * You cannot specify accelerators from different generations in the same request.
       *
       *
       * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference
       * (EI), and will help current customers migrate their workloads to options that offer better
       * price and performance. After April 15, 2023, new customers will not be able to launch
       * instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However,
       * customers who have used Amazon EI at least once during the past 30-day period are considered
       * current customers and will be able to continue using the service.
       */
      public fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable)

      /**
       * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
       * instance.
       * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances
       * to accelerate your Deep Learning (DL) inference workloads.
       *
       * You cannot specify accelerators from different generations in the same request.
       *
       *
       * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference
       * (EI), and will help current customers migrate their workloads to options that offer better
       * price and performance. After April 15, 2023, new customers will not be able to launch
       * instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However,
       * customers who have used Amazon EI at least once during the past 30-day period are considered
       * current customers and will be able to continue using the service.
       */
      public fun elasticInferenceAccelerators(elasticInferenceAccelerators: List<Any>)

      /**
       * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
       * instance.
       * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances
       * to accelerate your Deep Learning (DL) inference workloads.
       *
       * You cannot specify accelerators from different generations in the same request.
       *
       *
       * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference
       * (EI), and will help current customers migrate their workloads to options that offer better
       * price and performance. After April 15, 2023, new customers will not be able to launch
       * instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However,
       * customers who have used Amazon EI at least once during the past 30-day period are considered
       * current customers and will be able to continue using the service.
       */
      public fun elasticInferenceAccelerators(vararg elasticInferenceAccelerators: Any)

      /**
       * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
       * For more information, see [What is AWS Nitro
       * Enclaves?](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave.html) in the *AWS
       * Nitro Enclaves User Guide* .
       *
       * You can't enable AWS Nitro Enclaves and hibernation on the same instance.
       */
      public fun enclaveOptions(enclaveOptions: IResolvable)

      /**
       * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
       * For more information, see [What is AWS Nitro
       * Enclaves?](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave.html) in the *AWS
       * Nitro Enclaves User Guide* .
       *
       * You can't enable AWS Nitro Enclaves and hibernation on the same instance.
       */
      public fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty)

      /**
       * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
       * For more information, see [What is AWS Nitro
       * Enclaves?](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave.html) in the *AWS
       * Nitro Enclaves User Guide* .
       *
       * You can't enable AWS Nitro Enclaves and hibernation on the same instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07d1a4d0253198ddd3f5824e73df1255a4da4abfb9fb30dfb987a7cc2b9a138")
      public fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty.Builder.() -> Unit)

      /**
       * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
       * This parameter is valid only if the instance meets the [hibernation
       * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
       * . For more information, see [Hibernate your
       * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       */
      public fun hibernationOptions(hibernationOptions: IResolvable)

      /**
       * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
       * This parameter is valid only if the instance meets the [hibernation
       * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
       * . For more information, see [Hibernate your
       * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       */
      public fun hibernationOptions(hibernationOptions: HibernationOptionsProperty)

      /**
       * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
       * This parameter is valid only if the instance meets the [hibernation
       * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
       * . For more information, see [Hibernate your
       * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28e8f416c301f684b2caa0ff660d3316808d2aaa191bdf45a914e96dabfbc4a0")
      public
          fun hibernationOptions(hibernationOptions: HibernationOptionsProperty.Builder.() -> Unit)

      /**
       * @param iamInstanceProfile The name or Amazon Resource Name (ARN) of an IAM instance
       * profile.
       */
      public fun iamInstanceProfile(iamInstanceProfile: IResolvable)

      /**
       * @param iamInstanceProfile The name or Amazon Resource Name (ARN) of an IAM instance
       * profile.
       */
      public fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileProperty)

      /**
       * @param iamInstanceProfile The name or Amazon Resource Name (ARN) of an IAM instance
       * profile.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1bbd8df00cc9b5b637bda4de3be852174f5893db1acc2b1a7713ee0c97e67ffb")
      public
          fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileProperty.Builder.() -> Unit)

      /**
       * @param imageId The ID of the AMI.
       * Alternatively, you can specify a Systems Manager parameter, which will resolve to an AMI ID
       * on launch.
       *
       * Valid formats:
       *
       * * `ami-17characters00000`
       * * `resolve:ssm:parameter-name`
       * * `resolve:ssm:parameter-name:version-number`
       * * `resolve:ssm:parameter-name:label`
       *
       * For more information, see [Use a Systems Manager parameter to find an
       * AMI](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html#using-systems-manager-parameter-to-find-AMI)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun imageId(imageId: String)

      /**
       * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates
       * when you initiate shutdown from the instance (using the operating system command for system
       * shutdown).
       * Default: `stop`
       */
      public fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String)

      /**
       * @param instanceMarketOptions The market (purchasing) option for the instances.
       */
      public fun instanceMarketOptions(instanceMarketOptions: IResolvable)

      /**
       * @param instanceMarketOptions The market (purchasing) option for the instances.
       */
      public fun instanceMarketOptions(instanceMarketOptions: InstanceMarketOptionsProperty)

      /**
       * @param instanceMarketOptions The market (purchasing) option for the instances.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43a96f45291c6fafa8312eb816699be708763915c3331c65bd8212a0c3f434c4")
      public
          fun instanceMarketOptions(instanceMarketOptions: InstanceMarketOptionsProperty.Builder.() -> Unit)

      /**
       * @param instanceRequirements The attributes for the instance types.
       * When you specify instance attributes, Amazon EC2 will identify instance types with these
       * attributes.
       *
       * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
       * unspecified optional attribute is set to its default.
       *
       * When you specify multiple attributes, you get instance types that satisfy all of the
       * specified attributes. If you specify multiple values for an attribute, you get instance types
       * that satisfy any of the specified values.
       *
       * To limit the list of instance types from which Amazon EC2 can identify matching instance
       * types, you can use one of the following parameters, but not both in the same request:
       *
       * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance
       * types are ignored, even if they match your specified attributes.
       * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
       * your specified attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       *
       * Attribute-based instance type selection is only supported when using Auto Scaling groups,
       * EC2 Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the
       * [launch instance
       * wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html) ,
       * or with the
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * API or
       * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
       * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
       *
       *
       * For more information, see [Attribute-based instance type selection for EC2
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
       * , [Attribute-based instance type selection for Spot
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
       * , and [Spot placement
       * score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html) in the
       * *Amazon EC2 User Guide* .
       */
      public fun instanceRequirements(instanceRequirements: IResolvable)

      /**
       * @param instanceRequirements The attributes for the instance types.
       * When you specify instance attributes, Amazon EC2 will identify instance types with these
       * attributes.
       *
       * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
       * unspecified optional attribute is set to its default.
       *
       * When you specify multiple attributes, you get instance types that satisfy all of the
       * specified attributes. If you specify multiple values for an attribute, you get instance types
       * that satisfy any of the specified values.
       *
       * To limit the list of instance types from which Amazon EC2 can identify matching instance
       * types, you can use one of the following parameters, but not both in the same request:
       *
       * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance
       * types are ignored, even if they match your specified attributes.
       * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
       * your specified attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       *
       * Attribute-based instance type selection is only supported when using Auto Scaling groups,
       * EC2 Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the
       * [launch instance
       * wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html) ,
       * or with the
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * API or
       * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
       * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
       *
       *
       * For more information, see [Attribute-based instance type selection for EC2
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
       * , [Attribute-based instance type selection for Spot
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
       * , and [Spot placement
       * score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html) in the
       * *Amazon EC2 User Guide* .
       */
      public fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty)

      /**
       * @param instanceRequirements The attributes for the instance types.
       * When you specify instance attributes, Amazon EC2 will identify instance types with these
       * attributes.
       *
       * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
       * unspecified optional attribute is set to its default.
       *
       * When you specify multiple attributes, you get instance types that satisfy all of the
       * specified attributes. If you specify multiple values for an attribute, you get instance types
       * that satisfy any of the specified values.
       *
       * To limit the list of instance types from which Amazon EC2 can identify matching instance
       * types, you can use one of the following parameters, but not both in the same request:
       *
       * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance
       * types are ignored, even if they match your specified attributes.
       * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
       * your specified attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       *
       * Attribute-based instance type selection is only supported when using Auto Scaling groups,
       * EC2 Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the
       * [launch instance
       * wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html) ,
       * or with the
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * API or
       * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
       * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
       *
       *
       * For more information, see [Attribute-based instance type selection for EC2
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
       * , [Attribute-based instance type selection for Spot
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
       * , and [Spot placement
       * score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html) in the
       * *Amazon EC2 User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d761b0fa81c0457ee3edbe90ca24a6f1e9229459537600d3502abd9d657fd03")
      public
          fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty.Builder.() -> Unit)

      /**
       * @param instanceType The instance type. For more information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       * If you specify `InstanceType` , you can't specify `InstanceRequirements` .
       */
      public fun instanceType(instanceType: String)

      /**
       * @param kernelId The ID of the kernel.
       * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information,
       * see [User Provided
       * Kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
       * *Amazon EC2 User Guide* .
       */
      public fun kernelId(kernelId: String)

      /**
       * @param keyName The name of the key pair. You can create a key pair using
       * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html)
       * or
       * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html)
       * .
       *
       * If you do not specify a key pair, you can't connect to the instance unless you choose an
       * AMI that is configured to allow users another way to log in.
       */
      public fun keyName(keyName: String)

      /**
       * @param licenseSpecifications The license configurations.
       */
      public fun licenseSpecifications(licenseSpecifications: IResolvable)

      /**
       * @param licenseSpecifications The license configurations.
       */
      public fun licenseSpecifications(licenseSpecifications: List<Any>)

      /**
       * @param licenseSpecifications The license configurations.
       */
      public fun licenseSpecifications(vararg licenseSpecifications: Any)

      /**
       * @param maintenanceOptions The maintenance options of your instance.
       */
      public fun maintenanceOptions(maintenanceOptions: IResolvable)

      /**
       * @param maintenanceOptions The maintenance options of your instance.
       */
      public fun maintenanceOptions(maintenanceOptions: MaintenanceOptionsProperty)

      /**
       * @param maintenanceOptions The maintenance options of your instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc0929a282bb2fbc3977ef24433a08c1d37f4f2836f2a7220650d33b4c6539dc")
      public
          fun maintenanceOptions(maintenanceOptions: MaintenanceOptionsProperty.Builder.() -> Unit)

      /**
       * @param metadataOptions The metadata options for the instance.
       * For more information, see [Instance metadata and user
       * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun metadataOptions(metadataOptions: IResolvable)

      /**
       * @param metadataOptions The metadata options for the instance.
       * For more information, see [Instance metadata and user
       * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun metadataOptions(metadataOptions: MetadataOptionsProperty)

      /**
       * @param metadataOptions The metadata options for the instance.
       * For more information, see [Instance metadata and user
       * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac7fc838a77a9a6a23cb745f94ea114a1de9fd91a5d1d8d5c34039bb5f711bb2")
      public fun metadataOptions(metadataOptions: MetadataOptionsProperty.Builder.() -> Unit)

      /**
       * @param monitoring The monitoring for the instance.
       */
      public fun monitoring(monitoring: IResolvable)

      /**
       * @param monitoring The monitoring for the instance.
       */
      public fun monitoring(monitoring: MonitoringProperty)

      /**
       * @param monitoring The monitoring for the instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b77ed06d1cbb2ea112e6d6c0f98c421f7023ac656e2cb4be028d127207d434c")
      public fun monitoring(monitoring: MonitoringProperty.Builder.() -> Unit)

      /**
       * @param networkInterfaces One or more network interfaces.
       * If you specify a network interface, you must specify any security groups and subnets as
       * part of the network interface.
       */
      public fun networkInterfaces(networkInterfaces: IResolvable)

      /**
       * @param networkInterfaces One or more network interfaces.
       * If you specify a network interface, you must specify any security groups and subnets as
       * part of the network interface.
       */
      public fun networkInterfaces(networkInterfaces: List<Any>)

      /**
       * @param networkInterfaces One or more network interfaces.
       * If you specify a network interface, you must specify any security groups and subnets as
       * part of the network interface.
       */
      public fun networkInterfaces(vararg networkInterfaces: Any)

      /**
       * @param placement The placement for the instance.
       */
      public fun placement(placement: IResolvable)

      /**
       * @param placement The placement for the instance.
       */
      public fun placement(placement: PlacementProperty)

      /**
       * @param placement The placement for the instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("006e5a78cf2eeb9a54e00593775b245bdc307414cd0aa8805e7078b297666637")
      public fun placement(placement: PlacementProperty.Builder.() -> Unit)

      /**
       * @param privateDnsNameOptions The hostname type for EC2 instances launched into this subnet
       * and how DNS A and AAAA record queries should be handled.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun privateDnsNameOptions(privateDnsNameOptions: IResolvable)

      /**
       * @param privateDnsNameOptions The hostname type for EC2 instances launched into this subnet
       * and how DNS A and AAAA record queries should be handled.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty)

      /**
       * @param privateDnsNameOptions The hostname type for EC2 instances launched into this subnet
       * and how DNS A and AAAA record queries should be handled.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f8642d14e3161f7a43afabda8cbae0433ded3780822d98553845b48be10a2ef4")
      public
          fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty.Builder.() -> Unit)

      /**
       * @param ramDiskId The ID of the RAM disk.
       *
       * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information,
       * see [User provided
       * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun ramDiskId(ramDiskId: String)

      /**
       * @param securityGroupIds The IDs of the security groups.
       * You can specify the IDs of existing security groups and references to resources created by
       * the stack template.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The IDs of the security groups.
       * You can specify the IDs of existing security groups and references to resources created by
       * the stack template.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param securityGroups One or more security group names.
       * For a nondefault VPC, you must use security group IDs instead.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups One or more security group names.
       * For a nondefault VPC, you must use security group IDs instead.
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param tagSpecifications The tags to apply to the resources that are created during
       * instance launch.
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       *
       * To tag the launch template itself, use
       * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
       * .
       */
      public fun tagSpecifications(tagSpecifications: IResolvable)

      /**
       * @param tagSpecifications The tags to apply to the resources that are created during
       * instance launch.
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       *
       * To tag the launch template itself, use
       * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
       * .
       */
      public fun tagSpecifications(tagSpecifications: List<Any>)

      /**
       * @param tagSpecifications The tags to apply to the resources that are created during
       * instance launch.
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       *
       * To tag the launch template itself, use
       * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
       * .
       */
      public fun tagSpecifications(vararg tagSpecifications: Any)

      /**
       * @param userData The user data to make available to the instance.
       * You must provide base64-encoded text. User data is limited to 16 KB. For more information,
       * see [Run commands on your Linux instance at
       * launch](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html) (Linux) or [Work
       * with instance user
       * data](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instancedata-add-user-data.html)
       * (Windows) in the *Amazon Elastic Compute Cloud User Guide* .
       *
       * If you are creating the launch template for use with AWS Batch , the user data must be
       * provided in the [MIME multi-part archive
       * format](https://docs.aws.amazon.com/https://cloudinit.readthedocs.io/en/latest/topics/format.html#mime-multi-part-archive)
       * . For more information, see [Amazon EC2 user data in launch
       * templates](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the
       * *AWS Batch User Guide* .
       */
      public fun userData(userData: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty.builder()

      /**
       * @param blockDeviceMappings The block device mapping.
       */
      override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
      }

      /**
       * @param blockDeviceMappings The block device mapping.
       */
      override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings)
      }

      /**
       * @param blockDeviceMappings The block device mapping.
       */
      override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
          blockDeviceMappings(blockDeviceMappings.toList())

      /**
       * @param capacityReservationSpecification The Capacity Reservation targeting option.
       * If you do not specify this parameter, the instance's Capacity Reservation preference
       * defaults to `open` , which enables it to run in any open Capacity Reservation that has
       * matching attributes (instance type, platform, Availability Zone).
       */
      override fun capacityReservationSpecification(capacityReservationSpecification: IResolvable) {
        cdkBuilder.capacityReservationSpecification(capacityReservationSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param capacityReservationSpecification The Capacity Reservation targeting option.
       * If you do not specify this parameter, the instance's Capacity Reservation preference
       * defaults to `open` , which enables it to run in any open Capacity Reservation that has
       * matching attributes (instance type, platform, Availability Zone).
       */
      override
          fun capacityReservationSpecification(capacityReservationSpecification: CapacityReservationSpecificationProperty) {
        cdkBuilder.capacityReservationSpecification(capacityReservationSpecification.let(CapacityReservationSpecificationProperty::unwrap))
      }

      /**
       * @param capacityReservationSpecification The Capacity Reservation targeting option.
       * If you do not specify this parameter, the instance's Capacity Reservation preference
       * defaults to `open` , which enables it to run in any open Capacity Reservation that has
       * matching attributes (instance type, platform, Availability Zone).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7538c816f6b8ad00a2d467e58e27594cdd64e0cd65cc1a1e0c894ee8e5b165a0")
      override
          fun capacityReservationSpecification(capacityReservationSpecification: CapacityReservationSpecificationProperty.Builder.() -> Unit):
          Unit =
          capacityReservationSpecification(CapacityReservationSpecificationProperty(capacityReservationSpecification))

      /**
       * @param cpuOptions The CPU options for the instance.
       * For more information, see [Optimizing CPU
       * Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in
       * the *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun cpuOptions(cpuOptions: IResolvable) {
        cdkBuilder.cpuOptions(cpuOptions.let(IResolvable::unwrap))
      }

      /**
       * @param cpuOptions The CPU options for the instance.
       * For more information, see [Optimizing CPU
       * Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in
       * the *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun cpuOptions(cpuOptions: CpuOptionsProperty) {
        cdkBuilder.cpuOptions(cpuOptions.let(CpuOptionsProperty::unwrap))
      }

      /**
       * @param cpuOptions The CPU options for the instance.
       * For more information, see [Optimizing CPU
       * Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in
       * the *Amazon Elastic Compute Cloud User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("259e3b5c06cb5bf8c8108e0c786375e6a9cea676a84ba635b0c1c801565c8c24")
      override fun cpuOptions(cpuOptions: CpuOptionsProperty.Builder.() -> Unit): Unit =
          cpuOptions(CpuOptionsProperty(cpuOptions))

      /**
       * @param creditSpecification The credit option for CPU usage of the instance.
       * Valid only for T instances.
       */
      override fun creditSpecification(creditSpecification: IResolvable) {
        cdkBuilder.creditSpecification(creditSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param creditSpecification The credit option for CPU usage of the instance.
       * Valid only for T instances.
       */
      override fun creditSpecification(creditSpecification: CreditSpecificationProperty) {
        cdkBuilder.creditSpecification(creditSpecification.let(CreditSpecificationProperty::unwrap))
      }

      /**
       * @param creditSpecification The credit option for CPU usage of the instance.
       * Valid only for T instances.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c519e21ccdfb01d70cdf605a898774b356db73d7a867105c93e7548d3dbbd7f5")
      override
          fun creditSpecification(creditSpecification: CreditSpecificationProperty.Builder.() -> Unit):
          Unit = creditSpecification(CreditSpecificationProperty(creditSpecification))

      /**
       * @param disableApiStop Indicates whether to enable the instance for stop protection.
       * For more information, see [Stop
       * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun disableApiStop(disableApiStop: Boolean) {
        cdkBuilder.disableApiStop(disableApiStop)
      }

      /**
       * @param disableApiStop Indicates whether to enable the instance for stop protection.
       * For more information, see [Stop
       * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun disableApiStop(disableApiStop: IResolvable) {
        cdkBuilder.disableApiStop(disableApiStop.let(IResolvable::unwrap))
      }

      /**
       * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
       * instance using the Amazon EC2 console, CLI, or API;.
       * otherwise, you can. To change this attribute after launch, use
       * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
       * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
       * terminate the instance by running the shutdown command from the instance.
       */
      override fun disableApiTermination(disableApiTermination: Boolean) {
        cdkBuilder.disableApiTermination(disableApiTermination)
      }

      /**
       * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
       * instance using the Amazon EC2 console, CLI, or API;.
       * otherwise, you can. To change this attribute after launch, use
       * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
       * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
       * terminate the instance by running the shutdown command from the instance.
       */
      override fun disableApiTermination(disableApiTermination: IResolvable) {
        cdkBuilder.disableApiTermination(disableApiTermination.let(IResolvable::unwrap))
      }

      /**
       * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O.
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal Amazon EBS I/O performance. This optimization isn't
       * available with all instance types. Additional usage charges apply when using an EBS-optimized
       * instance.
       */
      override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      /**
       * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O.
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal Amazon EBS I/O performance. This optimization isn't
       * available with all instance types. Additional usage charges apply when using an EBS-optimized
       * instance.
       */
      override fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
      }

      /**
       * @param elasticGpuSpecifications Deprecated.
       *
       * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
       * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
       */
      override fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable) {
        cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications.let(IResolvable::unwrap))
      }

      /**
       * @param elasticGpuSpecifications Deprecated.
       *
       * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
       * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
       */
      override fun elasticGpuSpecifications(elasticGpuSpecifications: List<Any>) {
        cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications)
      }

      /**
       * @param elasticGpuSpecifications Deprecated.
       *
       * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
       * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
       */
      override fun elasticGpuSpecifications(vararg elasticGpuSpecifications: Any): Unit =
          elasticGpuSpecifications(elasticGpuSpecifications.toList())

      /**
       * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
       * instance.
       * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances
       * to accelerate your Deep Learning (DL) inference workloads.
       *
       * You cannot specify accelerators from different generations in the same request.
       *
       *
       * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference
       * (EI), and will help current customers migrate their workloads to options that offer better
       * price and performance. After April 15, 2023, new customers will not be able to launch
       * instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However,
       * customers who have used Amazon EI at least once during the past 30-day period are considered
       * current customers and will be able to continue using the service.
       */
      override fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable) {
        cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators.let(IResolvable::unwrap))
      }

      /**
       * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
       * instance.
       * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances
       * to accelerate your Deep Learning (DL) inference workloads.
       *
       * You cannot specify accelerators from different generations in the same request.
       *
       *
       * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference
       * (EI), and will help current customers migrate their workloads to options that offer better
       * price and performance. After April 15, 2023, new customers will not be able to launch
       * instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However,
       * customers who have used Amazon EI at least once during the past 30-day period are considered
       * current customers and will be able to continue using the service.
       */
      override fun elasticInferenceAccelerators(elasticInferenceAccelerators: List<Any>) {
        cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators)
      }

      /**
       * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
       * instance.
       * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances
       * to accelerate your Deep Learning (DL) inference workloads.
       *
       * You cannot specify accelerators from different generations in the same request.
       *
       *
       * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference
       * (EI), and will help current customers migrate their workloads to options that offer better
       * price and performance. After April 15, 2023, new customers will not be able to launch
       * instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However,
       * customers who have used Amazon EI at least once during the past 30-day period are considered
       * current customers and will be able to continue using the service.
       */
      override fun elasticInferenceAccelerators(vararg elasticInferenceAccelerators: Any): Unit =
          elasticInferenceAccelerators(elasticInferenceAccelerators.toList())

      /**
       * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
       * For more information, see [What is AWS Nitro
       * Enclaves?](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave.html) in the *AWS
       * Nitro Enclaves User Guide* .
       *
       * You can't enable AWS Nitro Enclaves and hibernation on the same instance.
       */
      override fun enclaveOptions(enclaveOptions: IResolvable) {
        cdkBuilder.enclaveOptions(enclaveOptions.let(IResolvable::unwrap))
      }

      /**
       * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
       * For more information, see [What is AWS Nitro
       * Enclaves?](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave.html) in the *AWS
       * Nitro Enclaves User Guide* .
       *
       * You can't enable AWS Nitro Enclaves and hibernation on the same instance.
       */
      override fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty) {
        cdkBuilder.enclaveOptions(enclaveOptions.let(EnclaveOptionsProperty::unwrap))
      }

      /**
       * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
       * For more information, see [What is AWS Nitro
       * Enclaves?](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave.html) in the *AWS
       * Nitro Enclaves User Guide* .
       *
       * You can't enable AWS Nitro Enclaves and hibernation on the same instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07d1a4d0253198ddd3f5824e73df1255a4da4abfb9fb30dfb987a7cc2b9a138")
      override fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty.Builder.() -> Unit): Unit =
          enclaveOptions(EnclaveOptionsProperty(enclaveOptions))

      /**
       * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
       * This parameter is valid only if the instance meets the [hibernation
       * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
       * . For more information, see [Hibernate your
       * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       */
      override fun hibernationOptions(hibernationOptions: IResolvable) {
        cdkBuilder.hibernationOptions(hibernationOptions.let(IResolvable::unwrap))
      }

      /**
       * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
       * This parameter is valid only if the instance meets the [hibernation
       * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
       * . For more information, see [Hibernate your
       * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       */
      override fun hibernationOptions(hibernationOptions: HibernationOptionsProperty) {
        cdkBuilder.hibernationOptions(hibernationOptions.let(HibernationOptionsProperty::unwrap))
      }

      /**
       * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
       * This parameter is valid only if the instance meets the [hibernation
       * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
       * . For more information, see [Hibernate your
       * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28e8f416c301f684b2caa0ff660d3316808d2aaa191bdf45a914e96dabfbc4a0")
      override
          fun hibernationOptions(hibernationOptions: HibernationOptionsProperty.Builder.() -> Unit):
          Unit = hibernationOptions(HibernationOptionsProperty(hibernationOptions))

      /**
       * @param iamInstanceProfile The name or Amazon Resource Name (ARN) of an IAM instance
       * profile.
       */
      override fun iamInstanceProfile(iamInstanceProfile: IResolvable) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile.let(IResolvable::unwrap))
      }

      /**
       * @param iamInstanceProfile The name or Amazon Resource Name (ARN) of an IAM instance
       * profile.
       */
      override fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileProperty) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile.let(IamInstanceProfileProperty::unwrap))
      }

      /**
       * @param iamInstanceProfile The name or Amazon Resource Name (ARN) of an IAM instance
       * profile.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1bbd8df00cc9b5b637bda4de3be852174f5893db1acc2b1a7713ee0c97e67ffb")
      override
          fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileProperty.Builder.() -> Unit):
          Unit = iamInstanceProfile(IamInstanceProfileProperty(iamInstanceProfile))

      /**
       * @param imageId The ID of the AMI.
       * Alternatively, you can specify a Systems Manager parameter, which will resolve to an AMI ID
       * on launch.
       *
       * Valid formats:
       *
       * * `ami-17characters00000`
       * * `resolve:ssm:parameter-name`
       * * `resolve:ssm:parameter-name:version-number`
       * * `resolve:ssm:parameter-name:label`
       *
       * For more information, see [Use a Systems Manager parameter to find an
       * AMI](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html#using-systems-manager-parameter-to-find-AMI)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
      }

      /**
       * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates
       * when you initiate shutdown from the instance (using the operating system command for system
       * shutdown).
       * Default: `stop`
       */
      override fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String) {
        cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior)
      }

      /**
       * @param instanceMarketOptions The market (purchasing) option for the instances.
       */
      override fun instanceMarketOptions(instanceMarketOptions: IResolvable) {
        cdkBuilder.instanceMarketOptions(instanceMarketOptions.let(IResolvable::unwrap))
      }

      /**
       * @param instanceMarketOptions The market (purchasing) option for the instances.
       */
      override fun instanceMarketOptions(instanceMarketOptions: InstanceMarketOptionsProperty) {
        cdkBuilder.instanceMarketOptions(instanceMarketOptions.let(InstanceMarketOptionsProperty::unwrap))
      }

      /**
       * @param instanceMarketOptions The market (purchasing) option for the instances.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43a96f45291c6fafa8312eb816699be708763915c3331c65bd8212a0c3f434c4")
      override
          fun instanceMarketOptions(instanceMarketOptions: InstanceMarketOptionsProperty.Builder.() -> Unit):
          Unit = instanceMarketOptions(InstanceMarketOptionsProperty(instanceMarketOptions))

      /**
       * @param instanceRequirements The attributes for the instance types.
       * When you specify instance attributes, Amazon EC2 will identify instance types with these
       * attributes.
       *
       * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
       * unspecified optional attribute is set to its default.
       *
       * When you specify multiple attributes, you get instance types that satisfy all of the
       * specified attributes. If you specify multiple values for an attribute, you get instance types
       * that satisfy any of the specified values.
       *
       * To limit the list of instance types from which Amazon EC2 can identify matching instance
       * types, you can use one of the following parameters, but not both in the same request:
       *
       * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance
       * types are ignored, even if they match your specified attributes.
       * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
       * your specified attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       *
       * Attribute-based instance type selection is only supported when using Auto Scaling groups,
       * EC2 Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the
       * [launch instance
       * wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html) ,
       * or with the
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * API or
       * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
       * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
       *
       *
       * For more information, see [Attribute-based instance type selection for EC2
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
       * , [Attribute-based instance type selection for Spot
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
       * , and [Spot placement
       * score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html) in the
       * *Amazon EC2 User Guide* .
       */
      override fun instanceRequirements(instanceRequirements: IResolvable) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(IResolvable::unwrap))
      }

      /**
       * @param instanceRequirements The attributes for the instance types.
       * When you specify instance attributes, Amazon EC2 will identify instance types with these
       * attributes.
       *
       * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
       * unspecified optional attribute is set to its default.
       *
       * When you specify multiple attributes, you get instance types that satisfy all of the
       * specified attributes. If you specify multiple values for an attribute, you get instance types
       * that satisfy any of the specified values.
       *
       * To limit the list of instance types from which Amazon EC2 can identify matching instance
       * types, you can use one of the following parameters, but not both in the same request:
       *
       * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance
       * types are ignored, even if they match your specified attributes.
       * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
       * your specified attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       *
       * Attribute-based instance type selection is only supported when using Auto Scaling groups,
       * EC2 Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the
       * [launch instance
       * wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html) ,
       * or with the
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * API or
       * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
       * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
       *
       *
       * For more information, see [Attribute-based instance type selection for EC2
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
       * , [Attribute-based instance type selection for Spot
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
       * , and [Spot placement
       * score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html) in the
       * *Amazon EC2 User Guide* .
       */
      override fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(InstanceRequirementsProperty::unwrap))
      }

      /**
       * @param instanceRequirements The attributes for the instance types.
       * When you specify instance attributes, Amazon EC2 will identify instance types with these
       * attributes.
       *
       * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
       * unspecified optional attribute is set to its default.
       *
       * When you specify multiple attributes, you get instance types that satisfy all of the
       * specified attributes. If you specify multiple values for an attribute, you get instance types
       * that satisfy any of the specified values.
       *
       * To limit the list of instance types from which Amazon EC2 can identify matching instance
       * types, you can use one of the following parameters, but not both in the same request:
       *
       * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance
       * types are ignored, even if they match your specified attributes.
       * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
       * your specified attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       *
       * Attribute-based instance type selection is only supported when using Auto Scaling groups,
       * EC2 Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the
       * [launch instance
       * wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html) ,
       * or with the
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * API or
       * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
       * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
       *
       *
       * For more information, see [Attribute-based instance type selection for EC2
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
       * , [Attribute-based instance type selection for Spot
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
       * , and [Spot placement
       * score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html) in the
       * *Amazon EC2 User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d761b0fa81c0457ee3edbe90ca24a6f1e9229459537600d3502abd9d657fd03")
      override
          fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty.Builder.() -> Unit):
          Unit = instanceRequirements(InstanceRequirementsProperty(instanceRequirements))

      /**
       * @param instanceType The instance type. For more information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       * If you specify `InstanceType` , you can't specify `InstanceRequirements` .
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param kernelId The ID of the kernel.
       * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information,
       * see [User Provided
       * Kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
       * *Amazon EC2 User Guide* .
       */
      override fun kernelId(kernelId: String) {
        cdkBuilder.kernelId(kernelId)
      }

      /**
       * @param keyName The name of the key pair. You can create a key pair using
       * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html)
       * or
       * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html)
       * .
       *
       * If you do not specify a key pair, you can't connect to the instance unless you choose an
       * AMI that is configured to allow users another way to log in.
       */
      override fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
      }

      /**
       * @param licenseSpecifications The license configurations.
       */
      override fun licenseSpecifications(licenseSpecifications: IResolvable) {
        cdkBuilder.licenseSpecifications(licenseSpecifications.let(IResolvable::unwrap))
      }

      /**
       * @param licenseSpecifications The license configurations.
       */
      override fun licenseSpecifications(licenseSpecifications: List<Any>) {
        cdkBuilder.licenseSpecifications(licenseSpecifications)
      }

      /**
       * @param licenseSpecifications The license configurations.
       */
      override fun licenseSpecifications(vararg licenseSpecifications: Any): Unit =
          licenseSpecifications(licenseSpecifications.toList())

      /**
       * @param maintenanceOptions The maintenance options of your instance.
       */
      override fun maintenanceOptions(maintenanceOptions: IResolvable) {
        cdkBuilder.maintenanceOptions(maintenanceOptions.let(IResolvable::unwrap))
      }

      /**
       * @param maintenanceOptions The maintenance options of your instance.
       */
      override fun maintenanceOptions(maintenanceOptions: MaintenanceOptionsProperty) {
        cdkBuilder.maintenanceOptions(maintenanceOptions.let(MaintenanceOptionsProperty::unwrap))
      }

      /**
       * @param maintenanceOptions The maintenance options of your instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc0929a282bb2fbc3977ef24433a08c1d37f4f2836f2a7220650d33b4c6539dc")
      override
          fun maintenanceOptions(maintenanceOptions: MaintenanceOptionsProperty.Builder.() -> Unit):
          Unit = maintenanceOptions(MaintenanceOptionsProperty(maintenanceOptions))

      /**
       * @param metadataOptions The metadata options for the instance.
       * For more information, see [Instance metadata and user
       * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun metadataOptions(metadataOptions: IResolvable) {
        cdkBuilder.metadataOptions(metadataOptions.let(IResolvable::unwrap))
      }

      /**
       * @param metadataOptions The metadata options for the instance.
       * For more information, see [Instance metadata and user
       * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun metadataOptions(metadataOptions: MetadataOptionsProperty) {
        cdkBuilder.metadataOptions(metadataOptions.let(MetadataOptionsProperty::unwrap))
      }

      /**
       * @param metadataOptions The metadata options for the instance.
       * For more information, see [Instance metadata and user
       * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac7fc838a77a9a6a23cb745f94ea114a1de9fd91a5d1d8d5c34039bb5f711bb2")
      override fun metadataOptions(metadataOptions: MetadataOptionsProperty.Builder.() -> Unit):
          Unit = metadataOptions(MetadataOptionsProperty(metadataOptions))

      /**
       * @param monitoring The monitoring for the instance.
       */
      override fun monitoring(monitoring: IResolvable) {
        cdkBuilder.monitoring(monitoring.let(IResolvable::unwrap))
      }

      /**
       * @param monitoring The monitoring for the instance.
       */
      override fun monitoring(monitoring: MonitoringProperty) {
        cdkBuilder.monitoring(monitoring.let(MonitoringProperty::unwrap))
      }

      /**
       * @param monitoring The monitoring for the instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b77ed06d1cbb2ea112e6d6c0f98c421f7023ac656e2cb4be028d127207d434c")
      override fun monitoring(monitoring: MonitoringProperty.Builder.() -> Unit): Unit =
          monitoring(MonitoringProperty(monitoring))

      /**
       * @param networkInterfaces One or more network interfaces.
       * If you specify a network interface, you must specify any security groups and subnets as
       * part of the network interface.
       */
      override fun networkInterfaces(networkInterfaces: IResolvable) {
        cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
      }

      /**
       * @param networkInterfaces One or more network interfaces.
       * If you specify a network interface, you must specify any security groups and subnets as
       * part of the network interface.
       */
      override fun networkInterfaces(networkInterfaces: List<Any>) {
        cdkBuilder.networkInterfaces(networkInterfaces)
      }

      /**
       * @param networkInterfaces One or more network interfaces.
       * If you specify a network interface, you must specify any security groups and subnets as
       * part of the network interface.
       */
      override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
          networkInterfaces(networkInterfaces.toList())

      /**
       * @param placement The placement for the instance.
       */
      override fun placement(placement: IResolvable) {
        cdkBuilder.placement(placement.let(IResolvable::unwrap))
      }

      /**
       * @param placement The placement for the instance.
       */
      override fun placement(placement: PlacementProperty) {
        cdkBuilder.placement(placement.let(PlacementProperty::unwrap))
      }

      /**
       * @param placement The placement for the instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("006e5a78cf2eeb9a54e00593775b245bdc307414cd0aa8805e7078b297666637")
      override fun placement(placement: PlacementProperty.Builder.() -> Unit): Unit =
          placement(PlacementProperty(placement))

      /**
       * @param privateDnsNameOptions The hostname type for EC2 instances launched into this subnet
       * and how DNS A and AAAA record queries should be handled.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun privateDnsNameOptions(privateDnsNameOptions: IResolvable) {
        cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(IResolvable::unwrap))
      }

      /**
       * @param privateDnsNameOptions The hostname type for EC2 instances launched into this subnet
       * and how DNS A and AAAA record queries should be handled.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty) {
        cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(PrivateDnsNameOptionsProperty::unwrap))
      }

      /**
       * @param privateDnsNameOptions The hostname type for EC2 instances launched into this subnet
       * and how DNS A and AAAA record queries should be handled.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f8642d14e3161f7a43afabda8cbae0433ded3780822d98553845b48be10a2ef4")
      override
          fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty.Builder.() -> Unit):
          Unit = privateDnsNameOptions(PrivateDnsNameOptionsProperty(privateDnsNameOptions))

      /**
       * @param ramDiskId The ID of the RAM disk.
       *
       * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information,
       * see [User provided
       * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun ramDiskId(ramDiskId: String) {
        cdkBuilder.ramDiskId(ramDiskId)
      }

      /**
       * @param securityGroupIds The IDs of the security groups.
       * You can specify the IDs of existing security groups and references to resources created by
       * the stack template.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The IDs of the security groups.
       * You can specify the IDs of existing security groups and references to resources created by
       * the stack template.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param securityGroups One or more security group names.
       * For a nondefault VPC, you must use security group IDs instead.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups One or more security group names.
       * For a nondefault VPC, you must use security group IDs instead.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param tagSpecifications The tags to apply to the resources that are created during
       * instance launch.
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       *
       * To tag the launch template itself, use
       * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
       * .
       */
      override fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
      }

      /**
       * @param tagSpecifications The tags to apply to the resources that are created during
       * instance launch.
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       *
       * To tag the launch template itself, use
       * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
       * .
       */
      override fun tagSpecifications(tagSpecifications: List<Any>) {
        cdkBuilder.tagSpecifications(tagSpecifications)
      }

      /**
       * @param tagSpecifications The tags to apply to the resources that are created during
       * instance launch.
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       *
       * To tag the launch template itself, use
       * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
       * .
       */
      override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
          tagSpecifications(tagSpecifications.toList())

      /**
       * @param userData The user data to make available to the instance.
       * You must provide base64-encoded text. User data is limited to 16 KB. For more information,
       * see [Run commands on your Linux instance at
       * launch](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html) (Linux) or [Work
       * with instance user
       * data](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instancedata-add-user-data.html)
       * (Windows) in the *Amazon Elastic Compute Cloud User Guide* .
       *
       * If you are creating the launch template for use with AWS Batch , the user data must be
       * provided in the [MIME multi-part archive
       * format](https://docs.aws.amazon.com/https://cloudinit.readthedocs.io/en/latest/topics/format.html#mime-multi-part-archive)
       * . For more information, see [Amazon EC2 user data in launch
       * templates](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the
       * *AWS Batch User Guide* .
       */
      override fun userData(userData: String) {
        cdkBuilder.userData(userData)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty,
    ) : CdkObject(cdkObject), LaunchTemplateDataProperty {
      /**
       * The block device mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings)
       */
      override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

      /**
       * The Capacity Reservation targeting option.
       *
       * If you do not specify this parameter, the instance's Capacity Reservation preference
       * defaults to `open` , which enables it to run in any open Capacity Reservation that has
       * matching attributes (instance type, platform, Availability Zone).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification)
       */
      override fun capacityReservationSpecification(): Any? =
          unwrap(this).getCapacityReservationSpecification()

      /**
       * The CPU options for the instance.
       *
       * For more information, see [Optimizing CPU
       * Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in
       * the *Amazon Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-cpuoptions)
       */
      override fun cpuOptions(): Any? = unwrap(this).getCpuOptions()

      /**
       * The credit option for CPU usage of the instance.
       *
       * Valid only for T instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-creditspecification)
       */
      override fun creditSpecification(): Any? = unwrap(this).getCreditSpecification()

      /**
       * Indicates whether to enable the instance for stop protection.
       *
       * For more information, see [Stop
       * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapistop)
       */
      override fun disableApiStop(): Any? = unwrap(this).getDisableApiStop()

      /**
       * If you set this parameter to `true` , you can't terminate the instance using the Amazon EC2
       * console, CLI, or API;
       *
       * otherwise, you can. To change this attribute after launch, use
       * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
       * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
       * terminate the instance by running the shutdown command from the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination)
       */
      override fun disableApiTermination(): Any? = unwrap(this).getDisableApiTermination()

      /**
       * Indicates whether the instance is optimized for Amazon EBS I/O.
       *
       * This optimization provides dedicated throughput to Amazon EBS and an optimized
       * configuration stack to provide optimal Amazon EBS I/O performance. This optimization isn't
       * available with all instance types. Additional usage charges apply when using an EBS-optimized
       * instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized)
       */
      override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

      /**
       * Deprecated.
       *
       *
       * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
       * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications)
       */
      override fun elasticGpuSpecifications(): Any? = unwrap(this).getElasticGpuSpecifications()

      /**
       * An elastic inference accelerator to associate with the instance.
       *
       * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances
       * to accelerate your Deep Learning (DL) inference workloads.
       *
       * You cannot specify accelerators from different generations in the same request.
       *
       *
       * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference
       * (EI), and will help current customers migrate their workloads to options that offer better
       * price and performance. After April 15, 2023, new customers will not be able to launch
       * instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However,
       * customers who have used Amazon EI at least once during the past 30-day period are considered
       * current customers and will be able to continue using the service.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticinferenceaccelerators)
       */
      override fun elasticInferenceAccelerators(): Any? =
          unwrap(this).getElasticInferenceAccelerators()

      /**
       * Indicates whether the instance is enabled for AWS Nitro Enclaves.
       *
       * For more information, see [What is AWS Nitro
       * Enclaves?](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave.html) in the *AWS
       * Nitro Enclaves User Guide* .
       *
       * You can't enable AWS Nitro Enclaves and hibernation on the same instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-enclaveoptions)
       */
      override fun enclaveOptions(): Any? = unwrap(this).getEnclaveOptions()

      /**
       * Indicates whether an instance is enabled for hibernation.
       *
       * This parameter is valid only if the instance meets the [hibernation
       * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
       * . For more information, see [Hibernate your
       * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-hibernationoptions)
       */
      override fun hibernationOptions(): Any? = unwrap(this).getHibernationOptions()

      /**
       * The name or Amazon Resource Name (ARN) of an IAM instance profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile)
       */
      override fun iamInstanceProfile(): Any? = unwrap(this).getIamInstanceProfile()

      /**
       * The ID of the AMI.
       *
       * Alternatively, you can specify a Systems Manager parameter, which will resolve to an AMI ID
       * on launch.
       *
       * Valid formats:
       *
       * * `ami-17characters00000`
       * * `resolve:ssm:parameter-name`
       * * `resolve:ssm:parameter-name:version-number`
       * * `resolve:ssm:parameter-name:label`
       *
       * For more information, see [Use a Systems Manager parameter to find an
       * AMI](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html#using-systems-manager-parameter-to-find-AMI)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid)
       */
      override fun imageId(): String? = unwrap(this).getImageId()

      /**
       * Indicates whether an instance stops or terminates when you initiate shutdown from the
       * instance (using the operating system command for system shutdown).
       *
       * Default: `stop`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior)
       */
      override fun instanceInitiatedShutdownBehavior(): String? =
          unwrap(this).getInstanceInitiatedShutdownBehavior()

      /**
       * The market (purchasing) option for the instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancemarketoptions)
       */
      override fun instanceMarketOptions(): Any? = unwrap(this).getInstanceMarketOptions()

      /**
       * The attributes for the instance types.
       *
       * When you specify instance attributes, Amazon EC2 will identify instance types with these
       * attributes.
       *
       * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
       * unspecified optional attribute is set to its default.
       *
       * When you specify multiple attributes, you get instance types that satisfy all of the
       * specified attributes. If you specify multiple values for an attribute, you get instance types
       * that satisfy any of the specified values.
       *
       * To limit the list of instance types from which Amazon EC2 can identify matching instance
       * types, you can use one of the following parameters, but not both in the same request:
       *
       * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance
       * types are ignored, even if they match your specified attributes.
       * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
       * your specified attributes.
       *
       *
       * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
       *
       * Attribute-based instance type selection is only supported when using Auto Scaling groups,
       * EC2 Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the
       * [launch instance
       * wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html) ,
       * or with the
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html)
       * API or
       * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
       * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
       *
       *
       * For more information, see [Attribute-based instance type selection for EC2
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
       * , [Attribute-based instance type selection for Spot
       * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
       * , and [Spot placement
       * score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html) in the
       * *Amazon EC2 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancerequirements)
       */
      override fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

      /**
       * The instance type. For more information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       *
       * If you specify `InstanceType` , you can't specify `InstanceRequirements` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * The ID of the kernel.
       *
       * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information,
       * see [User Provided
       * Kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
       * *Amazon EC2 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid)
       */
      override fun kernelId(): String? = unwrap(this).getKernelId()

      /**
       * The name of the key pair. You can create a key pair using
       * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html)
       * or
       * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html)
       * .
       *
       *
       * If you do not specify a key pair, you can't connect to the instance unless you choose an
       * AMI that is configured to allow users another way to log in.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname)
       */
      override fun keyName(): String? = unwrap(this).getKeyName()

      /**
       * The license configurations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-licensespecifications)
       */
      override fun licenseSpecifications(): Any? = unwrap(this).getLicenseSpecifications()

      /**
       * The maintenance options of your instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-maintenanceoptions)
       */
      override fun maintenanceOptions(): Any? = unwrap(this).getMaintenanceOptions()

      /**
       * The metadata options for the instance.
       *
       * For more information, see [Instance metadata and user
       * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions)
       */
      override fun metadataOptions(): Any? = unwrap(this).getMetadataOptions()

      /**
       * The monitoring for the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-monitoring)
       */
      override fun monitoring(): Any? = unwrap(this).getMonitoring()

      /**
       * One or more network interfaces.
       *
       * If you specify a network interface, you must specify any security groups and subnets as
       * part of the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces)
       */
      override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

      /**
       * The placement for the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-placement)
       */
      override fun placement(): Any? = unwrap(this).getPlacement()

      /**
       * The hostname type for EC2 instances launched into this subnet and how DNS A and AAAA record
       * queries should be handled.
       *
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-privatednsnameoptions)
       */
      override fun privateDnsNameOptions(): Any? = unwrap(this).getPrivateDnsNameOptions()

      /**
       * The ID of the RAM disk.
       *
       *
       * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information,
       * see [User provided
       * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid)
       */
      override fun ramDiskId(): String? = unwrap(this).getRamDiskId()

      /**
       * The IDs of the security groups.
       *
       * You can specify the IDs of existing security groups and references to resources created by
       * the stack template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * One or more security group names.
       *
       * For a nondefault VPC, you must use security group IDs instead.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      /**
       * The tags to apply to the resources that are created during instance launch.
       *
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       *
       * To tag the launch template itself, use
       * [TagSpecifications](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications)
       */
      override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

      /**
       * The user data to make available to the instance.
       *
       * You must provide base64-encoded text. User data is limited to 16 KB. For more information,
       * see [Run commands on your Linux instance at
       * launch](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html) (Linux) or [Work
       * with instance user
       * data](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instancedata-add-user-data.html)
       * (Windows) in the *Amazon Elastic Compute Cloud User Guide* .
       *
       * If you are creating the launch template for use with AWS Batch , the user data must be
       * provided in the [MIME multi-part archive
       * format](https://docs.aws.amazon.com/https://cloudinit.readthedocs.io/en/latest/topics/format.html#mime-multi-part-archive)
       * . For more information, see [Amazon EC2 user data in launch
       * templates](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the
       * *AWS Batch User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata)
       */
      override fun userData(): String? = unwrap(this).getUserData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty):
          LaunchTemplateDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateDataProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty
    }
  }

  /**
   * Specifies a target Capacity Reservation.
   *
   * `CapacityReservationTarget` is a property of the [Amazon EC2 LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * CapacityReservationTargetProperty capacityReservationTargetProperty =
   * CapacityReservationTargetProperty.builder()
   * .capacityReservationId("capacityReservationId")
   * .capacityReservationResourceGroupArn("capacityReservationResourceGroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html)
   */
  public interface CapacityReservationTargetProperty {
    /**
     * The ID of the Capacity Reservation in which to run the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html#cfn-ec2-launchtemplate-capacityreservationtarget-capacityreservationid)
     */
    public fun capacityReservationId(): String? = unwrap(this).getCapacityReservationId()

    /**
     * The ARN of the Capacity Reservation resource group in which to run the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html#cfn-ec2-launchtemplate-capacityreservationtarget-capacityreservationresourcegrouparn)
     */
    public fun capacityReservationResourceGroupArn(): String? =
        unwrap(this).getCapacityReservationResourceGroupArn()

    /**
     * A builder for [CapacityReservationTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capacityReservationId The ID of the Capacity Reservation in which to run the
       * instance.
       */
      public fun capacityReservationId(capacityReservationId: String)

      /**
       * @param capacityReservationResourceGroupArn The ARN of the Capacity Reservation resource
       * group in which to run the instance.
       */
      public fun capacityReservationResourceGroupArn(capacityReservationResourceGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty.builder()

      /**
       * @param capacityReservationId The ID of the Capacity Reservation in which to run the
       * instance.
       */
      override fun capacityReservationId(capacityReservationId: String) {
        cdkBuilder.capacityReservationId(capacityReservationId)
      }

      /**
       * @param capacityReservationResourceGroupArn The ARN of the Capacity Reservation resource
       * group in which to run the instance.
       */
      override
          fun capacityReservationResourceGroupArn(capacityReservationResourceGroupArn: String) {
        cdkBuilder.capacityReservationResourceGroupArn(capacityReservationResourceGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty,
    ) : CdkObject(cdkObject), CapacityReservationTargetProperty {
      /**
       * The ID of the Capacity Reservation in which to run the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html#cfn-ec2-launchtemplate-capacityreservationtarget-capacityreservationid)
       */
      override fun capacityReservationId(): String? = unwrap(this).getCapacityReservationId()

      /**
       * The ARN of the Capacity Reservation resource group in which to run the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html#cfn-ec2-launchtemplate-capacityreservationtarget-capacityreservationresourcegrouparn)
       */
      override fun capacityReservationResourceGroupArn(): String? =
          unwrap(this).getCapacityReservationResourceGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityReservationTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty):
          CapacityReservationTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityReservationTargetProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty
    }
  }

  /**
   * Specifies an IPv4 prefix for a network interface.
   *
   * `Ipv4PrefixSpecification` is a property of [AWS::EC2::LaunchTemplate
   * NetworkInterface](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * Ipv4PrefixSpecificationProperty ipv4PrefixSpecificationProperty =
   * Ipv4PrefixSpecificationProperty.builder()
   * .ipv4Prefix("ipv4Prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv4prefixspecification.html)
   */
  public interface Ipv4PrefixSpecificationProperty {
    /**
     * The IPv4 prefix.
     *
     * For information, see [Assigning prefixes to Amazon EC2 network
     * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv4prefixspecification.html#cfn-ec2-launchtemplate-ipv4prefixspecification-ipv4prefix)
     */
    public fun ipv4Prefix(): String? = unwrap(this).getIpv4Prefix()

    /**
     * A builder for [Ipv4PrefixSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipv4Prefix The IPv4 prefix.
       * For information, see [Assigning prefixes to Amazon EC2 network
       * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun ipv4Prefix(ipv4Prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty.builder()

      /**
       * @param ipv4Prefix The IPv4 prefix.
       * For information, see [Assigning prefixes to Amazon EC2 network
       * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun ipv4Prefix(ipv4Prefix: String) {
        cdkBuilder.ipv4Prefix(ipv4Prefix)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty,
    ) : CdkObject(cdkObject), Ipv4PrefixSpecificationProperty {
      /**
       * The IPv4 prefix.
       *
       * For information, see [Assigning prefixes to Amazon EC2 network
       * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv4prefixspecification.html#cfn-ec2-launchtemplate-ipv4prefixspecification-ipv4prefix)
       */
      override fun ipv4Prefix(): String? = unwrap(this).getIpv4Prefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Ipv4PrefixSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty):
          Ipv4PrefixSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ipv4PrefixSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty
    }
  }

  /**
   * The minimum and maximum amount of total accelerator memory, in MiB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AcceleratorTotalMemoryMiBProperty acceleratorTotalMemoryMiBProperty =
   * AcceleratorTotalMemoryMiBProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratortotalmemorymib.html)
   */
  public interface AcceleratorTotalMemoryMiBProperty {
    /**
     * The maximum amount of accelerator memory, in MiB.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratortotalmemorymib.html#cfn-ec2-launchtemplate-acceleratortotalmemorymib-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of accelerator memory, in MiB.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratortotalmemorymib.html#cfn-ec2-launchtemplate-acceleratortotalmemorymib-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [AcceleratorTotalMemoryMiBProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of accelerator memory, in MiB.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of accelerator memory, in MiB.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty.builder()

      /**
       * @param max The maximum amount of accelerator memory, in MiB.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of accelerator memory, in MiB.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty,
    ) : CdkObject(cdkObject), AcceleratorTotalMemoryMiBProperty {
      /**
       * The maximum amount of accelerator memory, in MiB.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratortotalmemorymib.html#cfn-ec2-launchtemplate-acceleratortotalmemorymib-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of accelerator memory, in MiB.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratortotalmemorymib.html#cfn-ec2-launchtemplate-acceleratortotalmemorymib-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AcceleratorTotalMemoryMiBProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty):
          AcceleratorTotalMemoryMiBProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorTotalMemoryMiBProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty
    }
  }

  /**
   * Specifies the parameters for a network interface.
   *
   * `NetworkInterface` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
   * .associateCarrierIpAddress(false)
   * .associatePublicIpAddress(false)
   * .connectionTrackingSpecification(ConnectionTrackingSpecificationProperty.builder()
   * .tcpEstablishedTimeout(123)
   * .udpStreamTimeout(123)
   * .udpTimeout(123)
   * .build())
   * .deleteOnTermination(false)
   * .description("description")
   * .deviceIndex(123)
   * .enaSrdSpecification(EnaSrdSpecificationProperty.builder()
   * .enaSrdEnabled(false)
   * .enaSrdUdpSpecification(EnaSrdUdpSpecificationProperty.builder()
   * .enaSrdUdpEnabled(false)
   * .build())
   * .build())
   * .groups(List.of("groups"))
   * .interfaceType("interfaceType")
   * .ipv4PrefixCount(123)
   * .ipv4Prefixes(List.of(Ipv4PrefixSpecificationProperty.builder()
   * .ipv4Prefix("ipv4Prefix")
   * .build()))
   * .ipv6AddressCount(123)
   * .ipv6Addresses(List.of(Ipv6AddProperty.builder()
   * .ipv6Address("ipv6Address")
   * .build()))
   * .ipv6PrefixCount(123)
   * .ipv6Prefixes(List.of(Ipv6PrefixSpecificationProperty.builder()
   * .ipv6Prefix("ipv6Prefix")
   * .build()))
   * .networkCardIndex(123)
   * .networkInterfaceId("networkInterfaceId")
   * .primaryIpv6(false)
   * .privateIpAddress("privateIpAddress")
   * .privateIpAddresses(List.of(PrivateIpAddProperty.builder()
   * .primary(false)
   * .privateIpAddress("privateIpAddress")
   * .build()))
   * .secondaryPrivateIpAddressCount(123)
   * .subnetId("subnetId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
   */
  public interface NetworkInterfaceProperty {
    /**
     * Associates a Carrier IP address with eth0 for a new network interface.
     *
     * Use this option when you launch an instance in a Wavelength Zone and want to associate a
     * Carrier IP address with the network interface. For more information about Carrier IP addresses,
     * see [Carrier IP
     * addresses](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
     * in the *AWS Wavelength Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-associatecarrieripaddress)
     */
    public fun associateCarrierIpAddress(): Any? = unwrap(this).getAssociateCarrierIpAddress()

    /**
     * Associates a public IPv4 address with eth0 for a new network interface.
     *
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
     * tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-associatepublicipaddress)
     */
    public fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

    /**
     * A connection tracking specification for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-connectiontrackingspecification)
     */
    public fun connectionTrackingSpecification(): Any? =
        unwrap(this).getConnectionTrackingSpecification()

    /**
     * Indicates whether the network interface is deleted when the instance is terminated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-deleteontermination)
     */
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    /**
     * A description for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The device index for the network interface attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-deviceindex)
     */
    public fun deviceIndex(): Number? = unwrap(this).getDeviceIndex()

    /**
     * The ENA Express configuration for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-enasrdspecification)
     */
    public fun enaSrdSpecification(): Any? = unwrap(this).getEnaSrdSpecification()

    /**
     * The IDs of one or more security groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-groups)
     */
    public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    /**
     * The type of network interface.
     *
     * To create an Elastic Fabric Adapter (EFA), specify `efa` . For more information, see [Elastic
     * Fabric Adapter](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html) in the *Amazon
     * Elastic Compute Cloud User Guide* .
     *
     * If you are not creating an EFA, specify `interface` or omit this parameter.
     *
     * Valid values: `interface` | `efa`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-interfacetype)
     */
    public fun interfaceType(): String? = unwrap(this).getInterfaceType()

    /**
     * The number of IPv4 prefixes to be automatically assigned to the network interface.
     *
     * You cannot use this option if you use the `Ipv4Prefix` option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv4prefixcount)
     */
    public fun ipv4PrefixCount(): Number? = unwrap(this).getIpv4PrefixCount()

    /**
     * One or more IPv4 prefixes to be assigned to the network interface.
     *
     * You cannot use this option if you use the `Ipv4PrefixCount` option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv4prefixes)
     */
    public fun ipv4Prefixes(): Any? = unwrap(this).getIpv4Prefixes()

    /**
     * The number of IPv6 addresses to assign to a network interface.
     *
     * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You can't use this
     * option if specifying specific IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6addresscount)
     */
    public fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet.
     *
     * You can't use this option if you're specifying a number of IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6addresses)
     */
    public fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

    /**
     * The number of IPv6 prefixes to be automatically assigned to the network interface.
     *
     * You cannot use this option if you use the `Ipv6Prefix` option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6prefixcount)
     */
    public fun ipv6PrefixCount(): Number? = unwrap(this).getIpv6PrefixCount()

    /**
     * One or more IPv6 prefixes to be assigned to the network interface.
     *
     * You cannot use this option if you use the `Ipv6PrefixCount` option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6prefixes)
     */
    public fun ipv6Prefixes(): Any? = unwrap(this).getIpv6Prefixes()

    /**
     * The index of the network card.
     *
     * Some instance types support multiple network cards. The primary network interface must be
     * assigned to network card index 0. The default is network card index 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-networkcardindex)
     */
    public fun networkCardIndex(): Number? = unwrap(this).getNetworkCardIndex()

    /**
     * The ID of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-networkinterfaceid)
     */
    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    /**
     * The primary IPv6 address of the network interface.
     *
     * When you enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made the
     * primary IPv6 address until the instance is terminated or the network interface is detached. For
     * more information about primary IPv6 addresses, see
     * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-primaryipv6)
     */
    public fun primaryIpv6(): Any? = unwrap(this).getPrimaryIpv6()

    /**
     * The primary private IPv4 address of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-privateipaddress)
     */
    public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    /**
     * One or more private IPv4 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-privateipaddresses)
     */
    public fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

    /**
     * The number of secondary private IPv4 addresses to assign to a network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-secondaryprivateipaddresscount)
     */
    public fun secondaryPrivateIpAddressCount(): Number? =
        unwrap(this).getSecondaryPrivateIpAddressCount()

    /**
     * The ID of the subnet for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * A builder for [NetworkInterfaceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param associateCarrierIpAddress Associates a Carrier IP address with eth0 for a new
       * network interface.
       * Use this option when you launch an instance in a Wavelength Zone and want to associate a
       * Carrier IP address with the network interface. For more information about Carrier IP
       * addresses, see [Carrier IP
       * addresses](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
       * in the *AWS Wavelength Developer Guide* .
       */
      public fun associateCarrierIpAddress(associateCarrierIpAddress: Boolean)

      /**
       * @param associateCarrierIpAddress Associates a Carrier IP address with eth0 for a new
       * network interface.
       * Use this option when you launch an instance in a Wavelength Zone and want to associate a
       * Carrier IP address with the network interface. For more information about Carrier IP
       * addresses, see [Carrier IP
       * addresses](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
       * in the *AWS Wavelength Developer Guide* .
       */
      public fun associateCarrierIpAddress(associateCarrierIpAddress: IResolvable)

      /**
       * @param associatePublicIpAddress Associates a public IPv4 address with eth0 for a new
       * network interface.
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       */
      public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

      /**
       * @param associatePublicIpAddress Associates a public IPv4 address with eth0 for a new
       * network interface.
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       */
      public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable)

      /**
       * @param connectionTrackingSpecification A connection tracking specification for the network
       * interface.
       */
      public fun connectionTrackingSpecification(connectionTrackingSpecification: IResolvable)

      /**
       * @param connectionTrackingSpecification A connection tracking specification for the network
       * interface.
       */
      public
          fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty)

      /**
       * @param connectionTrackingSpecification A connection tracking specification for the network
       * interface.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c6f4a87772b9bd415feeb96a63199cd3ff7731701e8a84031a75b567fdae520a")
      public
          fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty.Builder.() -> Unit)

      /**
       * @param deleteOnTermination Indicates whether the network interface is deleted when the
       * instance is terminated.
       */
      public fun deleteOnTermination(deleteOnTermination: Boolean)

      /**
       * @param deleteOnTermination Indicates whether the network interface is deleted when the
       * instance is terminated.
       */
      public fun deleteOnTermination(deleteOnTermination: IResolvable)

      /**
       * @param description A description for the network interface.
       */
      public fun description(description: String)

      /**
       * @param deviceIndex The device index for the network interface attachment.
       */
      public fun deviceIndex(deviceIndex: Number)

      /**
       * @param enaSrdSpecification The ENA Express configuration for the network interface.
       */
      public fun enaSrdSpecification(enaSrdSpecification: IResolvable)

      /**
       * @param enaSrdSpecification The ENA Express configuration for the network interface.
       */
      public fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty)

      /**
       * @param enaSrdSpecification The ENA Express configuration for the network interface.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde402339dbd4f7d544b0811410463367a3fbedfd09e5cfd914ab9ec1d85c378")
      public
          fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty.Builder.() -> Unit)

      /**
       * @param groups The IDs of one or more security groups.
       */
      public fun groups(groups: List<String>)

      /**
       * @param groups The IDs of one or more security groups.
       */
      public fun groups(vararg groups: String)

      /**
       * @param interfaceType The type of network interface.
       * To create an Elastic Fabric Adapter (EFA), specify `efa` . For more information, see
       * [Elastic Fabric Adapter](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       * If you are not creating an EFA, specify `interface` or omit this parameter.
       *
       * Valid values: `interface` | `efa`
       */
      public fun interfaceType(interfaceType: String)

      /**
       * @param ipv4PrefixCount The number of IPv4 prefixes to be automatically assigned to the
       * network interface.
       * You cannot use this option if you use the `Ipv4Prefix` option.
       */
      public fun ipv4PrefixCount(ipv4PrefixCount: Number)

      /**
       * @param ipv4Prefixes One or more IPv4 prefixes to be assigned to the network interface.
       * You cannot use this option if you use the `Ipv4PrefixCount` option.
       */
      public fun ipv4Prefixes(ipv4Prefixes: IResolvable)

      /**
       * @param ipv4Prefixes One or more IPv4 prefixes to be assigned to the network interface.
       * You cannot use this option if you use the `Ipv4PrefixCount` option.
       */
      public fun ipv4Prefixes(ipv4Prefixes: List<Any>)

      /**
       * @param ipv4Prefixes One or more IPv4 prefixes to be assigned to the network interface.
       * You cannot use this option if you use the `Ipv4PrefixCount` option.
       */
      public fun ipv4Prefixes(vararg ipv4Prefixes: Any)

      /**
       * @param ipv6AddressCount The number of IPv6 addresses to assign to a network interface.
       * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You can't use
       * this option if specifying specific IPv6 addresses.
       */
      public fun ipv6AddressCount(ipv6AddressCount: Number)

      /**
       * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
       * your subnet.
       * You can't use this option if you're specifying a number of IPv6 addresses.
       */
      public fun ipv6Addresses(ipv6Addresses: IResolvable)

      /**
       * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
       * your subnet.
       * You can't use this option if you're specifying a number of IPv6 addresses.
       */
      public fun ipv6Addresses(ipv6Addresses: List<Any>)

      /**
       * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
       * your subnet.
       * You can't use this option if you're specifying a number of IPv6 addresses.
       */
      public fun ipv6Addresses(vararg ipv6Addresses: Any)

      /**
       * @param ipv6PrefixCount The number of IPv6 prefixes to be automatically assigned to the
       * network interface.
       * You cannot use this option if you use the `Ipv6Prefix` option.
       */
      public fun ipv6PrefixCount(ipv6PrefixCount: Number)

      /**
       * @param ipv6Prefixes One or more IPv6 prefixes to be assigned to the network interface.
       * You cannot use this option if you use the `Ipv6PrefixCount` option.
       */
      public fun ipv6Prefixes(ipv6Prefixes: IResolvable)

      /**
       * @param ipv6Prefixes One or more IPv6 prefixes to be assigned to the network interface.
       * You cannot use this option if you use the `Ipv6PrefixCount` option.
       */
      public fun ipv6Prefixes(ipv6Prefixes: List<Any>)

      /**
       * @param ipv6Prefixes One or more IPv6 prefixes to be assigned to the network interface.
       * You cannot use this option if you use the `Ipv6PrefixCount` option.
       */
      public fun ipv6Prefixes(vararg ipv6Prefixes: Any)

      /**
       * @param networkCardIndex The index of the network card.
       * Some instance types support multiple network cards. The primary network interface must be
       * assigned to network card index 0. The default is network card index 0.
       */
      public fun networkCardIndex(networkCardIndex: Number)

      /**
       * @param networkInterfaceId The ID of the network interface.
       */
      public fun networkInterfaceId(networkInterfaceId: String)

      /**
       * @param primaryIpv6 The primary IPv6 address of the network interface.
       * When you enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made
       * the primary IPv6 address until the instance is terminated or the network interface is
       * detached. For more information about primary IPv6 addresses, see
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html) .
       */
      public fun primaryIpv6(primaryIpv6: Boolean)

      /**
       * @param primaryIpv6 The primary IPv6 address of the network interface.
       * When you enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made
       * the primary IPv6 address until the instance is terminated or the network interface is
       * detached. For more information about primary IPv6 addresses, see
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html) .
       */
      public fun primaryIpv6(primaryIpv6: IResolvable)

      /**
       * @param privateIpAddress The primary private IPv4 address of the network interface.
       */
      public fun privateIpAddress(privateIpAddress: String)

      /**
       * @param privateIpAddresses One or more private IPv4 addresses.
       */
      public fun privateIpAddresses(privateIpAddresses: IResolvable)

      /**
       * @param privateIpAddresses One or more private IPv4 addresses.
       */
      public fun privateIpAddresses(privateIpAddresses: List<Any>)

      /**
       * @param privateIpAddresses One or more private IPv4 addresses.
       */
      public fun privateIpAddresses(vararg privateIpAddresses: Any)

      /**
       * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses to
       * assign to a network interface.
       */
      public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number)

      /**
       * @param subnetId The ID of the subnet for the network interface.
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty.builder()

      /**
       * @param associateCarrierIpAddress Associates a Carrier IP address with eth0 for a new
       * network interface.
       * Use this option when you launch an instance in a Wavelength Zone and want to associate a
       * Carrier IP address with the network interface. For more information about Carrier IP
       * addresses, see [Carrier IP
       * addresses](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
       * in the *AWS Wavelength Developer Guide* .
       */
      override fun associateCarrierIpAddress(associateCarrierIpAddress: Boolean) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress)
      }

      /**
       * @param associateCarrierIpAddress Associates a Carrier IP address with eth0 for a new
       * network interface.
       * Use this option when you launch an instance in a Wavelength Zone and want to associate a
       * Carrier IP address with the network interface. For more information about Carrier IP
       * addresses, see [Carrier IP
       * addresses](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
       * in the *AWS Wavelength Developer Guide* .
       */
      override fun associateCarrierIpAddress(associateCarrierIpAddress: IResolvable) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress.let(IResolvable::unwrap))
      }

      /**
       * @param associatePublicIpAddress Associates a public IPv4 address with eth0 for a new
       * network interface.
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       */
      override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
      }

      /**
       * @param associatePublicIpAddress Associates a public IPv4 address with eth0 for a new
       * network interface.
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       */
      override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable::unwrap))
      }

      /**
       * @param connectionTrackingSpecification A connection tracking specification for the network
       * interface.
       */
      override fun connectionTrackingSpecification(connectionTrackingSpecification: IResolvable) {
        cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param connectionTrackingSpecification A connection tracking specification for the network
       * interface.
       */
      override
          fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty) {
        cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(ConnectionTrackingSpecificationProperty::unwrap))
      }

      /**
       * @param connectionTrackingSpecification A connection tracking specification for the network
       * interface.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c6f4a87772b9bd415feeb96a63199cd3ff7731701e8a84031a75b567fdae520a")
      override
          fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty.Builder.() -> Unit):
          Unit =
          connectionTrackingSpecification(ConnectionTrackingSpecificationProperty(connectionTrackingSpecification))

      /**
       * @param deleteOnTermination Indicates whether the network interface is deleted when the
       * instance is terminated.
       */
      override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      /**
       * @param deleteOnTermination Indicates whether the network interface is deleted when the
       * instance is terminated.
       */
      override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      /**
       * @param description A description for the network interface.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param deviceIndex The device index for the network interface attachment.
       */
      override fun deviceIndex(deviceIndex: Number) {
        cdkBuilder.deviceIndex(deviceIndex)
      }

      /**
       * @param enaSrdSpecification The ENA Express configuration for the network interface.
       */
      override fun enaSrdSpecification(enaSrdSpecification: IResolvable) {
        cdkBuilder.enaSrdSpecification(enaSrdSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param enaSrdSpecification The ENA Express configuration for the network interface.
       */
      override fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty) {
        cdkBuilder.enaSrdSpecification(enaSrdSpecification.let(EnaSrdSpecificationProperty::unwrap))
      }

      /**
       * @param enaSrdSpecification The ENA Express configuration for the network interface.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde402339dbd4f7d544b0811410463367a3fbedfd09e5cfd914ab9ec1d85c378")
      override
          fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty.Builder.() -> Unit):
          Unit = enaSrdSpecification(EnaSrdSpecificationProperty(enaSrdSpecification))

      /**
       * @param groups The IDs of one or more security groups.
       */
      override fun groups(groups: List<String>) {
        cdkBuilder.groups(groups)
      }

      /**
       * @param groups The IDs of one or more security groups.
       */
      override fun groups(vararg groups: String): Unit = groups(groups.toList())

      /**
       * @param interfaceType The type of network interface.
       * To create an Elastic Fabric Adapter (EFA), specify `efa` . For more information, see
       * [Elastic Fabric Adapter](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       * If you are not creating an EFA, specify `interface` or omit this parameter.
       *
       * Valid values: `interface` | `efa`
       */
      override fun interfaceType(interfaceType: String) {
        cdkBuilder.interfaceType(interfaceType)
      }

      /**
       * @param ipv4PrefixCount The number of IPv4 prefixes to be automatically assigned to the
       * network interface.
       * You cannot use this option if you use the `Ipv4Prefix` option.
       */
      override fun ipv4PrefixCount(ipv4PrefixCount: Number) {
        cdkBuilder.ipv4PrefixCount(ipv4PrefixCount)
      }

      /**
       * @param ipv4Prefixes One or more IPv4 prefixes to be assigned to the network interface.
       * You cannot use this option if you use the `Ipv4PrefixCount` option.
       */
      override fun ipv4Prefixes(ipv4Prefixes: IResolvable) {
        cdkBuilder.ipv4Prefixes(ipv4Prefixes.let(IResolvable::unwrap))
      }

      /**
       * @param ipv4Prefixes One or more IPv4 prefixes to be assigned to the network interface.
       * You cannot use this option if you use the `Ipv4PrefixCount` option.
       */
      override fun ipv4Prefixes(ipv4Prefixes: List<Any>) {
        cdkBuilder.ipv4Prefixes(ipv4Prefixes)
      }

      /**
       * @param ipv4Prefixes One or more IPv4 prefixes to be assigned to the network interface.
       * You cannot use this option if you use the `Ipv4PrefixCount` option.
       */
      override fun ipv4Prefixes(vararg ipv4Prefixes: Any): Unit =
          ipv4Prefixes(ipv4Prefixes.toList())

      /**
       * @param ipv6AddressCount The number of IPv6 addresses to assign to a network interface.
       * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You can't use
       * this option if specifying specific IPv6 addresses.
       */
      override fun ipv6AddressCount(ipv6AddressCount: Number) {
        cdkBuilder.ipv6AddressCount(ipv6AddressCount)
      }

      /**
       * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
       * your subnet.
       * You can't use this option if you're specifying a number of IPv6 addresses.
       */
      override fun ipv6Addresses(ipv6Addresses: IResolvable) {
        cdkBuilder.ipv6Addresses(ipv6Addresses.let(IResolvable::unwrap))
      }

      /**
       * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
       * your subnet.
       * You can't use this option if you're specifying a number of IPv6 addresses.
       */
      override fun ipv6Addresses(ipv6Addresses: List<Any>) {
        cdkBuilder.ipv6Addresses(ipv6Addresses)
      }

      /**
       * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of
       * your subnet.
       * You can't use this option if you're specifying a number of IPv6 addresses.
       */
      override fun ipv6Addresses(vararg ipv6Addresses: Any): Unit =
          ipv6Addresses(ipv6Addresses.toList())

      /**
       * @param ipv6PrefixCount The number of IPv6 prefixes to be automatically assigned to the
       * network interface.
       * You cannot use this option if you use the `Ipv6Prefix` option.
       */
      override fun ipv6PrefixCount(ipv6PrefixCount: Number) {
        cdkBuilder.ipv6PrefixCount(ipv6PrefixCount)
      }

      /**
       * @param ipv6Prefixes One or more IPv6 prefixes to be assigned to the network interface.
       * You cannot use this option if you use the `Ipv6PrefixCount` option.
       */
      override fun ipv6Prefixes(ipv6Prefixes: IResolvable) {
        cdkBuilder.ipv6Prefixes(ipv6Prefixes.let(IResolvable::unwrap))
      }

      /**
       * @param ipv6Prefixes One or more IPv6 prefixes to be assigned to the network interface.
       * You cannot use this option if you use the `Ipv6PrefixCount` option.
       */
      override fun ipv6Prefixes(ipv6Prefixes: List<Any>) {
        cdkBuilder.ipv6Prefixes(ipv6Prefixes)
      }

      /**
       * @param ipv6Prefixes One or more IPv6 prefixes to be assigned to the network interface.
       * You cannot use this option if you use the `Ipv6PrefixCount` option.
       */
      override fun ipv6Prefixes(vararg ipv6Prefixes: Any): Unit =
          ipv6Prefixes(ipv6Prefixes.toList())

      /**
       * @param networkCardIndex The index of the network card.
       * Some instance types support multiple network cards. The primary network interface must be
       * assigned to network card index 0. The default is network card index 0.
       */
      override fun networkCardIndex(networkCardIndex: Number) {
        cdkBuilder.networkCardIndex(networkCardIndex)
      }

      /**
       * @param networkInterfaceId The ID of the network interface.
       */
      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      /**
       * @param primaryIpv6 The primary IPv6 address of the network interface.
       * When you enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made
       * the primary IPv6 address until the instance is terminated or the network interface is
       * detached. For more information about primary IPv6 addresses, see
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html) .
       */
      override fun primaryIpv6(primaryIpv6: Boolean) {
        cdkBuilder.primaryIpv6(primaryIpv6)
      }

      /**
       * @param primaryIpv6 The primary IPv6 address of the network interface.
       * When you enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made
       * the primary IPv6 address until the instance is terminated or the network interface is
       * detached. For more information about primary IPv6 addresses, see
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html) .
       */
      override fun primaryIpv6(primaryIpv6: IResolvable) {
        cdkBuilder.primaryIpv6(primaryIpv6.let(IResolvable::unwrap))
      }

      /**
       * @param privateIpAddress The primary private IPv4 address of the network interface.
       */
      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      /**
       * @param privateIpAddresses One or more private IPv4 addresses.
       */
      override fun privateIpAddresses(privateIpAddresses: IResolvable) {
        cdkBuilder.privateIpAddresses(privateIpAddresses.let(IResolvable::unwrap))
      }

      /**
       * @param privateIpAddresses One or more private IPv4 addresses.
       */
      override fun privateIpAddresses(privateIpAddresses: List<Any>) {
        cdkBuilder.privateIpAddresses(privateIpAddresses)
      }

      /**
       * @param privateIpAddresses One or more private IPv4 addresses.
       */
      override fun privateIpAddresses(vararg privateIpAddresses: Any): Unit =
          privateIpAddresses(privateIpAddresses.toList())

      /**
       * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses to
       * assign to a network interface.
       */
      override fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
        cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
      }

      /**
       * @param subnetId The ID of the subnet for the network interface.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceProperty {
      /**
       * Associates a Carrier IP address with eth0 for a new network interface.
       *
       * Use this option when you launch an instance in a Wavelength Zone and want to associate a
       * Carrier IP address with the network interface. For more information about Carrier IP
       * addresses, see [Carrier IP
       * addresses](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
       * in the *AWS Wavelength Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-associatecarrieripaddress)
       */
      override fun associateCarrierIpAddress(): Any? = unwrap(this).getAssociateCarrierIpAddress()

      /**
       * Associates a public IPv4 address with eth0 for a new network interface.
       *
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [Amazon VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-associatepublicipaddress)
       */
      override fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

      /**
       * A connection tracking specification for the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-connectiontrackingspecification)
       */
      override fun connectionTrackingSpecification(): Any? =
          unwrap(this).getConnectionTrackingSpecification()

      /**
       * Indicates whether the network interface is deleted when the instance is terminated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-deleteontermination)
       */
      override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      /**
       * A description for the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The device index for the network interface attachment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-deviceindex)
       */
      override fun deviceIndex(): Number? = unwrap(this).getDeviceIndex()

      /**
       * The ENA Express configuration for the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-enasrdspecification)
       */
      override fun enaSrdSpecification(): Any? = unwrap(this).getEnaSrdSpecification()

      /**
       * The IDs of one or more security groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-groups)
       */
      override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

      /**
       * The type of network interface.
       *
       * To create an Elastic Fabric Adapter (EFA), specify `efa` . For more information, see
       * [Elastic Fabric Adapter](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/efa.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       * If you are not creating an EFA, specify `interface` or omit this parameter.
       *
       * Valid values: `interface` | `efa`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-interfacetype)
       */
      override fun interfaceType(): String? = unwrap(this).getInterfaceType()

      /**
       * The number of IPv4 prefixes to be automatically assigned to the network interface.
       *
       * You cannot use this option if you use the `Ipv4Prefix` option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv4prefixcount)
       */
      override fun ipv4PrefixCount(): Number? = unwrap(this).getIpv4PrefixCount()

      /**
       * One or more IPv4 prefixes to be assigned to the network interface.
       *
       * You cannot use this option if you use the `Ipv4PrefixCount` option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv4prefixes)
       */
      override fun ipv4Prefixes(): Any? = unwrap(this).getIpv4Prefixes()

      /**
       * The number of IPv6 addresses to assign to a network interface.
       *
       * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You can't use
       * this option if specifying specific IPv6 addresses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6addresscount)
       */
      override fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

      /**
       * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet.
       *
       * You can't use this option if you're specifying a number of IPv6 addresses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6addresses)
       */
      override fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

      /**
       * The number of IPv6 prefixes to be automatically assigned to the network interface.
       *
       * You cannot use this option if you use the `Ipv6Prefix` option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6prefixcount)
       */
      override fun ipv6PrefixCount(): Number? = unwrap(this).getIpv6PrefixCount()

      /**
       * One or more IPv6 prefixes to be assigned to the network interface.
       *
       * You cannot use this option if you use the `Ipv6PrefixCount` option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-ipv6prefixes)
       */
      override fun ipv6Prefixes(): Any? = unwrap(this).getIpv6Prefixes()

      /**
       * The index of the network card.
       *
       * Some instance types support multiple network cards. The primary network interface must be
       * assigned to network card index 0. The default is network card index 0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-networkcardindex)
       */
      override fun networkCardIndex(): Number? = unwrap(this).getNetworkCardIndex()

      /**
       * The ID of the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-networkinterfaceid)
       */
      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      /**
       * The primary IPv6 address of the network interface.
       *
       * When you enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA will be made
       * the primary IPv6 address until the instance is terminated or the network interface is
       * detached. For more information about primary IPv6 addresses, see
       * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-primaryipv6)
       */
      override fun primaryIpv6(): Any? = unwrap(this).getPrimaryIpv6()

      /**
       * The primary private IPv4 address of the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-privateipaddress)
       */
      override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

      /**
       * One or more private IPv4 addresses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-privateipaddresses)
       */
      override fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

      /**
       * The number of secondary private IPv4 addresses to assign to a network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-secondaryprivateipaddresscount)
       */
      override fun secondaryPrivateIpAddressCount(): Number? =
          unwrap(this).getSecondaryPrivateIpAddressCount()

      /**
       * The ID of the subnet for the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html#cfn-ec2-launchtemplate-networkinterface-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty):
          NetworkInterfaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty
    }
  }

  /**
   * The minimum and maximum amount of total local storage, in GB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * TotalLocalStorageGBProperty totalLocalStorageGBProperty = TotalLocalStorageGBProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-totallocalstoragegb.html)
   */
  public interface TotalLocalStorageGBProperty {
    /**
     * The maximum amount of total local storage, in GB.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-totallocalstoragegb.html#cfn-ec2-launchtemplate-totallocalstoragegb-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of total local storage, in GB.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-totallocalstoragegb.html#cfn-ec2-launchtemplate-totallocalstoragegb-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [TotalLocalStorageGBProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of total local storage, in GB.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of total local storage, in GB.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty.builder()

      /**
       * @param max The maximum amount of total local storage, in GB.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of total local storage, in GB.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty,
    ) : CdkObject(cdkObject), TotalLocalStorageGBProperty {
      /**
       * The maximum amount of total local storage, in GB.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-totallocalstoragegb.html#cfn-ec2-launchtemplate-totallocalstoragegb-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of total local storage, in GB.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-totallocalstoragegb.html#cfn-ec2-launchtemplate-totallocalstoragegb-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TotalLocalStorageGBProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty):
          TotalLocalStorageGBProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TotalLocalStorageGBProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty
    }
  }

  /**
   * Amazon Elastic Graphics reached end of life on January 8, 2024.
   *
   * For workloads that require graphics acceleration, we recommend that you use Amazon EC2 G4ad,
   * G4dn, or G5 instances.
   *
   * Specifies a specification for an Elastic GPU for an Amazon EC2 launch template.
   *
   * `ElasticGpuSpecification` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ElasticGpuSpecificationProperty elasticGpuSpecificationProperty =
   * ElasticGpuSpecificationProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-elasticgpuspecification.html)
   */
  public interface ElasticGpuSpecificationProperty {
    /**
     * The type of Elastic Graphics accelerator.
     *
     * For more information about the values to specify for `Type` , see [Elastic Graphics
     * Basics](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics)
     * , specifically the Elastic Graphics accelerator column, in the *Amazon Elastic Compute Cloud
     * User Guide for Windows Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-elasticgpuspecification.html#cfn-ec2-launchtemplate-elasticgpuspecification-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ElasticGpuSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of Elastic Graphics accelerator.
       * For more information about the values to specify for `Type` , see [Elastic Graphics
       * Basics](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics)
       * , specifically the Elastic Graphics accelerator column, in the *Amazon Elastic Compute Cloud
       * User Guide for Windows Instances* .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty.builder()

      /**
       * @param type The type of Elastic Graphics accelerator.
       * For more information about the values to specify for `Type` , see [Elastic Graphics
       * Basics](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics)
       * , specifically the Elastic Graphics accelerator column, in the *Amazon Elastic Compute Cloud
       * User Guide for Windows Instances* .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty,
    ) : CdkObject(cdkObject), ElasticGpuSpecificationProperty {
      /**
       * The type of Elastic Graphics accelerator.
       *
       * For more information about the values to specify for `Type` , see [Elastic Graphics
       * Basics](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics)
       * , specifically the Elastic Graphics accelerator column, in the *Amazon Elastic Compute Cloud
       * User Guide for Windows Instances* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-elasticgpuspecification.html#cfn-ec2-launchtemplate-elasticgpuspecification-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticGpuSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty):
          ElasticGpuSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticGpuSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty
    }
  }

  /**
   * Specifies an elastic inference accelerator.
   *
   * `LaunchTemplateElasticInferenceAccelerator` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * LaunchTemplateElasticInferenceAcceleratorProperty
   * launchTemplateElasticInferenceAcceleratorProperty =
   * LaunchTemplateElasticInferenceAcceleratorProperty.builder()
   * .count(123)
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplateelasticinferenceaccelerator.html)
   */
  public interface LaunchTemplateElasticInferenceAcceleratorProperty {
    /**
     * The number of elastic inference accelerators to attach to the instance.
     *
     * Default: 1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplateelasticinferenceaccelerator.html#cfn-ec2-launchtemplate-launchtemplateelasticinferenceaccelerator-count)
     */
    public fun count(): Number? = unwrap(this).getCount()

    /**
     * The type of elastic inference accelerator.
     *
     * The possible values are eia1.medium, eia1.large, and eia1.xlarge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplateelasticinferenceaccelerator.html#cfn-ec2-launchtemplate-launchtemplateelasticinferenceaccelerator-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [LaunchTemplateElasticInferenceAcceleratorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param count The number of elastic inference accelerators to attach to the instance.
       * Default: 1
       */
      public fun count(count: Number)

      /**
       * @param type The type of elastic inference accelerator.
       * The possible values are eia1.medium, eia1.large, and eia1.xlarge.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty.builder()

      /**
       * @param count The number of elastic inference accelerators to attach to the instance.
       * Default: 1
       */
      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      /**
       * @param type The type of elastic inference accelerator.
       * The possible values are eia1.medium, eia1.large, and eia1.xlarge.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty,
    ) : CdkObject(cdkObject), LaunchTemplateElasticInferenceAcceleratorProperty {
      /**
       * The number of elastic inference accelerators to attach to the instance.
       *
       * Default: 1
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplateelasticinferenceaccelerator.html#cfn-ec2-launchtemplate-launchtemplateelasticinferenceaccelerator-count)
       */
      override fun count(): Number? = unwrap(this).getCount()

      /**
       * The type of elastic inference accelerator.
       *
       * The possible values are eia1.medium, eia1.large, and eia1.xlarge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplateelasticinferenceaccelerator.html#cfn-ec2-launchtemplate-launchtemplateelasticinferenceaccelerator-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateElasticInferenceAcceleratorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty):
          LaunchTemplateElasticInferenceAcceleratorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateElasticInferenceAcceleratorProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty
    }
  }

  /**
   * Parameters for a block device for an EBS volume in an Amazon EC2 launch template.
   *
   * `Ebs` is a property of [AWS::EC2::LaunchTemplate
   * BlockDeviceMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * EbsProperty ebsProperty = EbsProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .kmsKeyId("kmsKeyId")
   * .snapshotId("snapshotId")
   * .throughput(123)
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html)
   */
  public interface EbsProperty {
    /**
     * Indicates whether the EBS volume is deleted on instance termination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-deleteontermination)
     */
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    /**
     * Indicates whether the EBS volume is encrypted.
     *
     * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. If
     * you are creating a volume from a snapshot, you can't specify an encryption value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-encrypted)
     */
    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * The number of I/O operations per second (IOPS).
     *
     * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
     * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
     * volume and the rate at which the volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type:
     *
     * * `gp3` : 3,000 - 16,000 IOPS
     * * `io1` : 100 - 64,000 IOPS
     * * `io2` : 100 - 256,000 IOPS
     *
     * For `io2` volumes, you can achieve up to 256,000 IOPS on [instances built on the Nitro
     * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * . On other instances, you can achieve performance up to 32,000 IOPS.
     *
     * This parameter is supported for `io1` , `io2` , and `gp3` volumes only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The ARN of the symmetric AWS Key Management Service ( AWS KMS ) CMK used for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The ID of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-snapshotid)
     */
    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    /**
     * The throughput to provision for a `gp3` volume, with a maximum of 1,000 MiB/s.
     *
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-throughput)
     */
    public fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The size of the volume, in GiBs.
     *
     * You must specify either a snapshot ID or a volume size. The following are the supported
     * volumes sizes for each volume type:
     *
     * * `gp2` and `gp3` : 1 - 16,384 GiB
     * * `io1` : 4 - 16,384 GiB
     * * `io2` : 4 - 65,536 GiB
     * * `st1` and `sc1` : 125 - 16,384 GiB
     * * `standard` : 1 - 1024 GiB
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-volumesize)
     */
    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * The volume type.
     *
     * For more information, see [Amazon EBS volume
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
     * Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-volumetype)
     */
    public fun volumeType(): String? = unwrap(this).getVolumeType()

    /**
     * A builder for [EbsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
       * termination.
       */
      public fun deleteOnTermination(deleteOnTermination: Boolean)

      /**
       * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
       * termination.
       */
      public fun deleteOnTermination(deleteOnTermination: IResolvable)

      /**
       * @param encrypted Indicates whether the EBS volume is encrypted.
       * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. If
       * you are creating a volume from a snapshot, you can't specify an encryption value.
       */
      public fun encrypted(encrypted: Boolean)

      /**
       * @param encrypted Indicates whether the EBS volume is encrypted.
       * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. If
       * you are creating a volume from a snapshot, you can't specify an encryption value.
       */
      public fun encrypted(encrypted: IResolvable)

      /**
       * @param iops The number of I/O operations per second (IOPS).
       * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
       * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
       * volume and the rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type:
       *
       * * `gp3` : 3,000 - 16,000 IOPS
       * * `io1` : 100 - 64,000 IOPS
       * * `io2` : 100 - 256,000 IOPS
       *
       * For `io2` volumes, you can achieve up to 256,000 IOPS on [instances built on the Nitro
       * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
       * . On other instances, you can achieve performance up to 32,000 IOPS.
       *
       * This parameter is supported for `io1` , `io2` , and `gp3` volumes only.
       */
      public fun iops(iops: Number)

      /**
       * @param kmsKeyId The ARN of the symmetric AWS Key Management Service ( AWS KMS ) CMK used
       * for encryption.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param snapshotId The ID of the snapshot.
       */
      public fun snapshotId(snapshotId: String)

      /**
       * @param throughput The throughput to provision for a `gp3` volume, with a maximum of 1,000
       * MiB/s.
       * Valid Range: Minimum value of 125. Maximum value of 1000.
       */
      public fun throughput(throughput: Number)

      /**
       * @param volumeSize The size of the volume, in GiBs.
       * You must specify either a snapshot ID or a volume size. The following are the supported
       * volumes sizes for each volume type:
       *
       * * `gp2` and `gp3` : 1 - 16,384 GiB
       * * `io1` : 4 - 16,384 GiB
       * * `io2` : 4 - 65,536 GiB
       * * `st1` and `sc1` : 125 - 16,384 GiB
       * * `standard` : 1 - 1024 GiB
       */
      public fun volumeSize(volumeSize: Number)

      /**
       * @param volumeType The volume type.
       * For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty.builder()

      /**
       * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
       * termination.
       */
      override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      /**
       * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
       * termination.
       */
      override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      /**
       * @param encrypted Indicates whether the EBS volume is encrypted.
       * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. If
       * you are creating a volume from a snapshot, you can't specify an encryption value.
       */
      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      /**
       * @param encrypted Indicates whether the EBS volume is encrypted.
       * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. If
       * you are creating a volume from a snapshot, you can't specify an encryption value.
       */
      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      /**
       * @param iops The number of I/O operations per second (IOPS).
       * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
       * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
       * volume and the rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type:
       *
       * * `gp3` : 3,000 - 16,000 IOPS
       * * `io1` : 100 - 64,000 IOPS
       * * `io2` : 100 - 256,000 IOPS
       *
       * For `io2` volumes, you can achieve up to 256,000 IOPS on [instances built on the Nitro
       * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
       * . On other instances, you can achieve performance up to 32,000 IOPS.
       *
       * This parameter is supported for `io1` , `io2` , and `gp3` volumes only.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param kmsKeyId The ARN of the symmetric AWS Key Management Service ( AWS KMS ) CMK used
       * for encryption.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param snapshotId The ID of the snapshot.
       */
      override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      /**
       * @param throughput The throughput to provision for a `gp3` volume, with a maximum of 1,000
       * MiB/s.
       * Valid Range: Minimum value of 125. Maximum value of 1000.
       */
      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      /**
       * @param volumeSize The size of the volume, in GiBs.
       * You must specify either a snapshot ID or a volume size. The following are the supported
       * volumes sizes for each volume type:
       *
       * * `gp2` and `gp3` : 1 - 16,384 GiB
       * * `io1` : 4 - 16,384 GiB
       * * `io2` : 4 - 65,536 GiB
       * * `st1` and `sc1` : 125 - 16,384 GiB
       * * `standard` : 1 - 1024 GiB
       */
      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      /**
       * @param volumeType The volume type.
       * For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty,
    ) : CdkObject(cdkObject), EbsProperty {
      /**
       * Indicates whether the EBS volume is deleted on instance termination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-deleteontermination)
       */
      override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      /**
       * Indicates whether the EBS volume is encrypted.
       *
       * Encrypted volumes can only be attached to instances that support Amazon EBS encryption. If
       * you are creating a volume from a snapshot, you can't specify an encryption value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-encrypted)
       */
      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      /**
       * The number of I/O operations per second (IOPS).
       *
       * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
       * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
       * volume and the rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type:
       *
       * * `gp3` : 3,000 - 16,000 IOPS
       * * `io1` : 100 - 64,000 IOPS
       * * `io2` : 100 - 256,000 IOPS
       *
       * For `io2` volumes, you can achieve up to 256,000 IOPS on [instances built on the Nitro
       * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
       * . On other instances, you can achieve performance up to 32,000 IOPS.
       *
       * This parameter is supported for `io1` , `io2` , and `gp3` volumes only.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The ARN of the symmetric AWS Key Management Service ( AWS KMS ) CMK used for encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The ID of the snapshot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-snapshotid)
       */
      override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      /**
       * The throughput to provision for a `gp3` volume, with a maximum of 1,000 MiB/s.
       *
       * Valid Range: Minimum value of 125. Maximum value of 1000.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-throughput)
       */
      override fun throughput(): Number? = unwrap(this).getThroughput()

      /**
       * The size of the volume, in GiBs.
       *
       * You must specify either a snapshot ID or a volume size. The following are the supported
       * volumes sizes for each volume type:
       *
       * * `gp2` and `gp3` : 1 - 16,384 GiB
       * * `io1` : 4 - 16,384 GiB
       * * `io2` : 4 - 65,536 GiB
       * * `st1` and `sc1` : 125 - 16,384 GiB
       * * `standard` : 1 - 1024 GiB
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-volumesize)
       */
      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      /**
       * The volume type.
       *
       * For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ebs.html#cfn-ec2-launchtemplate-ebs-volumetype)
       */
      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty):
          EbsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty
    }
  }

  /**
   * Specifies the market (purchasing) option for an instance.
   *
   * `InstanceMarketOptions` is a property of the [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * InstanceMarketOptionsProperty instanceMarketOptionsProperty =
   * InstanceMarketOptionsProperty.builder()
   * .marketType("marketType")
   * .spotOptions(SpotOptionsProperty.builder()
   * .blockDurationMinutes(123)
   * .instanceInterruptionBehavior("instanceInterruptionBehavior")
   * .maxPrice("maxPrice")
   * .spotInstanceType("spotInstanceType")
   * .validUntil("validUntil")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancemarketoptions.html)
   */
  public interface InstanceMarketOptionsProperty {
    /**
     * The market type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancemarketoptions.html#cfn-ec2-launchtemplate-instancemarketoptions-markettype)
     */
    public fun marketType(): String? = unwrap(this).getMarketType()

    /**
     * The options for Spot Instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancemarketoptions.html#cfn-ec2-launchtemplate-instancemarketoptions-spotoptions)
     */
    public fun spotOptions(): Any? = unwrap(this).getSpotOptions()

    /**
     * A builder for [InstanceMarketOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param marketType The market type.
       */
      public fun marketType(marketType: String)

      /**
       * @param spotOptions The options for Spot Instances.
       */
      public fun spotOptions(spotOptions: IResolvable)

      /**
       * @param spotOptions The options for Spot Instances.
       */
      public fun spotOptions(spotOptions: SpotOptionsProperty)

      /**
       * @param spotOptions The options for Spot Instances.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f744c35a1804b7b20099c6d3a34b26802557f5b5ffb6c6f41595d1880bb85894")
      public fun spotOptions(spotOptions: SpotOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty.builder()

      /**
       * @param marketType The market type.
       */
      override fun marketType(marketType: String) {
        cdkBuilder.marketType(marketType)
      }

      /**
       * @param spotOptions The options for Spot Instances.
       */
      override fun spotOptions(spotOptions: IResolvable) {
        cdkBuilder.spotOptions(spotOptions.let(IResolvable::unwrap))
      }

      /**
       * @param spotOptions The options for Spot Instances.
       */
      override fun spotOptions(spotOptions: SpotOptionsProperty) {
        cdkBuilder.spotOptions(spotOptions.let(SpotOptionsProperty::unwrap))
      }

      /**
       * @param spotOptions The options for Spot Instances.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f744c35a1804b7b20099c6d3a34b26802557f5b5ffb6c6f41595d1880bb85894")
      override fun spotOptions(spotOptions: SpotOptionsProperty.Builder.() -> Unit): Unit =
          spotOptions(SpotOptionsProperty(spotOptions))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty,
    ) : CdkObject(cdkObject), InstanceMarketOptionsProperty {
      /**
       * The market type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancemarketoptions.html#cfn-ec2-launchtemplate-instancemarketoptions-markettype)
       */
      override fun marketType(): String? = unwrap(this).getMarketType()

      /**
       * The options for Spot Instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancemarketoptions.html#cfn-ec2-launchtemplate-instancemarketoptions-spotoptions)
       */
      override fun spotOptions(): Any? = unwrap(this).getSpotOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceMarketOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty):
          InstanceMarketOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceMarketOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty
    }
  }

  /**
   * A security group connection tracking specification that enables you to set the idle timeout for
   * connection tracking on an Elastic network interface.
   *
   * For more information, see [Connection tracking
   * timeouts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#connection-tracking-timeouts)
   * in the *Amazon Elastic Compute Cloud User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ConnectionTrackingSpecificationProperty connectionTrackingSpecificationProperty =
   * ConnectionTrackingSpecificationProperty.builder()
   * .tcpEstablishedTimeout(123)
   * .udpStreamTimeout(123)
   * .udpTimeout(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-connectiontrackingspecification.html)
   */
  public interface ConnectionTrackingSpecificationProperty {
    /**
     * Timeout (in seconds) for idle TCP connections in an established state.
     *
     * Min: 60 seconds. Max: 432000 seconds (5 days). Default: 432000 seconds. Recommended: Less
     * than 432000 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-connectiontrackingspecification.html#cfn-ec2-launchtemplate-connectiontrackingspecification-tcpestablishedtimeout)
     */
    public fun tcpEstablishedTimeout(): Number? = unwrap(this).getTcpEstablishedTimeout()

    /**
     * Timeout (in seconds) for idle UDP flows classified as streams which have seen more than one
     * request-response transaction.
     *
     * Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-connectiontrackingspecification.html#cfn-ec2-launchtemplate-connectiontrackingspecification-udpstreamtimeout)
     */
    public fun udpStreamTimeout(): Number? = unwrap(this).getUdpStreamTimeout()

    /**
     * Timeout (in seconds) for idle UDP flows that have seen traffic only in a single direction or
     * a single request-response transaction.
     *
     * Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-connectiontrackingspecification.html#cfn-ec2-launchtemplate-connectiontrackingspecification-udptimeout)
     */
    public fun udpTimeout(): Number? = unwrap(this).getUdpTimeout()

    /**
     * A builder for [ConnectionTrackingSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param tcpEstablishedTimeout Timeout (in seconds) for idle TCP connections in an
       * established state.
       * Min: 60 seconds. Max: 432000 seconds (5 days). Default: 432000 seconds. Recommended: Less
       * than 432000 seconds.
       */
      public fun tcpEstablishedTimeout(tcpEstablishedTimeout: Number)

      /**
       * @param udpStreamTimeout Timeout (in seconds) for idle UDP flows classified as streams which
       * have seen more than one request-response transaction.
       * Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
       */
      public fun udpStreamTimeout(udpStreamTimeout: Number)

      /**
       * @param udpTimeout Timeout (in seconds) for idle UDP flows that have seen traffic only in a
       * single direction or a single request-response transaction.
       * Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
       */
      public fun udpTimeout(udpTimeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty.builder()

      /**
       * @param tcpEstablishedTimeout Timeout (in seconds) for idle TCP connections in an
       * established state.
       * Min: 60 seconds. Max: 432000 seconds (5 days). Default: 432000 seconds. Recommended: Less
       * than 432000 seconds.
       */
      override fun tcpEstablishedTimeout(tcpEstablishedTimeout: Number) {
        cdkBuilder.tcpEstablishedTimeout(tcpEstablishedTimeout)
      }

      /**
       * @param udpStreamTimeout Timeout (in seconds) for idle UDP flows classified as streams which
       * have seen more than one request-response transaction.
       * Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
       */
      override fun udpStreamTimeout(udpStreamTimeout: Number) {
        cdkBuilder.udpStreamTimeout(udpStreamTimeout)
      }

      /**
       * @param udpTimeout Timeout (in seconds) for idle UDP flows that have seen traffic only in a
       * single direction or a single request-response transaction.
       * Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
       */
      override fun udpTimeout(udpTimeout: Number) {
        cdkBuilder.udpTimeout(udpTimeout)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty,
    ) : CdkObject(cdkObject), ConnectionTrackingSpecificationProperty {
      /**
       * Timeout (in seconds) for idle TCP connections in an established state.
       *
       * Min: 60 seconds. Max: 432000 seconds (5 days). Default: 432000 seconds. Recommended: Less
       * than 432000 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-connectiontrackingspecification.html#cfn-ec2-launchtemplate-connectiontrackingspecification-tcpestablishedtimeout)
       */
      override fun tcpEstablishedTimeout(): Number? = unwrap(this).getTcpEstablishedTimeout()

      /**
       * Timeout (in seconds) for idle UDP flows classified as streams which have seen more than one
       * request-response transaction.
       *
       * Min: 60 seconds. Max: 180 seconds (3 minutes). Default: 180 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-connectiontrackingspecification.html#cfn-ec2-launchtemplate-connectiontrackingspecification-udpstreamtimeout)
       */
      override fun udpStreamTimeout(): Number? = unwrap(this).getUdpStreamTimeout()

      /**
       * Timeout (in seconds) for idle UDP flows that have seen traffic only in a single direction
       * or a single request-response transaction.
       *
       * Min: 30 seconds. Max: 60 seconds. Default: 30 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-connectiontrackingspecification.html#cfn-ec2-launchtemplate-connectiontrackingspecification-udptimeout)
       */
      override fun udpTimeout(): Number? = unwrap(this).getUdpTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectionTrackingSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty):
          ConnectionTrackingSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionTrackingSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty
    }
  }

  /**
   * Specifies whether your instance is configured for hibernation.
   *
   * This parameter is valid only if the instance meets the [hibernation
   * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites)
   * . For more information, see [Hibernate Your
   * Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
   * User Guide* .
   *
   * `HibernationOptions` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * HibernationOptionsProperty hibernationOptionsProperty = HibernationOptionsProperty.builder()
   * .configured(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-hibernationoptions.html)
   */
  public interface HibernationOptionsProperty {
    /**
     * If you set this parameter to `true` , the instance is enabled for hibernation.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-hibernationoptions.html#cfn-ec2-launchtemplate-hibernationoptions-configured)
     */
    public fun configured(): Any? = unwrap(this).getConfigured()

    /**
     * A builder for [HibernationOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configured If you set this parameter to `true` , the instance is enabled for
       * hibernation.
       * Default: `false`
       */
      public fun configured(configured: Boolean)

      /**
       * @param configured If you set this parameter to `true` , the instance is enabled for
       * hibernation.
       * Default: `false`
       */
      public fun configured(configured: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty.builder()

      /**
       * @param configured If you set this parameter to `true` , the instance is enabled for
       * hibernation.
       * Default: `false`
       */
      override fun configured(configured: Boolean) {
        cdkBuilder.configured(configured)
      }

      /**
       * @param configured If you set this parameter to `true` , the instance is enabled for
       * hibernation.
       * Default: `false`
       */
      override fun configured(configured: IResolvable) {
        cdkBuilder.configured(configured.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty,
    ) : CdkObject(cdkObject), HibernationOptionsProperty {
      /**
       * If you set this parameter to `true` , the instance is enabled for hibernation.
       *
       * Default: `false`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-hibernationoptions.html#cfn-ec2-launchtemplate-hibernationoptions-configured)
       */
      override fun configured(): Any? = unwrap(this).getConfigured()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HibernationOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty):
          HibernationOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HibernationOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty
    }
  }

  /**
   * Specifies an IAM instance profile, which is a container for an IAM role for your instance.
   *
   * You can use an IAM role to distribute your AWS credentials to your instances.
   *
   * If you are creating the launch template for use with an Amazon EC2 Auto Scaling group, you can
   * specify either the name or the ARN of the instance profile, but not both.
   *
   * `IamInstanceProfile` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * IamInstanceProfileProperty iamInstanceProfileProperty = IamInstanceProfileProperty.builder()
   * .arn("arn")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-iaminstanceprofile.html)
   */
  public interface IamInstanceProfileProperty {
    /**
     * The Amazon Resource Name (ARN) of the instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-iaminstanceprofile.html#cfn-ec2-launchtemplate-iaminstanceprofile-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * The name of the instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-iaminstanceprofile.html#cfn-ec2-launchtemplate-iaminstanceprofile-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [IamInstanceProfileProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the instance profile.
       */
      public fun arn(arn: String)

      /**
       * @param name The name of the instance profile.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the instance profile.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param name The name of the instance profile.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty,
    ) : CdkObject(cdkObject), IamInstanceProfileProperty {
      /**
       * The Amazon Resource Name (ARN) of the instance profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-iaminstanceprofile.html#cfn-ec2-launchtemplate-iaminstanceprofile-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()

      /**
       * The name of the instance profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-iaminstanceprofile.html#cfn-ec2-launchtemplate-iaminstanceprofile-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IamInstanceProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty):
          IamInstanceProfileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamInstanceProfileProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty
    }
  }

  /**
   * Specifies an IPv6 prefix for a network interface.
   *
   * `Ipv6PrefixSpecification` is a property of [AWS::EC2::LaunchTemplate
   * NetworkInterface](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * Ipv6PrefixSpecificationProperty ipv6PrefixSpecificationProperty =
   * Ipv6PrefixSpecificationProperty.builder()
   * .ipv6Prefix("ipv6Prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6prefixspecification.html)
   */
  public interface Ipv6PrefixSpecificationProperty {
    /**
     * The IPv6 prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6prefixspecification.html#cfn-ec2-launchtemplate-ipv6prefixspecification-ipv6prefix)
     */
    public fun ipv6Prefix(): String? = unwrap(this).getIpv6Prefix()

    /**
     * A builder for [Ipv6PrefixSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipv6Prefix The IPv6 prefix.
       */
      public fun ipv6Prefix(ipv6Prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty.builder()

      /**
       * @param ipv6Prefix The IPv6 prefix.
       */
      override fun ipv6Prefix(ipv6Prefix: String) {
        cdkBuilder.ipv6Prefix(ipv6Prefix)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty,
    ) : CdkObject(cdkObject), Ipv6PrefixSpecificationProperty {
      /**
       * The IPv6 prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6prefixspecification.html#cfn-ec2-launchtemplate-ipv6prefixspecification-ipv6prefix)
       */
      override fun ipv6Prefix(): String? = unwrap(this).getIpv6Prefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Ipv6PrefixSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty):
          Ipv6PrefixSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ipv6PrefixSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty
    }
  }

  /**
   * The hostname type for EC2 instances launched into this subnet and how DNS A and AAAA record
   * queries should be handled.
   *
   * For more information, see [Amazon EC2 instance hostname
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PrivateDnsNameOptionsProperty privateDnsNameOptionsProperty =
   * PrivateDnsNameOptionsProperty.builder()
   * .enableResourceNameDnsAaaaRecord(false)
   * .enableResourceNameDnsARecord(false)
   * .hostnameType("hostnameType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privatednsnameoptions.html)
   */
  public interface PrivateDnsNameOptionsProperty {
    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privatednsnameoptions.html#cfn-ec2-launchtemplate-privatednsnameoptions-enableresourcenamednsarecord)
     */
    public fun enableResourceNameDnsARecord(): Any? = unwrap(this).getEnableResourceNameDnsARecord()

    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privatednsnameoptions.html#cfn-ec2-launchtemplate-privatednsnameoptions-enableresourcenamednsaaaarecord)
     */
    public fun enableResourceNameDnsAaaaRecord(): Any? =
        unwrap(this).getEnableResourceNameDnsAaaaRecord()

    /**
     * The type of hostname for EC2 instances.
     *
     * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
     * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
     * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID. For
     * more information, see [Amazon EC2 instance hostname
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privatednsnameoptions.html#cfn-ec2-launchtemplate-privatednsnameoptions-hostnametype)
     */
    public fun hostnameType(): String? = unwrap(this).getHostnameType()

    /**
     * A builder for [PrivateDnsNameOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS A records.
       */
      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean)

      /**
       * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS A records.
       */
      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable)

      /**
       * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS AAAA records.
       */
      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean)

      /**
       * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS AAAA records.
       */
      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable)

      /**
       * @param hostnameType The type of hostname for EC2 instances.
       * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
       * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
       * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun hostnameType(hostnameType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty.builder()

      /**
       * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS A records.
       */
      override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
      }

      /**
       * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS A records.
       */
      override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord.let(IResolvable::unwrap))
      }

      /**
       * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS AAAA records.
       */
      override fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
      }

      /**
       * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS AAAA records.
       */
      override fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord.let(IResolvable::unwrap))
      }

      /**
       * @param hostnameType The type of hostname for EC2 instances.
       * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
       * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
       * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun hostnameType(hostnameType: String) {
        cdkBuilder.hostnameType(hostnameType)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty,
    ) : CdkObject(cdkObject), PrivateDnsNameOptionsProperty {
      /**
       * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privatednsnameoptions.html#cfn-ec2-launchtemplate-privatednsnameoptions-enableresourcenamednsarecord)
       */
      override fun enableResourceNameDnsARecord(): Any? =
          unwrap(this).getEnableResourceNameDnsARecord()

      /**
       * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privatednsnameoptions.html#cfn-ec2-launchtemplate-privatednsnameoptions-enableresourcenamednsaaaarecord)
       */
      override fun enableResourceNameDnsAaaaRecord(): Any? =
          unwrap(this).getEnableResourceNameDnsAaaaRecord()

      /**
       * The type of hostname for EC2 instances.
       *
       * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
       * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
       * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privatednsnameoptions.html#cfn-ec2-launchtemplate-privatednsnameoptions-hostnametype)
       */
      override fun hostnameType(): String? = unwrap(this).getHostnameType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateDnsNameOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty):
          PrivateDnsNameOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateDnsNameOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty
    }
  }

  /**
   * The metadata options for the instance.
   *
   * For more information, see [Instance metadata and user
   * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
   * *Amazon EC2 User Guide* .
   *
   * `MetadataOptions` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * MetadataOptionsProperty metadataOptionsProperty = MetadataOptionsProperty.builder()
   * .httpEndpoint("httpEndpoint")
   * .httpProtocolIpv6("httpProtocolIpv6")
   * .httpPutResponseHopLimit(123)
   * .httpTokens("httpTokens")
   * .instanceMetadataTags("instanceMetadataTags")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html)
   */
  public interface MetadataOptionsProperty {
    /**
     * Enables or disables the HTTP metadata endpoint on your instances.
     *
     * If the parameter is not specified, the default state is `enabled` .
     *
     *
     * If you specify a value of `disabled` , you will not be able to access your instance metadata.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html#cfn-ec2-launchtemplate-metadataoptions-httpendpoint)
     */
    public fun httpEndpoint(): String? = unwrap(this).getHttpEndpoint()

    /**
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     *
     * Default: `disabled`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html#cfn-ec2-launchtemplate-metadataoptions-httpprotocolipv6)
     */
    public fun httpProtocolIpv6(): String? = unwrap(this).getHttpProtocolIpv6()

    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     *
     * The larger the number, the further instance metadata requests can travel.
     *
     * Default: `1`
     *
     * Possible values: Integers from 1 to 64
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html#cfn-ec2-launchtemplate-metadataoptions-httpputresponsehoplimit)
     */
    public fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

    /**
     * Indicates whether IMDSv2 is required.
     *
     * * `optional` - IMDSv2 is optional. You can choose whether to send a session token in your
     * instance metadata retrieval requests. If you retrieve IAM role credentials without a session
     * token, you receive the IMDSv1 role credentials. If you retrieve IAM role credentials using a
     * valid session token, you receive the IMDSv2 role credentials.
     * * `required` - IMDSv2 is required. You must send a session token in your instance metadata
     * retrieval requests. With this option, retrieving the IAM role credentials always returns IMDSv2
     * credentials; IMDSv1 credentials are not available.
     *
     * Default: If the value of `ImdsSupport` for the Amazon Machine Image (AMI) for your instance
     * is `v2.0` , the default is `required` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html#cfn-ec2-launchtemplate-metadataoptions-httptokens)
     */
    public fun httpTokens(): String? = unwrap(this).getHttpTokens()

    /**
     * Set to `enabled` to allow access to instance tags from the instance metadata.
     *
     * Set to `disabled` to turn off access to instance tags from the instance metadata. For more
     * information, see [Work with instance tags using the instance
     * metadata](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS)
     * .
     *
     * Default: `disabled`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html#cfn-ec2-launchtemplate-metadataoptions-instancemetadatatags)
     */
    public fun instanceMetadataTags(): String? = unwrap(this).getInstanceMetadataTags()

    /**
     * A builder for [MetadataOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param httpEndpoint Enables or disables the HTTP metadata endpoint on your instances.
       * If the parameter is not specified, the default state is `enabled` .
       *
       *
       * If you specify a value of `disabled` , you will not be able to access your instance
       * metadata.
       */
      public fun httpEndpoint(httpEndpoint: String)

      /**
       * @param httpProtocolIpv6 Enables or disables the IPv6 endpoint for the instance metadata
       * service.
       * Default: `disabled`
       */
      public fun httpProtocolIpv6(httpProtocolIpv6: String)

      /**
       * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance
       * metadata requests.
       * The larger the number, the further instance metadata requests can travel.
       *
       * Default: `1`
       *
       * Possible values: Integers from 1 to 64
       */
      public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number)

      /**
       * @param httpTokens Indicates whether IMDSv2 is required.
       * * `optional` - IMDSv2 is optional. You can choose whether to send a session token in your
       * instance metadata retrieval requests. If you retrieve IAM role credentials without a session
       * token, you receive the IMDSv1 role credentials. If you retrieve IAM role credentials using a
       * valid session token, you receive the IMDSv2 role credentials.
       * * `required` - IMDSv2 is required. You must send a session token in your instance metadata
       * retrieval requests. With this option, retrieving the IAM role credentials always returns
       * IMDSv2 credentials; IMDSv1 credentials are not available.
       *
       * Default: If the value of `ImdsSupport` for the Amazon Machine Image (AMI) for your instance
       * is `v2.0` , the default is `required` .
       */
      public fun httpTokens(httpTokens: String)

      /**
       * @param instanceMetadataTags Set to `enabled` to allow access to instance tags from the
       * instance metadata.
       * Set to `disabled` to turn off access to instance tags from the instance metadata. For more
       * information, see [Work with instance tags using the instance
       * metadata](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS)
       * .
       *
       * Default: `disabled`
       */
      public fun instanceMetadataTags(instanceMetadataTags: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty.builder()

      /**
       * @param httpEndpoint Enables or disables the HTTP metadata endpoint on your instances.
       * If the parameter is not specified, the default state is `enabled` .
       *
       *
       * If you specify a value of `disabled` , you will not be able to access your instance
       * metadata.
       */
      override fun httpEndpoint(httpEndpoint: String) {
        cdkBuilder.httpEndpoint(httpEndpoint)
      }

      /**
       * @param httpProtocolIpv6 Enables or disables the IPv6 endpoint for the instance metadata
       * service.
       * Default: `disabled`
       */
      override fun httpProtocolIpv6(httpProtocolIpv6: String) {
        cdkBuilder.httpProtocolIpv6(httpProtocolIpv6)
      }

      /**
       * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance
       * metadata requests.
       * The larger the number, the further instance metadata requests can travel.
       *
       * Default: `1`
       *
       * Possible values: Integers from 1 to 64
       */
      override fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
      }

      /**
       * @param httpTokens Indicates whether IMDSv2 is required.
       * * `optional` - IMDSv2 is optional. You can choose whether to send a session token in your
       * instance metadata retrieval requests. If you retrieve IAM role credentials without a session
       * token, you receive the IMDSv1 role credentials. If you retrieve IAM role credentials using a
       * valid session token, you receive the IMDSv2 role credentials.
       * * `required` - IMDSv2 is required. You must send a session token in your instance metadata
       * retrieval requests. With this option, retrieving the IAM role credentials always returns
       * IMDSv2 credentials; IMDSv1 credentials are not available.
       *
       * Default: If the value of `ImdsSupport` for the Amazon Machine Image (AMI) for your instance
       * is `v2.0` , the default is `required` .
       */
      override fun httpTokens(httpTokens: String) {
        cdkBuilder.httpTokens(httpTokens)
      }

      /**
       * @param instanceMetadataTags Set to `enabled` to allow access to instance tags from the
       * instance metadata.
       * Set to `disabled` to turn off access to instance tags from the instance metadata. For more
       * information, see [Work with instance tags using the instance
       * metadata](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS)
       * .
       *
       * Default: `disabled`
       */
      override fun instanceMetadataTags(instanceMetadataTags: String) {
        cdkBuilder.instanceMetadataTags(instanceMetadataTags)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty,
    ) : CdkObject(cdkObject), MetadataOptionsProperty {
      /**
       * Enables or disables the HTTP metadata endpoint on your instances.
       *
       * If the parameter is not specified, the default state is `enabled` .
       *
       *
       * If you specify a value of `disabled` , you will not be able to access your instance
       * metadata.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html#cfn-ec2-launchtemplate-metadataoptions-httpendpoint)
       */
      override fun httpEndpoint(): String? = unwrap(this).getHttpEndpoint()

      /**
       * Enables or disables the IPv6 endpoint for the instance metadata service.
       *
       * Default: `disabled`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html#cfn-ec2-launchtemplate-metadataoptions-httpprotocolipv6)
       */
      override fun httpProtocolIpv6(): String? = unwrap(this).getHttpProtocolIpv6()

      /**
       * The desired HTTP PUT response hop limit for instance metadata requests.
       *
       * The larger the number, the further instance metadata requests can travel.
       *
       * Default: `1`
       *
       * Possible values: Integers from 1 to 64
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html#cfn-ec2-launchtemplate-metadataoptions-httpputresponsehoplimit)
       */
      override fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

      /**
       * Indicates whether IMDSv2 is required.
       *
       * * `optional` - IMDSv2 is optional. You can choose whether to send a session token in your
       * instance metadata retrieval requests. If you retrieve IAM role credentials without a session
       * token, you receive the IMDSv1 role credentials. If you retrieve IAM role credentials using a
       * valid session token, you receive the IMDSv2 role credentials.
       * * `required` - IMDSv2 is required. You must send a session token in your instance metadata
       * retrieval requests. With this option, retrieving the IAM role credentials always returns
       * IMDSv2 credentials; IMDSv1 credentials are not available.
       *
       * Default: If the value of `ImdsSupport` for the Amazon Machine Image (AMI) for your instance
       * is `v2.0` , the default is `required` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html#cfn-ec2-launchtemplate-metadataoptions-httptokens)
       */
      override fun httpTokens(): String? = unwrap(this).getHttpTokens()

      /**
       * Set to `enabled` to allow access to instance tags from the instance metadata.
       *
       * Set to `disabled` to turn off access to instance tags from the instance metadata. For more
       * information, see [Work with instance tags using the instance
       * metadata](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS)
       * .
       *
       * Default: `disabled`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-metadataoptions.html#cfn-ec2-launchtemplate-metadataoptions-instancemetadatatags)
       */
      override fun instanceMetadataTags(): String? = unwrap(this).getInstanceMetadataTags()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty):
          MetadataOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty
    }
  }

  /**
   * Specifies the credit option for CPU usage of a T2, T3, or T3a instance.
   *
   * `CreditSpecification` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * CreditSpecificationProperty creditSpecificationProperty = CreditSpecificationProperty.builder()
   * .cpuCredits("cpuCredits")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-creditspecification.html)
   */
  public interface CreditSpecificationProperty {
    /**
     * The credit option for CPU usage of a T instance.
     *
     * Valid values: `standard` | `unlimited`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-creditspecification.html#cfn-ec2-launchtemplate-creditspecification-cpucredits)
     */
    public fun cpuCredits(): String? = unwrap(this).getCpuCredits()

    /**
     * A builder for [CreditSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpuCredits The credit option for CPU usage of a T instance.
       * Valid values: `standard` | `unlimited`
       */
      public fun cpuCredits(cpuCredits: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty.builder()

      /**
       * @param cpuCredits The credit option for CPU usage of a T instance.
       * Valid values: `standard` | `unlimited`
       */
      override fun cpuCredits(cpuCredits: String) {
        cdkBuilder.cpuCredits(cpuCredits)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty,
    ) : CdkObject(cdkObject), CreditSpecificationProperty {
      /**
       * The credit option for CPU usage of a T instance.
       *
       * Valid values: `standard` | `unlimited`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-creditspecification.html#cfn-ec2-launchtemplate-creditspecification-cpucredits)
       */
      override fun cpuCredits(): String? = unwrap(this).getCpuCredits()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CreditSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty):
          CreditSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreditSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty
    }
  }

  /**
   * The minimum and maximum amount of memory per vCPU, in GiB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * MemoryGiBPerVCpuProperty memoryGiBPerVCpuProperty = MemoryGiBPerVCpuProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-memorygibpervcpu.html)
   */
  public interface MemoryGiBPerVCpuProperty {
    /**
     * The maximum amount of memory per vCPU, in GiB.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-memorygibpervcpu.html#cfn-ec2-launchtemplate-memorygibpervcpu-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of memory per vCPU, in GiB.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-memorygibpervcpu.html#cfn-ec2-launchtemplate-memorygibpervcpu-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [MemoryGiBPerVCpuProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of memory per vCPU, in GiB.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of memory per vCPU, in GiB.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty.builder()

      /**
       * @param max The maximum amount of memory per vCPU, in GiB.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of memory per vCPU, in GiB.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty,
    ) : CdkObject(cdkObject), MemoryGiBPerVCpuProperty {
      /**
       * The maximum amount of memory per vCPU, in GiB.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-memorygibpervcpu.html#cfn-ec2-launchtemplate-memorygibpervcpu-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of memory per vCPU, in GiB.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-memorygibpervcpu.html#cfn-ec2-launchtemplate-memorygibpervcpu-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryGiBPerVCpuProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty):
          MemoryGiBPerVCpuProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryGiBPerVCpuProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty
    }
  }

  /**
   * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
   *
   *
   * Setting the minimum bandwidth does not guarantee that your instance will achieve the minimum
   * bandwidth. Amazon EC2 will identify instance types that support the specified minimum bandwidth,
   * but the actual bandwidth of your instance might go below the specified minimum at times. For more
   * information, see [Available instance
   * bandwidth](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-network-bandwidth.html#available-instance-bandwidth)
   * in the *Amazon EC2 User Guide* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * NetworkBandwidthGbpsProperty networkBandwidthGbpsProperty =
   * NetworkBandwidthGbpsProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkbandwidthgbps.html)
   */
  public interface NetworkBandwidthGbpsProperty {
    /**
     * The maximum amount of network bandwidth, in Gbps.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkbandwidthgbps.html#cfn-ec2-launchtemplate-networkbandwidthgbps-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of network bandwidth, in Gbps.
     *
     * If this parameter is not specified, there is no minimum limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkbandwidthgbps.html#cfn-ec2-launchtemplate-networkbandwidthgbps-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [NetworkBandwidthGbpsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of network bandwidth, in Gbps.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of network bandwidth, in Gbps.
       * If this parameter is not specified, there is no minimum limit.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty.builder()

      /**
       * @param max The maximum amount of network bandwidth, in Gbps.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of network bandwidth, in Gbps.
       * If this parameter is not specified, there is no minimum limit.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty,
    ) : CdkObject(cdkObject), NetworkBandwidthGbpsProperty {
      /**
       * The maximum amount of network bandwidth, in Gbps.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkbandwidthgbps.html#cfn-ec2-launchtemplate-networkbandwidthgbps-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of network bandwidth, in Gbps.
       *
       * If this parameter is not specified, there is no minimum limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkbandwidthgbps.html#cfn-ec2-launchtemplate-networkbandwidthgbps-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkBandwidthGbpsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty):
          NetworkBandwidthGbpsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkBandwidthGbpsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty
    }
  }

  /**
   * Specifies the tags to apply to a resource when the resource is created for the launch template.
   *
   * `TagSpecification` is a property type of
   * [`TagSpecifications`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications)
   * .
   * [`TagSpecifications`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications)
   * is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html)
   */
  public interface TagSpecificationProperty {
    /**
     * The type of resource to tag.
     *
     * Valid Values lists all resource types for Amazon EC2 that can be tagged. When you create a
     * launch template, you can specify tags for the following resource types only: `instance` |
     * `volume` | `network-interface` | `spot-instances-request` . If the instance does not include the
     * resource type that you specify, the instance launch fails. For example, not all instance types
     * include a volume.
     *
     * To tag a resource after it has been created, see
     * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-resourcetype)
     */
    public fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * The tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [TagSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceType The type of resource to tag.
       * Valid Values lists all resource types for Amazon EC2 that can be tagged. When you create a
       * launch template, you can specify tags for the following resource types only: `instance` |
       * `volume` | `network-interface` | `spot-instances-request` . If the instance does not include
       * the resource type that you specify, the instance launch fails. For example, not all instance
       * types include a volume.
       *
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       */
      public fun resourceType(resourceType: String)

      /**
       * @param tags The tags to apply to the resource.
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags The tags to apply to the resource.
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty.builder()

      /**
       * @param resourceType The type of resource to tag.
       * Valid Values lists all resource types for Amazon EC2 that can be tagged. When you create a
       * launch template, you can specify tags for the following resource types only: `instance` |
       * `volume` | `network-interface` | `spot-instances-request` . If the instance does not include
       * the resource type that you specify, the instance launch fails. For example, not all instance
       * types include a volume.
       *
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      /**
       * @param tags The tags to apply to the resource.
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      /**
       * @param tags The tags to apply to the resource.
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty,
    ) : CdkObject(cdkObject), TagSpecificationProperty {
      /**
       * The type of resource to tag.
       *
       * Valid Values lists all resource types for Amazon EC2 that can be tagged. When you create a
       * launch template, you can specify tags for the following resource types only: `instance` |
       * `volume` | `network-interface` | `spot-instances-request` . If the instance does not include
       * the resource type that you specify, the instance launch fails. For example, not all instance
       * types include a volume.
       *
       * To tag a resource after it has been created, see
       * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-resourcetype)
       */
      override fun resourceType(): String? = unwrap(this).getResourceType()

      /**
       * The tags to apply to the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty):
          TagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty
    }
  }

  /**
   * The attributes for the instance types.
   *
   * When you specify instance attributes, Amazon EC2 will identify instance types with these
   * attributes.
   *
   * You must specify `VCpuCount` and `MemoryMiB` . All other attributes are optional. Any
   * unspecified optional attribute is set to its default.
   *
   * When you specify multiple attributes, you get instance types that satisfy all of the specified
   * attributes. If you specify multiple values for an attribute, you get instance types that satisfy
   * any of the specified values.
   *
   * To limit the list of instance types from which Amazon EC2 can identify matching instance types,
   * you can use one of the following parameters, but not both in the same request:
   *
   * * `AllowedInstanceTypes` - The instance types to include in the list. All other instance types
   * are ignored, even if they match your specified attributes.
   * * `ExcludedInstanceTypes` - The instance types to exclude from the list, even if they match
   * your specified attributes.
   *
   *
   * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
   *
   * Attribute-based instance type selection is only supported when using Auto Scaling groups, EC2
   * Fleet, and Spot Fleet to launch instances. If you plan to use the launch template in the [launch
   * instance
   * wizard](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-instance-wizard.html) , or
   * with the
   * [RunInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html) API
   * or
   * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * AWS CloudFormation resource, you can't specify `InstanceRequirements` .
   *
   *
   * For more information, see [Attribute-based instance type selection for EC2
   * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html)
   * , [Attribute-based instance type selection for Spot
   * Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html)
   * , and [Spot placement
   * score](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html) in the
   * *Amazon EC2 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * InstanceRequirementsProperty instanceRequirementsProperty =
   * InstanceRequirementsProperty.builder()
   * .acceleratorCount(AcceleratorCountProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
   * .acceleratorNames(List.of("acceleratorNames"))
   * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .acceleratorTypes(List.of("acceleratorTypes"))
   * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
   * .bareMetal("bareMetal")
   * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .burstablePerformance("burstablePerformance")
   * .cpuManufacturers(List.of("cpuManufacturers"))
   * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
   * .instanceGenerations(List.of("instanceGenerations"))
   * .localStorage("localStorage")
   * .localStorageTypes(List.of("localStorageTypes"))
   * .maxSpotPriceAsPercentageOfOptimalOnDemandPrice(123)
   * .memoryGiBPerVCpu(MemoryGiBPerVCpuProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .memoryMiB(MemoryMiBProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .networkBandwidthGbps(NetworkBandwidthGbpsProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .networkInterfaceCount(NetworkInterfaceCountProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .onDemandMaxPricePercentageOverLowestPrice(123)
   * .requireHibernateSupport(false)
   * .spotMaxPricePercentageOverLowestPrice(123)
   * .totalLocalStorageGb(TotalLocalStorageGBProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .vCpuCount(VCpuCountProperty.builder()
   * .max(123)
   * .min(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html)
   */
  public interface InstanceRequirementsProperty {
    /**
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) on an
     * instance.
     *
     * To exclude accelerator-enabled instance types, set `Max` to `0` .
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-acceleratorcount)
     */
    public fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

    /**
     * Indicates whether instance types must have accelerators by specific manufacturers.
     *
     * * For instance types with AWS devices, specify `amazon-web-services` .
     * * For instance types with AMD devices, specify `amd` .
     * * For instance types with Habana devices, specify `habana` .
     * * For instance types with NVIDIA devices, specify `nvidia` .
     * * For instance types with Xilinx devices, specify `xilinx` .
     *
     * Default: Any manufacturer
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-acceleratormanufacturers)
     */
    public fun acceleratorManufacturers(): List<String> = unwrap(this).getAcceleratorManufacturers()
        ?: emptyList()

    /**
     * The accelerators that must be on the instance type.
     *
     * * For instance types with NVIDIA A10G GPUs, specify `a10g` .
     * * For instance types with NVIDIA A100 GPUs, specify `a100` .
     * * For instance types with NVIDIA H100 GPUs, specify `h100` .
     * * For instance types with AWS Inferentia chips, specify `inferentia` .
     * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
     * * For instance types with NVIDIA K80 GPUs, specify `k80` .
     * * For instance types with NVIDIA M60 GPUs, specify `m60` .
     * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
     * * For instance types with NVIDIA T4 GPUs, specify `t4` .
     * * For instance types with NVIDIA T4G GPUs, specify `t4g` .
     * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
     * * For instance types with NVIDIA V100 GPUs, specify `v100` .
     *
     * Default: Any accelerator
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-acceleratornames)
     */
    public fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?: emptyList()

    /**
     * The minimum and maximum amount of total accelerator memory, in MiB.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-acceleratortotalmemorymib)
     */
    public fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

    /**
     * The accelerator types that must be on the instance type.
     *
     * * For instance types with GPU accelerators, specify `gpu` .
     * * For instance types with FPGA accelerators, specify `fpga` .
     * * For instance types with inference accelerators, specify `inference` .
     *
     * Default: Any accelerator type
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-acceleratortypes)
     */
    public fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?: emptyList()

    /**
     * The instance types to apply your specified attributes against.
     *
     * All other instance types are ignored, even if they match your specified attributes.
     *
     * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to allow
     * an instance type, size, or generation. The following are examples: `m5.8xlarge` , `c5*.*` ,
     * `m5a.*` , `r*` , `*3*` .
     *
     * For example, if you specify `c5*` ,Amazon EC2 will allow the entire C5 instance family, which
     * includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will allow all the
     * M5a instance types, but not the M5n instance types.
     *
     *
     * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
     *
     *
     * Default: All instance types
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-allowedinstancetypes)
     */
    public fun allowedInstanceTypes(): List<String> = unwrap(this).getAllowedInstanceTypes() ?:
        emptyList()

    /**
     * Indicates whether bare metal instance types must be included, excluded, or required.
     *
     * * To include bare metal instance types, specify `included` .
     * * To require only bare metal instance types, specify `required` .
     * * To exclude bare metal instance types, specify `excluded` .
     *
     * Default: `excluded`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-baremetal)
     */
    public fun bareMetal(): String? = unwrap(this).getBareMetal()

    /**
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps.
     *
     * For more information, see [Amazon EBS–optimized
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
     * *Amazon EC2 User Guide* .
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-baselineebsbandwidthmbps)
     */
    public fun baselineEbsBandwidthMbps(): Any? = unwrap(this).getBaselineEbsBandwidthMbps()

    /**
     * Indicates whether burstable performance T instance types are included, excluded, or required.
     *
     * For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * .
     *
     * * To include burstable performance instance types, specify `included` .
     * * To require only burstable performance instance types, specify `required` .
     * * To exclude burstable performance instance types, specify `excluded` .
     *
     * Default: `excluded`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-burstableperformance)
     */
    public fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

    /**
     * The CPU manufacturers to include.
     *
     * * For instance types with Intel CPUs, specify `intel` .
     * * For instance types with AMD CPUs, specify `amd` .
     * * For instance types with AWS CPUs, specify `amazon-web-services` .
     *
     *
     * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with
     * a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your
     * launch template.
     *
     *
     * Default: Any manufacturer
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-cpumanufacturers)
     */
    public fun cpuManufacturers(): List<String> = unwrap(this).getCpuManufacturers() ?: emptyList()

    /**
     * The instance types to exclude.
     *
     * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
     * exclude an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
     * `c5*.*` , `m5a.*` , `r*` , `*3*` .
     *
     * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family,
     * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will exclude
     * all the M5a instance types, but not the M5n instance types.
     *
     *
     * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
     *
     *
     * Default: No excluded instance types
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-excludedinstancetypes)
     */
    public fun excludedInstanceTypes(): List<String> = unwrap(this).getExcludedInstanceTypes() ?:
        emptyList()

    /**
     * Indicates whether current or previous generation instance types are included.
     *
     * The current generation instance types are recommended for use. Current generation instance
     * types are typically the latest two to three generations in each instance family. For more
     * information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     *
     * For current generation instance types, specify `current` .
     *
     * For previous generation instance types, specify `previous` .
     *
     * Default: Current and previous generation instance types
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-instancegenerations)
     */
    public fun instanceGenerations(): List<String> = unwrap(this).getInstanceGenerations() ?:
        emptyList()

    /**
     * Indicates whether instance types with instance store volumes are included, excluded, or
     * required.
     *
     * For more information, [Amazon EC2 instance
     * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the *Amazon
     * EC2 User Guide* .
     *
     * * To include instance types with instance store volumes, specify `included` .
     * * To require only instance types with instance store volumes, specify `required` .
     * * To exclude instance types with instance store volumes, specify `excluded` .
     *
     * Default: `included`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-localstorage)
     */
    public fun localStorage(): String? = unwrap(this).getLocalStorage()

    /**
     * The type of local storage that is required.
     *
     * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
     * * For instance types with solid state drive (SSD) storage, specify `ssd` .
     *
     * Default: `hdd` and `ssd`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-localstoragetypes)
     */
    public fun localStorageTypes(): List<String> = unwrap(this).getLocalStorageTypes() ?:
        emptyList()

    /**
     * [Price protection] The price protection threshold for Spot Instances, as a percentage of an
     * identified On-Demand price.
     *
     * The identified On-Demand price is the price of the lowest priced current generation C, M, or
     * R instance type with your specified attributes. If no current generation C, M, or R instance
     * type matches your attributes, then the identified price is from the lowest priced current
     * generation instance types, and failing that, from the lowest priced previous generation instance
     * types that match your attributes. When Amazon EC2 selects instance types with your attributes,
     * it will exclude instance types whose price exceeds your specified threshold.
     *
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *
     * To indicate no price protection threshold, specify a high value, such as `999999` .
     *
     * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
     * is based on the per vCPU or per memory price instead of the per instance price.
     *
     *
     * Only one of `SpotMaxPricePercentageOverLowestPrice` or
     * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify either,
     * then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter defaults
     * to `100` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-maxspotpriceaspercentageofoptimalondemandprice)
     */
    public fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
        unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

    /**
     * The minimum and maximum amount of memory per vCPU, in GiB.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-memorygibpervcpu)
     */
    public fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

    /**
     * The minimum and maximum amount of memory, in MiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-memorymib)
     */
    public fun memoryMiB(): Any? = unwrap(this).getMemoryMiB()

    /**
     * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-networkbandwidthgbps)
     */
    public fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

    /**
     * The minimum and maximum number of network interfaces.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-networkinterfacecount)
     */
    public fun networkInterfaceCount(): Any? = unwrap(this).getNetworkInterfaceCount()

    /**
     * [Price protection] The price protection threshold for On-Demand Instances, as a percentage
     * higher than an identified On-Demand price.
     *
     * The identified On-Demand price is the price of the lowest priced current generation C, M, or
     * R instance type with your specified attributes. When Amazon EC2 selects instance types with your
     * attributes, it will exclude instance types whose price exceeds your specified threshold.
     *
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *
     * To turn off price protection, specify a high value, such as `999999` .
     *
     * This parameter is not supported for
     * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
     * and
     * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
     * .
     *
     *
     * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
     * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
     * price.
     *
     *
     * Default: `20`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-ondemandmaxpricepercentageoverlowestprice)
     */
    public fun onDemandMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getOnDemandMaxPricePercentageOverLowestPrice()

    /**
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     *
     * This parameter is not supported for
     * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
     * .
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-requirehibernatesupport)
     */
    public fun requireHibernateSupport(): Any? = unwrap(this).getRequireHibernateSupport()

    /**
     * [Price protection] The price protection threshold for Spot Instances, as a percentage higher
     * than an identified Spot price.
     *
     * The identified Spot price is the Spot price of the lowest priced current generation C, M, or
     * R instance type with your specified attributes. If no current generation C, M, or R instance
     * type matches your attributes, then the identified Spot price is from the lowest priced current
     * generation instance types, and failing that, from the lowest priced previous generation instance
     * types that match your attributes. When Amazon EC2 selects instance types with your attributes,
     * it will exclude instance types whose Spot price exceeds your specified threshold.
     *
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *
     * To indicate no price protection threshold, specify a high value, such as `999999` .
     *
     * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
     * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
     * price.
     *
     * This parameter is not supported for
     * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
     * and
     * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
     * .
     *
     *
     * Only one of `SpotMaxPricePercentageOverLowestPrice` or
     * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify either,
     * then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter defaults
     * to `100` .
     *
     *
     * Default: `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-spotmaxpricepercentageoverlowestprice)
     */
    public fun spotMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

    /**
     * The minimum and maximum amount of total local storage, in GB.
     *
     * Default: No minimum or maximum limits
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-totallocalstoragegb)
     */
    public fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

    /**
     * The minimum and maximum number of vCPUs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-vcpucount)
     */
    public fun vCpuCount(): Any? = unwrap(this).getVCpuCount()

    /**
     * A builder for [InstanceRequirementsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      public fun acceleratorCount(acceleratorCount: IResolvable)

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      public fun acceleratorCount(acceleratorCount: AcceleratorCountProperty)

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6d22fd76cabe48f089b8c237bc1c7ec9426e15e6717e466b208f0fbcf8978aa")
      public fun acceleratorCount(acceleratorCount: AcceleratorCountProperty.Builder.() -> Unit)

      /**
       * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
       * specific manufacturers.
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with Habana devices, specify `habana` .
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       */
      public fun acceleratorManufacturers(acceleratorManufacturers: List<String>)

      /**
       * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
       * specific manufacturers.
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with Habana devices, specify `habana` .
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       */
      public fun acceleratorManufacturers(vararg acceleratorManufacturers: String)

      /**
       * @param acceleratorNames The accelerators that must be on the instance type.
       * * For instance types with NVIDIA A10G GPUs, specify `a10g` .
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA H100 GPUs, specify `h100` .
       * * For instance types with AWS Inferentia chips, specify `inferentia` .
       * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA T4G GPUs, specify `t4g` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       *
       * Default: Any accelerator
       */
      public fun acceleratorNames(acceleratorNames: List<String>)

      /**
       * @param acceleratorNames The accelerators that must be on the instance type.
       * * For instance types with NVIDIA A10G GPUs, specify `a10g` .
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA H100 GPUs, specify `h100` .
       * * For instance types with AWS Inferentia chips, specify `inferentia` .
       * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA T4G GPUs, specify `t4g` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       *
       * Default: Any accelerator
       */
      public fun acceleratorNames(vararg acceleratorNames: String)

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      public fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable)

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBProperty)

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("687315408c1bb56ead021b0c0a5a9e16088665e100a889fb74ce71abbd43fa22")
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBProperty.Builder.() -> Unit)

      /**
       * @param acceleratorTypes The accelerator types that must be on the instance type.
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       */
      public fun acceleratorTypes(acceleratorTypes: List<String>)

      /**
       * @param acceleratorTypes The accelerator types that must be on the instance type.
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       */
      public fun acceleratorTypes(vararg acceleratorTypes: String)

      /**
       * @param allowedInstanceTypes The instance types to apply your specified attributes against.
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will allow the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will allow
       * all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       */
      public fun allowedInstanceTypes(allowedInstanceTypes: List<String>)

      /**
       * @param allowedInstanceTypes The instance types to apply your specified attributes against.
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will allow the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will allow
       * all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       */
      public fun allowedInstanceTypes(vararg allowedInstanceTypes: String)

      /**
       * @param bareMetal Indicates whether bare metal instance types must be included, excluded, or
       * required.
       * * To include bare metal instance types, specify `included` .
       * * To require only bare metal instance types, specify `required` .
       * * To exclude bare metal instance types, specify `excluded` .
       *
       * Default: `excluded`
       */
      public fun bareMetal(bareMetal: String)

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS,
       * in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      public fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable)

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS,
       * in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsProperty)

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS,
       * in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99ce2f9d06f918c623b5226bc75b8d59bcc2dbe40fb6a6ce2e63c42d1f8391a1")
      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsProperty.Builder.() -> Unit)

      /**
       * @param burstablePerformance Indicates whether burstable performance T instance types are
       * included, excluded, or required.
       * For more information, see [Burstable performance
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
       * .
       *
       * * To include burstable performance instance types, specify `included` .
       * * To require only burstable performance instance types, specify `required` .
       * * To exclude burstable performance instance types, specify `excluded` .
       *
       * Default: `excluded`
       */
      public fun burstablePerformance(burstablePerformance: String)

      /**
       * @param cpuManufacturers The CPU manufacturers to include.
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched
       * with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in
       * your launch template.
       *
       *
       * Default: Any manufacturer
       */
      public fun cpuManufacturers(cpuManufacturers: List<String>)

      /**
       * @param cpuManufacturers The CPU manufacturers to include.
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched
       * with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in
       * your launch template.
       *
       *
       * Default: Any manufacturer
       */
      public fun cpuManufacturers(vararg cpuManufacturers: String)

      /**
       * @param excludedInstanceTypes The instance types to exclude.
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       */
      public fun excludedInstanceTypes(excludedInstanceTypes: List<String>)

      /**
       * @param excludedInstanceTypes The instance types to exclude.
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       */
      public fun excludedInstanceTypes(vararg excludedInstanceTypes: String)

      /**
       * @param instanceGenerations Indicates whether current or previous generation instance types
       * are included.
       * The current generation instance types are recommended for use. Current generation instance
       * types are typically the latest two to three generations in each instance family. For more
       * information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide* .
       *
       * For current generation instance types, specify `current` .
       *
       * For previous generation instance types, specify `previous` .
       *
       * Default: Current and previous generation instance types
       */
      public fun instanceGenerations(instanceGenerations: List<String>)

      /**
       * @param instanceGenerations Indicates whether current or previous generation instance types
       * are included.
       * The current generation instance types are recommended for use. Current generation instance
       * types are typically the latest two to three generations in each instance family. For more
       * information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide* .
       *
       * For current generation instance types, specify `current` .
       *
       * For previous generation instance types, specify `previous` .
       *
       * Default: Current and previous generation instance types
       */
      public fun instanceGenerations(vararg instanceGenerations: String)

      /**
       * @param localStorage Indicates whether instance types with instance store volumes are
       * included, excluded, or required.
       * For more information, [Amazon EC2 instance
       * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the
       * *Amazon EC2 User Guide* .
       *
       * * To include instance types with instance store volumes, specify `included` .
       * * To require only instance types with instance store volumes, specify `required` .
       * * To exclude instance types with instance store volumes, specify `excluded` .
       *
       * Default: `included`
       */
      public fun localStorage(localStorage: String)

      /**
       * @param localStorageTypes The type of local storage that is required.
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: `hdd` and `ssd`
       */
      public fun localStorageTypes(localStorageTypes: List<String>)

      /**
       * @param localStorageTypes The type of local storage that is required.
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: `hdd` and `ssd`
       */
      public fun localStorageTypes(vararg localStorageTypes: String)

      /**
       * @param maxSpotPriceAsPercentageOfOptimalOnDemandPrice [Price protection] The price
       * protection threshold for Spot Instances, as a percentage of an identified On-Demand price.
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified price is from the lowest priced
       * current generation instance types, and failing that, from the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 selects instance types
       * with your attributes, it will exclude instance types whose price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is based on the per vCPU or per memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       */
      public
          fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice: Number)

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable)

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuProperty)

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39bcea6b054460d3a4f72bf8e85c617b9de2d27b154012b8b2ffbae654835453")
      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuProperty.Builder.() -> Unit)

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      public fun memoryMiB(memoryMiB: IResolvable)

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      public fun memoryMiB(memoryMiB: MemoryMiBProperty)

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2be30fd8478496bd807b2a12ef67cfe0b5fc5f22ee2e40f86594c093e02e6352")
      public fun memoryMiB(memoryMiB: MemoryMiBProperty.Builder.() -> Unit)

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in
       * gigabits per second (Gbps).
       * Default: No minimum or maximum limits
       */
      public fun networkBandwidthGbps(networkBandwidthGbps: IResolvable)

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in
       * gigabits per second (Gbps).
       * Default: No minimum or maximum limits
       */
      public fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsProperty)

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in
       * gigabits per second (Gbps).
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1827db3ce1bb2f184bd37966238ca76dc315b92780edbf8056c5fc90eda9c716")
      public
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsProperty.Builder.() -> Unit)

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      public fun networkInterfaceCount(networkInterfaceCount: IResolvable)

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      public fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountProperty)

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fde96b2e0debdfcc33f8a0d0943f348612d4a2d2bfba0d2761c2738bdb344082")
      public
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountProperty.Builder.() -> Unit)

      /**
       * @param onDemandMaxPricePercentageOverLowestPrice [Price protection] The price protection
       * threshold for On-Demand Instances, as a percentage higher than an identified On-Demand price.
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. When Amazon EC2 selects instance types with
       * your attributes, it will exclude instance types whose price exceeds your specified threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To turn off price protection, specify a high value, such as `999999` .
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * and
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * .
       *
       *
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
       * price.
       *
       *
       * Default: `20`
       */
      public
          fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number)

      /**
       * @param requireHibernateSupport Indicates whether instance types must support hibernation
       * for On-Demand Instances.
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * .
       *
       * Default: `false`
       */
      public fun requireHibernateSupport(requireHibernateSupport: Boolean)

      /**
       * @param requireHibernateSupport Indicates whether instance types must support hibernation
       * for On-Demand Instances.
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * .
       *
       * Default: `false`
       */
      public fun requireHibernateSupport(requireHibernateSupport: IResolvable)

      /**
       * @param spotMaxPricePercentageOverLowestPrice [Price protection] The price protection
       * threshold for Spot Instances, as a percentage higher than an identified Spot price.
       * The identified Spot price is the Spot price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified Spot price is from the lowest
       * priced current generation instance types, and failing that, from the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 selects instance types
       * with your attributes, it will exclude instance types whose Spot price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
       * price.
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * and
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * .
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       *
       *
       * Default: `100`
       */
      public
          fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number)

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      public fun totalLocalStorageGb(totalLocalStorageGb: IResolvable)

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      public fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBProperty)

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ced7d39abec56d68911dca344eb452396b66dd2240deef63392ea726ad8b8a4")
      public
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBProperty.Builder.() -> Unit)

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      public fun vCpuCount(vCpuCount: IResolvable)

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      public fun vCpuCount(vCpuCount: VCpuCountProperty)

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("510e27b3bf93ab1beb810d076c1533945e97fbf0fa819abd7c204fae624cfaa0")
      public fun vCpuCount(vCpuCount: VCpuCountProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty.builder()

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      override fun acceleratorCount(acceleratorCount: IResolvable) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(IResolvable::unwrap))
      }

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      override fun acceleratorCount(acceleratorCount: AcceleratorCountProperty) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(AcceleratorCountProperty::unwrap))
      }

      /**
       * @param acceleratorCount The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS
       * Inferentia chips) on an instance.
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6d22fd76cabe48f089b8c237bc1c7ec9426e15e6717e466b208f0fbcf8978aa")
      override fun acceleratorCount(acceleratorCount: AcceleratorCountProperty.Builder.() -> Unit):
          Unit = acceleratorCount(AcceleratorCountProperty(acceleratorCount))

      /**
       * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
       * specific manufacturers.
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with Habana devices, specify `habana` .
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       */
      override fun acceleratorManufacturers(acceleratorManufacturers: List<String>) {
        cdkBuilder.acceleratorManufacturers(acceleratorManufacturers)
      }

      /**
       * @param acceleratorManufacturers Indicates whether instance types must have accelerators by
       * specific manufacturers.
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with Habana devices, specify `habana` .
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       */
      override fun acceleratorManufacturers(vararg acceleratorManufacturers: String): Unit =
          acceleratorManufacturers(acceleratorManufacturers.toList())

      /**
       * @param acceleratorNames The accelerators that must be on the instance type.
       * * For instance types with NVIDIA A10G GPUs, specify `a10g` .
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA H100 GPUs, specify `h100` .
       * * For instance types with AWS Inferentia chips, specify `inferentia` .
       * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA T4G GPUs, specify `t4g` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       *
       * Default: Any accelerator
       */
      override fun acceleratorNames(acceleratorNames: List<String>) {
        cdkBuilder.acceleratorNames(acceleratorNames)
      }

      /**
       * @param acceleratorNames The accelerators that must be on the instance type.
       * * For instance types with NVIDIA A10G GPUs, specify `a10g` .
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA H100 GPUs, specify `h100` .
       * * For instance types with AWS Inferentia chips, specify `inferentia` .
       * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA T4G GPUs, specify `t4g` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       *
       * Default: Any accelerator
       */
      override fun acceleratorNames(vararg acceleratorNames: String): Unit =
          acceleratorNames(acceleratorNames.toList())

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      override fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(IResolvable::unwrap))
      }

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBProperty) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(AcceleratorTotalMemoryMiBProperty::unwrap))
      }

      /**
       * @param acceleratorTotalMemoryMiB The minimum and maximum amount of total accelerator
       * memory, in MiB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("687315408c1bb56ead021b0c0a5a9e16088665e100a889fb74ce71abbd43fa22")
      override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBProperty.Builder.() -> Unit):
          Unit =
          acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBProperty(acceleratorTotalMemoryMiB))

      /**
       * @param acceleratorTypes The accelerator types that must be on the instance type.
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       */
      override fun acceleratorTypes(acceleratorTypes: List<String>) {
        cdkBuilder.acceleratorTypes(acceleratorTypes)
      }

      /**
       * @param acceleratorTypes The accelerator types that must be on the instance type.
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       */
      override fun acceleratorTypes(vararg acceleratorTypes: String): Unit =
          acceleratorTypes(acceleratorTypes.toList())

      /**
       * @param allowedInstanceTypes The instance types to apply your specified attributes against.
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will allow the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will allow
       * all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       */
      override fun allowedInstanceTypes(allowedInstanceTypes: List<String>) {
        cdkBuilder.allowedInstanceTypes(allowedInstanceTypes)
      }

      /**
       * @param allowedInstanceTypes The instance types to apply your specified attributes against.
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will allow the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will allow
       * all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       */
      override fun allowedInstanceTypes(vararg allowedInstanceTypes: String): Unit =
          allowedInstanceTypes(allowedInstanceTypes.toList())

      /**
       * @param bareMetal Indicates whether bare metal instance types must be included, excluded, or
       * required.
       * * To include bare metal instance types, specify `included` .
       * * To require only bare metal instance types, specify `required` .
       * * To exclude bare metal instance types, specify `excluded` .
       *
       * Default: `excluded`
       */
      override fun bareMetal(bareMetal: String) {
        cdkBuilder.bareMetal(bareMetal)
      }

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS,
       * in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      override fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(IResolvable::unwrap))
      }

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS,
       * in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsProperty) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(BaselineEbsBandwidthMbpsProperty::unwrap))
      }

      /**
       * @param baselineEbsBandwidthMbps The minimum and maximum baseline bandwidth to Amazon EBS,
       * in Mbps.
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99ce2f9d06f918c623b5226bc75b8d59bcc2dbe40fb6a6ce2e63c42d1f8391a1")
      override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsProperty.Builder.() -> Unit):
          Unit =
          baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsProperty(baselineEbsBandwidthMbps))

      /**
       * @param burstablePerformance Indicates whether burstable performance T instance types are
       * included, excluded, or required.
       * For more information, see [Burstable performance
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
       * .
       *
       * * To include burstable performance instance types, specify `included` .
       * * To require only burstable performance instance types, specify `required` .
       * * To exclude burstable performance instance types, specify `excluded` .
       *
       * Default: `excluded`
       */
      override fun burstablePerformance(burstablePerformance: String) {
        cdkBuilder.burstablePerformance(burstablePerformance)
      }

      /**
       * @param cpuManufacturers The CPU manufacturers to include.
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched
       * with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in
       * your launch template.
       *
       *
       * Default: Any manufacturer
       */
      override fun cpuManufacturers(cpuManufacturers: List<String>) {
        cdkBuilder.cpuManufacturers(cpuManufacturers)
      }

      /**
       * @param cpuManufacturers The CPU manufacturers to include.
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched
       * with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in
       * your launch template.
       *
       *
       * Default: Any manufacturer
       */
      override fun cpuManufacturers(vararg cpuManufacturers: String): Unit =
          cpuManufacturers(cpuManufacturers.toList())

      /**
       * @param excludedInstanceTypes The instance types to exclude.
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       */
      override fun excludedInstanceTypes(excludedInstanceTypes: List<String>) {
        cdkBuilder.excludedInstanceTypes(excludedInstanceTypes)
      }

      /**
       * @param excludedInstanceTypes The instance types to exclude.
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       */
      override fun excludedInstanceTypes(vararg excludedInstanceTypes: String): Unit =
          excludedInstanceTypes(excludedInstanceTypes.toList())

      /**
       * @param instanceGenerations Indicates whether current or previous generation instance types
       * are included.
       * The current generation instance types are recommended for use. Current generation instance
       * types are typically the latest two to three generations in each instance family. For more
       * information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide* .
       *
       * For current generation instance types, specify `current` .
       *
       * For previous generation instance types, specify `previous` .
       *
       * Default: Current and previous generation instance types
       */
      override fun instanceGenerations(instanceGenerations: List<String>) {
        cdkBuilder.instanceGenerations(instanceGenerations)
      }

      /**
       * @param instanceGenerations Indicates whether current or previous generation instance types
       * are included.
       * The current generation instance types are recommended for use. Current generation instance
       * types are typically the latest two to three generations in each instance family. For more
       * information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide* .
       *
       * For current generation instance types, specify `current` .
       *
       * For previous generation instance types, specify `previous` .
       *
       * Default: Current and previous generation instance types
       */
      override fun instanceGenerations(vararg instanceGenerations: String): Unit =
          instanceGenerations(instanceGenerations.toList())

      /**
       * @param localStorage Indicates whether instance types with instance store volumes are
       * included, excluded, or required.
       * For more information, [Amazon EC2 instance
       * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the
       * *Amazon EC2 User Guide* .
       *
       * * To include instance types with instance store volumes, specify `included` .
       * * To require only instance types with instance store volumes, specify `required` .
       * * To exclude instance types with instance store volumes, specify `excluded` .
       *
       * Default: `included`
       */
      override fun localStorage(localStorage: String) {
        cdkBuilder.localStorage(localStorage)
      }

      /**
       * @param localStorageTypes The type of local storage that is required.
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: `hdd` and `ssd`
       */
      override fun localStorageTypes(localStorageTypes: List<String>) {
        cdkBuilder.localStorageTypes(localStorageTypes)
      }

      /**
       * @param localStorageTypes The type of local storage that is required.
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: `hdd` and `ssd`
       */
      override fun localStorageTypes(vararg localStorageTypes: String): Unit =
          localStorageTypes(localStorageTypes.toList())

      /**
       * @param maxSpotPriceAsPercentageOfOptimalOnDemandPrice [Price protection] The price
       * protection threshold for Spot Instances, as a percentage of an identified On-Demand price.
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified price is from the lowest priced
       * current generation instance types, and failing that, from the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 selects instance types
       * with your attributes, it will exclude instance types whose price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is based on the per vCPU or per memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       */
      override
          fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice: Number) {
        cdkBuilder.maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice)
      }

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      override fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(IResolvable::unwrap))
      }

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      override fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuProperty) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(MemoryGiBPerVCpuProperty::unwrap))
      }

      /**
       * @param memoryGiBPerVCpu The minimum and maximum amount of memory per vCPU, in GiB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39bcea6b054460d3a4f72bf8e85c617b9de2d27b154012b8b2ffbae654835453")
      override fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuProperty.Builder.() -> Unit):
          Unit = memoryGiBPerVCpu(MemoryGiBPerVCpuProperty(memoryGiBPerVCpu))

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      override fun memoryMiB(memoryMiB: IResolvable) {
        cdkBuilder.memoryMiB(memoryMiB.let(IResolvable::unwrap))
      }

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      override fun memoryMiB(memoryMiB: MemoryMiBProperty) {
        cdkBuilder.memoryMiB(memoryMiB.let(MemoryMiBProperty::unwrap))
      }

      /**
       * @param memoryMiB The minimum and maximum amount of memory, in MiB.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2be30fd8478496bd807b2a12ef67cfe0b5fc5f22ee2e40f86594c093e02e6352")
      override fun memoryMiB(memoryMiB: MemoryMiBProperty.Builder.() -> Unit): Unit =
          memoryMiB(MemoryMiBProperty(memoryMiB))

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in
       * gigabits per second (Gbps).
       * Default: No minimum or maximum limits
       */
      override fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(IResolvable::unwrap))
      }

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in
       * gigabits per second (Gbps).
       * Default: No minimum or maximum limits
       */
      override fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsProperty) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(NetworkBandwidthGbpsProperty::unwrap))
      }

      /**
       * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in
       * gigabits per second (Gbps).
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1827db3ce1bb2f184bd37966238ca76dc315b92780edbf8056c5fc90eda9c716")
      override
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsProperty.Builder.() -> Unit):
          Unit = networkBandwidthGbps(NetworkBandwidthGbpsProperty(networkBandwidthGbps))

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      override fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(IResolvable::unwrap))
      }

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      override fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountProperty) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(NetworkInterfaceCountProperty::unwrap))
      }

      /**
       * @param networkInterfaceCount The minimum and maximum number of network interfaces.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fde96b2e0debdfcc33f8a0d0943f348612d4a2d2bfba0d2761c2738bdb344082")
      override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountProperty.Builder.() -> Unit):
          Unit = networkInterfaceCount(NetworkInterfaceCountProperty(networkInterfaceCount))

      /**
       * @param onDemandMaxPricePercentageOverLowestPrice [Price protection] The price protection
       * threshold for On-Demand Instances, as a percentage higher than an identified On-Demand price.
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. When Amazon EC2 selects instance types with
       * your attributes, it will exclude instance types whose price exceeds your specified threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To turn off price protection, specify a high value, such as `999999` .
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * and
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * .
       *
       *
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
       * price.
       *
       *
       * Default: `20`
       */
      override
          fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number) {
        cdkBuilder.onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice)
      }

      /**
       * @param requireHibernateSupport Indicates whether instance types must support hibernation
       * for On-Demand Instances.
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * .
       *
       * Default: `false`
       */
      override fun requireHibernateSupport(requireHibernateSupport: Boolean) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport)
      }

      /**
       * @param requireHibernateSupport Indicates whether instance types must support hibernation
       * for On-Demand Instances.
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * .
       *
       * Default: `false`
       */
      override fun requireHibernateSupport(requireHibernateSupport: IResolvable) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport.let(IResolvable::unwrap))
      }

      /**
       * @param spotMaxPricePercentageOverLowestPrice [Price protection] The price protection
       * threshold for Spot Instances, as a percentage higher than an identified Spot price.
       * The identified Spot price is the Spot price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified Spot price is from the lowest
       * priced current generation instance types, and failing that, from the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 selects instance types
       * with your attributes, it will exclude instance types whose Spot price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
       * price.
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * and
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * .
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       *
       *
       * Default: `100`
       */
      override
          fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number) {
        cdkBuilder.spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice)
      }

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      override fun totalLocalStorageGb(totalLocalStorageGb: IResolvable) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(IResolvable::unwrap))
      }

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      override fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBProperty) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(TotalLocalStorageGBProperty::unwrap))
      }

      /**
       * @param totalLocalStorageGb The minimum and maximum amount of total local storage, in GB.
       * Default: No minimum or maximum limits
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ced7d39abec56d68911dca344eb452396b66dd2240deef63392ea726ad8b8a4")
      override
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBProperty.Builder.() -> Unit):
          Unit = totalLocalStorageGb(TotalLocalStorageGBProperty(totalLocalStorageGb))

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      override fun vCpuCount(vCpuCount: IResolvable) {
        cdkBuilder.vCpuCount(vCpuCount.let(IResolvable::unwrap))
      }

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      override fun vCpuCount(vCpuCount: VCpuCountProperty) {
        cdkBuilder.vCpuCount(vCpuCount.let(VCpuCountProperty::unwrap))
      }

      /**
       * @param vCpuCount The minimum and maximum number of vCPUs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("510e27b3bf93ab1beb810d076c1533945e97fbf0fa819abd7c204fae624cfaa0")
      override fun vCpuCount(vCpuCount: VCpuCountProperty.Builder.() -> Unit): Unit =
          vCpuCount(VCpuCountProperty(vCpuCount))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty,
    ) : CdkObject(cdkObject), InstanceRequirementsProperty {
      /**
       * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) on an
       * instance.
       *
       * To exclude accelerator-enabled instance types, set `Max` to `0` .
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-acceleratorcount)
       */
      override fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

      /**
       * Indicates whether instance types must have accelerators by specific manufacturers.
       *
       * * For instance types with AWS devices, specify `amazon-web-services` .
       * * For instance types with AMD devices, specify `amd` .
       * * For instance types with Habana devices, specify `habana` .
       * * For instance types with NVIDIA devices, specify `nvidia` .
       * * For instance types with Xilinx devices, specify `xilinx` .
       *
       * Default: Any manufacturer
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-acceleratormanufacturers)
       */
      override fun acceleratorManufacturers(): List<String> =
          unwrap(this).getAcceleratorManufacturers() ?: emptyList()

      /**
       * The accelerators that must be on the instance type.
       *
       * * For instance types with NVIDIA A10G GPUs, specify `a10g` .
       * * For instance types with NVIDIA A100 GPUs, specify `a100` .
       * * For instance types with NVIDIA H100 GPUs, specify `h100` .
       * * For instance types with AWS Inferentia chips, specify `inferentia` .
       * * For instance types with NVIDIA GRID K520 GPUs, specify `k520` .
       * * For instance types with NVIDIA K80 GPUs, specify `k80` .
       * * For instance types with NVIDIA M60 GPUs, specify `m60` .
       * * For instance types with AMD Radeon Pro V520 GPUs, specify `radeon-pro-v520` .
       * * For instance types with NVIDIA T4 GPUs, specify `t4` .
       * * For instance types with NVIDIA T4G GPUs, specify `t4g` .
       * * For instance types with Xilinx VU9P FPGAs, specify `vu9p` .
       * * For instance types with NVIDIA V100 GPUs, specify `v100` .
       *
       * Default: Any accelerator
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-acceleratornames)
       */
      override fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?:
          emptyList()

      /**
       * The minimum and maximum amount of total accelerator memory, in MiB.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-acceleratortotalmemorymib)
       */
      override fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

      /**
       * The accelerator types that must be on the instance type.
       *
       * * For instance types with GPU accelerators, specify `gpu` .
       * * For instance types with FPGA accelerators, specify `fpga` .
       * * For instance types with inference accelerators, specify `inference` .
       *
       * Default: Any accelerator type
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-acceleratortypes)
       */
      override fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?:
          emptyList()

      /**
       * The instance types to apply your specified attributes against.
       *
       * All other instance types are ignored, even if they match your specified attributes.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * allow an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will allow the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will allow
       * all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `AllowedInstanceTypes` , you can't specify `ExcludedInstanceTypes` .
       *
       *
       * Default: All instance types
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-allowedinstancetypes)
       */
      override fun allowedInstanceTypes(): List<String> = unwrap(this).getAllowedInstanceTypes() ?:
          emptyList()

      /**
       * Indicates whether bare metal instance types must be included, excluded, or required.
       *
       * * To include bare metal instance types, specify `included` .
       * * To require only bare metal instance types, specify `required` .
       * * To exclude bare metal instance types, specify `excluded` .
       *
       * Default: `excluded`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-baremetal)
       */
      override fun bareMetal(): String? = unwrap(this).getBareMetal()

      /**
       * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps.
       *
       * For more information, see [Amazon EBS–optimized
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the
       * *Amazon EC2 User Guide* .
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-baselineebsbandwidthmbps)
       */
      override fun baselineEbsBandwidthMbps(): Any? = unwrap(this).getBaselineEbsBandwidthMbps()

      /**
       * Indicates whether burstable performance T instance types are included, excluded, or
       * required.
       *
       * For more information, see [Burstable performance
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
       * .
       *
       * * To include burstable performance instance types, specify `included` .
       * * To require only burstable performance instance types, specify `required` .
       * * To exclude burstable performance instance types, specify `excluded` .
       *
       * Default: `excluded`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-burstableperformance)
       */
      override fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

      /**
       * The CPU manufacturers to include.
       *
       * * For instance types with Intel CPUs, specify `intel` .
       * * For instance types with AMD CPUs, specify `amd` .
       * * For instance types with AWS CPUs, specify `amazon-web-services` .
       *
       *
       * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched
       * with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in
       * your launch template.
       *
       *
       * Default: Any manufacturer
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-cpumanufacturers)
       */
      override fun cpuManufacturers(): List<String> = unwrap(this).getCpuManufacturers() ?:
          emptyList()

      /**
       * The instance types to exclude.
       *
       * You can use strings with one or more wild cards, represented by an asterisk ( `*` ), to
       * exclude an instance type, size, or generation. The following are examples: `m5.8xlarge` ,
       * `c5*.*` , `m5a.*` , `r*` , `*3*` .
       *
       * For example, if you specify `c5*` ,Amazon EC2 will exclude the entire C5 instance family,
       * which includes all C5a and C5n instance types. If you specify `m5a.*` , Amazon EC2 will
       * exclude all the M5a instance types, but not the M5n instance types.
       *
       *
       * If you specify `ExcludedInstanceTypes` , you can't specify `AllowedInstanceTypes` .
       *
       *
       * Default: No excluded instance types
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-excludedinstancetypes)
       */
      override fun excludedInstanceTypes(): List<String> = unwrap(this).getExcludedInstanceTypes()
          ?: emptyList()

      /**
       * Indicates whether current or previous generation instance types are included.
       *
       * The current generation instance types are recommended for use. Current generation instance
       * types are typically the latest two to three generations in each instance family. For more
       * information, see [Instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
       * EC2 User Guide* .
       *
       * For current generation instance types, specify `current` .
       *
       * For previous generation instance types, specify `previous` .
       *
       * Default: Current and previous generation instance types
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-instancegenerations)
       */
      override fun instanceGenerations(): List<String> = unwrap(this).getInstanceGenerations() ?:
          emptyList()

      /**
       * Indicates whether instance types with instance store volumes are included, excluded, or
       * required.
       *
       * For more information, [Amazon EC2 instance
       * store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) in the
       * *Amazon EC2 User Guide* .
       *
       * * To include instance types with instance store volumes, specify `included` .
       * * To require only instance types with instance store volumes, specify `required` .
       * * To exclude instance types with instance store volumes, specify `excluded` .
       *
       * Default: `included`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-localstorage)
       */
      override fun localStorage(): String? = unwrap(this).getLocalStorage()

      /**
       * The type of local storage that is required.
       *
       * * For instance types with hard disk drive (HDD) storage, specify `hdd` .
       * * For instance types with solid state drive (SSD) storage, specify `ssd` .
       *
       * Default: `hdd` and `ssd`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-localstoragetypes)
       */
      override fun localStorageTypes(): List<String> = unwrap(this).getLocalStorageTypes() ?:
          emptyList()

      /**
       * [Price protection] The price protection threshold for Spot Instances, as a percentage of an
       * identified On-Demand price.
       *
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified price is from the lowest priced
       * current generation instance types, and failing that, from the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 selects instance types
       * with your attributes, it will exclude instance types whose price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `DesiredCapacityType` to `vcpu` or `memory-mib` , the price protection threshold
       * is based on the per vCPU or per memory price instead of the per instance price.
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-maxspotpriceaspercentageofoptimalondemandprice)
       */
      override fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
          unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

      /**
       * The minimum and maximum amount of memory per vCPU, in GiB.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-memorygibpervcpu)
       */
      override fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

      /**
       * The minimum and maximum amount of memory, in MiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-memorymib)
       */
      override fun memoryMiB(): Any? = unwrap(this).getMemoryMiB()

      /**
       * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-networkbandwidthgbps)
       */
      override fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

      /**
       * The minimum and maximum number of network interfaces.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-networkinterfacecount)
       */
      override fun networkInterfaceCount(): Any? = unwrap(this).getNetworkInterfaceCount()

      /**
       * [Price protection] The price protection threshold for On-Demand Instances, as a percentage
       * higher than an identified On-Demand price.
       *
       * The identified On-Demand price is the price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. When Amazon EC2 selects instance types with
       * your attributes, it will exclude instance types whose price exceeds your specified threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To turn off price protection, specify a high value, such as `999999` .
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * and
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * .
       *
       *
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
       * price.
       *
       *
       * Default: `20`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-ondemandmaxpricepercentageoverlowestprice)
       */
      override fun onDemandMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getOnDemandMaxPricePercentageOverLowestPrice()

      /**
       * Indicates whether instance types must support hibernation for On-Demand Instances.
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * .
       *
       * Default: `false`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-requirehibernatesupport)
       */
      override fun requireHibernateSupport(): Any? = unwrap(this).getRequireHibernateSupport()

      /**
       * [Price protection] The price protection threshold for Spot Instances, as a percentage
       * higher than an identified Spot price.
       *
       * The identified Spot price is the Spot price of the lowest priced current generation C, M,
       * or R instance type with your specified attributes. If no current generation C, M, or R
       * instance type matches your attributes, then the identified Spot price is from the lowest
       * priced current generation instance types, and failing that, from the lowest priced previous
       * generation instance types that match your attributes. When Amazon EC2 selects instance types
       * with your attributes, it will exclude instance types whose Spot price exceeds your specified
       * threshold.
       *
       * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
       *
       * To indicate no price protection threshold, specify a high value, such as `999999` .
       *
       * If you set `TargetCapacityUnitType` to `vcpu` or `memory-mib` , the price protection
       * threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
       * price.
       *
       * This parameter is not supported for
       * [GetSpotPlacementScores](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html)
       * and
       * [GetInstanceTypesFromInstanceRequirements](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html)
       * .
       *
       *
       * Only one of `SpotMaxPricePercentageOverLowestPrice` or
       * `MaxSpotPriceAsPercentageOfOptimalOnDemandPrice` can be specified. If you don't specify
       * either, then `SpotMaxPricePercentageOverLowestPrice` is used and the value for that parameter
       * defaults to `100` .
       *
       *
       * Default: `100`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-spotmaxpricepercentageoverlowestprice)
       */
      override fun spotMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

      /**
       * The minimum and maximum amount of total local storage, in GB.
       *
       * Default: No minimum or maximum limits
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-totallocalstoragegb)
       */
      override fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

      /**
       * The minimum and maximum number of vCPUs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-instancerequirements.html#cfn-ec2-launchtemplate-instancerequirements-vcpucount)
       */
      override fun vCpuCount(): Any? = unwrap(this).getVCpuCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceRequirementsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty):
          InstanceRequirementsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceRequirementsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty
    }
  }

  /**
   * ENA Express is compatible with both TCP and UDP transport protocols.
   *
   * When it's enabled, TCP traffic automatically uses it. However, some UDP-based applications are
   * designed to handle network packets that are out of order, without a need for retransmission, such
   * as live video broadcasting or other near-real-time applications. For UDP traffic, you can specify
   * whether to use ENA Express, based on your application environment needs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * EnaSrdUdpSpecificationProperty enaSrdUdpSpecificationProperty =
   * EnaSrdUdpSpecificationProperty.builder()
   * .enaSrdUdpEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enasrdudpspecification.html)
   */
  public interface EnaSrdUdpSpecificationProperty {
    /**
     * Indicates whether UDP traffic to and from the instance uses ENA Express.
     *
     * To specify this setting, you must first enable ENA Express.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enasrdudpspecification.html#cfn-ec2-launchtemplate-enasrdudpspecification-enasrdudpenabled)
     */
    public fun enaSrdUdpEnabled(): Any? = unwrap(this).getEnaSrdUdpEnabled()

    /**
     * A builder for [EnaSrdUdpSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enaSrdUdpEnabled Indicates whether UDP traffic to and from the instance uses ENA
       * Express.
       * To specify this setting, you must first enable ENA Express.
       */
      public fun enaSrdUdpEnabled(enaSrdUdpEnabled: Boolean)

      /**
       * @param enaSrdUdpEnabled Indicates whether UDP traffic to and from the instance uses ENA
       * Express.
       * To specify this setting, you must first enable ENA Express.
       */
      public fun enaSrdUdpEnabled(enaSrdUdpEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty.builder()

      /**
       * @param enaSrdUdpEnabled Indicates whether UDP traffic to and from the instance uses ENA
       * Express.
       * To specify this setting, you must first enable ENA Express.
       */
      override fun enaSrdUdpEnabled(enaSrdUdpEnabled: Boolean) {
        cdkBuilder.enaSrdUdpEnabled(enaSrdUdpEnabled)
      }

      /**
       * @param enaSrdUdpEnabled Indicates whether UDP traffic to and from the instance uses ENA
       * Express.
       * To specify this setting, you must first enable ENA Express.
       */
      override fun enaSrdUdpEnabled(enaSrdUdpEnabled: IResolvable) {
        cdkBuilder.enaSrdUdpEnabled(enaSrdUdpEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty,
    ) : CdkObject(cdkObject), EnaSrdUdpSpecificationProperty {
      /**
       * Indicates whether UDP traffic to and from the instance uses ENA Express.
       *
       * To specify this setting, you must first enable ENA Express.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enasrdudpspecification.html#cfn-ec2-launchtemplate-enasrdudpspecification-enasrdudpenabled)
       */
      override fun enaSrdUdpEnabled(): Any? = unwrap(this).getEnaSrdUdpEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnaSrdUdpSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty):
          EnaSrdUdpSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnaSrdUdpSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty
    }
  }

  /**
   * Specifies an instance's Capacity Reservation targeting option. You can specify only one option
   * at a time.
   *
   * `CapacityReservationSpecification` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * CapacityReservationSpecificationProperty capacityReservationSpecificationProperty =
   * CapacityReservationSpecificationProperty.builder()
   * .capacityReservationPreference("capacityReservationPreference")
   * .capacityReservationTarget(CapacityReservationTargetProperty.builder()
   * .capacityReservationId("capacityReservationId")
   * .capacityReservationResourceGroupArn("capacityReservationResourceGroupArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationspecification.html)
   */
  public interface CapacityReservationSpecificationProperty {
    /**
     * Indicates the instance's Capacity Reservation preferences. Possible preferences include:.
     *
     * * `open` - The instance can run in any `open` Capacity Reservation that has matching
     * attributes (instance type, platform, Availability Zone).
     * * `none` - The instance avoids running in a Capacity Reservation even if one is available.
     * The instance runs in On-Demand capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationspecification.html#cfn-ec2-launchtemplate-capacityreservationspecification-capacityreservationpreference)
     */
    public fun capacityReservationPreference(): String? =
        unwrap(this).getCapacityReservationPreference()

    /**
     * Information about the target Capacity Reservation or Capacity Reservation group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationspecification.html#cfn-ec2-launchtemplate-capacityreservationspecification-capacityreservationtarget)
     */
    public fun capacityReservationTarget(): Any? = unwrap(this).getCapacityReservationTarget()

    /**
     * A builder for [CapacityReservationSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capacityReservationPreference Indicates the instance's Capacity Reservation
       * preferences. Possible preferences include:.
       * * `open` - The instance can run in any `open` Capacity Reservation that has matching
       * attributes (instance type, platform, Availability Zone).
       * * `none` - The instance avoids running in a Capacity Reservation even if one is available.
       * The instance runs in On-Demand capacity.
       */
      public fun capacityReservationPreference(capacityReservationPreference: String)

      /**
       * @param capacityReservationTarget Information about the target Capacity Reservation or
       * Capacity Reservation group.
       */
      public fun capacityReservationTarget(capacityReservationTarget: IResolvable)

      /**
       * @param capacityReservationTarget Information about the target Capacity Reservation or
       * Capacity Reservation group.
       */
      public
          fun capacityReservationTarget(capacityReservationTarget: CapacityReservationTargetProperty)

      /**
       * @param capacityReservationTarget Information about the target Capacity Reservation or
       * Capacity Reservation group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13509a6123938dcb67ae290a6c4220f1dfb5f0a1121bea480151b94202eb2fdc")
      public
          fun capacityReservationTarget(capacityReservationTarget: CapacityReservationTargetProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty.builder()

      /**
       * @param capacityReservationPreference Indicates the instance's Capacity Reservation
       * preferences. Possible preferences include:.
       * * `open` - The instance can run in any `open` Capacity Reservation that has matching
       * attributes (instance type, platform, Availability Zone).
       * * `none` - The instance avoids running in a Capacity Reservation even if one is available.
       * The instance runs in On-Demand capacity.
       */
      override fun capacityReservationPreference(capacityReservationPreference: String) {
        cdkBuilder.capacityReservationPreference(capacityReservationPreference)
      }

      /**
       * @param capacityReservationTarget Information about the target Capacity Reservation or
       * Capacity Reservation group.
       */
      override fun capacityReservationTarget(capacityReservationTarget: IResolvable) {
        cdkBuilder.capacityReservationTarget(capacityReservationTarget.let(IResolvable::unwrap))
      }

      /**
       * @param capacityReservationTarget Information about the target Capacity Reservation or
       * Capacity Reservation group.
       */
      override
          fun capacityReservationTarget(capacityReservationTarget: CapacityReservationTargetProperty) {
        cdkBuilder.capacityReservationTarget(capacityReservationTarget.let(CapacityReservationTargetProperty::unwrap))
      }

      /**
       * @param capacityReservationTarget Information about the target Capacity Reservation or
       * Capacity Reservation group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13509a6123938dcb67ae290a6c4220f1dfb5f0a1121bea480151b94202eb2fdc")
      override
          fun capacityReservationTarget(capacityReservationTarget: CapacityReservationTargetProperty.Builder.() -> Unit):
          Unit =
          capacityReservationTarget(CapacityReservationTargetProperty(capacityReservationTarget))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty,
    ) : CdkObject(cdkObject), CapacityReservationSpecificationProperty {
      /**
       * Indicates the instance's Capacity Reservation preferences. Possible preferences include:.
       *
       * * `open` - The instance can run in any `open` Capacity Reservation that has matching
       * attributes (instance type, platform, Availability Zone).
       * * `none` - The instance avoids running in a Capacity Reservation even if one is available.
       * The instance runs in On-Demand capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationspecification.html#cfn-ec2-launchtemplate-capacityreservationspecification-capacityreservationpreference)
       */
      override fun capacityReservationPreference(): String? =
          unwrap(this).getCapacityReservationPreference()

      /**
       * Information about the target Capacity Reservation or Capacity Reservation group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationspecification.html#cfn-ec2-launchtemplate-capacityreservationspecification-capacityreservationtarget)
       */
      override fun capacityReservationTarget(): Any? = unwrap(this).getCapacityReservationTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityReservationSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty):
          CapacityReservationSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityReservationSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty
    }
  }

  /**
   * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps.
   *
   * For more information, see [Amazon EBS–optimized
   * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html) in the *Amazon
   * EC2 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * BaselineEbsBandwidthMbpsProperty baselineEbsBandwidthMbpsProperty =
   * BaselineEbsBandwidthMbpsProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-baselineebsbandwidthmbps.html)
   */
  public interface BaselineEbsBandwidthMbpsProperty {
    /**
     * The maximum baseline bandwidth, in Mbps.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-baselineebsbandwidthmbps.html#cfn-ec2-launchtemplate-baselineebsbandwidthmbps-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum baseline bandwidth, in Mbps.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-baselineebsbandwidthmbps.html#cfn-ec2-launchtemplate-baselineebsbandwidthmbps-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [BaselineEbsBandwidthMbpsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum baseline bandwidth, in Mbps.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum baseline bandwidth, in Mbps.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty.builder()

      /**
       * @param max The maximum baseline bandwidth, in Mbps.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum baseline bandwidth, in Mbps.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty,
    ) : CdkObject(cdkObject), BaselineEbsBandwidthMbpsProperty {
      /**
       * The maximum baseline bandwidth, in Mbps.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-baselineebsbandwidthmbps.html#cfn-ec2-launchtemplate-baselineebsbandwidthmbps-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum baseline bandwidth, in Mbps.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-baselineebsbandwidthmbps.html#cfn-ec2-launchtemplate-baselineebsbandwidthmbps-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BaselineEbsBandwidthMbpsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty):
          BaselineEbsBandwidthMbpsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BaselineEbsBandwidthMbpsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty
    }
  }

  /**
   * The minimum and maximum number of vCPUs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * VCpuCountProperty vCpuCountProperty = VCpuCountProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-vcpucount.html)
   */
  public interface VCpuCountProperty {
    /**
     * The maximum number of vCPUs.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-vcpucount.html#cfn-ec2-launchtemplate-vcpucount-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum number of vCPUs.
     *
     * To specify no minimum limit, specify `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-vcpucount.html#cfn-ec2-launchtemplate-vcpucount-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [VCpuCountProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum number of vCPUs.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum number of vCPUs.
       * To specify no minimum limit, specify `0` .
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty.builder()

      /**
       * @param max The maximum number of vCPUs.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum number of vCPUs.
       * To specify no minimum limit, specify `0` .
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty,
    ) : CdkObject(cdkObject), VCpuCountProperty {
      /**
       * The maximum number of vCPUs.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-vcpucount.html#cfn-ec2-launchtemplate-vcpucount-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum number of vCPUs.
       *
       * To specify no minimum limit, specify `0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-vcpucount.html#cfn-ec2-launchtemplate-vcpucount-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VCpuCountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty):
          VCpuCountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VCpuCountProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty
    }
  }

  /**
   * The maintenance options of your instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * MaintenanceOptionsProperty maintenanceOptionsProperty = MaintenanceOptionsProperty.builder()
   * .autoRecovery("autoRecovery")
   * .rebootMigration("rebootMigration")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-maintenanceoptions.html)
   */
  public interface MaintenanceOptionsProperty {
    /**
     * Disables the automatic recovery behavior of your instance or sets it to default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-maintenanceoptions.html#cfn-ec2-launchtemplate-maintenanceoptions-autorecovery)
     */
    public fun autoRecovery(): String? = unwrap(this).getAutoRecovery()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-maintenanceoptions.html#cfn-ec2-launchtemplate-maintenanceoptions-rebootmigration)
     */
    public fun rebootMigration(): String? = unwrap(this).getRebootMigration()

    /**
     * A builder for [MaintenanceOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoRecovery Disables the automatic recovery behavior of your instance or sets it to
       * default.
       */
      public fun autoRecovery(autoRecovery: String)

      /**
       * @param rebootMigration the value to be set.
       */
      public fun rebootMigration(rebootMigration: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty.builder()

      /**
       * @param autoRecovery Disables the automatic recovery behavior of your instance or sets it to
       * default.
       */
      override fun autoRecovery(autoRecovery: String) {
        cdkBuilder.autoRecovery(autoRecovery)
      }

      /**
       * @param rebootMigration the value to be set.
       */
      override fun rebootMigration(rebootMigration: String) {
        cdkBuilder.rebootMigration(rebootMigration)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty,
    ) : CdkObject(cdkObject), MaintenanceOptionsProperty {
      /**
       * Disables the automatic recovery behavior of your instance or sets it to default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-maintenanceoptions.html#cfn-ec2-launchtemplate-maintenanceoptions-autorecovery)
       */
      override fun autoRecovery(): String? = unwrap(this).getAutoRecovery()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-maintenanceoptions.html#cfn-ec2-launchtemplate-maintenanceoptions-rebootmigration)
       */
      override fun rebootMigration(): String? = unwrap(this).getRebootMigration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MaintenanceOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty):
          MaintenanceOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty
    }
  }

  /**
   * ENA Express uses AWS Scalable Reliable Datagram (SRD) technology to increase the maximum
   * bandwidth used per stream and minimize tail latency of network traffic between EC2 instances.
   *
   * With ENA Express, you can communicate between two EC2 instances in the same subnet within the
   * same account, or in different accounts. Both sending and receiving instances must have ENA Express
   * enabled.
   *
   * To improve the reliability of network packet delivery, ENA Express reorders network packets on
   * the receiving end by default. However, some UDP-based applications are designed to handle network
   * packets that are out of order to reduce the overhead for packet delivery at the network layer.
   * When ENA Express is enabled, you can specify whether UDP network traffic uses it.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * EnaSrdSpecificationProperty enaSrdSpecificationProperty = EnaSrdSpecificationProperty.builder()
   * .enaSrdEnabled(false)
   * .enaSrdUdpSpecification(EnaSrdUdpSpecificationProperty.builder()
   * .enaSrdUdpEnabled(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enasrdspecification.html)
   */
  public interface EnaSrdSpecificationProperty {
    /**
     * Indicates whether ENA Express is enabled for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enasrdspecification.html#cfn-ec2-launchtemplate-enasrdspecification-enasrdenabled)
     */
    public fun enaSrdEnabled(): Any? = unwrap(this).getEnaSrdEnabled()

    /**
     * Configures ENA Express for UDP network traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enasrdspecification.html#cfn-ec2-launchtemplate-enasrdspecification-enasrdudpspecification)
     */
    public fun enaSrdUdpSpecification(): Any? = unwrap(this).getEnaSrdUdpSpecification()

    /**
     * A builder for [EnaSrdSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enaSrdEnabled Indicates whether ENA Express is enabled for the network interface.
       */
      public fun enaSrdEnabled(enaSrdEnabled: Boolean)

      /**
       * @param enaSrdEnabled Indicates whether ENA Express is enabled for the network interface.
       */
      public fun enaSrdEnabled(enaSrdEnabled: IResolvable)

      /**
       * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic.
       */
      public fun enaSrdUdpSpecification(enaSrdUdpSpecification: IResolvable)

      /**
       * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic.
       */
      public fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty)

      /**
       * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd7cd088ca722e28b6bce1ce2139206df9bf6fb92063da1c5b497af55aa9ffb4")
      public
          fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty.builder()

      /**
       * @param enaSrdEnabled Indicates whether ENA Express is enabled for the network interface.
       */
      override fun enaSrdEnabled(enaSrdEnabled: Boolean) {
        cdkBuilder.enaSrdEnabled(enaSrdEnabled)
      }

      /**
       * @param enaSrdEnabled Indicates whether ENA Express is enabled for the network interface.
       */
      override fun enaSrdEnabled(enaSrdEnabled: IResolvable) {
        cdkBuilder.enaSrdEnabled(enaSrdEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic.
       */
      override fun enaSrdUdpSpecification(enaSrdUdpSpecification: IResolvable) {
        cdkBuilder.enaSrdUdpSpecification(enaSrdUdpSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic.
       */
      override fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty) {
        cdkBuilder.enaSrdUdpSpecification(enaSrdUdpSpecification.let(EnaSrdUdpSpecificationProperty::unwrap))
      }

      /**
       * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd7cd088ca722e28b6bce1ce2139206df9bf6fb92063da1c5b497af55aa9ffb4")
      override
          fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty.Builder.() -> Unit):
          Unit = enaSrdUdpSpecification(EnaSrdUdpSpecificationProperty(enaSrdUdpSpecification))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty,
    ) : CdkObject(cdkObject), EnaSrdSpecificationProperty {
      /**
       * Indicates whether ENA Express is enabled for the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enasrdspecification.html#cfn-ec2-launchtemplate-enasrdspecification-enasrdenabled)
       */
      override fun enaSrdEnabled(): Any? = unwrap(this).getEnaSrdEnabled()

      /**
       * Configures ENA Express for UDP network traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enasrdspecification.html#cfn-ec2-launchtemplate-enasrdspecification-enasrdudpspecification)
       */
      override fun enaSrdUdpSpecification(): Any? = unwrap(this).getEnaSrdUdpSpecification()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnaSrdSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty):
          EnaSrdSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnaSrdSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty
    }
  }

  /**
   * Specifies whether detailed monitoring is enabled for an instance.
   *
   * For more information about detailed monitoring, see [Enable or turn off detailed monitoring for
   * your instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html) in
   * the *Amazon EC2 User Guide* .
   *
   * `Monitoring` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * MonitoringProperty monitoringProperty = MonitoringProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-monitoring.html)
   */
  public interface MonitoringProperty {
    /**
     * Specify `true` to enable detailed monitoring.
     *
     * Otherwise, basic monitoring is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-monitoring.html#cfn-ec2-launchtemplate-monitoring-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [MonitoringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Specify `true` to enable detailed monitoring.
       * Otherwise, basic monitoring is enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specify `true` to enable detailed monitoring.
       * Otherwise, basic monitoring is enabled.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty.builder()

      /**
       * @param enabled Specify `true` to enable detailed monitoring.
       * Otherwise, basic monitoring is enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specify `true` to enable detailed monitoring.
       * Otherwise, basic monitoring is enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty,
    ) : CdkObject(cdkObject), MonitoringProperty {
      /**
       * Specify `true` to enable detailed monitoring.
       *
       * Otherwise, basic monitoring is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-monitoring.html#cfn-ec2-launchtemplate-monitoring-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty):
          MonitoringProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty
    }
  }

  /**
   * The minimum and maximum amount of memory, in MiB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * MemoryMiBProperty memoryMiBProperty = MemoryMiBProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-memorymib.html)
   */
  public interface MemoryMiBProperty {
    /**
     * The maximum amount of memory, in MiB.
     *
     * To specify no maximum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-memorymib.html#cfn-ec2-launchtemplate-memorymib-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum amount of memory, in MiB.
     *
     * To specify no minimum limit, specify `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-memorymib.html#cfn-ec2-launchtemplate-memorymib-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [MemoryMiBProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum amount of memory, in MiB.
       * To specify no maximum limit, omit this parameter.
       */
      public fun max(max: Number)

      /**
       * @param min The minimum amount of memory, in MiB.
       * To specify no minimum limit, specify `0` .
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty.builder()

      /**
       * @param max The maximum amount of memory, in MiB.
       * To specify no maximum limit, omit this parameter.
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum amount of memory, in MiB.
       * To specify no minimum limit, specify `0` .
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty,
    ) : CdkObject(cdkObject), MemoryMiBProperty {
      /**
       * The maximum amount of memory, in MiB.
       *
       * To specify no maximum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-memorymib.html#cfn-ec2-launchtemplate-memorymib-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum amount of memory, in MiB.
       *
       * To specify no minimum limit, specify `0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-memorymib.html#cfn-ec2-launchtemplate-memorymib-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryMiBProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty):
          MemoryMiBProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryMiBProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty
    }
  }

  /**
   * Specifies a secondary private IPv4 address for a network interface.
   *
   * `PrivateIpAdd` is a property of [AWS::EC2::LaunchTemplate
   * NetworkInterface](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PrivateIpAddProperty privateIpAddProperty = PrivateIpAddProperty.builder()
   * .primary(false)
   * .privateIpAddress("privateIpAddress")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html)
   */
  public interface PrivateIpAddProperty {
    /**
     * Indicates whether the private IPv4 address is the primary private IPv4 address.
     *
     * Only one IPv4 address can be designated as primary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-primary)
     */
    public fun primary(): Any? = unwrap(this).getPrimary()

    /**
     * The private IPv4 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-privateipaddress)
     */
    public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    /**
     * A builder for [PrivateIpAddProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param primary Indicates whether the private IPv4 address is the primary private IPv4
       * address.
       * Only one IPv4 address can be designated as primary.
       */
      public fun primary(primary: Boolean)

      /**
       * @param primary Indicates whether the private IPv4 address is the primary private IPv4
       * address.
       * Only one IPv4 address can be designated as primary.
       */
      public fun primary(primary: IResolvable)

      /**
       * @param privateIpAddress The private IPv4 address.
       */
      public fun privateIpAddress(privateIpAddress: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty.builder()

      /**
       * @param primary Indicates whether the private IPv4 address is the primary private IPv4
       * address.
       * Only one IPv4 address can be designated as primary.
       */
      override fun primary(primary: Boolean) {
        cdkBuilder.primary(primary)
      }

      /**
       * @param primary Indicates whether the private IPv4 address is the primary private IPv4
       * address.
       * Only one IPv4 address can be designated as primary.
       */
      override fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary.let(IResolvable::unwrap))
      }

      /**
       * @param privateIpAddress The private IPv4 address.
       */
      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty,
    ) : CdkObject(cdkObject), PrivateIpAddProperty {
      /**
       * Indicates whether the private IPv4 address is the primary private IPv4 address.
       *
       * Only one IPv4 address can be designated as primary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-primary)
       */
      override fun primary(): Any? = unwrap(this).getPrimary()

      /**
       * The private IPv4 address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-privateipaddress)
       */
      override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateIpAddProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty):
          PrivateIpAddProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateIpAddProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty
    }
  }

  /**
   * Specifies the CPU options for an instance.
   *
   * For more information, see [Optimize CPU
   * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   *
   * `CpuOptions` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * CpuOptionsProperty cpuOptionsProperty = CpuOptionsProperty.builder()
   * .amdSevSnp("amdSevSnp")
   * .coreCount(123)
   * .threadsPerCore(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-cpuoptions.html)
   */
  public interface CpuOptionsProperty {
    /**
     * Indicates whether to enable the instance for AMD SEV-SNP.
     *
     * AMD SEV-SNP is supported with M6a, R6a, and C6a instance types only. For more information,
     * see [AMD SEV-SNP](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/sev-snp.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-cpuoptions.html#cfn-ec2-launchtemplate-cpuoptions-amdsevsnp)
     */
    public fun amdSevSnp(): String? = unwrap(this).getAmdSevSnp()

    /**
     * The number of CPU cores for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-cpuoptions.html#cfn-ec2-launchtemplate-cpuoptions-corecount)
     */
    public fun coreCount(): Number? = unwrap(this).getCoreCount()

    /**
     * The number of threads per CPU core.
     *
     * To disable multithreading for the instance, specify a value of `1` . Otherwise, specify the
     * default value of `2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-cpuoptions.html#cfn-ec2-launchtemplate-cpuoptions-threadspercore)
     */
    public fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()

    /**
     * A builder for [CpuOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amdSevSnp Indicates whether to enable the instance for AMD SEV-SNP.
       * AMD SEV-SNP is supported with M6a, R6a, and C6a instance types only. For more information,
       * see [AMD SEV-SNP](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/sev-snp.html) .
       */
      public fun amdSevSnp(amdSevSnp: String)

      /**
       * @param coreCount The number of CPU cores for the instance.
       */
      public fun coreCount(coreCount: Number)

      /**
       * @param threadsPerCore The number of threads per CPU core.
       * To disable multithreading for the instance, specify a value of `1` . Otherwise, specify the
       * default value of `2` .
       */
      public fun threadsPerCore(threadsPerCore: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty.builder()

      /**
       * @param amdSevSnp Indicates whether to enable the instance for AMD SEV-SNP.
       * AMD SEV-SNP is supported with M6a, R6a, and C6a instance types only. For more information,
       * see [AMD SEV-SNP](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/sev-snp.html) .
       */
      override fun amdSevSnp(amdSevSnp: String) {
        cdkBuilder.amdSevSnp(amdSevSnp)
      }

      /**
       * @param coreCount The number of CPU cores for the instance.
       */
      override fun coreCount(coreCount: Number) {
        cdkBuilder.coreCount(coreCount)
      }

      /**
       * @param threadsPerCore The number of threads per CPU core.
       * To disable multithreading for the instance, specify a value of `1` . Otherwise, specify the
       * default value of `2` .
       */
      override fun threadsPerCore(threadsPerCore: Number) {
        cdkBuilder.threadsPerCore(threadsPerCore)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty,
    ) : CdkObject(cdkObject), CpuOptionsProperty {
      /**
       * Indicates whether to enable the instance for AMD SEV-SNP.
       *
       * AMD SEV-SNP is supported with M6a, R6a, and C6a instance types only. For more information,
       * see [AMD SEV-SNP](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/sev-snp.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-cpuoptions.html#cfn-ec2-launchtemplate-cpuoptions-amdsevsnp)
       */
      override fun amdSevSnp(): String? = unwrap(this).getAmdSevSnp()

      /**
       * The number of CPU cores for the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-cpuoptions.html#cfn-ec2-launchtemplate-cpuoptions-corecount)
       */
      override fun coreCount(): Number? = unwrap(this).getCoreCount()

      /**
       * The number of threads per CPU core.
       *
       * To disable multithreading for the instance, specify a value of `1` . Otherwise, specify the
       * default value of `2` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-cpuoptions.html#cfn-ec2-launchtemplate-cpuoptions-threadspercore)
       */
      override fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CpuOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty):
          CpuOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CpuOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty
    }
  }

  /**
   * Specifies the tags to apply to the launch template during creation.
   *
   * `LaunchTemplateTagSpecification` is a property of
   * [AWS::EC2::LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * LaunchTemplateTagSpecificationProperty launchTemplateTagSpecificationProperty =
   * LaunchTemplateTagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatetagspecification.html)
   */
  public interface LaunchTemplateTagSpecificationProperty {
    /**
     * The type of resource.
     *
     * To tag the launch template, `ResourceType` must be `launch-template` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatetagspecification.html#cfn-ec2-launchtemplate-launchtemplatetagspecification-resourcetype)
     */
    public fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * The tags for the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatetagspecification.html#cfn-ec2-launchtemplate-launchtemplatetagspecification-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [LaunchTemplateTagSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceType The type of resource.
       * To tag the launch template, `ResourceType` must be `launch-template` .
       */
      public fun resourceType(resourceType: String)

      /**
       * @param tags The tags for the resource.
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags The tags for the resource.
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty.builder()

      /**
       * @param resourceType The type of resource.
       * To tag the launch template, `ResourceType` must be `launch-template` .
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      /**
       * @param tags The tags for the resource.
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      /**
       * @param tags The tags for the resource.
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty,
    ) : CdkObject(cdkObject), LaunchTemplateTagSpecificationProperty {
      /**
       * The type of resource.
       *
       * To tag the launch template, `ResourceType` must be `launch-template` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatetagspecification.html#cfn-ec2-launchtemplate-launchtemplatetagspecification-resourcetype)
       */
      override fun resourceType(): String? = unwrap(this).getResourceType()

      /**
       * The tags for the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatetagspecification.html#cfn-ec2-launchtemplate-launchtemplatetagspecification-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateTagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty):
          LaunchTemplateTagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateTagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty
    }
  }

  /**
   * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) on an
   * instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AcceleratorCountProperty acceleratorCountProperty = AcceleratorCountProperty.builder()
   * .max(123)
   * .min(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratorcount.html)
   */
  public interface AcceleratorCountProperty {
    /**
     * The maximum number of accelerators.
     *
     * To specify no maximum limit, omit this parameter. To exclude accelerator-enabled instance
     * types, set `Max` to `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratorcount.html#cfn-ec2-launchtemplate-acceleratorcount-max)
     */
    public fun max(): Number? = unwrap(this).getMax()

    /**
     * The minimum number of accelerators.
     *
     * To specify no minimum limit, omit this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratorcount.html#cfn-ec2-launchtemplate-acceleratorcount-min)
     */
    public fun min(): Number? = unwrap(this).getMin()

    /**
     * A builder for [AcceleratorCountProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param max The maximum number of accelerators.
       * To specify no maximum limit, omit this parameter. To exclude accelerator-enabled instance
       * types, set `Max` to `0` .
       */
      public fun max(max: Number)

      /**
       * @param min The minimum number of accelerators.
       * To specify no minimum limit, omit this parameter.
       */
      public fun min(min: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty.builder()

      /**
       * @param max The maximum number of accelerators.
       * To specify no maximum limit, omit this parameter. To exclude accelerator-enabled instance
       * types, set `Max` to `0` .
       */
      override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      /**
       * @param min The minimum number of accelerators.
       * To specify no minimum limit, omit this parameter.
       */
      override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty,
    ) : CdkObject(cdkObject), AcceleratorCountProperty {
      /**
       * The maximum number of accelerators.
       *
       * To specify no maximum limit, omit this parameter. To exclude accelerator-enabled instance
       * types, set `Max` to `0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratorcount.html#cfn-ec2-launchtemplate-acceleratorcount-max)
       */
      override fun max(): Number? = unwrap(this).getMax()

      /**
       * The minimum number of accelerators.
       *
       * To specify no minimum limit, omit this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratorcount.html#cfn-ec2-launchtemplate-acceleratorcount-min)
       */
      override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorCountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty):
          AcceleratorCountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorCountProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty
    }
  }

  /**
   * Specifies an IPv6 address in an Amazon EC2 launch template.
   *
   * `Ipv6Add` is a property of [AWS::EC2::LaunchTemplate
   * NetworkInterface](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * Ipv6AddProperty ipv6AddProperty = Ipv6AddProperty.builder()
   * .ipv6Address("ipv6Address")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html)
   */
  public interface Ipv6AddProperty {
    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet.
     *
     * You can't use this option if you're specifying a number of IPv6 addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html#cfn-ec2-launchtemplate-ipv6add-ipv6address)
     */
    public fun ipv6Address(): String? = unwrap(this).getIpv6Address()

    /**
     * A builder for [Ipv6AddProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipv6Address One or more specific IPv6 addresses from the IPv6 CIDR block range of
       * your subnet.
       * You can't use this option if you're specifying a number of IPv6 addresses.
       */
      public fun ipv6Address(ipv6Address: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty.builder()

      /**
       * @param ipv6Address One or more specific IPv6 addresses from the IPv6 CIDR block range of
       * your subnet.
       * You can't use this option if you're specifying a number of IPv6 addresses.
       */
      override fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty,
    ) : CdkObject(cdkObject), Ipv6AddProperty {
      /**
       * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet.
       *
       * You can't use this option if you're specifying a number of IPv6 addresses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html#cfn-ec2-launchtemplate-ipv6add-ipv6address)
       */
      override fun ipv6Address(): String? = unwrap(this).getIpv6Address()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Ipv6AddProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty):
          Ipv6AddProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ipv6AddProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty
    }
  }

  /**
   * Specifies a license configuration for an instance.
   *
   * `LicenseSpecification` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * LicenseSpecificationProperty licenseSpecificationProperty =
   * LicenseSpecificationProperty.builder()
   * .licenseConfigurationArn("licenseConfigurationArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-licensespecification.html)
   */
  public interface LicenseSpecificationProperty {
    /**
     * The Amazon Resource Name (ARN) of the license configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-licensespecification.html#cfn-ec2-launchtemplate-licensespecification-licenseconfigurationarn)
     */
    public fun licenseConfigurationArn(): String? = unwrap(this).getLicenseConfigurationArn()

    /**
     * A builder for [LicenseSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param licenseConfigurationArn The Amazon Resource Name (ARN) of the license configuration.
       */
      public fun licenseConfigurationArn(licenseConfigurationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty.builder()

      /**
       * @param licenseConfigurationArn The Amazon Resource Name (ARN) of the license configuration.
       */
      override fun licenseConfigurationArn(licenseConfigurationArn: String) {
        cdkBuilder.licenseConfigurationArn(licenseConfigurationArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty,
    ) : CdkObject(cdkObject), LicenseSpecificationProperty {
      /**
       * The Amazon Resource Name (ARN) of the license configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-licensespecification.html#cfn-ec2-launchtemplate-licensespecification-licenseconfigurationarn)
       */
      override fun licenseConfigurationArn(): String? = unwrap(this).getLicenseConfigurationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LicenseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty):
          LicenseSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LicenseSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty
    }
  }

  /**
   * Specifies the placement of an instance.
   *
   * `Placement` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PlacementProperty placementProperty = PlacementProperty.builder()
   * .affinity("affinity")
   * .availabilityZone("availabilityZone")
   * .groupId("groupId")
   * .groupName("groupName")
   * .hostId("hostId")
   * .hostResourceGroupArn("hostResourceGroupArn")
   * .partitionNumber(123)
   * .spreadDomain("spreadDomain")
   * .tenancy("tenancy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html)
   */
  public interface PlacementProperty {
    /**
     * The affinity setting for an instance on a Dedicated Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-affinity)
     */
    public fun affinity(): String? = unwrap(this).getAffinity()

    /**
     * The Availability Zone for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The Group Id of a placement group.
     *
     * You must specify the Placement Group *Group Id* to launch an instance in a shared placement
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-groupid)
     */
    public fun groupId(): String? = unwrap(this).getGroupId()

    /**
     * The name of the placement group for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-groupname)
     */
    public fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * The ID of the Dedicated Host for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-hostid)
     */
    public fun hostId(): String? = unwrap(this).getHostId()

    /**
     * The ARN of the host resource group in which to launch the instances.
     *
     * If you specify a host resource group ARN, omit the *Tenancy* parameter or set it to `host` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-hostresourcegrouparn)
     */
    public fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

    /**
     * The number of the partition the instance should launch in.
     *
     * Valid only if the placement group strategy is set to `partition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-partitionnumber)
     */
    public fun partitionNumber(): Number? = unwrap(this).getPartitionNumber()

    /**
     * Reserved for future use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-spreaddomain)
     */
    public fun spreadDomain(): String? = unwrap(this).getSpreadDomain()

    /**
     * The tenancy of the instance.
     *
     * An instance with a tenancy of dedicated runs on single-tenant hardware.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-tenancy)
     */
    public fun tenancy(): String? = unwrap(this).getTenancy()

    /**
     * A builder for [PlacementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param affinity The affinity setting for an instance on a Dedicated Host.
       */
      public fun affinity(affinity: String)

      /**
       * @param availabilityZone The Availability Zone for the instance.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param groupId The Group Id of a placement group.
       * You must specify the Placement Group *Group Id* to launch an instance in a shared placement
       * group.
       */
      public fun groupId(groupId: String)

      /**
       * @param groupName The name of the placement group for the instance.
       */
      public fun groupName(groupName: String)

      /**
       * @param hostId The ID of the Dedicated Host for the instance.
       */
      public fun hostId(hostId: String)

      /**
       * @param hostResourceGroupArn The ARN of the host resource group in which to launch the
       * instances.
       * If you specify a host resource group ARN, omit the *Tenancy* parameter or set it to `host`
       * .
       */
      public fun hostResourceGroupArn(hostResourceGroupArn: String)

      /**
       * @param partitionNumber The number of the partition the instance should launch in.
       * Valid only if the placement group strategy is set to `partition` .
       */
      public fun partitionNumber(partitionNumber: Number)

      /**
       * @param spreadDomain Reserved for future use.
       */
      public fun spreadDomain(spreadDomain: String)

      /**
       * @param tenancy The tenancy of the instance.
       * An instance with a tenancy of dedicated runs on single-tenant hardware.
       */
      public fun tenancy(tenancy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty.builder()

      /**
       * @param affinity The affinity setting for an instance on a Dedicated Host.
       */
      override fun affinity(affinity: String) {
        cdkBuilder.affinity(affinity)
      }

      /**
       * @param availabilityZone The Availability Zone for the instance.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param groupId The Group Id of a placement group.
       * You must specify the Placement Group *Group Id* to launch an instance in a shared placement
       * group.
       */
      override fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
      }

      /**
       * @param groupName The name of the placement group for the instance.
       */
      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      /**
       * @param hostId The ID of the Dedicated Host for the instance.
       */
      override fun hostId(hostId: String) {
        cdkBuilder.hostId(hostId)
      }

      /**
       * @param hostResourceGroupArn The ARN of the host resource group in which to launch the
       * instances.
       * If you specify a host resource group ARN, omit the *Tenancy* parameter or set it to `host`
       * .
       */
      override fun hostResourceGroupArn(hostResourceGroupArn: String) {
        cdkBuilder.hostResourceGroupArn(hostResourceGroupArn)
      }

      /**
       * @param partitionNumber The number of the partition the instance should launch in.
       * Valid only if the placement group strategy is set to `partition` .
       */
      override fun partitionNumber(partitionNumber: Number) {
        cdkBuilder.partitionNumber(partitionNumber)
      }

      /**
       * @param spreadDomain Reserved for future use.
       */
      override fun spreadDomain(spreadDomain: String) {
        cdkBuilder.spreadDomain(spreadDomain)
      }

      /**
       * @param tenancy The tenancy of the instance.
       * An instance with a tenancy of dedicated runs on single-tenant hardware.
       */
      override fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty,
    ) : CdkObject(cdkObject), PlacementProperty {
      /**
       * The affinity setting for an instance on a Dedicated Host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-affinity)
       */
      override fun affinity(): String? = unwrap(this).getAffinity()

      /**
       * The Availability Zone for the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The Group Id of a placement group.
       *
       * You must specify the Placement Group *Group Id* to launch an instance in a shared placement
       * group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-groupid)
       */
      override fun groupId(): String? = unwrap(this).getGroupId()

      /**
       * The name of the placement group for the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-groupname)
       */
      override fun groupName(): String? = unwrap(this).getGroupName()

      /**
       * The ID of the Dedicated Host for the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-hostid)
       */
      override fun hostId(): String? = unwrap(this).getHostId()

      /**
       * The ARN of the host resource group in which to launch the instances.
       *
       * If you specify a host resource group ARN, omit the *Tenancy* parameter or set it to `host`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-hostresourcegrouparn)
       */
      override fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

      /**
       * The number of the partition the instance should launch in.
       *
       * Valid only if the placement group strategy is set to `partition` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-partitionnumber)
       */
      override fun partitionNumber(): Number? = unwrap(this).getPartitionNumber()

      /**
       * Reserved for future use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-spreaddomain)
       */
      override fun spreadDomain(): String? = unwrap(this).getSpreadDomain()

      /**
       * The tenancy of the instance.
       *
       * An instance with a tenancy of dedicated runs on single-tenant hardware.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html#cfn-ec2-launchtemplate-placement-tenancy)
       */
      override fun tenancy(): String? = unwrap(this).getTenancy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty):
          PlacementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty
    }
  }

  /**
   * Specifies a block device mapping for a launch template.
   *
   * You must specify `DeviceName` plus exactly one of the following properties: `Ebs` , `NoDevice`
   * , or `VirtualName` .
   *
   * `BlockDeviceMapping` is a property of [AWS::EC2::LaunchTemplate
   * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
   * .deviceName("deviceName")
   * .ebs(EbsProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .kmsKeyId("kmsKeyId")
   * .snapshotId("snapshotId")
   * .throughput(123)
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build())
   * .noDevice("noDevice")
   * .virtualName("virtualName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html)
   */
  public interface BlockDeviceMappingProperty {
    /**
     * The device name (for example, /dev/sdh or xvdh).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-devicename)
     */
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    /**
     * Parameters used to automatically set up EBS volumes when the instance is launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs)
     */
    public fun ebs(): Any? = unwrap(this).getEbs()

    /**
     * To omit the device from the block device mapping, specify an empty string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-nodevice)
     */
    public fun noDevice(): String? = unwrap(this).getNoDevice()

    /**
     * The virtual device name (ephemeralN).
     *
     * Instance store volumes are numbered starting from 0. An instance type with 2 available
     * instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of
     * available instance store volumes depends on the instance type. After you connect to the
     * instance, you must mount the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-virtualname)
     */
    public fun virtualName(): String? = unwrap(this).getVirtualName()

    /**
     * A builder for [BlockDeviceMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deviceName The device name (for example, /dev/sdh or xvdh).
       */
      public fun deviceName(deviceName: String)

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       */
      public fun ebs(ebs: IResolvable)

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       */
      public fun ebs(ebs: EbsProperty)

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13d6ae31b3c9294cb1f107c22c338c808581bedefec428957e26694bbbfd5a89")
      public fun ebs(ebs: EbsProperty.Builder.() -> Unit)

      /**
       * @param noDevice To omit the device from the block device mapping, specify an empty string.
       */
      public fun noDevice(noDevice: String)

      /**
       * @param virtualName The virtual device name (ephemeralN).
       * Instance store volumes are numbered starting from 0. An instance type with 2 available
       * instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of
       * available instance store volumes depends on the instance type. After you connect to the
       * instance, you must mount the volume.
       */
      public fun virtualName(virtualName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty.builder()

      /**
       * @param deviceName The device name (for example, /dev/sdh or xvdh).
       */
      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       */
      override fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs.let(IResolvable::unwrap))
      }

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       */
      override fun ebs(ebs: EbsProperty) {
        cdkBuilder.ebs(ebs.let(EbsProperty::unwrap))
      }

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13d6ae31b3c9294cb1f107c22c338c808581bedefec428957e26694bbbfd5a89")
      override fun ebs(ebs: EbsProperty.Builder.() -> Unit): Unit = ebs(EbsProperty(ebs))

      /**
       * @param noDevice To omit the device from the block device mapping, specify an empty string.
       */
      override fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
      }

      /**
       * @param virtualName The virtual device name (ephemeralN).
       * Instance store volumes are numbered starting from 0. An instance type with 2 available
       * instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of
       * available instance store volumes depends on the instance type. After you connect to the
       * instance, you must mount the volume.
       */
      override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty,
    ) : CdkObject(cdkObject), BlockDeviceMappingProperty {
      /**
       * The device name (for example, /dev/sdh or xvdh).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-devicename)
       */
      override fun deviceName(): String? = unwrap(this).getDeviceName()

      /**
       * Parameters used to automatically set up EBS volumes when the instance is launched.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-ebs)
       */
      override fun ebs(): Any? = unwrap(this).getEbs()

      /**
       * To omit the device from the block device mapping, specify an empty string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-nodevice)
       */
      override fun noDevice(): String? = unwrap(this).getNoDevice()

      /**
       * The virtual device name (ephemeralN).
       *
       * Instance store volumes are numbered starting from 0. An instance type with 2 available
       * instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of
       * available instance store volumes depends on the instance type. After you connect to the
       * instance, you must mount the volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-blockdevicemapping.html#cfn-ec2-launchtemplate-blockdevicemapping-virtualname)
       */
      override fun virtualName(): String? = unwrap(this).getVirtualName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlockDeviceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty):
          BlockDeviceMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockDeviceMappingProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty
    }
  }
}
