@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::IVS::PlaybackKeyPair` resource specifies an  playback key pair.
 *
 * uses a public playback key to validate playback tokens that have been signed with the
 * corresponding private key. For more information, see [Setting Up Private
 * Channels](https://docs.aws.amazon.com/ivs/latest/LowLatencyUserGuide/private-channels.html) in the
 * *Amazon IVS Low-Latency Streaming User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnPlaybackKeyPair cfnPlaybackKeyPair = CfnPlaybackKeyPair.Builder.create(this,
 * "MyCfnPlaybackKeyPair")
 * .name("name")
 * .publicKeyMaterial("publicKeyMaterial")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html)
 */
public open class CfnPlaybackKeyPair(
  cdkObject: software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPlaybackKeyPairProps,
  ) :
      this(software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnPlaybackKeyPairProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPlaybackKeyPairProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPlaybackKeyPairProps(props)
  )

  /**
   * Key-pair ARN.
   *
   * For example:
   * `arn:aws:ivs:us-west-2:693991300569:playback-key/f99cde61-c2b0-4df3-8941-ca7d38acca1a`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Key-pair identifier.
   *
   * For example: `98:0d:1a:a0:19:96:1e:ea:0a:0a:2c:9a:42:19:2b:e7`
   */
  public open fun attrFingerprint(): String = unwrap(this).getAttrFingerprint()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Playback-key-pair name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Playback-key-pair name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The public portion of a customer-generated key pair.
   */
  public open fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

  /**
   * The public portion of a customer-generated key pair.
   */
  public open fun publicKeyMaterial(`value`: String) {
    unwrap(this).setPublicKeyMaterial(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ivs.CfnPlaybackKeyPair].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Playback-key-pair name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-name)
     * @param name Playback-key-pair name. 
     */
    public fun name(name: String)

    /**
     * The public portion of a customer-generated key pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-publickeymaterial)
     * @param publicKeyMaterial The public portion of a customer-generated key pair. 
     */
    public fun publicKeyMaterial(publicKeyMaterial: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackkeypair-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackkeypair-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair.Builder =
        software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair.Builder.create(scope, id)

    /**
     * Playback-key-pair name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-name)
     * @param name Playback-key-pair name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The public portion of a customer-generated key pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-publickeymaterial)
     * @param publicKeyMaterial The public portion of a customer-generated key pair. 
     */
    override fun publicKeyMaterial(publicKeyMaterial: String) {
      cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackkeypair-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackkeypair-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPlaybackKeyPair {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPlaybackKeyPair(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair):
        CfnPlaybackKeyPair = CfnPlaybackKeyPair(cdkObject)

    internal fun unwrap(wrapped: CfnPlaybackKeyPair):
        software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair = wrapped.cdkObject as
        software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair
  }
}
