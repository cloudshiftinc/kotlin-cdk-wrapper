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
 * Properties for defining a `CfnVariantStore`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * CfnVariantStoreProps cfnVariantStoreProps = CfnVariantStoreProps.builder()
 * .name("name")
 * .reference(ReferenceItemProperty.builder()
 * .referenceArn("referenceArn")
 * .build())
 * // the properties below are optional
 * .description("description")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html)
 */
public interface CfnVariantStoreProps {
  /**
   * A description for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A name for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-name)
   */
  public fun name(): String

  /**
   * The genome reference for the store's variants.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-reference)
   */
  public fun reference(): Any

  /**
   * Server-side encryption (SSE) settings for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-sseconfig)
   */
  public fun sseConfig(): Any? = unwrap(this).getSseConfig()

  /**
   * Tags for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnVariantStoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the store.
     */
    public fun description(description: String)

    /**
     * @param name A name for the store. 
     */
    public fun name(name: String)

    /**
     * @param reference The genome reference for the store's variants. 
     */
    public fun reference(reference: IResolvable)

    /**
     * @param reference The genome reference for the store's variants. 
     */
    public fun reference(reference: CfnVariantStore.ReferenceItemProperty)

    /**
     * @param reference The genome reference for the store's variants. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7e5aa46d9d82fb254975099d8acd828f6c5fc9f2f168cd8baeace1dba2b47d7")
    public fun reference(reference: CfnVariantStore.ReferenceItemProperty.Builder.() -> Unit)

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    public fun sseConfig(sseConfig: IResolvable)

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    public fun sseConfig(sseConfig: CfnVariantStore.SseConfigProperty)

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e3668a9020afb7400d7bbf89cb75d2cc9edd65d1f25ed15ccb4ae04fd8b4b78")
    public fun sseConfig(sseConfig: CfnVariantStore.SseConfigProperty.Builder.() -> Unit)

    /**
     * @param tags Tags for the store.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnVariantStoreProps.Builder =
        software.amazon.awscdk.services.omics.CfnVariantStoreProps.builder()

    /**
     * @param description A description for the store.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name A name for the store. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param reference The genome reference for the store's variants. 
     */
    override fun reference(reference: IResolvable) {
      cdkBuilder.reference(reference.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param reference The genome reference for the store's variants. 
     */
    override fun reference(reference: CfnVariantStore.ReferenceItemProperty) {
      cdkBuilder.reference(reference.let(CfnVariantStore.ReferenceItemProperty.Companion::unwrap))
    }

    /**
     * @param reference The genome reference for the store's variants. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7e5aa46d9d82fb254975099d8acd828f6c5fc9f2f168cd8baeace1dba2b47d7")
    override fun reference(reference: CfnVariantStore.ReferenceItemProperty.Builder.() -> Unit):
        Unit = reference(CfnVariantStore.ReferenceItemProperty(reference))

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    override fun sseConfig(sseConfig: CfnVariantStore.SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(CfnVariantStore.SseConfigProperty.Companion::unwrap))
    }

    /**
     * @param sseConfig Server-side encryption (SSE) settings for the store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e3668a9020afb7400d7bbf89cb75d2cc9edd65d1f25ed15ccb4ae04fd8b4b78")
    override fun sseConfig(sseConfig: CfnVariantStore.SseConfigProperty.Builder.() -> Unit): Unit =
        sseConfig(CfnVariantStore.SseConfigProperty(sseConfig))

    /**
     * @param tags Tags for the store.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnVariantStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.omics.CfnVariantStoreProps,
  ) : CdkObject(cdkObject), CfnVariantStoreProps {
    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A name for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The genome reference for the store's variants.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-reference)
     */
    override fun reference(): Any = unwrap(this).getReference()

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-sseconfig)
     */
    override fun sseConfig(): Any? = unwrap(this).getSseConfig()

    /**
     * Tags for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVariantStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnVariantStoreProps):
        CfnVariantStoreProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVariantStoreProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVariantStoreProps):
        software.amazon.awscdk.services.omics.CfnVariantStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.omics.CfnVariantStoreProps
  }
}
