@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.panorama

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an application instance and deploys it to a device.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.panorama.*;
 * CfnApplicationInstance cfnApplicationInstance = CfnApplicationInstance.Builder.create(this,
 * "MyCfnApplicationInstance")
 * .defaultRuntimeContextDevice("defaultRuntimeContextDevice")
 * .manifestPayload(ManifestPayloadProperty.builder()
 * .payloadData("payloadData")
 * .build())
 * // the properties below are optional
 * .applicationInstanceIdToReplace("applicationInstanceIdToReplace")
 * .description("description")
 * .manifestOverridesPayload(ManifestOverridesPayloadProperty.builder()
 * .payloadData("payloadData")
 * .build())
 * .name("name")
 * .runtimeRoleArn("runtimeRoleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html)
 */
public open class CfnApplicationInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.panorama.CfnApplicationInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID of an application instance to replace with the new instance.
   */
  public open fun applicationInstanceIdToReplace(): String? =
      unwrap(this).getApplicationInstanceIdToReplace()

  /**
   * The ID of an application instance to replace with the new instance.
   */
  public open fun applicationInstanceIdToReplace(`value`: String) {
    unwrap(this).setApplicationInstanceIdToReplace(`value`)
  }

  /**
   * The application instance's ID.
   */
  public open fun attrApplicationInstanceId(): String = unwrap(this).getAttrApplicationInstanceId()

  /**
   * The application instance's ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The application instance's created time.
   */
  public open fun attrCreatedTime(): Number = unwrap(this).getAttrCreatedTime()

  /**
   * The application instance's default runtime context device name.
   */
  public open fun attrDefaultRuntimeContextDeviceName(): String =
      unwrap(this).getAttrDefaultRuntimeContextDeviceName()

  /**
   * The application instance's health status.
   */
  public open fun attrHealthStatus(): String = unwrap(this).getAttrHealthStatus()

  /**
   * The application instance's last updated time.
   */
  public open fun attrLastUpdatedTime(): Number = unwrap(this).getAttrLastUpdatedTime()

  /**
   * The application instance's status.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The application instance's status description.
   */
  public open fun attrStatusDescription(): String = unwrap(this).getAttrStatusDescription()

  /**
   * The device's ID.
   */
  public open fun defaultRuntimeContextDevice(): String =
      unwrap(this).getDefaultRuntimeContextDevice()

  /**
   * The device's ID.
   */
  public open fun defaultRuntimeContextDevice(`value`: String) {
    unwrap(this).setDefaultRuntimeContextDevice(`value`)
  }

  /**
   * A description for the application instance.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the application instance.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Setting overrides for the application manifest.
   */
  public open fun manifestOverridesPayload(): Any? = unwrap(this).getManifestOverridesPayload()

  /**
   * Setting overrides for the application manifest.
   */
  public open fun manifestOverridesPayload(`value`: IResolvable) {
    unwrap(this).setManifestOverridesPayload(`value`.let(IResolvable::unwrap))
  }

  /**
   * Setting overrides for the application manifest.
   */
  public open fun manifestOverridesPayload(`value`: ManifestOverridesPayloadProperty) {
    unwrap(this).setManifestOverridesPayload(`value`.let(ManifestOverridesPayloadProperty::unwrap))
  }

  /**
   * Setting overrides for the application manifest.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5766abb9a0020ee6ac0260264091b352d741f2a8af4117d081a7a284267cdf2")
  public open
      fun manifestOverridesPayload(`value`: ManifestOverridesPayloadProperty.Builder.() -> Unit):
      Unit = manifestOverridesPayload(ManifestOverridesPayloadProperty(`value`))

  /**
   * The application's manifest document.
   */
  public open fun manifestPayload(): Any = unwrap(this).getManifestPayload()

  /**
   * The application's manifest document.
   */
  public open fun manifestPayload(`value`: IResolvable) {
    unwrap(this).setManifestPayload(`value`.let(IResolvable::unwrap))
  }

  /**
   * The application's manifest document.
   */
  public open fun manifestPayload(`value`: ManifestPayloadProperty) {
    unwrap(this).setManifestPayload(`value`.let(ManifestPayloadProperty::unwrap))
  }

  /**
   * The application's manifest document.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c811b14b9ad4ad01b324e420d5a060a89d9d73b145738c3dda78891abb0aa6b8")
  public open fun manifestPayload(`value`: ManifestPayloadProperty.Builder.() -> Unit): Unit =
      manifestPayload(ManifestPayloadProperty(`value`))

  /**
   * A name for the application instance.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A name for the application instance.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARN of a runtime role for the application instance.
   */
  public open fun runtimeRoleArn(): String? = unwrap(this).getRuntimeRoleArn()

  /**
   * The ARN of a runtime role for the application instance.
   */
  public open fun runtimeRoleArn(`value`: String) {
    unwrap(this).setRuntimeRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags for the application instance.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Tags for the application instance.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Tags for the application instance.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.panorama.CfnApplicationInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of an application instance to replace with the new instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-applicationinstanceidtoreplace)
     * @param applicationInstanceIdToReplace The ID of an application instance to replace with the
     * new instance. 
     */
    public fun applicationInstanceIdToReplace(applicationInstanceIdToReplace: String)

    /**
     * The device's ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-defaultruntimecontextdevice)
     * @param defaultRuntimeContextDevice The device's ID. 
     */
    public fun defaultRuntimeContextDevice(defaultRuntimeContextDevice: String)

    /**
     * A description for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-description)
     * @param description A description for the application instance. 
     */
    public fun description(description: String)

    /**
     * Setting overrides for the application manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestoverridespayload)
     * @param manifestOverridesPayload Setting overrides for the application manifest. 
     */
    public fun manifestOverridesPayload(manifestOverridesPayload: IResolvable)

    /**
     * Setting overrides for the application manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestoverridespayload)
     * @param manifestOverridesPayload Setting overrides for the application manifest. 
     */
    public fun manifestOverridesPayload(manifestOverridesPayload: ManifestOverridesPayloadProperty)

    /**
     * Setting overrides for the application manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestoverridespayload)
     * @param manifestOverridesPayload Setting overrides for the application manifest. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3fea6e0388b64f4224c3966cc05a778b0e96eff05e2571d6856a0d19cede2ff")
    public
        fun manifestOverridesPayload(manifestOverridesPayload: ManifestOverridesPayloadProperty.Builder.() -> Unit)

    /**
     * The application's manifest document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestpayload)
     * @param manifestPayload The application's manifest document. 
     */
    public fun manifestPayload(manifestPayload: IResolvable)

    /**
     * The application's manifest document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestpayload)
     * @param manifestPayload The application's manifest document. 
     */
    public fun manifestPayload(manifestPayload: ManifestPayloadProperty)

    /**
     * The application's manifest document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestpayload)
     * @param manifestPayload The application's manifest document. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9948972873d9876a1879bd640f247de1c5d81f10a5efe27effe1ddbf495bb9f")
    public fun manifestPayload(manifestPayload: ManifestPayloadProperty.Builder.() -> Unit)

    /**
     * A name for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-name)
     * @param name A name for the application instance. 
     */
    public fun name(name: String)

    /**
     * The ARN of a runtime role for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-runtimerolearn)
     * @param runtimeRoleArn The ARN of a runtime role for the application instance. 
     */
    public fun runtimeRoleArn(runtimeRoleArn: String)

    /**
     * Tags for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-tags)
     * @param tags Tags for the application instance. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-tags)
     * @param tags Tags for the application instance. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.panorama.CfnApplicationInstance.Builder
        = software.amazon.awscdk.services.panorama.CfnApplicationInstance.Builder.create(scope, id)

    /**
     * The ID of an application instance to replace with the new instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-applicationinstanceidtoreplace)
     * @param applicationInstanceIdToReplace The ID of an application instance to replace with the
     * new instance. 
     */
    override fun applicationInstanceIdToReplace(applicationInstanceIdToReplace: String) {
      cdkBuilder.applicationInstanceIdToReplace(applicationInstanceIdToReplace)
    }

    /**
     * The device's ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-defaultruntimecontextdevice)
     * @param defaultRuntimeContextDevice The device's ID. 
     */
    override fun defaultRuntimeContextDevice(defaultRuntimeContextDevice: String) {
      cdkBuilder.defaultRuntimeContextDevice(defaultRuntimeContextDevice)
    }

    /**
     * A description for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-description)
     * @param description A description for the application instance. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Setting overrides for the application manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestoverridespayload)
     * @param manifestOverridesPayload Setting overrides for the application manifest. 
     */
    override fun manifestOverridesPayload(manifestOverridesPayload: IResolvable) {
      cdkBuilder.manifestOverridesPayload(manifestOverridesPayload.let(IResolvable::unwrap))
    }

    /**
     * Setting overrides for the application manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestoverridespayload)
     * @param manifestOverridesPayload Setting overrides for the application manifest. 
     */
    override
        fun manifestOverridesPayload(manifestOverridesPayload: ManifestOverridesPayloadProperty) {
      cdkBuilder.manifestOverridesPayload(manifestOverridesPayload.let(ManifestOverridesPayloadProperty::unwrap))
    }

    /**
     * Setting overrides for the application manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestoverridespayload)
     * @param manifestOverridesPayload Setting overrides for the application manifest. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3fea6e0388b64f4224c3966cc05a778b0e96eff05e2571d6856a0d19cede2ff")
    override
        fun manifestOverridesPayload(manifestOverridesPayload: ManifestOverridesPayloadProperty.Builder.() -> Unit):
        Unit = manifestOverridesPayload(ManifestOverridesPayloadProperty(manifestOverridesPayload))

    /**
     * The application's manifest document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestpayload)
     * @param manifestPayload The application's manifest document. 
     */
    override fun manifestPayload(manifestPayload: IResolvable) {
      cdkBuilder.manifestPayload(manifestPayload.let(IResolvable::unwrap))
    }

    /**
     * The application's manifest document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestpayload)
     * @param manifestPayload The application's manifest document. 
     */
    override fun manifestPayload(manifestPayload: ManifestPayloadProperty) {
      cdkBuilder.manifestPayload(manifestPayload.let(ManifestPayloadProperty::unwrap))
    }

    /**
     * The application's manifest document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestpayload)
     * @param manifestPayload The application's manifest document. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9948972873d9876a1879bd640f247de1c5d81f10a5efe27effe1ddbf495bb9f")
    override fun manifestPayload(manifestPayload: ManifestPayloadProperty.Builder.() -> Unit): Unit
        = manifestPayload(ManifestPayloadProperty(manifestPayload))

    /**
     * A name for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-name)
     * @param name A name for the application instance. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARN of a runtime role for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-runtimerolearn)
     * @param runtimeRoleArn The ARN of a runtime role for the application instance. 
     */
    override fun runtimeRoleArn(runtimeRoleArn: String) {
      cdkBuilder.runtimeRoleArn(runtimeRoleArn)
    }

    /**
     * Tags for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-tags)
     * @param tags Tags for the application instance. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Tags for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-tags)
     * @param tags Tags for the application instance. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.panorama.CfnApplicationInstance =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.panorama.CfnApplicationInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnApplicationInstance):
        CfnApplicationInstance = CfnApplicationInstance(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationInstance):
        software.amazon.awscdk.services.panorama.CfnApplicationInstance = wrapped.cdkObject
  }

  /**
   * Parameter overrides for an application instance.
   *
   * This is a JSON document that has a single key ( `PayloadData` ) where the value is an escaped
   * string representation of the overrides document.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.panorama.*;
   * ManifestOverridesPayloadProperty manifestOverridesPayloadProperty =
   * ManifestOverridesPayloadProperty.builder()
   * .payloadData("payloadData")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-applicationinstance-manifestoverridespayload.html)
   */
  public interface ManifestOverridesPayloadProperty {
    /**
     * The overrides document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-applicationinstance-manifestoverridespayload.html#cfn-panorama-applicationinstance-manifestoverridespayload-payloaddata)
     */
    public fun payloadData(): String? = unwrap(this).getPayloadData()

    /**
     * A builder for [ManifestOverridesPayloadProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param payloadData The overrides document.
       */
      public fun payloadData(payloadData: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty.Builder
          =
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty.builder()

      /**
       * @param payloadData The overrides document.
       */
      override fun payloadData(payloadData: String) {
        cdkBuilder.payloadData(payloadData)
      }

      public fun build():
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty,
    ) : CdkObject(cdkObject), ManifestOverridesPayloadProperty {
      /**
       * The overrides document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-applicationinstance-manifestoverridespayload.html#cfn-panorama-applicationinstance-manifestoverridespayload-payloaddata)
       */
      override fun payloadData(): String? = unwrap(this).getPayloadData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManifestOverridesPayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty):
          ManifestOverridesPayloadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManifestOverridesPayloadProperty):
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestOverridesPayloadProperty
    }
  }

  /**
   * A application verion's manifest file.
   *
   * This is a JSON document that has a single key ( `PayloadData` ) where the value is an escaped
   * string representation of the application manifest ( `graph.json` ). This file is located in the
   * `graphs` folder in your application source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.panorama.*;
   * ManifestPayloadProperty manifestPayloadProperty = ManifestPayloadProperty.builder()
   * .payloadData("payloadData")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-applicationinstance-manifestpayload.html)
   */
  public interface ManifestPayloadProperty {
    /**
     * The application manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-applicationinstance-manifestpayload.html#cfn-panorama-applicationinstance-manifestpayload-payloaddata)
     */
    public fun payloadData(): String? = unwrap(this).getPayloadData()

    /**
     * A builder for [ManifestPayloadProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param payloadData The application manifest.
       */
      public fun payloadData(payloadData: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty.Builder
          =
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty.builder()

      /**
       * @param payloadData The application manifest.
       */
      override fun payloadData(payloadData: String) {
        cdkBuilder.payloadData(payloadData)
      }

      public fun build():
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty,
    ) : CdkObject(cdkObject), ManifestPayloadProperty {
      /**
       * The application manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-applicationinstance-manifestpayload.html#cfn-panorama-applicationinstance-manifestpayload-payloaddata)
       */
      override fun payloadData(): String? = unwrap(this).getPayloadData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManifestPayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty):
          ManifestPayloadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManifestPayloadProperty):
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.panorama.CfnApplicationInstance.ManifestPayloadProperty
    }
  }
}
