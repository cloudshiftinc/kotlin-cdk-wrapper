package io.cloudshiftdev.awscdk.services.fsx

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

public open class CfnSnapshot internal constructor(
  private val cdkObject: software.amazon.awscdk.services.fsx.CfnSnapshot,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Returns the snapshot's Amazon Resource Name (ARN).
   *
   * Example:
   * `arn:aws:fsx:us-east-2:111133334444:snapshot/fsvol-01234567890123456/fsvolsnap-0123456789abcedf5`
   */
  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the snapshot.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the snapshot.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of `Tag` values, with a maximum of 50 elements.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of `Tag` values, with a maximum of 50 elements.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of `Tag` values, with a maximum of 50 elements.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the volume that the snapshot is of.
   */
  public open fun volumeId(): String = unwrap(this).getVolumeId()

  /**
   * The ID of the volume that the snapshot is of.
   */
  public open fun volumeId(`value`: String) {
    unwrap(this).setVolumeId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fsx.CfnSnapshot].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-name)
     * @param name The name of the snapshot. 
     */
    public fun name(name: String)

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-tags)
     * @param tags A list of `Tag` values, with a maximum of 50 elements. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-tags)
     * @param tags A list of `Tag` values, with a maximum of 50 elements. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the volume that the snapshot is of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-volumeid)
     * @param volumeId The ID of the volume that the snapshot is of. 
     */
    public fun volumeId(volumeId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnSnapshot.Builder =
        software.amazon.awscdk.services.fsx.CfnSnapshot.Builder.create(scope, id)

    /**
     * The name of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-name)
     * @param name The name of the snapshot. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-tags)
     * @param tags A list of `Tag` values, with a maximum of 50 elements. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-tags)
     * @param tags A list of `Tag` values, with a maximum of 50 elements. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the volume that the snapshot is of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-volumeid)
     * @param volumeId The ID of the volume that the snapshot is of. 
     */
    override fun volumeId(volumeId: String) {
      cdkBuilder.volumeId(volumeId)
    }

    public fun build(): software.amazon.awscdk.services.fsx.CfnSnapshot = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSnapshot {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSnapshot(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnSnapshot): CfnSnapshot =
        CfnSnapshot(cdkObject)

    internal fun unwrap(wrapped: CfnSnapshot): software.amazon.awscdk.services.fsx.CfnSnapshot =
        wrapped.cdkObject
  }
}
