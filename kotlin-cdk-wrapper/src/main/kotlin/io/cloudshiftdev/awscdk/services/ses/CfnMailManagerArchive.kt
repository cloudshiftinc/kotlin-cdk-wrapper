@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new email archive resource for storing and retaining emails.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnMailManagerArchive cfnMailManagerArchive = CfnMailManagerArchive.Builder.create(this,
 * "MyCfnMailManagerArchive")
 * .archiveName("archiveName")
 * .kmsKeyArn("kmsKeyArn")
 * .retention(ArchiveRetentionProperty.builder()
 * .retentionPeriod("retentionPeriod")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html)
 */
public open class CfnMailManagerArchive(
  cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerArchive,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ses.CfnMailManagerArchive(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerArchiveProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnMailManagerArchive(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMailManagerArchiveProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerArchiveProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMailManagerArchiveProps(props)
  )

  /**
   * A unique name for the new archive.
   */
  public open fun archiveName(): String? = unwrap(this).getArchiveName()

  /**
   * A unique name for the new archive.
   */
  public open fun archiveName(`value`: String) {
    unwrap(this).setArchiveName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the archive.
   */
  public open fun attrArchiveArn(): String = unwrap(this).getAttrArchiveArn()

  /**
   * The unique identifier of the archive.
   */
  public open fun attrArchiveId(): String = unwrap(this).getAttrArchiveId()

  /**
   * The current state of the archive:.
   *
   * * `ACTIVE` – The archive is ready and available for use.
   * * `PENDING_DELETION` – The archive has been marked for deletion and will be permanently deleted
   * in 30 days. No further modifications can be made in this state.
   */
  public open fun attrArchiveState(): String = unwrap(this).getAttrArchiveState()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the KMS key for encrypting emails in the archive.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The Amazon Resource Name (ARN) of the KMS key for encrypting emails in the archive.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * The period for retaining emails in the archive before automatic deletion.
   */
  public open fun retention(): Any? = unwrap(this).getRetention()

  /**
   * The period for retaining emails in the archive before automatic deletion.
   */
  public open fun retention(`value`: IResolvable) {
    unwrap(this).setRetention(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The period for retaining emails in the archive before automatic deletion.
   */
  public open fun retention(`value`: ArchiveRetentionProperty) {
    unwrap(this).setRetention(`value`.let(ArchiveRetentionProperty.Companion::unwrap))
  }

  /**
   * The period for retaining emails in the archive before automatic deletion.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("22aedc4500114696cd89148b8fcf7fe67086a6a823701bea95fb72321943b45e")
  public open fun retention(`value`: ArchiveRetentionProperty.Builder.() -> Unit): Unit =
      retention(ArchiveRetentionProperty(`value`))

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnMailManagerArchive].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A unique name for the new archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-archivename)
     * @param archiveName A unique name for the new archive. 
     */
    public fun archiveName(archiveName: String)

    /**
     * The Amazon Resource Name (ARN) of the KMS key for encrypting emails in the archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key for encrypting emails in the
     * archive. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * The period for retaining emails in the archive before automatic deletion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-retention)
     * @param retention The period for retaining emails in the archive before automatic deletion. 
     */
    public fun retention(retention: IResolvable)

    /**
     * The period for retaining emails in the archive before automatic deletion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-retention)
     * @param retention The period for retaining emails in the archive before automatic deletion. 
     */
    public fun retention(retention: ArchiveRetentionProperty)

    /**
     * The period for retaining emails in the archive before automatic deletion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-retention)
     * @param retention The period for retaining emails in the archive before automatic deletion. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f953e58f20ffb17084cd622268395fc7f8fdd5966c301db7321db86c16336738")
    public fun retention(retention: ArchiveRetentionProperty.Builder.() -> Unit)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnMailManagerArchive.Builder =
        software.amazon.awscdk.services.ses.CfnMailManagerArchive.Builder.create(scope, id)

    /**
     * A unique name for the new archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-archivename)
     * @param archiveName A unique name for the new archive. 
     */
    override fun archiveName(archiveName: String) {
      cdkBuilder.archiveName(archiveName)
    }

    /**
     * The Amazon Resource Name (ARN) of the KMS key for encrypting emails in the archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key for encrypting emails in the
     * archive. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The period for retaining emails in the archive before automatic deletion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-retention)
     * @param retention The period for retaining emails in the archive before automatic deletion. 
     */
    override fun retention(retention: IResolvable) {
      cdkBuilder.retention(retention.let(IResolvable.Companion::unwrap))
    }

    /**
     * The period for retaining emails in the archive before automatic deletion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-retention)
     * @param retention The period for retaining emails in the archive before automatic deletion. 
     */
    override fun retention(retention: ArchiveRetentionProperty) {
      cdkBuilder.retention(retention.let(ArchiveRetentionProperty.Companion::unwrap))
    }

    /**
     * The period for retaining emails in the archive before automatic deletion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-retention)
     * @param retention The period for retaining emails in the archive before automatic deletion. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f953e58f20ffb17084cd622268395fc7f8fdd5966c301db7321db86c16336738")
    override fun retention(retention: ArchiveRetentionProperty.Builder.() -> Unit): Unit =
        retention(ArchiveRetentionProperty(retention))

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerArchive =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnMailManagerArchive.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMailManagerArchive {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMailManagerArchive(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerArchive):
        CfnMailManagerArchive = CfnMailManagerArchive(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerArchive):
        software.amazon.awscdk.services.ses.CfnMailManagerArchive = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.CfnMailManagerArchive
  }

  /**
   * The retention policy for an email archive that specifies how long emails are kept before being
   * automatically deleted.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * ArchiveRetentionProperty archiveRetentionProperty = ArchiveRetentionProperty.builder()
   * .retentionPeriod("retentionPeriod")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerarchive-archiveretention.html)
   */
  public interface ArchiveRetentionProperty {
    /**
     * The enum value sets the period for retaining emails in an archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerarchive-archiveretention.html#cfn-ses-mailmanagerarchive-archiveretention-retentionperiod)
     */
    public fun retentionPeriod(): String

    /**
     * A builder for [ArchiveRetentionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param retentionPeriod The enum value sets the period for retaining emails in an archive. 
       */
      public fun retentionPeriod(retentionPeriod: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerArchive.ArchiveRetentionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerArchive.ArchiveRetentionProperty.builder()

      /**
       * @param retentionPeriod The enum value sets the period for retaining emails in an archive. 
       */
      override fun retentionPeriod(retentionPeriod: String) {
        cdkBuilder.retentionPeriod(retentionPeriod)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerArchive.ArchiveRetentionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerArchive.ArchiveRetentionProperty,
    ) : CdkObject(cdkObject),
        ArchiveRetentionProperty {
      /**
       * The enum value sets the period for retaining emails in an archive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerarchive-archiveretention.html#cfn-ses-mailmanagerarchive-archiveretention-retentionperiod)
       */
      override fun retentionPeriod(): String = unwrap(this).getRetentionPeriod()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveRetentionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerArchive.ArchiveRetentionProperty):
          ArchiveRetentionProperty = CdkObjectWrappers.wrap(cdkObject) as? ArchiveRetentionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveRetentionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerArchive.ArchiveRetentionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerArchive.ArchiveRetentionProperty
    }
  }
}
