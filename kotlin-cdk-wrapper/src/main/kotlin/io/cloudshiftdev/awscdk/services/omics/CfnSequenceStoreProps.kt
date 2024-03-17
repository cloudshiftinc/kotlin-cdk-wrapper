@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSequenceStore`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * CfnSequenceStoreProps cfnSequenceStoreProps = CfnSequenceStoreProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .fallbackLocation("fallbackLocation")
 * .sseConfig(SseConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html)
 */
public interface CfnSequenceStoreProps {
  /**
   * A description for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * An S3 location that is used to store files that have failed a direct upload.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-fallbacklocation)
   */
  public fun fallbackLocation(): String? = unwrap(this).getFallbackLocation()

  /**
   * A name for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-name)
   */
  public fun name(): String

  /**
   * Server-side encryption (SSE) settings for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-sseconfig)
   */
  public fun sseConfig(): Any? = unwrap(this).getSseConfig()

  /**
   * Tags for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnSequenceStoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the store.
     */
    public fun description(description: String)

    /**
     * @param fallbackLocation An S3 location that is used to store files that have failed a direct
     * upload.
     */
    public fun fallbackLocation(fallbackLocation: String)

    /**
     * @param name A name for the store. 
     */
    public fun name(name: String)

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    public fun sseConfig(sseConfig: IResolvable)

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    public fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty)

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b08f61f52e6ffa4653df1814db4d891dd87c7ed451582e12630c0ec29da408ba")
    public fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty.Builder.() -> Unit)

    /**
     * @param tags Tags for the store.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnSequenceStoreProps.Builder =
        software.amazon.awscdk.services.omics.CfnSequenceStoreProps.builder()

    /**
     * @param description A description for the store.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param fallbackLocation An S3 location that is used to store files that have failed a direct
     * upload.
     */
    override fun fallbackLocation(fallbackLocation: String) {
      cdkBuilder.fallbackLocation(fallbackLocation)
    }

    /**
     * @param name A name for the store. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable::unwrap))
    }

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    override fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(CfnSequenceStore.SseConfigProperty::unwrap))
    }

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b08f61f52e6ffa4653df1814db4d891dd87c7ed451582e12630c0ec29da408ba")
    override fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty.Builder.() -> Unit): Unit =
        sseConfig(CfnSequenceStore.SseConfigProperty(sseConfig))

    /**
     * @param tags Tags for the store.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnSequenceStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.omics.CfnSequenceStoreProps,
  ) : CdkObject(cdkObject), CfnSequenceStoreProps {
    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * An S3 location that is used to store files that have failed a direct upload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-fallbacklocation)
     */
    override fun fallbackLocation(): String? = unwrap(this).getFallbackLocation()

    /**
     * A name for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-sseconfig)
     */
    override fun sseConfig(): Any? = unwrap(this).getSseConfig()

    /**
     * Tags for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSequenceStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnSequenceStoreProps):
        CfnSequenceStoreProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSequenceStoreProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSequenceStoreProps):
        software.amazon.awscdk.services.omics.CfnSequenceStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.omics.CfnSequenceStoreProps
  }
}
