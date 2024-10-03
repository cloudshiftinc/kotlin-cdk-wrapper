@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMailManagerArchive`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnMailManagerArchiveProps cfnMailManagerArchiveProps = CfnMailManagerArchiveProps.builder()
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
public interface CfnMailManagerArchiveProps {
  /**
   * A unique name for the new archive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-archivename)
   */
  public fun archiveName(): String? = unwrap(this).getArchiveName()

  /**
   * The Amazon Resource Name (ARN) of the KMS key for encrypting emails in the archive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The period for retaining emails in the archive before automatic deletion.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-retention)
   */
  public fun retention(): Any? = unwrap(this).getRetention()

  /**
   * The tags used to organize, track, or control access for the resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMailManagerArchiveProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param archiveName A unique name for the new archive.
     */
    public fun archiveName(archiveName: String)

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key for encrypting emails in the
     * archive.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param retention The period for retaining emails in the archive before automatic deletion.
     */
    public fun retention(retention: IResolvable)

    /**
     * @param retention The period for retaining emails in the archive before automatic deletion.
     */
    public fun retention(retention: CfnMailManagerArchive.ArchiveRetentionProperty)

    /**
     * @param retention The period for retaining emails in the archive before automatic deletion.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e00fb61a0979a2743470d5b2f1f02cc0c5293f1fa16eda71e8485af0a63cb4a1")
    public
        fun retention(retention: CfnMailManagerArchive.ArchiveRetentionProperty.Builder.() -> Unit)

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnMailManagerArchiveProps.Builder =
        software.amazon.awscdk.services.ses.CfnMailManagerArchiveProps.builder()

    /**
     * @param archiveName A unique name for the new archive.
     */
    override fun archiveName(archiveName: String) {
      cdkBuilder.archiveName(archiveName)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key for encrypting emails in the
     * archive.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param retention The period for retaining emails in the archive before automatic deletion.
     */
    override fun retention(retention: IResolvable) {
      cdkBuilder.retention(retention.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param retention The period for retaining emails in the archive before automatic deletion.
     */
    override fun retention(retention: CfnMailManagerArchive.ArchiveRetentionProperty) {
      cdkBuilder.retention(retention.let(CfnMailManagerArchive.ArchiveRetentionProperty.Companion::unwrap))
    }

    /**
     * @param retention The period for retaining emails in the archive before automatic deletion.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e00fb61a0979a2743470d5b2f1f02cc0c5293f1fa16eda71e8485af0a63cb4a1")
    override
        fun retention(retention: CfnMailManagerArchive.ArchiveRetentionProperty.Builder.() -> Unit):
        Unit = retention(CfnMailManagerArchive.ArchiveRetentionProperty(retention))

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerArchiveProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerArchiveProps,
  ) : CdkObject(cdkObject),
      CfnMailManagerArchiveProps {
    /**
     * A unique name for the new archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-archivename)
     */
    override fun archiveName(): String? = unwrap(this).getArchiveName()

    /**
     * The Amazon Resource Name (ARN) of the KMS key for encrypting emails in the archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The period for retaining emails in the archive before automatic deletion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-retention)
     */
    override fun retention(): Any? = unwrap(this).getRetention()

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerarchive.html#cfn-ses-mailmanagerarchive-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMailManagerArchiveProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerArchiveProps):
        CfnMailManagerArchiveProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMailManagerArchiveProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerArchiveProps):
        software.amazon.awscdk.services.ses.CfnMailManagerArchiveProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnMailManagerArchiveProps
  }
}
