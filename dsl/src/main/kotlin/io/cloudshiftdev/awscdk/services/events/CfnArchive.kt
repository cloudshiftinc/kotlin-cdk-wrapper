package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnArchive internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.CfnArchive,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The name for the archive to create.
   */
  public open fun archiveName(): String? = unwrap(this).getArchiveName()

  /**
   * The name for the archive to create.
   */
  public open fun archiveName(`value`: String) {
    unwrap(this).setArchiveName(`value`)
  }

  /**
   * The ARN of the archive created.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A description for the archive.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the archive.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * An event pattern to use to filter events sent to the archive.
   */
  public open fun eventPattern(): Any? = unwrap(this).getEventPattern()

  /**
   * An event pattern to use to filter events sent to the archive.
   */
  public open fun eventPattern(`value`: Any) {
    unwrap(this).setEventPattern(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The number of days to retain events for.
   */
  public open fun retentionDays(): Number? = unwrap(this).getRetentionDays()

  /**
   * The number of days to retain events for.
   */
  public open fun retentionDays(`value`: Number) {
    unwrap(this).setRetentionDays(`value`)
  }

  /**
   * The ARN of the event bus that sends events to the archive.
   */
  public open fun sourceArn(): String = unwrap(this).getSourceArn()

  /**
   * The ARN of the event bus that sends events to the archive.
   */
  public open fun sourceArn(`value`: String) {
    unwrap(this).setSourceArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.CfnArchive].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name for the archive to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-archivename)
     * @param archiveName The name for the archive to create. 
     */
    public fun archiveName(archiveName: String)

    /**
     * A description for the archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-description)
     * @param description A description for the archive. 
     */
    public fun description(description: String)

    /**
     * An event pattern to use to filter events sent to the archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-eventpattern)
     * @param eventPattern An event pattern to use to filter events sent to the archive. 
     */
    public fun eventPattern(eventPattern: Any)

    /**
     * The number of days to retain events for.
     *
     * Default value is 0. If set to 0, events are retained indefinitely
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-retentiondays)
     * @param retentionDays The number of days to retain events for. 
     */
    public fun retentionDays(retentionDays: Number)

    /**
     * The ARN of the event bus that sends events to the archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-sourcearn)
     * @param sourceArn The ARN of the event bus that sends events to the archive. 
     */
    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnArchive.Builder =
        software.amazon.awscdk.services.events.CfnArchive.Builder.create(scope, id)

    /**
     * The name for the archive to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-archivename)
     * @param archiveName The name for the archive to create. 
     */
    override fun archiveName(archiveName: String) {
      cdkBuilder.archiveName(archiveName)
    }

    /**
     * A description for the archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-description)
     * @param description A description for the archive. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * An event pattern to use to filter events sent to the archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-eventpattern)
     * @param eventPattern An event pattern to use to filter events sent to the archive. 
     */
    override fun eventPattern(eventPattern: Any) {
      cdkBuilder.eventPattern(eventPattern)
    }

    /**
     * The number of days to retain events for.
     *
     * Default value is 0. If set to 0, events are retained indefinitely
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-retentiondays)
     * @param retentionDays The number of days to retain events for. 
     */
    override fun retentionDays(retentionDays: Number) {
      cdkBuilder.retentionDays(retentionDays)
    }

    /**
     * The ARN of the event bus that sends events to the archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-sourcearn)
     * @param sourceArn The ARN of the event bus that sends events to the archive. 
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnArchive = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.events.CfnArchive.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnArchive {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnArchive(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnArchive): CfnArchive =
        CfnArchive(cdkObject)

    internal fun unwrap(wrapped: CfnArchive): software.amazon.awscdk.services.events.CfnArchive =
        wrapped.cdkObject
  }
}
