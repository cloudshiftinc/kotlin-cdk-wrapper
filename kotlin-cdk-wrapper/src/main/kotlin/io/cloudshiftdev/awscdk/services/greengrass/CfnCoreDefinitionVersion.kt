@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Greengrass::CoreDefinitionVersion` resource represents a core definition version for
 * AWS IoT Greengrass .
 *
 * A core definition version contains a Greengrass core.
 *
 *
 * To create a core definition version, you must specify the ID of the core definition that you want
 * to associate with the version. For information about creating a core definition, see
 * [`AWS::Greengrass::CoreDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html)
 * .
 *
 * After you create a core definition version that contains the core you want to deploy, you must
 * add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * CfnCoreDefinitionVersion cfnCoreDefinitionVersion = CfnCoreDefinitionVersion.Builder.create(this,
 * "MyCfnCoreDefinitionVersion")
 * .coreDefinitionId("coreDefinitionId")
 * .cores(List.of(CoreProperty.builder()
 * .certificateArn("certificateArn")
 * .id("id")
 * .thingArn("thingArn")
 * // the properties below are optional
 * .syncShadow(false)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
 */
public open class CfnCoreDefinitionVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the core definition associated with this version.
   */
  public open fun coreDefinitionId(): String = unwrap(this).getCoreDefinitionId()

  /**
   * The ID of the core definition associated with this version.
   */
  public open fun coreDefinitionId(`value`: String) {
    unwrap(this).setCoreDefinitionId(`value`)
  }

  /**
   * The Greengrass core in this version.
   */
  public open fun cores(): Any = unwrap(this).getCores()

  /**
   * The Greengrass core in this version.
   */
  public open fun cores(`value`: IResolvable) {
    unwrap(this).setCores(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Greengrass core in this version.
   */
  public open fun cores(`value`: List<Any>) {
    unwrap(this).setCores(`value`)
  }

  /**
   * The Greengrass core in this version.
   */
  public open fun cores(vararg `value`: Any): Unit = cores(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrass.CfnCoreDefinitionVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the core definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-coredefinitionid)
     * @param coreDefinitionId The ID of the core definition associated with this version. 
     */
    public fun coreDefinitionId(coreDefinitionId: String)

    /**
     * The Greengrass core in this version.
     *
     * Currently, the `Cores` property for a core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores)
     * @param cores The Greengrass core in this version. 
     */
    public fun cores(cores: IResolvable)

    /**
     * The Greengrass core in this version.
     *
     * Currently, the `Cores` property for a core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores)
     * @param cores The Greengrass core in this version. 
     */
    public fun cores(cores: List<Any>)

    /**
     * The Greengrass core in this version.
     *
     * Currently, the `Cores` property for a core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores)
     * @param cores The Greengrass core in this version. 
     */
    public fun cores(vararg cores: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.Builder.create(scope,
        id)

    /**
     * The ID of the core definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-coredefinitionid)
     * @param coreDefinitionId The ID of the core definition associated with this version. 
     */
    override fun coreDefinitionId(coreDefinitionId: String) {
      cdkBuilder.coreDefinitionId(coreDefinitionId)
    }

    /**
     * The Greengrass core in this version.
     *
     * Currently, the `Cores` property for a core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores)
     * @param cores The Greengrass core in this version. 
     */
    override fun cores(cores: IResolvable) {
      cdkBuilder.cores(cores.let(IResolvable::unwrap))
    }

    /**
     * The Greengrass core in this version.
     *
     * Currently, the `Cores` property for a core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores)
     * @param cores The Greengrass core in this version. 
     */
    override fun cores(cores: List<Any>) {
      cdkBuilder.cores(cores)
    }

    /**
     * The Greengrass core in this version.
     *
     * Currently, the `Cores` property for a core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores)
     * @param cores The Greengrass core in this version. 
     */
    override fun cores(vararg cores: Any): Unit = cores(cores.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCoreDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCoreDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion):
        CfnCoreDefinitionVersion = CfnCoreDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnCoreDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion = wrapped.cdkObject
  }

  /**
   * A core is an AWS IoT device that runs the AWS IoT Greengrass core software and manages local
   * processes for a Greengrass group.
   *
   * For more information, see [What Is AWS IoT Greengrass
   * ?](https://docs.aws.amazon.com/greengrass/v1/developerguide/what-is-gg.html) in the *Developer
   * Guide* .
   *
   * In an AWS CloudFormation template, the `Cores` property of the
   * [`AWS::Greengrass::CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
   * resource contains a list of `Core` property types. Currently, the list can contain only one core.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * CoreProperty coreProperty = CoreProperty.builder()
   * .certificateArn("certificateArn")
   * .id("id")
   * .thingArn("thingArn")
   * // the properties below are optional
   * .syncShadow(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinitionversion-core.html)
   */
  public interface CoreProperty {
    /**
     * The ARN of the device certificate for the core.
     *
     * This X.509 certificate is used to authenticate the core with AWS IoT and AWS IoT Greengrass
     * services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinitionversion-core.html#cfn-greengrass-coredefinitionversion-core-certificatearn)
     */
    public fun certificateArn(): String

    /**
     * A descriptive or arbitrary ID for the core.
     *
     * This value must be unique within the core definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinitionversion-core.html#cfn-greengrass-coredefinitionversion-core-id)
     */
    public fun id(): String

    /**
     * Indicates whether the core's local shadow is synced with the cloud automatically.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinitionversion-core.html#cfn-greengrass-coredefinitionversion-core-syncshadow)
     */
    public fun syncShadow(): Any? = unwrap(this).getSyncShadow()

    /**
     * The Amazon Resource Name (ARN) of the core, which is an AWS IoT device (thing).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinitionversion-core.html#cfn-greengrass-coredefinitionversion-core-thingarn)
     */
    public fun thingArn(): String

    /**
     * A builder for [CoreProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn The ARN of the device certificate for the core. 
       * This X.509 certificate is used to authenticate the core with AWS IoT and AWS IoT Greengrass
       * services.
       */
      public fun certificateArn(certificateArn: String)

      /**
       * @param id A descriptive or arbitrary ID for the core. 
       * This value must be unique within the core definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      public fun id(id: String)

      /**
       * @param syncShadow Indicates whether the core's local shadow is synced with the cloud
       * automatically.
       * The default is false.
       */
      public fun syncShadow(syncShadow: Boolean)

      /**
       * @param syncShadow Indicates whether the core's local shadow is synced with the cloud
       * automatically.
       * The default is false.
       */
      public fun syncShadow(syncShadow: IResolvable)

      /**
       * @param thingArn The Amazon Resource Name (ARN) of the core, which is an AWS IoT device
       * (thing). 
       */
      public fun thingArn(thingArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty.Builder =
          software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty.builder()

      /**
       * @param certificateArn The ARN of the device certificate for the core. 
       * This X.509 certificate is used to authenticate the core with AWS IoT and AWS IoT Greengrass
       * services.
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      /**
       * @param id A descriptive or arbitrary ID for the core. 
       * This value must be unique within the core definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param syncShadow Indicates whether the core's local shadow is synced with the cloud
       * automatically.
       * The default is false.
       */
      override fun syncShadow(syncShadow: Boolean) {
        cdkBuilder.syncShadow(syncShadow)
      }

      /**
       * @param syncShadow Indicates whether the core's local shadow is synced with the cloud
       * automatically.
       * The default is false.
       */
      override fun syncShadow(syncShadow: IResolvable) {
        cdkBuilder.syncShadow(syncShadow.let(IResolvable::unwrap))
      }

      /**
       * @param thingArn The Amazon Resource Name (ARN) of the core, which is an AWS IoT device
       * (thing). 
       */
      override fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty,
    ) : CdkObject(cdkObject), CoreProperty {
      /**
       * The ARN of the device certificate for the core.
       *
       * This X.509 certificate is used to authenticate the core with AWS IoT and AWS IoT Greengrass
       * services.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinitionversion-core.html#cfn-greengrass-coredefinitionversion-core-certificatearn)
       */
      override fun certificateArn(): String = unwrap(this).getCertificateArn()

      /**
       * A descriptive or arbitrary ID for the core.
       *
       * This value must be unique within the core definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinitionversion-core.html#cfn-greengrass-coredefinitionversion-core-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * Indicates whether the core's local shadow is synced with the cloud automatically.
       *
       * The default is false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinitionversion-core.html#cfn-greengrass-coredefinitionversion-core-syncshadow)
       */
      override fun syncShadow(): Any? = unwrap(this).getSyncShadow()

      /**
       * The Amazon Resource Name (ARN) of the core, which is an AWS IoT device (thing).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinitionversion-core.html#cfn-greengrass-coredefinitionversion-core-thingarn)
       */
      override fun thingArn(): String = unwrap(this).getThingArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CoreProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty):
          CoreProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoreProperty):
          software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty
    }
  }
}
