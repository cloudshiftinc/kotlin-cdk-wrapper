package io.cloudshiftdev.awscdk.services.panorama

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnApplicationInstanceProps {
  /**
   * The ID of an application instance to replace with the new instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-applicationinstanceidtoreplace)
   */
  public fun applicationInstanceIdToReplace(): String? =
      unwrap(this).getApplicationInstanceIdToReplace()

  /**
   * The device's ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-defaultruntimecontextdevice)
   */
  public fun defaultRuntimeContextDevice(): String

  /**
   * A description for the application instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Setting overrides for the application manifest.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestoverridespayload)
   */
  public fun manifestOverridesPayload(): Any? = unwrap(this).getManifestOverridesPayload()

  /**
   * The application's manifest document.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestpayload)
   */
  public fun manifestPayload(): Any

  /**
   * A name for the application instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The ARN of a runtime role for the application instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-runtimerolearn)
   */
  public fun runtimeRoleArn(): String? = unwrap(this).getRuntimeRoleArn()

  /**
   * Tags for the application instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApplicationInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationInstanceIdToReplace The ID of an application instance to replace with the
     * new instance.
     */
    public fun applicationInstanceIdToReplace(applicationInstanceIdToReplace: String)

    /**
     * @param defaultRuntimeContextDevice The device's ID. 
     */
    public fun defaultRuntimeContextDevice(defaultRuntimeContextDevice: String)

    /**
     * @param description A description for the application instance.
     */
    public fun description(description: String)

    /**
     * @param manifestOverridesPayload Setting overrides for the application manifest.
     */
    public fun manifestOverridesPayload(manifestOverridesPayload: IResolvable)

    /**
     * @param manifestOverridesPayload Setting overrides for the application manifest.
     */
    public
        fun manifestOverridesPayload(manifestOverridesPayload: CfnApplicationInstance.ManifestOverridesPayloadProperty)

    /**
     * @param manifestOverridesPayload Setting overrides for the application manifest.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fdd3efea807fbf122d062d08d44ed045e13b748e6bcc6247ed872921e961ff4")
    public
        fun manifestOverridesPayload(manifestOverridesPayload: CfnApplicationInstance.ManifestOverridesPayloadProperty.Builder.() -> Unit)

    /**
     * @param manifestPayload The application's manifest document. 
     */
    public fun manifestPayload(manifestPayload: IResolvable)

    /**
     * @param manifestPayload The application's manifest document. 
     */
    public fun manifestPayload(manifestPayload: CfnApplicationInstance.ManifestPayloadProperty)

    /**
     * @param manifestPayload The application's manifest document. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15a37b78cffc511c2c561e09996e1d06f9a61ee37b2f9b8020da8fc55bfae49f")
    public
        fun manifestPayload(manifestPayload: CfnApplicationInstance.ManifestPayloadProperty.Builder.() -> Unit)

    /**
     * @param name A name for the application instance.
     */
    public fun name(name: String)

    /**
     * @param runtimeRoleArn The ARN of a runtime role for the application instance.
     */
    public fun runtimeRoleArn(runtimeRoleArn: String)

    /**
     * @param tags Tags for the application instance.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags for the application instance.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps.Builder =
        software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps.builder()

    /**
     * @param applicationInstanceIdToReplace The ID of an application instance to replace with the
     * new instance.
     */
    override fun applicationInstanceIdToReplace(applicationInstanceIdToReplace: String) {
      cdkBuilder.applicationInstanceIdToReplace(applicationInstanceIdToReplace)
    }

    /**
     * @param defaultRuntimeContextDevice The device's ID. 
     */
    override fun defaultRuntimeContextDevice(defaultRuntimeContextDevice: String) {
      cdkBuilder.defaultRuntimeContextDevice(defaultRuntimeContextDevice)
    }

    /**
     * @param description A description for the application instance.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param manifestOverridesPayload Setting overrides for the application manifest.
     */
    override fun manifestOverridesPayload(manifestOverridesPayload: IResolvable) {
      cdkBuilder.manifestOverridesPayload(manifestOverridesPayload.let(IResolvable::unwrap))
    }

    /**
     * @param manifestOverridesPayload Setting overrides for the application manifest.
     */
    override
        fun manifestOverridesPayload(manifestOverridesPayload: CfnApplicationInstance.ManifestOverridesPayloadProperty) {
      cdkBuilder.manifestOverridesPayload(manifestOverridesPayload.let(CfnApplicationInstance.ManifestOverridesPayloadProperty::unwrap))
    }

    /**
     * @param manifestOverridesPayload Setting overrides for the application manifest.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fdd3efea807fbf122d062d08d44ed045e13b748e6bcc6247ed872921e961ff4")
    override
        fun manifestOverridesPayload(manifestOverridesPayload: CfnApplicationInstance.ManifestOverridesPayloadProperty.Builder.() -> Unit):
        Unit =
        manifestOverridesPayload(CfnApplicationInstance.ManifestOverridesPayloadProperty(manifestOverridesPayload))

    /**
     * @param manifestPayload The application's manifest document. 
     */
    override fun manifestPayload(manifestPayload: IResolvable) {
      cdkBuilder.manifestPayload(manifestPayload.let(IResolvable::unwrap))
    }

    /**
     * @param manifestPayload The application's manifest document. 
     */
    override fun manifestPayload(manifestPayload: CfnApplicationInstance.ManifestPayloadProperty) {
      cdkBuilder.manifestPayload(manifestPayload.let(CfnApplicationInstance.ManifestPayloadProperty::unwrap))
    }

    /**
     * @param manifestPayload The application's manifest document. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15a37b78cffc511c2c561e09996e1d06f9a61ee37b2f9b8020da8fc55bfae49f")
    override
        fun manifestPayload(manifestPayload: CfnApplicationInstance.ManifestPayloadProperty.Builder.() -> Unit):
        Unit = manifestPayload(CfnApplicationInstance.ManifestPayloadProperty(manifestPayload))

    /**
     * @param name A name for the application instance.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param runtimeRoleArn The ARN of a runtime role for the application instance.
     */
    override fun runtimeRoleArn(runtimeRoleArn: String) {
      cdkBuilder.runtimeRoleArn(runtimeRoleArn)
    }

    /**
     * @param tags Tags for the application instance.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Tags for the application instance.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps,
  ) : CdkObject(cdkObject), CfnApplicationInstanceProps {
    /**
     * The ID of an application instance to replace with the new instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-applicationinstanceidtoreplace)
     */
    override fun applicationInstanceIdToReplace(): String? =
        unwrap(this).getApplicationInstanceIdToReplace()

    /**
     * The device's ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-defaultruntimecontextdevice)
     */
    override fun defaultRuntimeContextDevice(): String =
        unwrap(this).getDefaultRuntimeContextDevice()

    /**
     * A description for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Setting overrides for the application manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestoverridespayload)
     */
    override fun manifestOverridesPayload(): Any? = unwrap(this).getManifestOverridesPayload()

    /**
     * The application's manifest document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-manifestpayload)
     */
    override fun manifestPayload(): Any = unwrap(this).getManifestPayload()

    /**
     * A name for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The ARN of a runtime role for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-runtimerolearn)
     */
    override fun runtimeRoleArn(): String? = unwrap(this).getRuntimeRoleArn()

    /**
     * Tags for the application instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html#cfn-panorama-applicationinstance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps):
        CfnApplicationInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationInstanceProps):
        software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps
  }
}
