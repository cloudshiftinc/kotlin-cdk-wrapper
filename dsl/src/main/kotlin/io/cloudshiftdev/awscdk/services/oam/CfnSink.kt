package io.cloudshiftdev.awscdk.services.oam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSink internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.oam.CfnSink,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the sink.
   *
   * For example, `arn:aws:oam:us-west-1:111111111111:sink:abcd1234-a123-456a-a12b-a123b456c789`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A name for the sink.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the sink.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The IAM policy that grants permissions to source accounts to link to this sink.
   */
  public open fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * The IAM policy that grants permissions to source accounts to link to this sink.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to the sink.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * An array of key-value pairs to apply to the sink.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.oam.CfnSink].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the sink.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-name)
     * @param name A name for the sink. 
     */
    public fun name(name: String)

    /**
     * The IAM policy that grants permissions to source accounts to link to this sink.
     *
     * The policy can grant permission in the following ways:
     *
     * * Include organization IDs or organization paths to permit all accounts in an organization
     * * Include account IDs to permit the specified accounts
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-policy)
     * @param policy The IAM policy that grants permissions to source accounts to link to this sink.
     * 
     */
    public fun policy(policy: Any)

    /**
     * An array of key-value pairs to apply to the sink.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-tags)
     * @param tags An array of key-value pairs to apply to the sink. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.oam.CfnSink.Builder =
        software.amazon.awscdk.services.oam.CfnSink.Builder.create(scope, id)

    /**
     * A name for the sink.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-name)
     * @param name A name for the sink. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The IAM policy that grants permissions to source accounts to link to this sink.
     *
     * The policy can grant permission in the following ways:
     *
     * * Include organization IDs or organization paths to permit all accounts in an organization
     * * Include account IDs to permit the specified accounts
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-policy)
     * @param policy The IAM policy that grants permissions to source accounts to link to this sink.
     * 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * An array of key-value pairs to apply to the sink.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-tags)
     * @param tags An array of key-value pairs to apply to the sink. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.oam.CfnSink = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.oam.CfnSink.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSink(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.oam.CfnSink): CfnSink =
        CfnSink(cdkObject)

    internal fun unwrap(wrapped: CfnSink): software.amazon.awscdk.services.oam.CfnSink =
        wrapped.cdkObject
  }
}
