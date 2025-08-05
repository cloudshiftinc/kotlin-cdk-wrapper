@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Object s3AccessPolicy;
 * CfnSequenceStoreProps cfnSequenceStoreProps = CfnSequenceStoreProps.builder()
 * .name("name")
 * // the properties below are optional
 * .accessLogLocation("accessLogLocation")
 * .description("description")
 * .eTagAlgorithmFamily("eTagAlgorithmFamily")
 * .fallbackLocation("fallbackLocation")
 * .propagatedSetLevelTags(List.of("propagatedSetLevelTags"))
 * .s3AccessPolicy(s3AccessPolicy)
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
   * Location of the access logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-accessloglocation)
   */
  public fun accessLogLocation(): String? = unwrap(this).getAccessLogLocation()

  /**
   * A description for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The algorithm family of the ETag.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-etagalgorithmfamily)
   */
  public fun eTagAlgorithmFamily(): String? = unwrap(this).getETagAlgorithmFamily()

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
   * The tags keys to propagate to the S3 objects associated with read sets in the sequence store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-propagatedsetleveltags)
   */
  public fun propagatedSetLevelTags(): List<String> = unwrap(this).getPropagatedSetLevelTags() ?:
      emptyList()

  /**
   * The resource policy that controls S3 access on the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-s3accesspolicy)
   */
  public fun s3AccessPolicy(): Any? = unwrap(this).getS3AccessPolicy()

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
     * @param accessLogLocation Location of the access logs.
     */
    public fun accessLogLocation(accessLogLocation: String)

    /**
     * @param description A description for the store.
     */
    public fun description(description: String)

    /**
     * @param eTagAlgorithmFamily The algorithm family of the ETag.
     */
    public fun eTagAlgorithmFamily(eTagAlgorithmFamily: String)

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
     * @param propagatedSetLevelTags The tags keys to propagate to the S3 objects associated with
     * read sets in the sequence store.
     */
    public fun propagatedSetLevelTags(propagatedSetLevelTags: List<String>)

    /**
     * @param propagatedSetLevelTags The tags keys to propagate to the S3 objects associated with
     * read sets in the sequence store.
     */
    public fun propagatedSetLevelTags(vararg propagatedSetLevelTags: String)

    /**
     * @param s3AccessPolicy The resource policy that controls S3 access on the store.
     */
    public fun s3AccessPolicy(s3AccessPolicy: Any)

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
     * @param accessLogLocation Location of the access logs.
     */
    override fun accessLogLocation(accessLogLocation: String) {
      cdkBuilder.accessLogLocation(accessLogLocation)
    }

    /**
     * @param description A description for the store.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eTagAlgorithmFamily The algorithm family of the ETag.
     */
    override fun eTagAlgorithmFamily(eTagAlgorithmFamily: String) {
      cdkBuilder.eTagAlgorithmFamily(eTagAlgorithmFamily)
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
     * @param propagatedSetLevelTags The tags keys to propagate to the S3 objects associated with
     * read sets in the sequence store.
     */
    override fun propagatedSetLevelTags(propagatedSetLevelTags: List<String>) {
      cdkBuilder.propagatedSetLevelTags(propagatedSetLevelTags)
    }

    /**
     * @param propagatedSetLevelTags The tags keys to propagate to the S3 objects associated with
     * read sets in the sequence store.
     */
    override fun propagatedSetLevelTags(vararg propagatedSetLevelTags: String): Unit =
        propagatedSetLevelTags(propagatedSetLevelTags.toList())

    /**
     * @param s3AccessPolicy The resource policy that controls S3 access on the store.
     */
    override fun s3AccessPolicy(s3AccessPolicy: Any) {
      cdkBuilder.s3AccessPolicy(s3AccessPolicy)
    }

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    override fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(CfnSequenceStore.SseConfigProperty.Companion::unwrap))
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
    cdkObject: software.amazon.awscdk.services.omics.CfnSequenceStoreProps,
  ) : CdkObject(cdkObject),
      CfnSequenceStoreProps {
    /**
     * Location of the access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-accessloglocation)
     */
    override fun accessLogLocation(): String? = unwrap(this).getAccessLogLocation()

    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The algorithm family of the ETag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-etagalgorithmfamily)
     */
    override fun eTagAlgorithmFamily(): String? = unwrap(this).getETagAlgorithmFamily()

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
     * The tags keys to propagate to the S3 objects associated with read sets in the sequence store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-propagatedsetleveltags)
     */
    override fun propagatedSetLevelTags(): List<String> = unwrap(this).getPropagatedSetLevelTags()
        ?: emptyList()

    /**
     * The resource policy that controls S3 access on the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-s3accesspolicy)
     */
    override fun s3AccessPolicy(): Any? = unwrap(this).getS3AccessPolicy()

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
