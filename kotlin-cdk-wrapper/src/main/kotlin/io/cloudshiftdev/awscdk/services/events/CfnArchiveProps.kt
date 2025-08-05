@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnArchive`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * Object eventPattern;
 * CfnArchiveProps cfnArchiveProps = CfnArchiveProps.builder()
 * .sourceArn("sourceArn")
 * // the properties below are optional
 * .archiveName("archiveName")
 * .description("description")
 * .eventPattern(eventPattern)
 * .kmsKeyIdentifier("kmsKeyIdentifier")
 * .retentionDays(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html)
 */
public interface CfnArchiveProps {
  /**
   * The name for the archive to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-archivename)
   */
  public fun archiveName(): String? = unwrap(this).getArchiveName()

  /**
   * A description for the archive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * An event pattern to use to filter events sent to the archive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-eventpattern)
   */
  public fun eventPattern(): Any? = unwrap(this).getEventPattern()

  /**
   * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to use
   * a customer managed key to encrypt this archive.
   *
   * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
   *
   * If you do not specify a customer managed key identifier, EventBridge uses an AWS owned key to
   * encrypt the archive.
   *
   * For more information, see [Identify and view
   * keys](https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html) in the *AWS Key
   * Management Service Developer Guide* .
   *
   *
   * If you have specified that EventBridge use a customer managed key for encrypting the source
   * event bus, we strongly recommend you also specify a customer managed key for any archives for the
   * event bus as well.
   *
   * For more information, see [Encrypting
   * archives](https://docs.aws.amazon.com/eventbridge/latest/userguide/encryption-archives.html) in
   * the *Amazon EventBridge User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-kmskeyidentifier)
   */
  public fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  /**
   * The number of days to retain events for.
   *
   * Default value is 0. If set to 0, events are retained indefinitely
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-retentiondays)
   */
  public fun retentionDays(): Number? = unwrap(this).getRetentionDays()

  /**
   * The ARN of the event bus that sends events to the archive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-sourcearn)
   */
  public fun sourceArn(): String

  /**
   * A builder for [CfnArchiveProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param archiveName The name for the archive to create.
     */
    public fun archiveName(archiveName: String)

    /**
     * @param description A description for the archive.
     */
    public fun description(description: String)

    /**
     * @param eventPattern An event pattern to use to filter events sent to the archive.
     */
    public fun eventPattern(eventPattern: Any)

    /**
     * @param kmsKeyIdentifier The identifier of the AWS KMS customer managed key for EventBridge to
     * use, if you choose to use a customer managed key to encrypt this archive.
     * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
     *
     * If you do not specify a customer managed key identifier, EventBridge uses an AWS owned key to
     * encrypt the archive.
     *
     * For more information, see [Identify and view
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     *
     * If you have specified that EventBridge use a customer managed key for encrypting the source
     * event bus, we strongly recommend you also specify a customer managed key for any archives for
     * the event bus as well.
     *
     * For more information, see [Encrypting
     * archives](https://docs.aws.amazon.com/eventbridge/latest/userguide/encryption-archives.html) in
     * the *Amazon EventBridge User Guide* .
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    /**
     * @param retentionDays The number of days to retain events for.
     * Default value is 0. If set to 0, events are retained indefinitely
     */
    public fun retentionDays(retentionDays: Number)

    /**
     * @param sourceArn The ARN of the event bus that sends events to the archive. 
     */
    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnArchiveProps.Builder =
        software.amazon.awscdk.services.events.CfnArchiveProps.builder()

    /**
     * @param archiveName The name for the archive to create.
     */
    override fun archiveName(archiveName: String) {
      cdkBuilder.archiveName(archiveName)
    }

    /**
     * @param description A description for the archive.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventPattern An event pattern to use to filter events sent to the archive.
     */
    override fun eventPattern(eventPattern: Any) {
      cdkBuilder.eventPattern(eventPattern)
    }

    /**
     * @param kmsKeyIdentifier The identifier of the AWS KMS customer managed key for EventBridge to
     * use, if you choose to use a customer managed key to encrypt this archive.
     * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
     *
     * If you do not specify a customer managed key identifier, EventBridge uses an AWS owned key to
     * encrypt the archive.
     *
     * For more information, see [Identify and view
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     *
     * If you have specified that EventBridge use a customer managed key for encrypting the source
     * event bus, we strongly recommend you also specify a customer managed key for any archives for
     * the event bus as well.
     *
     * For more information, see [Encrypting
     * archives](https://docs.aws.amazon.com/eventbridge/latest/userguide/encryption-archives.html) in
     * the *Amazon EventBridge User Guide* .
     */
    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * @param retentionDays The number of days to retain events for.
     * Default value is 0. If set to 0, events are retained indefinitely
     */
    override fun retentionDays(retentionDays: Number) {
      cdkBuilder.retentionDays(retentionDays)
    }

    /**
     * @param sourceArn The ARN of the event bus that sends events to the archive. 
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnArchiveProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.CfnArchiveProps,
  ) : CdkObject(cdkObject),
      CfnArchiveProps {
    /**
     * The name for the archive to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-archivename)
     */
    override fun archiveName(): String? = unwrap(this).getArchiveName()

    /**
     * A description for the archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * An event pattern to use to filter events sent to the archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-eventpattern)
     */
    override fun eventPattern(): Any? = unwrap(this).getEventPattern()

    /**
     * The identifier of the AWS KMS customer managed key for EventBridge to use, if you choose to
     * use a customer managed key to encrypt this archive.
     *
     * The identifier can be the key Amazon Resource Name (ARN), KeyId, key alias, or key alias ARN.
     *
     * If you do not specify a customer managed key identifier, EventBridge uses an AWS owned key to
     * encrypt the archive.
     *
     * For more information, see [Identify and view
     * keys](https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html) in the *AWS Key
     * Management Service Developer Guide* .
     *
     *
     * If you have specified that EventBridge use a customer managed key for encrypting the source
     * event bus, we strongly recommend you also specify a customer managed key for any archives for
     * the event bus as well.
     *
     * For more information, see [Encrypting
     * archives](https://docs.aws.amazon.com/eventbridge/latest/userguide/encryption-archives.html) in
     * the *Amazon EventBridge User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-kmskeyidentifier)
     */
    override fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

    /**
     * The number of days to retain events for.
     *
     * Default value is 0. If set to 0, events are retained indefinitely
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-retentiondays)
     */
    override fun retentionDays(): Number? = unwrap(this).getRetentionDays()

    /**
     * The ARN of the event bus that sends events to the archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-sourcearn)
     */
    override fun sourceArn(): String = unwrap(this).getSourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnArchiveProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnArchiveProps):
        CfnArchiveProps = CdkObjectWrappers.wrap(cdkObject) as? CfnArchiveProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnArchiveProps):
        software.amazon.awscdk.services.events.CfnArchiveProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.CfnArchiveProps
  }
}
