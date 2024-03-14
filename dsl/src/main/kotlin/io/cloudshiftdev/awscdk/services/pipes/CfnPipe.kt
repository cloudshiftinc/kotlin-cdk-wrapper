package io.cloudshiftdev.awscdk.services.pipes

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPipe internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.pipes.CfnPipe,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the pipe.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time the pipe was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The state the pipe is in.
   */
  public open fun attrCurrentState(): String = unwrap(this).getAttrCurrentState()

  /**
   * When the pipe was last updated, in [ISO-8601
   * format](https://docs.aws.amazon.com/https://www.w3.org/TR/NOTE-datetime)
   * (YYYY-MM-DDThh:mm:ss.sTZD).
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * The reason the pipe is in its current state.
   */
  public open fun attrStateReason(): String = unwrap(this).getAttrStateReason()

  /**
   * A description of the pipe.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the pipe.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The state the pipe should be in.
   */
  public open fun desiredState(): String? = unwrap(this).getDesiredState()

  /**
   * The state the pipe should be in.
   */
  public open fun desiredState(`value`: String) {
    unwrap(this).setDesiredState(`value`)
  }

  /**
   * The ARN of the enrichment resource.
   */
  public open fun enrichment(): String? = unwrap(this).getEnrichment()

  /**
   * The ARN of the enrichment resource.
   */
  public open fun enrichment(`value`: String) {
    unwrap(this).setEnrichment(`value`)
  }

  /**
   * The parameters required to set up enrichment on your pipe.
   */
  public open fun enrichmentParameters(): Any? = unwrap(this).getEnrichmentParameters()

  /**
   * The parameters required to set up enrichment on your pipe.
   */
  public open fun enrichmentParameters(`value`: IResolvable) {
    unwrap(this).setEnrichmentParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The parameters required to set up enrichment on your pipe.
   */
  public open fun enrichmentParameters(`value`: PipeEnrichmentParametersProperty) {
    unwrap(this).setEnrichmentParameters(`value`.let(PipeEnrichmentParametersProperty::unwrap))
  }

  /**
   * The parameters required to set up enrichment on your pipe.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("734f2d779d00918203f2c55a79edee77318ed044d7396502fe53959af0029d5a")
  public open
      fun enrichmentParameters(`value`: PipeEnrichmentParametersProperty.Builder.() -> Unit): Unit =
      enrichmentParameters(PipeEnrichmentParametersProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The logging configuration settings for the pipe.
   */
  public open fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  /**
   * The logging configuration settings for the pipe.
   */
  public open fun logConfiguration(`value`: IResolvable) {
    unwrap(this).setLogConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The logging configuration settings for the pipe.
   */
  public open fun logConfiguration(`value`: PipeLogConfigurationProperty) {
    unwrap(this).setLogConfiguration(`value`.let(PipeLogConfigurationProperty::unwrap))
  }

  /**
   * The logging configuration settings for the pipe.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1917a1cb44ecb163b5d615a1a88558970ecee80240cfde3ef73fe7582bf07b5f")
  public open fun logConfiguration(`value`: PipeLogConfigurationProperty.Builder.() -> Unit): Unit =
      logConfiguration(PipeLogConfigurationProperty(`value`))

  /**
   * The name of the pipe.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the pipe.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARN of the role that allows the pipe to send data to the target.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The ARN of the role that allows the pipe to send data to the target.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The ARN of the source resource.
   */
  public open fun source(): String = unwrap(this).getSource()

  /**
   * The ARN of the source resource.
   */
  public open fun source(`value`: String) {
    unwrap(this).setSource(`value`)
  }

  /**
   * The parameters required to set up a source for your pipe.
   */
  public open fun sourceParameters(): Any? = unwrap(this).getSourceParameters()

  /**
   * The parameters required to set up a source for your pipe.
   */
  public open fun sourceParameters(`value`: IResolvable) {
    unwrap(this).setSourceParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The parameters required to set up a source for your pipe.
   */
  public open fun sourceParameters(`value`: PipeSourceParametersProperty) {
    unwrap(this).setSourceParameters(`value`.let(PipeSourceParametersProperty::unwrap))
  }

  /**
   * The parameters required to set up a source for your pipe.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4c64beee58f4a4b4598a6e838d69e46a3b019cf579766f5736c8a98ad4a88007")
  public open fun sourceParameters(`value`: PipeSourceParametersProperty.Builder.() -> Unit): Unit =
      sourceParameters(PipeSourceParametersProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of key-value pairs to associate with the pipe.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The list of key-value pairs to associate with the pipe.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The ARN of the target resource.
   */
  public open fun target(): String = unwrap(this).getTarget()

  /**
   * The ARN of the target resource.
   */
  public open fun target(`value`: String) {
    unwrap(this).setTarget(`value`)
  }

  /**
   * The parameters required to set up a target for your pipe.
   */
  public open fun targetParameters(): Any? = unwrap(this).getTargetParameters()

  /**
   * The parameters required to set up a target for your pipe.
   */
  public open fun targetParameters(`value`: IResolvable) {
    unwrap(this).setTargetParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The parameters required to set up a target for your pipe.
   */
  public open fun targetParameters(`value`: PipeTargetParametersProperty) {
    unwrap(this).setTargetParameters(`value`.let(PipeTargetParametersProperty::unwrap))
  }

  /**
   * The parameters required to set up a target for your pipe.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd31aaec916ec2a451df6cf82781920abdbca84fbce71ac90881d8e4f203a070")
  public open fun targetParameters(`value`: PipeTargetParametersProperty.Builder.() -> Unit): Unit =
      targetParameters(PipeTargetParametersProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pipes.CfnPipe].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-description)
     * @param description A description of the pipe. 
     */
    public fun description(description: String)

    /**
     * The state the pipe should be in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-desiredstate)
     * @param desiredState The state the pipe should be in. 
     */
    public fun desiredState(desiredState: String)

    /**
     * The ARN of the enrichment resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichment)
     * @param enrichment The ARN of the enrichment resource. 
     */
    public fun enrichment(enrichment: String)

    /**
     * The parameters required to set up enrichment on your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe. 
     */
    public fun enrichmentParameters(enrichmentParameters: IResolvable)

    /**
     * The parameters required to set up enrichment on your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe. 
     */
    public fun enrichmentParameters(enrichmentParameters: PipeEnrichmentParametersProperty)

    /**
     * The parameters required to set up enrichment on your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("546dbe1fb8a400361d0f6133bfb986f88c805c8430e31adaea92a36edaf521b5")
    public
        fun enrichmentParameters(enrichmentParameters: PipeEnrichmentParametersProperty.Builder.() -> Unit)

    /**
     * The logging configuration settings for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-logconfiguration)
     * @param logConfiguration The logging configuration settings for the pipe. 
     */
    public fun logConfiguration(logConfiguration: IResolvable)

    /**
     * The logging configuration settings for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-logconfiguration)
     * @param logConfiguration The logging configuration settings for the pipe. 
     */
    public fun logConfiguration(logConfiguration: PipeLogConfigurationProperty)

    /**
     * The logging configuration settings for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-logconfiguration)
     * @param logConfiguration The logging configuration settings for the pipe. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("590ad1af47372201c74eb48366b821269e5557cfc4568fc97080194ec64a18b1")
    public fun logConfiguration(logConfiguration: PipeLogConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-name)
     * @param name The name of the pipe. 
     */
    public fun name(name: String)

    /**
     * The ARN of the role that allows the pipe to send data to the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-rolearn)
     * @param roleArn The ARN of the role that allows the pipe to send data to the target. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The ARN of the source resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-source)
     * @param source The ARN of the source resource. 
     */
    public fun source(source: String)

    /**
     * The parameters required to set up a source for your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
     * @param sourceParameters The parameters required to set up a source for your pipe. 
     */
    public fun sourceParameters(sourceParameters: IResolvable)

    /**
     * The parameters required to set up a source for your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
     * @param sourceParameters The parameters required to set up a source for your pipe. 
     */
    public fun sourceParameters(sourceParameters: PipeSourceParametersProperty)

    /**
     * The parameters required to set up a source for your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
     * @param sourceParameters The parameters required to set up a source for your pipe. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a633e6cccf93692744ba1c51540c9986d1b346863598da59ac6c6466aab48e67")
    public fun sourceParameters(sourceParameters: PipeSourceParametersProperty.Builder.() -> Unit)

    /**
     * The list of key-value pairs to associate with the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-tags)
     * @param tags The list of key-value pairs to associate with the pipe. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The ARN of the target resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-target)
     * @param target The ARN of the target resource. 
     */
    public fun target(target: String)

    /**
     * The parameters required to set up a target for your pipe.
     *
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
     * @param targetParameters The parameters required to set up a target for your pipe. 
     */
    public fun targetParameters(targetParameters: IResolvable)

    /**
     * The parameters required to set up a target for your pipe.
     *
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
     * @param targetParameters The parameters required to set up a target for your pipe. 
     */
    public fun targetParameters(targetParameters: PipeTargetParametersProperty)

    /**
     * The parameters required to set up a target for your pipe.
     *
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
     * @param targetParameters The parameters required to set up a target for your pipe. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("253a95462466d0fa986923ebda44eb7148c210e5f2c08fa64fb41c53501e0f5b")
    public fun targetParameters(targetParameters: PipeTargetParametersProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pipes.CfnPipe.Builder =
        software.amazon.awscdk.services.pipes.CfnPipe.Builder.create(scope, id)

    /**
     * A description of the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-description)
     * @param description A description of the pipe. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The state the pipe should be in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-desiredstate)
     * @param desiredState The state the pipe should be in. 
     */
    override fun desiredState(desiredState: String) {
      cdkBuilder.desiredState(desiredState)
    }

    /**
     * The ARN of the enrichment resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichment)
     * @param enrichment The ARN of the enrichment resource. 
     */
    override fun enrichment(enrichment: String) {
      cdkBuilder.enrichment(enrichment)
    }

    /**
     * The parameters required to set up enrichment on your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe. 
     */
    override fun enrichmentParameters(enrichmentParameters: IResolvable) {
      cdkBuilder.enrichmentParameters(enrichmentParameters.let(IResolvable::unwrap))
    }

    /**
     * The parameters required to set up enrichment on your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe. 
     */
    override fun enrichmentParameters(enrichmentParameters: PipeEnrichmentParametersProperty) {
      cdkBuilder.enrichmentParameters(enrichmentParameters.let(PipeEnrichmentParametersProperty::unwrap))
    }

    /**
     * The parameters required to set up enrichment on your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("546dbe1fb8a400361d0f6133bfb986f88c805c8430e31adaea92a36edaf521b5")
    override
        fun enrichmentParameters(enrichmentParameters: PipeEnrichmentParametersProperty.Builder.() -> Unit):
        Unit = enrichmentParameters(PipeEnrichmentParametersProperty(enrichmentParameters))

    /**
     * The logging configuration settings for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-logconfiguration)
     * @param logConfiguration The logging configuration settings for the pipe. 
     */
    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The logging configuration settings for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-logconfiguration)
     * @param logConfiguration The logging configuration settings for the pipe. 
     */
    override fun logConfiguration(logConfiguration: PipeLogConfigurationProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(PipeLogConfigurationProperty::unwrap))
    }

    /**
     * The logging configuration settings for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-logconfiguration)
     * @param logConfiguration The logging configuration settings for the pipe. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("590ad1af47372201c74eb48366b821269e5557cfc4568fc97080194ec64a18b1")
    override
        fun logConfiguration(logConfiguration: PipeLogConfigurationProperty.Builder.() -> Unit):
        Unit = logConfiguration(PipeLogConfigurationProperty(logConfiguration))

    /**
     * The name of the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-name)
     * @param name The name of the pipe. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARN of the role that allows the pipe to send data to the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-rolearn)
     * @param roleArn The ARN of the role that allows the pipe to send data to the target. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The ARN of the source resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-source)
     * @param source The ARN of the source resource. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * The parameters required to set up a source for your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
     * @param sourceParameters The parameters required to set up a source for your pipe. 
     */
    override fun sourceParameters(sourceParameters: IResolvable) {
      cdkBuilder.sourceParameters(sourceParameters.let(IResolvable::unwrap))
    }

    /**
     * The parameters required to set up a source for your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
     * @param sourceParameters The parameters required to set up a source for your pipe. 
     */
    override fun sourceParameters(sourceParameters: PipeSourceParametersProperty) {
      cdkBuilder.sourceParameters(sourceParameters.let(PipeSourceParametersProperty::unwrap))
    }

    /**
     * The parameters required to set up a source for your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
     * @param sourceParameters The parameters required to set up a source for your pipe. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a633e6cccf93692744ba1c51540c9986d1b346863598da59ac6c6466aab48e67")
    override
        fun sourceParameters(sourceParameters: PipeSourceParametersProperty.Builder.() -> Unit):
        Unit = sourceParameters(PipeSourceParametersProperty(sourceParameters))

    /**
     * The list of key-value pairs to associate with the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-tags)
     * @param tags The list of key-value pairs to associate with the pipe. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The ARN of the target resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-target)
     * @param target The ARN of the target resource. 
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    /**
     * The parameters required to set up a target for your pipe.
     *
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
     * @param targetParameters The parameters required to set up a target for your pipe. 
     */
    override fun targetParameters(targetParameters: IResolvable) {
      cdkBuilder.targetParameters(targetParameters.let(IResolvable::unwrap))
    }

    /**
     * The parameters required to set up a target for your pipe.
     *
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
     * @param targetParameters The parameters required to set up a target for your pipe. 
     */
    override fun targetParameters(targetParameters: PipeTargetParametersProperty) {
      cdkBuilder.targetParameters(targetParameters.let(PipeTargetParametersProperty::unwrap))
    }

    /**
     * The parameters required to set up a target for your pipe.
     *
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
     * @param targetParameters The parameters required to set up a target for your pipe. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("253a95462466d0fa986923ebda44eb7148c210e5f2c08fa64fb41c53501e0f5b")
    override
        fun targetParameters(targetParameters: PipeTargetParametersProperty.Builder.() -> Unit):
        Unit = targetParameters(PipeTargetParametersProperty(targetParameters))

    public fun build(): software.amazon.awscdk.services.pipes.CfnPipe = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipe {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipe(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe): CfnPipe =
        CfnPipe(cdkObject)

    internal fun unwrap(wrapped: CfnPipe): software.amazon.awscdk.services.pipes.CfnPipe =
        wrapped.cdkObject
  }

  public interface PipeSourceRabbitMQBrokerParametersProperty {
    /**
     * The maximum number of records to include in each batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcerabbitmqbrokerparameters.html#cfn-pipes-pipe-pipesourcerabbitmqbrokerparameters-batchsize)
     */
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * The credentials needed to access the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcerabbitmqbrokerparameters.html#cfn-pipes-pipe-pipesourcerabbitmqbrokerparameters-credentials)
     */
    public fun credentials(): Any

    /**
     * The maximum length of a time to wait for events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcerabbitmqbrokerparameters.html#cfn-pipes-pipe-pipesourcerabbitmqbrokerparameters-maximumbatchingwindowinseconds)
     */
    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    /**
     * The name of the destination queue to consume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcerabbitmqbrokerparameters.html#cfn-pipes-pipe-pipesourcerabbitmqbrokerparameters-queuename)
     */
    public fun queueName(): String

    /**
     * The name of the virtual host associated with the source broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcerabbitmqbrokerparameters.html#cfn-pipes-pipe-pipesourcerabbitmqbrokerparameters-virtualhost)
     */
    public fun virtualHost(): String? = unwrap(this).getVirtualHost()

    /**
     * A builder for [PipeSourceRabbitMQBrokerParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      public fun batchSize(batchSize: Number)

      /**
       * @param credentials The credentials needed to access the resource. 
       */
      public fun credentials(credentials: IResolvable)

      /**
       * @param credentials The credentials needed to access the resource. 
       */
      public fun credentials(credentials: MQBrokerAccessCredentialsProperty)

      /**
       * @param credentials The credentials needed to access the resource. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5e829a47a553ec3c8f5dd7a09804d3df855ba545cf7cf8720327f22314cea4")
      public fun credentials(credentials: MQBrokerAccessCredentialsProperty.Builder.() -> Unit)

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      /**
       * @param queueName The name of the destination queue to consume. 
       */
      public fun queueName(queueName: String)

      /**
       * @param virtualHost The name of the virtual host associated with the source broker.
       */
      public fun virtualHost(virtualHost: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty.builder()

      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      /**
       * @param credentials The credentials needed to access the resource. 
       */
      override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
      }

      /**
       * @param credentials The credentials needed to access the resource. 
       */
      override fun credentials(credentials: MQBrokerAccessCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(MQBrokerAccessCredentialsProperty::unwrap))
      }

      /**
       * @param credentials The credentials needed to access the resource. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5e829a47a553ec3c8f5dd7a09804d3df855ba545cf7cf8720327f22314cea4")
      override fun credentials(credentials: MQBrokerAccessCredentialsProperty.Builder.() -> Unit):
          Unit = credentials(MQBrokerAccessCredentialsProperty(credentials))

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      /**
       * @param queueName The name of the destination queue to consume. 
       */
      override fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
      }

      /**
       * @param virtualHost The name of the virtual host associated with the source broker.
       */
      override fun virtualHost(virtualHost: String) {
        cdkBuilder.virtualHost(virtualHost)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceRabbitMQBrokerParametersProperty {
      /**
       * The maximum number of records to include in each batch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcerabbitmqbrokerparameters.html#cfn-pipes-pipe-pipesourcerabbitmqbrokerparameters-batchsize)
       */
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      /**
       * The credentials needed to access the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcerabbitmqbrokerparameters.html#cfn-pipes-pipe-pipesourcerabbitmqbrokerparameters-credentials)
       */
      override fun credentials(): Any = unwrap(this).getCredentials()

      /**
       * The maximum length of a time to wait for events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcerabbitmqbrokerparameters.html#cfn-pipes-pipe-pipesourcerabbitmqbrokerparameters-maximumbatchingwindowinseconds)
       */
      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      /**
       * The name of the destination queue to consume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcerabbitmqbrokerparameters.html#cfn-pipes-pipe-pipesourcerabbitmqbrokerparameters-queuename)
       */
      override fun queueName(): String = unwrap(this).getQueueName()

      /**
       * The name of the virtual host associated with the source broker.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcerabbitmqbrokerparameters.html#cfn-pipes-pipe-pipesourcerabbitmqbrokerparameters-virtualhost)
       */
      override fun virtualHost(): String? = unwrap(this).getVirtualHost()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceRabbitMQBrokerParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty):
          PipeSourceRabbitMQBrokerParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceRabbitMQBrokerParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty
    }
  }

  public interface PipeTargetSageMakerPipelineParametersProperty {
    /**
     * List of Parameter names and values for SageMaker Model Building Pipeline execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetsagemakerpipelineparameters.html#cfn-pipes-pipe-pipetargetsagemakerpipelineparameters-pipelineparameterlist)
     */
    public fun pipelineParameterList(): Any? = unwrap(this).getPipelineParameterList()

    /**
     * A builder for [PipeTargetSageMakerPipelineParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pipelineParameterList List of Parameter names and values for SageMaker Model
       * Building Pipeline execution.
       */
      public fun pipelineParameterList(pipelineParameterList: IResolvable)

      /**
       * @param pipelineParameterList List of Parameter names and values for SageMaker Model
       * Building Pipeline execution.
       */
      public fun pipelineParameterList(pipelineParameterList: List<Any>)

      /**
       * @param pipelineParameterList List of Parameter names and values for SageMaker Model
       * Building Pipeline execution.
       */
      public fun pipelineParameterList(vararg pipelineParameterList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty.builder()

      /**
       * @param pipelineParameterList List of Parameter names and values for SageMaker Model
       * Building Pipeline execution.
       */
      override fun pipelineParameterList(pipelineParameterList: IResolvable) {
        cdkBuilder.pipelineParameterList(pipelineParameterList.let(IResolvable::unwrap))
      }

      /**
       * @param pipelineParameterList List of Parameter names and values for SageMaker Model
       * Building Pipeline execution.
       */
      override fun pipelineParameterList(pipelineParameterList: List<Any>) {
        cdkBuilder.pipelineParameterList(pipelineParameterList)
      }

      /**
       * @param pipelineParameterList List of Parameter names and values for SageMaker Model
       * Building Pipeline execution.
       */
      override fun pipelineParameterList(vararg pipelineParameterList: Any): Unit =
          pipelineParameterList(pipelineParameterList.toList())

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetSageMakerPipelineParametersProperty {
      /**
       * List of Parameter names and values for SageMaker Model Building Pipeline execution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetsagemakerpipelineparameters.html#cfn-pipes-pipe-pipetargetsagemakerpipelineparameters-pipelineparameterlist)
       */
      override fun pipelineParameterList(): Any? = unwrap(this).getPipelineParameterList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetSageMakerPipelineParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty):
          PipeTargetSageMakerPipelineParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetSageMakerPipelineParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty
    }
  }

  public interface AwsVpcConfigurationProperty {
    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-awsvpcconfiguration.html#cfn-pipes-pipe-awsvpcconfiguration-assignpublicip)
     */
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    /**
     * Specifies the security groups associated with the task.
     *
     * These security groups must all be in the same VPC. You can specify as many as five security
     * groups. If you do not specify a security group, the default security group for the VPC is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-awsvpcconfiguration.html#cfn-pipes-pipe-awsvpcconfiguration-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * Specifies the subnets associated with the task.
     *
     * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-awsvpcconfiguration.html#cfn-pipes-pipe-awsvpcconfiguration-subnets)
     */
    public fun subnets(): List<String>

    /**
     * A builder for [AwsVpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param assignPublicIp Specifies whether the task's elastic network interface receives a
       * public IP address.
       * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
       */
      public fun assignPublicIp(assignPublicIp: String)

      /**
       * @param securityGroups Specifies the security groups associated with the task.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups Specifies the security groups associated with the task.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param subnets Specifies the subnets associated with the task. 
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets Specifies the subnets associated with the task. 
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty.builder()

      /**
       * @param assignPublicIp Specifies whether the task's elastic network interface receives a
       * public IP address.
       * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
       */
      override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      /**
       * @param securityGroups Specifies the security groups associated with the task.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups Specifies the security groups associated with the task.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param subnets Specifies the subnets associated with the task. 
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets Specifies the subnets associated with the task. 
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty,
    ) : CdkObject(cdkObject), AwsVpcConfigurationProperty {
      /**
       * Specifies whether the task's elastic network interface receives a public IP address.
       *
       * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-awsvpcconfiguration.html#cfn-pipes-pipe-awsvpcconfiguration-assignpublicip)
       */
      override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

      /**
       * Specifies the security groups associated with the task.
       *
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-awsvpcconfiguration.html#cfn-pipes-pipe-awsvpcconfiguration-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      /**
       * Specifies the subnets associated with the task.
       *
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-awsvpcconfiguration.html#cfn-pipes-pipe-awsvpcconfiguration-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty):
          AwsVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty
    }
  }

  public interface PipeSourceSqsQueueParametersProperty {
    /**
     * The maximum number of records to include in each batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcesqsqueueparameters.html#cfn-pipes-pipe-pipesourcesqsqueueparameters-batchsize)
     */
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * The maximum length of a time to wait for events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcesqsqueueparameters.html#cfn-pipes-pipe-pipesourcesqsqueueparameters-maximumbatchingwindowinseconds)
     */
    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    /**
     * A builder for [PipeSourceSqsQueueParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      public fun batchSize(batchSize: Number)

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty.builder()

      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceSqsQueueParametersProperty {
      /**
       * The maximum number of records to include in each batch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcesqsqueueparameters.html#cfn-pipes-pipe-pipesourcesqsqueueparameters-batchsize)
       */
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      /**
       * The maximum length of a time to wait for events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcesqsqueueparameters.html#cfn-pipes-pipe-pipesourcesqsqueueparameters-maximumbatchingwindowinseconds)
       */
      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceSqsQueueParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty):
          PipeSourceSqsQueueParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceSqsQueueParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty
    }
  }

  public interface PipeTargetSqsQueueParametersProperty {
    /**
     * This parameter applies only to FIFO (first-in-first-out) queues.
     *
     * The token used for deduplication of sent messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetsqsqueueparameters.html#cfn-pipes-pipe-pipetargetsqsqueueparameters-messagededuplicationid)
     */
    public fun messageDeduplicationId(): String? = unwrap(this).getMessageDeduplicationId()

    /**
     * The FIFO message group ID to use as the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetsqsqueueparameters.html#cfn-pipes-pipe-pipetargetsqsqueueparameters-messagegroupid)
     */
    public fun messageGroupId(): String? = unwrap(this).getMessageGroupId()

    /**
     * A builder for [PipeTargetSqsQueueParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param messageDeduplicationId This parameter applies only to FIFO (first-in-first-out)
       * queues.
       * The token used for deduplication of sent messages.
       */
      public fun messageDeduplicationId(messageDeduplicationId: String)

      /**
       * @param messageGroupId The FIFO message group ID to use as the target.
       */
      public fun messageGroupId(messageGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty.builder()

      /**
       * @param messageDeduplicationId This parameter applies only to FIFO (first-in-first-out)
       * queues.
       * The token used for deduplication of sent messages.
       */
      override fun messageDeduplicationId(messageDeduplicationId: String) {
        cdkBuilder.messageDeduplicationId(messageDeduplicationId)
      }

      /**
       * @param messageGroupId The FIFO message group ID to use as the target.
       */
      override fun messageGroupId(messageGroupId: String) {
        cdkBuilder.messageGroupId(messageGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetSqsQueueParametersProperty {
      /**
       * This parameter applies only to FIFO (first-in-first-out) queues.
       *
       * The token used for deduplication of sent messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetsqsqueueparameters.html#cfn-pipes-pipe-pipetargetsqsqueueparameters-messagededuplicationid)
       */
      override fun messageDeduplicationId(): String? = unwrap(this).getMessageDeduplicationId()

      /**
       * The FIFO message group ID to use as the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetsqsqueueparameters.html#cfn-pipes-pipe-pipetargetsqsqueueparameters-messagegroupid)
       */
      override fun messageGroupId(): String? = unwrap(this).getMessageGroupId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetSqsQueueParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty):
          PipeTargetSqsQueueParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetSqsQueueParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty
    }
  }

  public interface EcsEnvironmentFileProperty {
    /**
     * The file type to use.
     *
     * The only supported value is `s3` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsenvironmentfile.html#cfn-pipes-pipe-ecsenvironmentfile-type)
     */
    public fun type(): String

    /**
     * The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable
     * file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsenvironmentfile.html#cfn-pipes-pipe-ecsenvironmentfile-value)
     */
    public fun `value`(): String

    /**
     * A builder for [EcsEnvironmentFileProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The file type to use. 
       * The only supported value is `s3` .
       */
      public fun type(type: String)

      /**
       * @param value The Amazon Resource Name (ARN) of the Amazon S3 object containing the
       * environment variable file. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty.builder()

      /**
       * @param type The file type to use. 
       * The only supported value is `s3` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The Amazon Resource Name (ARN) of the Amazon S3 object containing the
       * environment variable file. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty,
    ) : CdkObject(cdkObject), EcsEnvironmentFileProperty {
      /**
       * The file type to use.
       *
       * The only supported value is `s3` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsenvironmentfile.html#cfn-pipes-pipe-ecsenvironmentfile-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable
       * file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsenvironmentfile.html#cfn-pipes-pipe-ecsenvironmentfile-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsEnvironmentFileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty):
          EcsEnvironmentFileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsEnvironmentFileProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty
    }
  }

  public interface SelfManagedKafkaAccessConfigurationCredentialsProperty {
    /**
     * The ARN of the Secrets Manager secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials.html#cfn-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials-basicauth)
     */
    public fun basicAuth(): String? = unwrap(this).getBasicAuth()

    /**
     * The ARN of the Secrets Manager secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials.html#cfn-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials-clientcertificatetlsauth)
     */
    public fun clientCertificateTlsAuth(): String? = unwrap(this).getClientCertificateTlsAuth()

    /**
     * The ARN of the Secrets Manager secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials.html#cfn-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials-saslscram256auth)
     */
    public fun saslScram256Auth(): String? = unwrap(this).getSaslScram256Auth()

    /**
     * The ARN of the Secrets Manager secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials.html#cfn-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials-saslscram512auth)
     */
    public fun saslScram512Auth(): String? = unwrap(this).getSaslScram512Auth()

    /**
     * A builder for [SelfManagedKafkaAccessConfigurationCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param basicAuth The ARN of the Secrets Manager secret.
       */
      public fun basicAuth(basicAuth: String)

      /**
       * @param clientCertificateTlsAuth The ARN of the Secrets Manager secret.
       */
      public fun clientCertificateTlsAuth(clientCertificateTlsAuth: String)

      /**
       * @param saslScram256Auth The ARN of the Secrets Manager secret.
       */
      public fun saslScram256Auth(saslScram256Auth: String)

      /**
       * @param saslScram512Auth The ARN of the Secrets Manager secret.
       */
      public fun saslScram512Auth(saslScram512Auth: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()

      /**
       * @param basicAuth The ARN of the Secrets Manager secret.
       */
      override fun basicAuth(basicAuth: String) {
        cdkBuilder.basicAuth(basicAuth)
      }

      /**
       * @param clientCertificateTlsAuth The ARN of the Secrets Manager secret.
       */
      override fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
        cdkBuilder.clientCertificateTlsAuth(clientCertificateTlsAuth)
      }

      /**
       * @param saslScram256Auth The ARN of the Secrets Manager secret.
       */
      override fun saslScram256Auth(saslScram256Auth: String) {
        cdkBuilder.saslScram256Auth(saslScram256Auth)
      }

      /**
       * @param saslScram512Auth The ARN of the Secrets Manager secret.
       */
      override fun saslScram512Auth(saslScram512Auth: String) {
        cdkBuilder.saslScram512Auth(saslScram512Auth)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty,
    ) : CdkObject(cdkObject), SelfManagedKafkaAccessConfigurationCredentialsProperty {
      /**
       * The ARN of the Secrets Manager secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials.html#cfn-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials-basicauth)
       */
      override fun basicAuth(): String? = unwrap(this).getBasicAuth()

      /**
       * The ARN of the Secrets Manager secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials.html#cfn-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials-clientcertificatetlsauth)
       */
      override fun clientCertificateTlsAuth(): String? = unwrap(this).getClientCertificateTlsAuth()

      /**
       * The ARN of the Secrets Manager secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials.html#cfn-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials-saslscram256auth)
       */
      override fun saslScram256Auth(): String? = unwrap(this).getSaslScram256Auth()

      /**
       * The ARN of the Secrets Manager secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials.html#cfn-pipes-pipe-selfmanagedkafkaaccessconfigurationcredentials-saslscram512auth)
       */
      override fun saslScram512Auth(): String? = unwrap(this).getSaslScram512Auth()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SelfManagedKafkaAccessConfigurationCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty):
          SelfManagedKafkaAccessConfigurationCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedKafkaAccessConfigurationCredentialsProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty
    }
  }

  public interface S3LogDestinationProperty {
    /**
     * The name of the Amazon S3 bucket to which EventBridge delivers the log records for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-s3logdestination.html#cfn-pipes-pipe-s3logdestination-bucketname)
     */
    public fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * The AWS account that owns the Amazon S3 bucket to which EventBridge delivers the log records
     * for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-s3logdestination.html#cfn-pipes-pipe-s3logdestination-bucketowner)
     */
    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    /**
     * The format EventBridge uses for the log records.
     *
     * * `json` : JSON
     * * `plain` : Plain text
     * * `w3c` : [W3C extended logging file
     * format](https://docs.aws.amazon.com/https://www.w3.org/TR/WD-logfile)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-s3logdestination.html#cfn-pipes-pipe-s3logdestination-outputformat)
     */
    public fun outputFormat(): String? = unwrap(this).getOutputFormat()

    /**
     * The prefix text with which to begin Amazon S3 log object names.
     *
     * For more information, see [Organizing objects using
     * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) in the
     * *Amazon Simple Storage Service User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-s3logdestination.html#cfn-pipes-pipe-s3logdestination-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [S3LogDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The name of the Amazon S3 bucket to which EventBridge delivers the log
       * records for the pipe.
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketOwner The AWS account that owns the Amazon S3 bucket to which EventBridge
       * delivers the log records for the pipe.
       */
      public fun bucketOwner(bucketOwner: String)

      /**
       * @param outputFormat The format EventBridge uses for the log records.
       * * `json` : JSON
       * * `plain` : Plain text
       * * `w3c` : [W3C extended logging file
       * format](https://docs.aws.amazon.com/https://www.w3.org/TR/WD-logfile)
       */
      public fun outputFormat(outputFormat: String)

      /**
       * @param prefix The prefix text with which to begin Amazon S3 log object names.
       * For more information, see [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) in the
       * *Amazon Simple Storage Service User Guide* .
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty.builder()

      /**
       * @param bucketName The name of the Amazon S3 bucket to which EventBridge delivers the log
       * records for the pipe.
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketOwner The AWS account that owns the Amazon S3 bucket to which EventBridge
       * delivers the log records for the pipe.
       */
      override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      /**
       * @param outputFormat The format EventBridge uses for the log records.
       * * `json` : JSON
       * * `plain` : Plain text
       * * `w3c` : [W3C extended logging file
       * format](https://docs.aws.amazon.com/https://www.w3.org/TR/WD-logfile)
       */
      override fun outputFormat(outputFormat: String) {
        cdkBuilder.outputFormat(outputFormat)
      }

      /**
       * @param prefix The prefix text with which to begin Amazon S3 log object names.
       * For more information, see [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) in the
       * *Amazon Simple Storage Service User Guide* .
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty,
    ) : CdkObject(cdkObject), S3LogDestinationProperty {
      /**
       * The name of the Amazon S3 bucket to which EventBridge delivers the log records for the
       * pipe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-s3logdestination.html#cfn-pipes-pipe-s3logdestination-bucketname)
       */
      override fun bucketName(): String? = unwrap(this).getBucketName()

      /**
       * The AWS account that owns the Amazon S3 bucket to which EventBridge delivers the log
       * records for the pipe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-s3logdestination.html#cfn-pipes-pipe-s3logdestination-bucketowner)
       */
      override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

      /**
       * The format EventBridge uses for the log records.
       *
       * * `json` : JSON
       * * `plain` : Plain text
       * * `w3c` : [W3C extended logging file
       * format](https://docs.aws.amazon.com/https://www.w3.org/TR/WD-logfile)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-s3logdestination.html#cfn-pipes-pipe-s3logdestination-outputformat)
       */
      override fun outputFormat(): String? = unwrap(this).getOutputFormat()

      /**
       * The prefix text with which to begin Amazon S3 log object names.
       *
       * For more information, see [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) in the
       * *Amazon Simple Storage Service User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-s3logdestination.html#cfn-pipes-pipe-s3logdestination-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty):
          S3LogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LogDestinationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty
    }
  }

  public interface EcsInferenceAcceleratorOverrideProperty {
    /**
     * The Elastic Inference accelerator device name to override for the task.
     *
     * This parameter must match a `deviceName` specified in the task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsinferenceacceleratoroverride.html#cfn-pipes-pipe-ecsinferenceacceleratoroverride-devicename)
     */
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    /**
     * The Elastic Inference accelerator type to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsinferenceacceleratoroverride.html#cfn-pipes-pipe-ecsinferenceacceleratoroverride-devicetype)
     */
    public fun deviceType(): String? = unwrap(this).getDeviceType()

    /**
     * A builder for [EcsInferenceAcceleratorOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deviceName The Elastic Inference accelerator device name to override for the task.
       * This parameter must match a `deviceName` specified in the task definition.
       */
      public fun deviceName(deviceName: String)

      /**
       * @param deviceType The Elastic Inference accelerator type to use.
       */
      public fun deviceType(deviceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty.builder()

      /**
       * @param deviceName The Elastic Inference accelerator device name to override for the task.
       * This parameter must match a `deviceName` specified in the task definition.
       */
      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      /**
       * @param deviceType The Elastic Inference accelerator type to use.
       */
      override fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty,
    ) : CdkObject(cdkObject), EcsInferenceAcceleratorOverrideProperty {
      /**
       * The Elastic Inference accelerator device name to override for the task.
       *
       * This parameter must match a `deviceName` specified in the task definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsinferenceacceleratoroverride.html#cfn-pipes-pipe-ecsinferenceacceleratoroverride-devicename)
       */
      override fun deviceName(): String? = unwrap(this).getDeviceName()

      /**
       * The Elastic Inference accelerator type to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsinferenceacceleratoroverride.html#cfn-pipes-pipe-ecsinferenceacceleratoroverride-devicetype)
       */
      override fun deviceType(): String? = unwrap(this).getDeviceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EcsInferenceAcceleratorOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty):
          EcsInferenceAcceleratorOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsInferenceAcceleratorOverrideProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty
    }
  }

  public interface BatchEnvironmentVariableProperty {
    /**
     * The name of the key-value pair.
     *
     * For environment variables, this is the name of the environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchenvironmentvariable.html#cfn-pipes-pipe-batchenvironmentvariable-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value of the key-value pair.
     *
     * For environment variables, this is the value of the environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchenvironmentvariable.html#cfn-pipes-pipe-batchenvironmentvariable-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [BatchEnvironmentVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the key-value pair.
       * For environment variables, this is the name of the environment variable.
       */
      public fun name(name: String)

      /**
       * @param value The value of the key-value pair.
       * For environment variables, this is the value of the environment variable.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty.builder()

      /**
       * @param name The name of the key-value pair.
       * For environment variables, this is the name of the environment variable.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the key-value pair.
       * For environment variables, this is the value of the environment variable.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty,
    ) : CdkObject(cdkObject), BatchEnvironmentVariableProperty {
      /**
       * The name of the key-value pair.
       *
       * For environment variables, this is the name of the environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchenvironmentvariable.html#cfn-pipes-pipe-batchenvironmentvariable-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value of the key-value pair.
       *
       * For environment variables, this is the value of the environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchenvironmentvariable.html#cfn-pipes-pipe-batchenvironmentvariable-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchEnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty):
          BatchEnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchEnvironmentVariableProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty
    }
  }

  public interface FilterCriteriaProperty {
    /**
     * The event patterns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-filtercriteria.html#cfn-pipes-pipe-filtercriteria-filters)
     */
    public fun filters(): Any? = unwrap(this).getFilters()

    /**
     * A builder for [FilterCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filters The event patterns.
       */
      public fun filters(filters: IResolvable)

      /**
       * @param filters The event patterns.
       */
      public fun filters(filters: List<Any>)

      /**
       * @param filters The event patterns.
       */
      public fun filters(vararg filters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty.builder()

      /**
       * @param filters The event patterns.
       */
      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      /**
       * @param filters The event patterns.
       */
      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      /**
       * @param filters The event patterns.
       */
      override fun filters(vararg filters: Any): Unit = filters(filters.toList())

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty,
    ) : CdkObject(cdkObject), FilterCriteriaProperty {
      /**
       * The event patterns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-filtercriteria.html#cfn-pipes-pipe-filtercriteria-filters)
       */
      override fun filters(): Any? = unwrap(this).getFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty):
          FilterCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterCriteriaProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty
    }
  }

  public interface PlacementConstraintProperty {
    /**
     * A cluster query language expression to apply to the constraint.
     *
     * You cannot specify an expression if the constraint type is `distinctInstance` . To learn
     * more, see [Cluster Query
     * Language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
     * in the Amazon Elastic Container Service Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-placementconstraint.html#cfn-pipes-pipe-placementconstraint-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * The type of constraint.
     *
     * Use distinctInstance to ensure that each task in a particular group is running on a different
     * container instance. Use memberOf to restrict the selection to a group of valid candidates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-placementconstraint.html#cfn-pipes-pipe-placementconstraint-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [PlacementConstraintProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression A cluster query language expression to apply to the constraint.
       * You cannot specify an expression if the constraint type is `distinctInstance` . To learn
       * more, see [Cluster Query
       * Language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
       * in the Amazon Elastic Container Service Developer Guide.
       */
      public fun expression(expression: String)

      /**
       * @param type The type of constraint.
       * Use distinctInstance to ensure that each task in a particular group is running on a
       * different container instance. Use memberOf to restrict the selection to a group of valid
       * candidates.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty.builder()

      /**
       * @param expression A cluster query language expression to apply to the constraint.
       * You cannot specify an expression if the constraint type is `distinctInstance` . To learn
       * more, see [Cluster Query
       * Language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
       * in the Amazon Elastic Container Service Developer Guide.
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param type The type of constraint.
       * Use distinctInstance to ensure that each task in a particular group is running on a
       * different container instance. Use memberOf to restrict the selection to a group of valid
       * candidates.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty,
    ) : CdkObject(cdkObject), PlacementConstraintProperty {
      /**
       * A cluster query language expression to apply to the constraint.
       *
       * You cannot specify an expression if the constraint type is `distinctInstance` . To learn
       * more, see [Cluster Query
       * Language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
       * in the Amazon Elastic Container Service Developer Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-placementconstraint.html#cfn-pipes-pipe-placementconstraint-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * The type of constraint.
       *
       * Use distinctInstance to ensure that each task in a particular group is running on a
       * different container instance. Use memberOf to restrict the selection to a group of valid
       * candidates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-placementconstraint.html#cfn-pipes-pipe-placementconstraint-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty):
          PlacementConstraintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementConstraintProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty
    }
  }

  public interface CapacityProviderStrategyItemProperty {
    /**
     * The base value designates how many tasks, at a minimum, to run on the specified capacity
     * provider.
     *
     * Only one capacity provider in a capacity provider strategy can have a base defined. If no
     * value is specified, the default value of 0 is used.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-capacityproviderstrategyitem.html#cfn-pipes-pipe-capacityproviderstrategyitem-base)
     */
    public fun base(): Number? = unwrap(this).getBase()

    /**
     * The short name of the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-capacityproviderstrategyitem.html#cfn-pipes-pipe-capacityproviderstrategyitem-capacityprovider)
     */
    public fun capacityProvider(): String

    /**
     * The weight value designates the relative percentage of the total number of tasks launched
     * that should use the specified capacity provider.
     *
     * The weight value is taken into consideration after the base value, if defined, is satisfied.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-capacityproviderstrategyitem.html#cfn-pipes-pipe-capacityproviderstrategyitem-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [CapacityProviderStrategyItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param base The base value designates how many tasks, at a minimum, to run on the specified
       * capacity provider.
       * Only one capacity provider in a capacity provider strategy can have a base defined. If no
       * value is specified, the default value of 0 is used.
       */
      public fun base(base: Number)

      /**
       * @param capacityProvider The short name of the capacity provider. 
       */
      public fun capacityProvider(capacityProvider: String)

      /**
       * @param weight The weight value designates the relative percentage of the total number of
       * tasks launched that should use the specified capacity provider.
       * The weight value is taken into consideration after the base value, if defined, is
       * satisfied.
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty.builder()

      /**
       * @param base The base value designates how many tasks, at a minimum, to run on the specified
       * capacity provider.
       * Only one capacity provider in a capacity provider strategy can have a base defined. If no
       * value is specified, the default value of 0 is used.
       */
      override fun base(base: Number) {
        cdkBuilder.base(base)
      }

      /**
       * @param capacityProvider The short name of the capacity provider. 
       */
      override fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
      }

      /**
       * @param weight The weight value designates the relative percentage of the total number of
       * tasks launched that should use the specified capacity provider.
       * The weight value is taken into consideration after the base value, if defined, is
       * satisfied.
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty,
    ) : CdkObject(cdkObject), CapacityProviderStrategyItemProperty {
      /**
       * The base value designates how many tasks, at a minimum, to run on the specified capacity
       * provider.
       *
       * Only one capacity provider in a capacity provider strategy can have a base defined. If no
       * value is specified, the default value of 0 is used.
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-capacityproviderstrategyitem.html#cfn-pipes-pipe-capacityproviderstrategyitem-base)
       */
      override fun base(): Number? = unwrap(this).getBase()

      /**
       * The short name of the capacity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-capacityproviderstrategyitem.html#cfn-pipes-pipe-capacityproviderstrategyitem-capacityprovider)
       */
      override fun capacityProvider(): String = unwrap(this).getCapacityProvider()

      /**
       * The weight value designates the relative percentage of the total number of tasks launched
       * that should use the specified capacity provider.
       *
       * The weight value is taken into consideration after the base value, if defined, is
       * satisfied.
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-capacityproviderstrategyitem.html#cfn-pipes-pipe-capacityproviderstrategyitem-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityProviderStrategyItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty):
          CapacityProviderStrategyItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyItemProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty
    }
  }

  public interface PipeSourceManagedStreamingKafkaParametersProperty {
    /**
     * The maximum number of records to include in each batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html#cfn-pipes-pipe-pipesourcemanagedstreamingkafkaparameters-batchsize)
     */
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * The name of the destination queue to consume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html#cfn-pipes-pipe-pipesourcemanagedstreamingkafkaparameters-consumergroupid)
     */
    public fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    /**
     * The credentials needed to access the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html#cfn-pipes-pipe-pipesourcemanagedstreamingkafkaparameters-credentials)
     */
    public fun credentials(): Any? = unwrap(this).getCredentials()

    /**
     * The maximum length of a time to wait for events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html#cfn-pipes-pipe-pipesourcemanagedstreamingkafkaparameters-maximumbatchingwindowinseconds)
     */
    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    /**
     * (Streams only) The position in a stream from which to start reading.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html#cfn-pipes-pipe-pipesourcemanagedstreamingkafkaparameters-startingposition)
     */
    public fun startingPosition(): String? = unwrap(this).getStartingPosition()

    /**
     * The name of the topic that the pipe will read from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html#cfn-pipes-pipe-pipesourcemanagedstreamingkafkaparameters-topicname)
     */
    public fun topicName(): String

    /**
     * A builder for [PipeSourceManagedStreamingKafkaParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      public fun batchSize(batchSize: Number)

      /**
       * @param consumerGroupId The name of the destination queue to consume.
       */
      public fun consumerGroupId(consumerGroupId: String)

      /**
       * @param credentials The credentials needed to access the resource.
       */
      public fun credentials(credentials: IResolvable)

      /**
       * @param credentials The credentials needed to access the resource.
       */
      public fun credentials(credentials: MSKAccessCredentialsProperty)

      /**
       * @param credentials The credentials needed to access the resource.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9869d90c906b4a00a9be57c1d1dba3bdfa996a43c7c7bfcae332cf976b6543ce")
      public fun credentials(credentials: MSKAccessCredentialsProperty.Builder.() -> Unit)

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      /**
       * @param startingPosition (Streams only) The position in a stream from which to start
       * reading.
       */
      public fun startingPosition(startingPosition: String)

      /**
       * @param topicName The name of the topic that the pipe will read from. 
       */
      public fun topicName(topicName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty.builder()

      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      /**
       * @param consumerGroupId The name of the destination queue to consume.
       */
      override fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
      }

      /**
       * @param credentials The credentials needed to access the resource.
       */
      override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
      }

      /**
       * @param credentials The credentials needed to access the resource.
       */
      override fun credentials(credentials: MSKAccessCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(MSKAccessCredentialsProperty::unwrap))
      }

      /**
       * @param credentials The credentials needed to access the resource.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9869d90c906b4a00a9be57c1d1dba3bdfa996a43c7c7bfcae332cf976b6543ce")
      override fun credentials(credentials: MSKAccessCredentialsProperty.Builder.() -> Unit): Unit =
          credentials(MSKAccessCredentialsProperty(credentials))

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      /**
       * @param startingPosition (Streams only) The position in a stream from which to start
       * reading.
       */
      override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      /**
       * @param topicName The name of the topic that the pipe will read from. 
       */
      override fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceManagedStreamingKafkaParametersProperty {
      /**
       * The maximum number of records to include in each batch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html#cfn-pipes-pipe-pipesourcemanagedstreamingkafkaparameters-batchsize)
       */
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      /**
       * The name of the destination queue to consume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html#cfn-pipes-pipe-pipesourcemanagedstreamingkafkaparameters-consumergroupid)
       */
      override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

      /**
       * The credentials needed to access the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html#cfn-pipes-pipe-pipesourcemanagedstreamingkafkaparameters-credentials)
       */
      override fun credentials(): Any? = unwrap(this).getCredentials()

      /**
       * The maximum length of a time to wait for events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html#cfn-pipes-pipe-pipesourcemanagedstreamingkafkaparameters-maximumbatchingwindowinseconds)
       */
      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      /**
       * (Streams only) The position in a stream from which to start reading.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html#cfn-pipes-pipe-pipesourcemanagedstreamingkafkaparameters-startingposition)
       */
      override fun startingPosition(): String? = unwrap(this).getStartingPosition()

      /**
       * The name of the topic that the pipe will read from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcemanagedstreamingkafkaparameters.html#cfn-pipes-pipe-pipesourcemanagedstreamingkafkaparameters-topicname)
       */
      override fun topicName(): String = unwrap(this).getTopicName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceManagedStreamingKafkaParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty):
          PipeSourceManagedStreamingKafkaParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceManagedStreamingKafkaParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty
    }
  }

  public interface PipeSourceActiveMQBrokerParametersProperty {
    /**
     * The maximum number of records to include in each batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceactivemqbrokerparameters.html#cfn-pipes-pipe-pipesourceactivemqbrokerparameters-batchsize)
     */
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * The credentials needed to access the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceactivemqbrokerparameters.html#cfn-pipes-pipe-pipesourceactivemqbrokerparameters-credentials)
     */
    public fun credentials(): Any

    /**
     * The maximum length of a time to wait for events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceactivemqbrokerparameters.html#cfn-pipes-pipe-pipesourceactivemqbrokerparameters-maximumbatchingwindowinseconds)
     */
    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    /**
     * The name of the destination queue to consume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceactivemqbrokerparameters.html#cfn-pipes-pipe-pipesourceactivemqbrokerparameters-queuename)
     */
    public fun queueName(): String

    /**
     * A builder for [PipeSourceActiveMQBrokerParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      public fun batchSize(batchSize: Number)

      /**
       * @param credentials The credentials needed to access the resource. 
       */
      public fun credentials(credentials: IResolvable)

      /**
       * @param credentials The credentials needed to access the resource. 
       */
      public fun credentials(credentials: MQBrokerAccessCredentialsProperty)

      /**
       * @param credentials The credentials needed to access the resource. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ed7192250dd5f48c54611a1f27265b98db44c6219ef349b3c746e7f64c51307")
      public fun credentials(credentials: MQBrokerAccessCredentialsProperty.Builder.() -> Unit)

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      /**
       * @param queueName The name of the destination queue to consume. 
       */
      public fun queueName(queueName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty.builder()

      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      /**
       * @param credentials The credentials needed to access the resource. 
       */
      override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
      }

      /**
       * @param credentials The credentials needed to access the resource. 
       */
      override fun credentials(credentials: MQBrokerAccessCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(MQBrokerAccessCredentialsProperty::unwrap))
      }

      /**
       * @param credentials The credentials needed to access the resource. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ed7192250dd5f48c54611a1f27265b98db44c6219ef349b3c746e7f64c51307")
      override fun credentials(credentials: MQBrokerAccessCredentialsProperty.Builder.() -> Unit):
          Unit = credentials(MQBrokerAccessCredentialsProperty(credentials))

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      /**
       * @param queueName The name of the destination queue to consume. 
       */
      override fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceActiveMQBrokerParametersProperty {
      /**
       * The maximum number of records to include in each batch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceactivemqbrokerparameters.html#cfn-pipes-pipe-pipesourceactivemqbrokerparameters-batchsize)
       */
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      /**
       * The credentials needed to access the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceactivemqbrokerparameters.html#cfn-pipes-pipe-pipesourceactivemqbrokerparameters-credentials)
       */
      override fun credentials(): Any = unwrap(this).getCredentials()

      /**
       * The maximum length of a time to wait for events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceactivemqbrokerparameters.html#cfn-pipes-pipe-pipesourceactivemqbrokerparameters-maximumbatchingwindowinseconds)
       */
      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      /**
       * The name of the destination queue to consume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceactivemqbrokerparameters.html#cfn-pipes-pipe-pipesourceactivemqbrokerparameters-queuename)
       */
      override fun queueName(): String = unwrap(this).getQueueName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceActiveMQBrokerParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty):
          PipeSourceActiveMQBrokerParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceActiveMQBrokerParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty
    }
  }

  public interface PipeEnrichmentParametersProperty {
    /**
     * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or
     * EventBridge ApiDestination.
     *
     * If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can use
     * this parameter to specify headers, path parameters, and query string keys/values as part of your
     * target invoking request. If you're using ApiDestinations, the corresponding Connection can also
     * have these values configured. In case of any conflicting keys, values from the Connection take
     * precedence.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmentparameters.html#cfn-pipes-pipe-pipeenrichmentparameters-httpparameters)
     */
    public fun httpParameters(): Any? = unwrap(this).getHttpParameters()

    /**
     * Valid JSON text passed to the enrichment.
     *
     * In this case, nothing from the event itself is passed to the enrichment. For more
     * information, see [The JavaScript Object Notation (JSON) Data Interchange
     * Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt) .
     *
     * To remove an input template, specify an empty string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmentparameters.html#cfn-pipes-pipe-pipeenrichmentparameters-inputtemplate)
     */
    public fun inputTemplate(): String? = unwrap(this).getInputTemplate()

    /**
     * A builder for [PipeEnrichmentParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
       * REST endpoint or EventBridge ApiDestination.
       * If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can
       * use this parameter to specify headers, path parameters, and query string keys/values as part
       * of your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       */
      public fun httpParameters(httpParameters: IResolvable)

      /**
       * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
       * REST endpoint or EventBridge ApiDestination.
       * If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can
       * use this parameter to specify headers, path parameters, and query string keys/values as part
       * of your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       */
      public fun httpParameters(httpParameters: PipeEnrichmentHttpParametersProperty)

      /**
       * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
       * REST endpoint or EventBridge ApiDestination.
       * If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can
       * use this parameter to specify headers, path parameters, and query string keys/values as part
       * of your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3858678e5145b0aae91d534a55e459c2de77b8b2b05104433d661e992776db25")
      public
          fun httpParameters(httpParameters: PipeEnrichmentHttpParametersProperty.Builder.() -> Unit)

      /**
       * @param inputTemplate Valid JSON text passed to the enrichment.
       * In this case, nothing from the event itself is passed to the enrichment. For more
       * information, see [The JavaScript Object Notation (JSON) Data Interchange
       * Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt) .
       *
       * To remove an input template, specify an empty string.
       */
      public fun inputTemplate(inputTemplate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty.builder()

      /**
       * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
       * REST endpoint or EventBridge ApiDestination.
       * If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can
       * use this parameter to specify headers, path parameters, and query string keys/values as part
       * of your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       */
      override fun httpParameters(httpParameters: IResolvable) {
        cdkBuilder.httpParameters(httpParameters.let(IResolvable::unwrap))
      }

      /**
       * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
       * REST endpoint or EventBridge ApiDestination.
       * If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can
       * use this parameter to specify headers, path parameters, and query string keys/values as part
       * of your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       */
      override fun httpParameters(httpParameters: PipeEnrichmentHttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters.let(PipeEnrichmentHttpParametersProperty::unwrap))
      }

      /**
       * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
       * REST endpoint or EventBridge ApiDestination.
       * If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can
       * use this parameter to specify headers, path parameters, and query string keys/values as part
       * of your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3858678e5145b0aae91d534a55e459c2de77b8b2b05104433d661e992776db25")
      override
          fun httpParameters(httpParameters: PipeEnrichmentHttpParametersProperty.Builder.() -> Unit):
          Unit = httpParameters(PipeEnrichmentHttpParametersProperty(httpParameters))

      /**
       * @param inputTemplate Valid JSON text passed to the enrichment.
       * In this case, nothing from the event itself is passed to the enrichment. For more
       * information, see [The JavaScript Object Notation (JSON) Data Interchange
       * Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt) .
       *
       * To remove an input template, specify an empty string.
       */
      override fun inputTemplate(inputTemplate: String) {
        cdkBuilder.inputTemplate(inputTemplate)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty,
    ) : CdkObject(cdkObject), PipeEnrichmentParametersProperty {
      /**
       * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or
       * EventBridge ApiDestination.
       *
       * If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can
       * use this parameter to specify headers, path parameters, and query string keys/values as part
       * of your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmentparameters.html#cfn-pipes-pipe-pipeenrichmentparameters-httpparameters)
       */
      override fun httpParameters(): Any? = unwrap(this).getHttpParameters()

      /**
       * Valid JSON text passed to the enrichment.
       *
       * In this case, nothing from the event itself is passed to the enrichment. For more
       * information, see [The JavaScript Object Notation (JSON) Data Interchange
       * Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt) .
       *
       * To remove an input template, specify an empty string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmentparameters.html#cfn-pipes-pipe-pipeenrichmentparameters-inputtemplate)
       */
      override fun inputTemplate(): String? = unwrap(this).getInputTemplate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipeEnrichmentParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty):
          PipeEnrichmentParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeEnrichmentParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty
    }
  }

  public interface EcsContainerOverrideProperty {
    /**
     * The command to send to the container that overrides the default command from the Docker image
     * or the task definition.
     *
     * You must also specify a container name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-command)
     */
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The number of `cpu` units reserved for the container, instead of the default value from the
     * task definition.
     *
     * You must also specify a container name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-cpu)
     */
    public fun cpu(): Number? = unwrap(this).getCpu()

    /**
     * The environment variables to send to the container.
     *
     * You can add new environment variables, which are added to the container at launch, or you can
     * override the existing environment variables from the Docker image or the task definition. You
     * must also specify a container name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * A list of files containing the environment variables to pass to a container, instead of the
     * value from the container definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-environmentfiles)
     */
    public fun environmentFiles(): Any? = unwrap(this).getEnvironmentFiles()

    /**
     * The hard limit (in MiB) of memory to present to the container, instead of the default value
     * from the task definition.
     *
     * If your container attempts to exceed the memory specified here, the container is killed. You
     * must also specify a container name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-memory)
     */
    public fun memory(): Number? = unwrap(this).getMemory()

    /**
     * The soft limit (in MiB) of memory to reserve for the container, instead of the default value
     * from the task definition.
     *
     * You must also specify a container name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-memoryreservation)
     */
    public fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

    /**
     * The name of the container that receives the override.
     *
     * This parameter is required if any override is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The type and amount of a resource to assign to a container, instead of the default value from
     * the task definition.
     *
     * The only supported resource is a GPU.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-resourcerequirements)
     */
    public fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

    /**
     * A builder for [EcsContainerOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param command The command to send to the container that overrides the default command from
       * the Docker image or the task definition.
       * You must also specify a container name.
       */
      public fun command(command: List<String>)

      /**
       * @param command The command to send to the container that overrides the default command from
       * the Docker image or the task definition.
       * You must also specify a container name.
       */
      public fun command(vararg command: String)

      /**
       * @param cpu The number of `cpu` units reserved for the container, instead of the default
       * value from the task definition.
       * You must also specify a container name.
       */
      public fun cpu(cpu: Number)

      /**
       * @param environment The environment variables to send to the container.
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       * You must also specify a container name.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment The environment variables to send to the container.
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       * You must also specify a container name.
       */
      public fun environment(environment: List<Any>)

      /**
       * @param environment The environment variables to send to the container.
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       * You must also specify a container name.
       */
      public fun environment(vararg environment: Any)

      /**
       * @param environmentFiles A list of files containing the environment variables to pass to a
       * container, instead of the value from the container definition.
       */
      public fun environmentFiles(environmentFiles: IResolvable)

      /**
       * @param environmentFiles A list of files containing the environment variables to pass to a
       * container, instead of the value from the container definition.
       */
      public fun environmentFiles(environmentFiles: List<Any>)

      /**
       * @param environmentFiles A list of files containing the environment variables to pass to a
       * container, instead of the value from the container definition.
       */
      public fun environmentFiles(vararg environmentFiles: Any)

      /**
       * @param memory The hard limit (in MiB) of memory to present to the container, instead of the
       * default value from the task definition.
       * If your container attempts to exceed the memory specified here, the container is killed.
       * You must also specify a container name.
       */
      public fun memory(memory: Number)

      /**
       * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container,
       * instead of the default value from the task definition.
       * You must also specify a container name.
       */
      public fun memoryReservation(memoryReservation: Number)

      /**
       * @param name The name of the container that receives the override.
       * This parameter is required if any override is specified.
       */
      public fun name(name: String)

      /**
       * @param resourceRequirements The type and amount of a resource to assign to a container,
       * instead of the default value from the task definition.
       * The only supported resource is a GPU.
       */
      public fun resourceRequirements(resourceRequirements: IResolvable)

      /**
       * @param resourceRequirements The type and amount of a resource to assign to a container,
       * instead of the default value from the task definition.
       * The only supported resource is a GPU.
       */
      public fun resourceRequirements(resourceRequirements: List<Any>)

      /**
       * @param resourceRequirements The type and amount of a resource to assign to a container,
       * instead of the default value from the task definition.
       * The only supported resource is a GPU.
       */
      public fun resourceRequirements(vararg resourceRequirements: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty.builder()

      /**
       * @param command The command to send to the container that overrides the default command from
       * the Docker image or the task definition.
       * You must also specify a container name.
       */
      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      /**
       * @param command The command to send to the container that overrides the default command from
       * the Docker image or the task definition.
       * You must also specify a container name.
       */
      override fun command(vararg command: String): Unit = command(command.toList())

      /**
       * @param cpu The number of `cpu` units reserved for the container, instead of the default
       * value from the task definition.
       * You must also specify a container name.
       */
      override fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
      }

      /**
       * @param environment The environment variables to send to the container.
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       * You must also specify a container name.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      /**
       * @param environment The environment variables to send to the container.
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       * You must also specify a container name.
       */
      override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param environment The environment variables to send to the container.
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       * You must also specify a container name.
       */
      override fun environment(vararg environment: Any): Unit = environment(environment.toList())

      /**
       * @param environmentFiles A list of files containing the environment variables to pass to a
       * container, instead of the value from the container definition.
       */
      override fun environmentFiles(environmentFiles: IResolvable) {
        cdkBuilder.environmentFiles(environmentFiles.let(IResolvable::unwrap))
      }

      /**
       * @param environmentFiles A list of files containing the environment variables to pass to a
       * container, instead of the value from the container definition.
       */
      override fun environmentFiles(environmentFiles: List<Any>) {
        cdkBuilder.environmentFiles(environmentFiles)
      }

      /**
       * @param environmentFiles A list of files containing the environment variables to pass to a
       * container, instead of the value from the container definition.
       */
      override fun environmentFiles(vararg environmentFiles: Any): Unit =
          environmentFiles(environmentFiles.toList())

      /**
       * @param memory The hard limit (in MiB) of memory to present to the container, instead of the
       * default value from the task definition.
       * If your container attempts to exceed the memory specified here, the container is killed.
       * You must also specify a container name.
       */
      override fun memory(memory: Number) {
        cdkBuilder.memory(memory)
      }

      /**
       * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container,
       * instead of the default value from the task definition.
       * You must also specify a container name.
       */
      override fun memoryReservation(memoryReservation: Number) {
        cdkBuilder.memoryReservation(memoryReservation)
      }

      /**
       * @param name The name of the container that receives the override.
       * This parameter is required if any override is specified.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param resourceRequirements The type and amount of a resource to assign to a container,
       * instead of the default value from the task definition.
       * The only supported resource is a GPU.
       */
      override fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements.let(IResolvable::unwrap))
      }

      /**
       * @param resourceRequirements The type and amount of a resource to assign to a container,
       * instead of the default value from the task definition.
       * The only supported resource is a GPU.
       */
      override fun resourceRequirements(resourceRequirements: List<Any>) {
        cdkBuilder.resourceRequirements(resourceRequirements)
      }

      /**
       * @param resourceRequirements The type and amount of a resource to assign to a container,
       * instead of the default value from the task definition.
       * The only supported resource is a GPU.
       */
      override fun resourceRequirements(vararg resourceRequirements: Any): Unit =
          resourceRequirements(resourceRequirements.toList())

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty,
    ) : CdkObject(cdkObject), EcsContainerOverrideProperty {
      /**
       * The command to send to the container that overrides the default command from the Docker
       * image or the task definition.
       *
       * You must also specify a container name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-command)
       */
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      /**
       * The number of `cpu` units reserved for the container, instead of the default value from the
       * task definition.
       *
       * You must also specify a container name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-cpu)
       */
      override fun cpu(): Number? = unwrap(this).getCpu()

      /**
       * The environment variables to send to the container.
       *
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       * You must also specify a container name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * A list of files containing the environment variables to pass to a container, instead of the
       * value from the container definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-environmentfiles)
       */
      override fun environmentFiles(): Any? = unwrap(this).getEnvironmentFiles()

      /**
       * The hard limit (in MiB) of memory to present to the container, instead of the default value
       * from the task definition.
       *
       * If your container attempts to exceed the memory specified here, the container is killed.
       * You must also specify a container name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-memory)
       */
      override fun memory(): Number? = unwrap(this).getMemory()

      /**
       * The soft limit (in MiB) of memory to reserve for the container, instead of the default
       * value from the task definition.
       *
       * You must also specify a container name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-memoryreservation)
       */
      override fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

      /**
       * The name of the container that receives the override.
       *
       * This parameter is required if any override is specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The type and amount of a resource to assign to a container, instead of the default value
       * from the task definition.
       *
       * The only supported resource is a GPU.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecscontaineroverride.html#cfn-pipes-pipe-ecscontaineroverride-resourcerequirements)
       */
      override fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsContainerOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty):
          EcsContainerOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsContainerOverrideProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty
    }
  }

  public interface BatchRetryStrategyProperty {
    /**
     * The number of times to move a job to the `RUNNABLE` status.
     *
     * If the value of `attempts` is greater than one, the job is retried on failure the same number
     * of attempts as the value.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchretrystrategy.html#cfn-pipes-pipe-batchretrystrategy-attempts)
     */
    public fun attempts(): Number? = unwrap(this).getAttempts()

    /**
     * A builder for [BatchRetryStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attempts The number of times to move a job to the `RUNNABLE` status.
       * If the value of `attempts` is greater than one, the job is retried on failure the same
       * number of attempts as the value.
       */
      public fun attempts(attempts: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty.builder()

      /**
       * @param attempts The number of times to move a job to the `RUNNABLE` status.
       * If the value of `attempts` is greater than one, the job is retried on failure the same
       * number of attempts as the value.
       */
      override fun attempts(attempts: Number) {
        cdkBuilder.attempts(attempts)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty,
    ) : CdkObject(cdkObject), BatchRetryStrategyProperty {
      /**
       * The number of times to move a job to the `RUNNABLE` status.
       *
       * If the value of `attempts` is greater than one, the job is retried on failure the same
       * number of attempts as the value.
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchretrystrategy.html#cfn-pipes-pipe-batchretrystrategy-attempts)
       */
      override fun attempts(): Number? = unwrap(this).getAttempts()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchRetryStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty):
          BatchRetryStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchRetryStrategyProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty
    }
  }

  public interface PipeTargetKinesisStreamParametersProperty {
    /**
     * Determines which shard in the stream the data record is assigned to.
     *
     * Partition keys are Unicode strings with a maximum length limit of 256 characters for each
     * key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that maps
     * the partition key and associated data to a specific shard. Specifically, an MD5 hash function is
     * used to map partition keys to 128-bit integer values and to map associated data records to
     * shards. As a result of this hashing mechanism, all data records with the same partition key map
     * to the same shard within the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetkinesisstreamparameters.html#cfn-pipes-pipe-pipetargetkinesisstreamparameters-partitionkey)
     */
    public fun partitionKey(): String

    /**
     * A builder for [PipeTargetKinesisStreamParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param partitionKey Determines which shard in the stream the data record is assigned to. 
       * Partition keys are Unicode strings with a maximum length limit of 256 characters for each
       * key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that maps
       * the partition key and associated data to a specific shard. Specifically, an MD5 hash function
       * is used to map partition keys to 128-bit integer values and to map associated data records to
       * shards. As a result of this hashing mechanism, all data records with the same partition key
       * map to the same shard within the stream.
       */
      public fun partitionKey(partitionKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty.builder()

      /**
       * @param partitionKey Determines which shard in the stream the data record is assigned to. 
       * Partition keys are Unicode strings with a maximum length limit of 256 characters for each
       * key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that maps
       * the partition key and associated data to a specific shard. Specifically, an MD5 hash function
       * is used to map partition keys to 128-bit integer values and to map associated data records to
       * shards. As a result of this hashing mechanism, all data records with the same partition key
       * map to the same shard within the stream.
       */
      override fun partitionKey(partitionKey: String) {
        cdkBuilder.partitionKey(partitionKey)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetKinesisStreamParametersProperty {
      /**
       * Determines which shard in the stream the data record is assigned to.
       *
       * Partition keys are Unicode strings with a maximum length limit of 256 characters for each
       * key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that maps
       * the partition key and associated data to a specific shard. Specifically, an MD5 hash function
       * is used to map partition keys to 128-bit integer values and to map associated data records to
       * shards. As a result of this hashing mechanism, all data records with the same partition key
       * map to the same shard within the stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetkinesisstreamparameters.html#cfn-pipes-pipe-pipetargetkinesisstreamparameters-partitionkey)
       */
      override fun partitionKey(): String = unwrap(this).getPartitionKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetKinesisStreamParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty):
          PipeTargetKinesisStreamParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetKinesisStreamParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty
    }
  }

  public interface EcsEphemeralStorageProperty {
    /**
     * The total amount, in GiB, of ephemeral storage to set for the task.
     *
     * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsephemeralstorage.html#cfn-pipes-pipe-ecsephemeralstorage-sizeingib)
     */
    public fun sizeInGiB(): Number

    /**
     * A builder for [EcsEphemeralStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task. 
       * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
       */
      public fun sizeInGiB(sizeInGiB: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty.builder()

      /**
       * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task. 
       * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
       */
      override fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty,
    ) : CdkObject(cdkObject), EcsEphemeralStorageProperty {
      /**
       * The total amount, in GiB, of ephemeral storage to set for the task.
       *
       * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsephemeralstorage.html#cfn-pipes-pipe-ecsephemeralstorage-sizeingib)
       */
      override fun sizeInGiB(): Number = unwrap(this).getSizeInGiB()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsEphemeralStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty):
          EcsEphemeralStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsEphemeralStorageProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty
    }
  }

  public interface PipeTargetEventBridgeEventBusParametersProperty {
    /**
     * A free-form string, with a maximum of 128 characters, used to decide what fields to expect in
     * the event detail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargeteventbridgeeventbusparameters.html#cfn-pipes-pipe-pipetargeteventbridgeeventbusparameters-detailtype)
     */
    public fun detailType(): String? = unwrap(this).getDetailType()

    /**
     * The URL subdomain of the endpoint.
     *
     * For example, if the URL for Endpoint is https://abcde.veo.endpoints.event.amazonaws.com, then
     * the EndpointId is `abcde.veo` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargeteventbridgeeventbusparameters.html#cfn-pipes-pipe-pipetargeteventbridgeeventbusparameters-endpointid)
     */
    public fun endpointId(): String? = unwrap(this).getEndpointId()

    /**
     * AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns.
     *
     * Any number, including zero, may be present.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargeteventbridgeeventbusparameters.html#cfn-pipes-pipe-pipetargeteventbridgeeventbusparameters-resources)
     */
    public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    /**
     * The source of the event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargeteventbridgeeventbusparameters.html#cfn-pipes-pipe-pipetargeteventbridgeeventbusparameters-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * The time stamp of the event, per
     * [RFC3339](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc3339.txt) . If no time
     * stamp is provided, the time stamp of the
     * [PutEvents](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html) call
     * is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargeteventbridgeeventbusparameters.html#cfn-pipes-pipe-pipetargeteventbridgeeventbusparameters-time)
     */
    public fun time(): String? = unwrap(this).getTime()

    /**
     * A builder for [PipeTargetEventBridgeEventBusParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param detailType A free-form string, with a maximum of 128 characters, used to decide what
       * fields to expect in the event detail.
       */
      public fun detailType(detailType: String)

      /**
       * @param endpointId The URL subdomain of the endpoint.
       * For example, if the URL for Endpoint is https://abcde.veo.endpoints.event.amazonaws.com,
       * then the EndpointId is `abcde.veo` .
       */
      public fun endpointId(endpointId: String)

      /**
       * @param resources AWS resources, identified by Amazon Resource Name (ARN), which the event
       * primarily concerns.
       * Any number, including zero, may be present.
       */
      public fun resources(resources: List<String>)

      /**
       * @param resources AWS resources, identified by Amazon Resource Name (ARN), which the event
       * primarily concerns.
       * Any number, including zero, may be present.
       */
      public fun resources(vararg resources: String)

      /**
       * @param source The source of the event.
       */
      public fun source(source: String)

      /**
       * @param time The time stamp of the event, per
       * [RFC3339](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc3339.txt) . If no time
       * stamp is provided, the time stamp of the
       * [PutEvents](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
       * call is used.
       */
      public fun time(time: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty.builder()

      /**
       * @param detailType A free-form string, with a maximum of 128 characters, used to decide what
       * fields to expect in the event detail.
       */
      override fun detailType(detailType: String) {
        cdkBuilder.detailType(detailType)
      }

      /**
       * @param endpointId The URL subdomain of the endpoint.
       * For example, if the URL for Endpoint is https://abcde.veo.endpoints.event.amazonaws.com,
       * then the EndpointId is `abcde.veo` .
       */
      override fun endpointId(endpointId: String) {
        cdkBuilder.endpointId(endpointId)
      }

      /**
       * @param resources AWS resources, identified by Amazon Resource Name (ARN), which the event
       * primarily concerns.
       * Any number, including zero, may be present.
       */
      override fun resources(resources: List<String>) {
        cdkBuilder.resources(resources)
      }

      /**
       * @param resources AWS resources, identified by Amazon Resource Name (ARN), which the event
       * primarily concerns.
       * Any number, including zero, may be present.
       */
      override fun resources(vararg resources: String): Unit = resources(resources.toList())

      /**
       * @param source The source of the event.
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param time The time stamp of the event, per
       * [RFC3339](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc3339.txt) . If no time
       * stamp is provided, the time stamp of the
       * [PutEvents](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
       * call is used.
       */
      override fun time(time: String) {
        cdkBuilder.time(time)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetEventBridgeEventBusParametersProperty {
      /**
       * A free-form string, with a maximum of 128 characters, used to decide what fields to expect
       * in the event detail.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargeteventbridgeeventbusparameters.html#cfn-pipes-pipe-pipetargeteventbridgeeventbusparameters-detailtype)
       */
      override fun detailType(): String? = unwrap(this).getDetailType()

      /**
       * The URL subdomain of the endpoint.
       *
       * For example, if the URL for Endpoint is https://abcde.veo.endpoints.event.amazonaws.com,
       * then the EndpointId is `abcde.veo` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargeteventbridgeeventbusparameters.html#cfn-pipes-pipe-pipetargeteventbridgeeventbusparameters-endpointid)
       */
      override fun endpointId(): String? = unwrap(this).getEndpointId()

      /**
       * AWS resources, identified by Amazon Resource Name (ARN), which the event primarily
       * concerns.
       *
       * Any number, including zero, may be present.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargeteventbridgeeventbusparameters.html#cfn-pipes-pipe-pipetargeteventbridgeeventbusparameters-resources)
       */
      override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

      /**
       * The source of the event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargeteventbridgeeventbusparameters.html#cfn-pipes-pipe-pipetargeteventbridgeeventbusparameters-source)
       */
      override fun source(): String? = unwrap(this).getSource()

      /**
       * The time stamp of the event, per
       * [RFC3339](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc3339.txt) . If no time
       * stamp is provided, the time stamp of the
       * [PutEvents](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
       * call is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargeteventbridgeeventbusparameters.html#cfn-pipes-pipe-pipetargeteventbridgeeventbusparameters-time)
       */
      override fun time(): String? = unwrap(this).getTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetEventBridgeEventBusParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty):
          PipeTargetEventBridgeEventBusParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetEventBridgeEventBusParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty
    }
  }

  public interface PipeTargetLambdaFunctionParametersProperty {
    /**
     * Specify whether to invoke the function synchronously or asynchronously.
     *
     * * `REQUEST_RESPONSE` (default) - Invoke synchronously. This corresponds to the
     * `RequestResponse` option in the `InvocationType` parameter for the Lambda
     * [Invoke](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
     * API.
     * * `FIRE_AND_FORGET` - Invoke asynchronously. This corresponds to the `Event` option in the
     * `InvocationType` parameter for the Lambda
     * [Invoke](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
     * API.
     *
     * For more information, see [Invocation
     * types](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-invocation)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetlambdafunctionparameters.html#cfn-pipes-pipe-pipetargetlambdafunctionparameters-invocationtype)
     */
    public fun invocationType(): String? = unwrap(this).getInvocationType()

    /**
     * A builder for [PipeTargetLambdaFunctionParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param invocationType Specify whether to invoke the function synchronously or
       * asynchronously.
       * * `REQUEST_RESPONSE` (default) - Invoke synchronously. This corresponds to the
       * `RequestResponse` option in the `InvocationType` parameter for the Lambda
       * [Invoke](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
       * API.
       * * `FIRE_AND_FORGET` - Invoke asynchronously. This corresponds to the `Event` option in the
       * `InvocationType` parameter for the Lambda
       * [Invoke](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
       * API.
       *
       * For more information, see [Invocation
       * types](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-invocation)
       * in the *Amazon EventBridge User Guide* .
       */
      public fun invocationType(invocationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty.builder()

      /**
       * @param invocationType Specify whether to invoke the function synchronously or
       * asynchronously.
       * * `REQUEST_RESPONSE` (default) - Invoke synchronously. This corresponds to the
       * `RequestResponse` option in the `InvocationType` parameter for the Lambda
       * [Invoke](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
       * API.
       * * `FIRE_AND_FORGET` - Invoke asynchronously. This corresponds to the `Event` option in the
       * `InvocationType` parameter for the Lambda
       * [Invoke](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
       * API.
       *
       * For more information, see [Invocation
       * types](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-invocation)
       * in the *Amazon EventBridge User Guide* .
       */
      override fun invocationType(invocationType: String) {
        cdkBuilder.invocationType(invocationType)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetLambdaFunctionParametersProperty {
      /**
       * Specify whether to invoke the function synchronously or asynchronously.
       *
       * * `REQUEST_RESPONSE` (default) - Invoke synchronously. This corresponds to the
       * `RequestResponse` option in the `InvocationType` parameter for the Lambda
       * [Invoke](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
       * API.
       * * `FIRE_AND_FORGET` - Invoke asynchronously. This corresponds to the `Event` option in the
       * `InvocationType` parameter for the Lambda
       * [Invoke](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax)
       * API.
       *
       * For more information, see [Invocation
       * types](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-invocation)
       * in the *Amazon EventBridge User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetlambdafunctionparameters.html#cfn-pipes-pipe-pipetargetlambdafunctionparameters-invocationtype)
       */
      override fun invocationType(): String? = unwrap(this).getInvocationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetLambdaFunctionParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty):
          PipeTargetLambdaFunctionParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetLambdaFunctionParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty
    }
  }

  public interface BatchContainerOverridesProperty {
    /**
     * The command to send to the container that overrides the default command from the Docker image
     * or the task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchcontaineroverrides.html#cfn-pipes-pipe-batchcontaineroverrides-command)
     */
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The environment variables to send to the container.
     *
     * You can add new environment variables, which are added to the container at launch, or you can
     * override the existing environment variables from the Docker image or the task definition.
     *
     *
     * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved
     * for variables that AWS Batch sets.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchcontaineroverrides.html#cfn-pipes-pipe-batchcontaineroverrides-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The instance type to use for a multi-node parallel job.
     *
     *
     * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate
     * resources, and shouldn't be provided.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchcontaineroverrides.html#cfn-pipes-pipe-batchcontaineroverrides-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The type and amount of resources to assign to a container.
     *
     * This overrides the settings in the job definition. The supported resources include `GPU` ,
     * `MEMORY` , and `VCPU` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchcontaineroverrides.html#cfn-pipes-pipe-batchcontaineroverrides-resourcerequirements)
     */
    public fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

    /**
     * A builder for [BatchContainerOverridesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param command The command to send to the container that overrides the default command from
       * the Docker image or the task definition.
       */
      public fun command(command: List<String>)

      /**
       * @param command The command to send to the container that overrides the default command from
       * the Docker image or the task definition.
       */
      public fun command(vararg command: String)

      /**
       * @param environment The environment variables to send to the container.
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       *
       *
       * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment The environment variables to send to the container.
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       *
       *
       * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       */
      public fun environment(environment: List<Any>)

      /**
       * @param environment The environment variables to send to the container.
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       *
       *
       * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       */
      public fun environment(vararg environment: Any)

      /**
       * @param instanceType The instance type to use for a multi-node parallel job.
       *
       * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate
       * resources, and shouldn't be provided.
       */
      public fun instanceType(instanceType: String)

      /**
       * @param resourceRequirements The type and amount of resources to assign to a container.
       * This overrides the settings in the job definition. The supported resources include `GPU` ,
       * `MEMORY` , and `VCPU` .
       */
      public fun resourceRequirements(resourceRequirements: IResolvable)

      /**
       * @param resourceRequirements The type and amount of resources to assign to a container.
       * This overrides the settings in the job definition. The supported resources include `GPU` ,
       * `MEMORY` , and `VCPU` .
       */
      public fun resourceRequirements(resourceRequirements: List<Any>)

      /**
       * @param resourceRequirements The type and amount of resources to assign to a container.
       * This overrides the settings in the job definition. The supported resources include `GPU` ,
       * `MEMORY` , and `VCPU` .
       */
      public fun resourceRequirements(vararg resourceRequirements: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty.builder()

      /**
       * @param command The command to send to the container that overrides the default command from
       * the Docker image or the task definition.
       */
      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      /**
       * @param command The command to send to the container that overrides the default command from
       * the Docker image or the task definition.
       */
      override fun command(vararg command: String): Unit = command(command.toList())

      /**
       * @param environment The environment variables to send to the container.
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       *
       *
       * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      /**
       * @param environment The environment variables to send to the container.
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       *
       *
       * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       */
      override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param environment The environment variables to send to the container.
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       *
       *
       * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       */
      override fun environment(vararg environment: Any): Unit = environment(environment.toList())

      /**
       * @param instanceType The instance type to use for a multi-node parallel job.
       *
       * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate
       * resources, and shouldn't be provided.
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param resourceRequirements The type and amount of resources to assign to a container.
       * This overrides the settings in the job definition. The supported resources include `GPU` ,
       * `MEMORY` , and `VCPU` .
       */
      override fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements.let(IResolvable::unwrap))
      }

      /**
       * @param resourceRequirements The type and amount of resources to assign to a container.
       * This overrides the settings in the job definition. The supported resources include `GPU` ,
       * `MEMORY` , and `VCPU` .
       */
      override fun resourceRequirements(resourceRequirements: List<Any>) {
        cdkBuilder.resourceRequirements(resourceRequirements)
      }

      /**
       * @param resourceRequirements The type and amount of resources to assign to a container.
       * This overrides the settings in the job definition. The supported resources include `GPU` ,
       * `MEMORY` , and `VCPU` .
       */
      override fun resourceRequirements(vararg resourceRequirements: Any): Unit =
          resourceRequirements(resourceRequirements.toList())

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty,
    ) : CdkObject(cdkObject), BatchContainerOverridesProperty {
      /**
       * The command to send to the container that overrides the default command from the Docker
       * image or the task definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchcontaineroverrides.html#cfn-pipes-pipe-batchcontaineroverrides-command)
       */
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      /**
       * The environment variables to send to the container.
       *
       * You can add new environment variables, which are added to the container at launch, or you
       * can override the existing environment variables from the Docker image or the task definition.
       *
       *
       * Environment variables cannot start with " `AWS Batch` ". This naming convention is reserved
       * for variables that AWS Batch sets.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchcontaineroverrides.html#cfn-pipes-pipe-batchcontaineroverrides-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * The instance type to use for a multi-node parallel job.
       *
       *
       * This parameter isn't applicable to single-node container jobs or jobs that run on Fargate
       * resources, and shouldn't be provided.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchcontaineroverrides.html#cfn-pipes-pipe-batchcontaineroverrides-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * The type and amount of resources to assign to a container.
       *
       * This overrides the settings in the job definition. The supported resources include `GPU` ,
       * `MEMORY` , and `VCPU` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchcontaineroverrides.html#cfn-pipes-pipe-batchcontaineroverrides-resourcerequirements)
       */
      override fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchContainerOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty):
          BatchContainerOverridesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchContainerOverridesProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty
    }
  }

  public interface MQBrokerAccessCredentialsProperty {
    /**
     * The ARN of the Secrets Manager secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-mqbrokeraccesscredentials.html#cfn-pipes-pipe-mqbrokeraccesscredentials-basicauth)
     */
    public fun basicAuth(): String

    /**
     * A builder for [MQBrokerAccessCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param basicAuth The ARN of the Secrets Manager secret. 
       */
      public fun basicAuth(basicAuth: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty.builder()

      /**
       * @param basicAuth The ARN of the Secrets Manager secret. 
       */
      override fun basicAuth(basicAuth: String) {
        cdkBuilder.basicAuth(basicAuth)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty,
    ) : CdkObject(cdkObject), MQBrokerAccessCredentialsProperty {
      /**
       * The ARN of the Secrets Manager secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-mqbrokeraccesscredentials.html#cfn-pipes-pipe-mqbrokeraccesscredentials-basicauth)
       */
      override fun basicAuth(): String = unwrap(this).getBasicAuth()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MQBrokerAccessCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty):
          MQBrokerAccessCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MQBrokerAccessCredentialsProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty
    }
  }

  public interface EcsEnvironmentVariableProperty {
    /**
     * The name of the key-value pair.
     *
     * For environment variables, this is the name of the environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsenvironmentvariable.html#cfn-pipes-pipe-ecsenvironmentvariable-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value of the key-value pair.
     *
     * For environment variables, this is the value of the environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsenvironmentvariable.html#cfn-pipes-pipe-ecsenvironmentvariable-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [EcsEnvironmentVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the key-value pair.
       * For environment variables, this is the name of the environment variable.
       */
      public fun name(name: String)

      /**
       * @param value The value of the key-value pair.
       * For environment variables, this is the value of the environment variable.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty.builder()

      /**
       * @param name The name of the key-value pair.
       * For environment variables, this is the name of the environment variable.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the key-value pair.
       * For environment variables, this is the value of the environment variable.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty,
    ) : CdkObject(cdkObject), EcsEnvironmentVariableProperty {
      /**
       * The name of the key-value pair.
       *
       * For environment variables, this is the name of the environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsenvironmentvariable.html#cfn-pipes-pipe-ecsenvironmentvariable-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value of the key-value pair.
       *
       * For environment variables, this is the value of the environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsenvironmentvariable.html#cfn-pipes-pipe-ecsenvironmentvariable-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsEnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty):
          EcsEnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsEnvironmentVariableProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty
    }
  }

  public interface DeadLetterConfigProperty {
    /**
     * The ARN of the specified target for the dead-letter queue.
     *
     * For Amazon Kinesis stream and Amazon DynamoDB stream sources, specify either an Amazon SNS
     * topic or Amazon SQS queue ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-deadletterconfig.html#cfn-pipes-pipe-deadletterconfig-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * A builder for [DeadLetterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The ARN of the specified target for the dead-letter queue.
       * For Amazon Kinesis stream and Amazon DynamoDB stream sources, specify either an Amazon SNS
       * topic or Amazon SQS queue ARN.
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty.builder()

      /**
       * @param arn The ARN of the specified target for the dead-letter queue.
       * For Amazon Kinesis stream and Amazon DynamoDB stream sources, specify either an Amazon SNS
       * topic or Amazon SQS queue ARN.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty,
    ) : CdkObject(cdkObject), DeadLetterConfigProperty {
      /**
       * The ARN of the specified target for the dead-letter queue.
       *
       * For Amazon Kinesis stream and Amazon DynamoDB stream sources, specify either an Amazon SNS
       * topic or Amazon SQS queue ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-deadletterconfig.html#cfn-pipes-pipe-deadletterconfig-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty):
          DeadLetterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeadLetterConfigProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty
    }
  }

  public interface BatchResourceRequirementProperty {
    /**
     * The type of resource to assign to a container.
     *
     * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchresourcerequirement.html#cfn-pipes-pipe-batchresourcerequirement-type)
     */
    public fun type(): String

    /**
     * The quantity of the specified resource to reserve for the container. The values vary based on
     * the `type` specified.
     *
     * * **type="GPU"** - The number of physical GPUs to reserve for the container. Make sure that
     * the number of GPUs reserved for all containers in a job doesn't exceed the number of available
     * GPUs on the compute resource that the job is launched on.
     *
     *
     * GPUs aren't available for jobs that are running on Fargate resources.
     *
     *
     * * **type="MEMORY"** - The memory hard limit (in MiB) present to the container. This parameter
     * is supported for jobs that are running on EC2 resources. If your container attempts to exceed
     * the memory specified, the container is terminated. This parameter maps to `Memory` in the
     * [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . You must
     * specify at least 4 MiB of memory for a job. This is required but can be specified in several
     * places for multi-node parallel (MNP) jobs. It must be specified for each node at least once.
     * This parameter maps to `Memory` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *
     *
     * If you're trying to maximize your resource utilization by providing your jobs as much memory
     * as possible for a particular instance type, see [Memory
     * management](https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html) in the
     * *AWS Batch User Guide* .
     *
     *
     * For jobs that are running on Fargate resources, then `value` is the hard limit (in MiB), and
     * must match one of the supported values and the `VCPU` values must be one of the values supported
     * for that memory value.
     *
     * * **value = 512** - `VCPU` = 0.25
     * * **value = 1024** - `VCPU` = 0.25 or 0.5
     * * **value = 2048** - `VCPU` = 0.25, 0.5, or 1
     * * **value = 3072** - `VCPU` = 0.5, or 1
     * * **value = 4096** - `VCPU` = 0.5, 1, or 2
     * * **value = 5120, 6144, or 7168** - `VCPU` = 1 or 2
     * * **value = 8192** - `VCPU` = 1, 2, 4, or 8
     * * **value = 9216, 10240, 11264, 12288, 13312, 14336, or 15360** - `VCPU` = 2 or 4
     * * **value = 16384** - `VCPU` = 2, 4, or 8
     * * **value = 17408, 18432, 19456, 21504, 22528, 23552, 25600, 26624, 27648, 29696, or
     * 30720** - `VCPU` = 4
     * * **value = 20480, 24576, or 28672** - `VCPU` = 4 or 8
     * * **value = 36864, 45056, 53248, or 61440** - `VCPU` = 8
     * * **value = 32768, 40960, 49152, or 57344** - `VCPU` = 8 or 16
     * * **value = 65536, 73728, 81920, 90112, 98304, 106496, 114688, or 122880** - `VCPU` = 16
     * * **type="VCPU"** - The number of vCPUs reserved for the container. This parameter maps to
     * `CpuShares` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
     * `--cpu-shares` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Each vCPU is
     * equivalent to 1,024 CPU shares. For EC2 resources, you must specify at least one vCPU. This is
     * required but can be specified in several places; it must be specified for each node at least
     * once.
     *
     * The default for the Fargate On-Demand vCPU resource count quota is 6 vCPUs. For more
     * information about Fargate quotas, see [AWS Fargate
     * quotas](https://docs.aws.amazon.com/general/latest/gr/ecs-service.html#service-quotas-fargate)
     * in the *AWS General Reference* .
     *
     * For jobs that are running on Fargate resources, then `value` must match one of the supported
     * values and the `MEMORY` values must be one of the values supported for that `VCPU` value. The
     * supported values are 0.25, 0.5, 1, 2, 4, 8, and 16
     *
     * * **value = 0.25** - `MEMORY` = 512, 1024, or 2048
     * * **value = 0.5** - `MEMORY` = 1024, 2048, 3072, or 4096
     * * **value = 1** - `MEMORY` = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
     * * **value = 2** - `MEMORY` = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288, 13312,
     * 14336, 15360, or 16384
     * * **value = 4** - `MEMORY` = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384,
     * 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or
     * 30720
     * * **value = 8** - `MEMORY` = 16384, 20480, 24576, 28672, 32768, 36864, 40960, 45056, 49152,
     * 53248, 57344, or 61440
     * * **value = 16** - `MEMORY` = 32768, 40960, 49152, 57344, 65536, 73728, 81920, 90112, 98304,
     * 106496, 114688, or 122880
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchresourcerequirement.html#cfn-pipes-pipe-batchresourcerequirement-value)
     */
    public fun `value`(): String

    /**
     * A builder for [BatchResourceRequirementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of resource to assign to a container. 
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       */
      public fun type(type: String)

      /**
       * @param value The quantity of the specified resource to reserve for the container. The
       * values vary based on the `type` specified. 
       * * **type="GPU"** - The number of physical GPUs to reserve for the container. Make sure that
       * the number of GPUs reserved for all containers in a job doesn't exceed the number of available
       * GPUs on the compute resource that the job is launched on.
       *
       *
       * GPUs aren't available for jobs that are running on Fargate resources.
       *
       *
       * * **type="MEMORY"** - The memory hard limit (in MiB) present to the container. This
       * parameter is supported for jobs that are running on EC2 resources. If your container attempts
       * to exceed the memory specified, the container is terminated. This parameter maps to `Memory`
       * in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . You must
       * specify at least 4 MiB of memory for a job. This is required but can be specified in several
       * places for multi-node parallel (MNP) jobs. It must be specified for each node at least once.
       * This parameter maps to `Memory` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * If you're trying to maximize your resource utilization by providing your jobs as much
       * memory as possible for a particular instance type, see [Memory
       * management](https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html) in the
       * *AWS Batch User Guide* .
       *
       *
       * For jobs that are running on Fargate resources, then `value` is the hard limit (in MiB),
       * and must match one of the supported values and the `VCPU` values must be one of the values
       * supported for that memory value.
       *
       * * **value = 512** - `VCPU` = 0.25
       * * **value = 1024** - `VCPU` = 0.25 or 0.5
       * * **value = 2048** - `VCPU` = 0.25, 0.5, or 1
       * * **value = 3072** - `VCPU` = 0.5, or 1
       * * **value = 4096** - `VCPU` = 0.5, 1, or 2
       * * **value = 5120, 6144, or 7168** - `VCPU` = 1 or 2
       * * **value = 8192** - `VCPU` = 1, 2, 4, or 8
       * * **value = 9216, 10240, 11264, 12288, 13312, 14336, or 15360** - `VCPU` = 2 or 4
       * * **value = 16384** - `VCPU` = 2, 4, or 8
       * * **value = 17408, 18432, 19456, 21504, 22528, 23552, 25600, 26624, 27648, 29696, or
       * 30720** - `VCPU` = 4
       * * **value = 20480, 24576, or 28672** - `VCPU` = 4 or 8
       * * **value = 36864, 45056, 53248, or 61440** - `VCPU` = 8
       * * **value = 32768, 40960, 49152, or 57344** - `VCPU` = 8 or 16
       * * **value = 65536, 73728, 81920, 90112, 98304, 106496, 114688, or 122880** - `VCPU` = 16
       * * **type="VCPU"** - The number of vCPUs reserved for the container. This parameter maps to
       * `CpuShares` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--cpu-shares` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Each vCPU is
       * equivalent to 1,024 CPU shares. For EC2 resources, you must specify at least one vCPU. This is
       * required but can be specified in several places; it must be specified for each node at least
       * once.
       *
       * The default for the Fargate On-Demand vCPU resource count quota is 6 vCPUs. For more
       * information about Fargate quotas, see [AWS Fargate
       * quotas](https://docs.aws.amazon.com/general/latest/gr/ecs-service.html#service-quotas-fargate)
       * in the *AWS General Reference* .
       *
       * For jobs that are running on Fargate resources, then `value` must match one of the
       * supported values and the `MEMORY` values must be one of the values supported for that `VCPU`
       * value. The supported values are 0.25, 0.5, 1, 2, 4, 8, and 16
       *
       * * **value = 0.25** - `MEMORY` = 512, 1024, or 2048
       * * **value = 0.5** - `MEMORY` = 1024, 2048, 3072, or 4096
       * * **value = 1** - `MEMORY` = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
       * * **value = 2** - `MEMORY` = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288,
       * 13312, 14336, 15360, or 16384
       * * **value = 4** - `MEMORY` = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384,
       * 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or
       * 30720
       * * **value = 8** - `MEMORY` = 16384, 20480, 24576, 28672, 32768, 36864, 40960, 45056, 49152,
       * 53248, 57344, or 61440
       * * **value = 16** - `MEMORY` = 32768, 40960, 49152, 57344, 65536, 73728, 81920, 90112,
       * 98304, 106496, 114688, or 122880
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty.builder()

      /**
       * @param type The type of resource to assign to a container. 
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The quantity of the specified resource to reserve for the container. The
       * values vary based on the `type` specified. 
       * * **type="GPU"** - The number of physical GPUs to reserve for the container. Make sure that
       * the number of GPUs reserved for all containers in a job doesn't exceed the number of available
       * GPUs on the compute resource that the job is launched on.
       *
       *
       * GPUs aren't available for jobs that are running on Fargate resources.
       *
       *
       * * **type="MEMORY"** - The memory hard limit (in MiB) present to the container. This
       * parameter is supported for jobs that are running on EC2 resources. If your container attempts
       * to exceed the memory specified, the container is terminated. This parameter maps to `Memory`
       * in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . You must
       * specify at least 4 MiB of memory for a job. This is required but can be specified in several
       * places for multi-node parallel (MNP) jobs. It must be specified for each node at least once.
       * This parameter maps to `Memory` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * If you're trying to maximize your resource utilization by providing your jobs as much
       * memory as possible for a particular instance type, see [Memory
       * management](https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html) in the
       * *AWS Batch User Guide* .
       *
       *
       * For jobs that are running on Fargate resources, then `value` is the hard limit (in MiB),
       * and must match one of the supported values and the `VCPU` values must be one of the values
       * supported for that memory value.
       *
       * * **value = 512** - `VCPU` = 0.25
       * * **value = 1024** - `VCPU` = 0.25 or 0.5
       * * **value = 2048** - `VCPU` = 0.25, 0.5, or 1
       * * **value = 3072** - `VCPU` = 0.5, or 1
       * * **value = 4096** - `VCPU` = 0.5, 1, or 2
       * * **value = 5120, 6144, or 7168** - `VCPU` = 1 or 2
       * * **value = 8192** - `VCPU` = 1, 2, 4, or 8
       * * **value = 9216, 10240, 11264, 12288, 13312, 14336, or 15360** - `VCPU` = 2 or 4
       * * **value = 16384** - `VCPU` = 2, 4, or 8
       * * **value = 17408, 18432, 19456, 21504, 22528, 23552, 25600, 26624, 27648, 29696, or
       * 30720** - `VCPU` = 4
       * * **value = 20480, 24576, or 28672** - `VCPU` = 4 or 8
       * * **value = 36864, 45056, 53248, or 61440** - `VCPU` = 8
       * * **value = 32768, 40960, 49152, or 57344** - `VCPU` = 8 or 16
       * * **value = 65536, 73728, 81920, 90112, 98304, 106496, 114688, or 122880** - `VCPU` = 16
       * * **type="VCPU"** - The number of vCPUs reserved for the container. This parameter maps to
       * `CpuShares` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--cpu-shares` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Each vCPU is
       * equivalent to 1,024 CPU shares. For EC2 resources, you must specify at least one vCPU. This is
       * required but can be specified in several places; it must be specified for each node at least
       * once.
       *
       * The default for the Fargate On-Demand vCPU resource count quota is 6 vCPUs. For more
       * information about Fargate quotas, see [AWS Fargate
       * quotas](https://docs.aws.amazon.com/general/latest/gr/ecs-service.html#service-quotas-fargate)
       * in the *AWS General Reference* .
       *
       * For jobs that are running on Fargate resources, then `value` must match one of the
       * supported values and the `MEMORY` values must be one of the values supported for that `VCPU`
       * value. The supported values are 0.25, 0.5, 1, 2, 4, 8, and 16
       *
       * * **value = 0.25** - `MEMORY` = 512, 1024, or 2048
       * * **value = 0.5** - `MEMORY` = 1024, 2048, 3072, or 4096
       * * **value = 1** - `MEMORY` = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
       * * **value = 2** - `MEMORY` = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288,
       * 13312, 14336, 15360, or 16384
       * * **value = 4** - `MEMORY` = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384,
       * 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or
       * 30720
       * * **value = 8** - `MEMORY` = 16384, 20480, 24576, 28672, 32768, 36864, 40960, 45056, 49152,
       * 53248, 57344, or 61440
       * * **value = 16** - `MEMORY` = 32768, 40960, 49152, 57344, 65536, 73728, 81920, 90112,
       * 98304, 106496, 114688, or 122880
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty,
    ) : CdkObject(cdkObject), BatchResourceRequirementProperty {
      /**
       * The type of resource to assign to a container.
       *
       * The supported resources include `GPU` , `MEMORY` , and `VCPU` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchresourcerequirement.html#cfn-pipes-pipe-batchresourcerequirement-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The quantity of the specified resource to reserve for the container. The values vary based
       * on the `type` specified.
       *
       * * **type="GPU"** - The number of physical GPUs to reserve for the container. Make sure that
       * the number of GPUs reserved for all containers in a job doesn't exceed the number of available
       * GPUs on the compute resource that the job is launched on.
       *
       *
       * GPUs aren't available for jobs that are running on Fargate resources.
       *
       *
       * * **type="MEMORY"** - The memory hard limit (in MiB) present to the container. This
       * parameter is supported for jobs that are running on EC2 resources. If your container attempts
       * to exceed the memory specified, the container is terminated. This parameter maps to `Memory`
       * in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . You must
       * specify at least 4 MiB of memory for a job. This is required but can be specified in several
       * places for multi-node parallel (MNP) jobs. It must be specified for each node at least once.
       * This parameter maps to `Memory` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
       *
       *
       * If you're trying to maximize your resource utilization by providing your jobs as much
       * memory as possible for a particular instance type, see [Memory
       * management](https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html) in the
       * *AWS Batch User Guide* .
       *
       *
       * For jobs that are running on Fargate resources, then `value` is the hard limit (in MiB),
       * and must match one of the supported values and the `VCPU` values must be one of the values
       * supported for that memory value.
       *
       * * **value = 512** - `VCPU` = 0.25
       * * **value = 1024** - `VCPU` = 0.25 or 0.5
       * * **value = 2048** - `VCPU` = 0.25, 0.5, or 1
       * * **value = 3072** - `VCPU` = 0.5, or 1
       * * **value = 4096** - `VCPU` = 0.5, 1, or 2
       * * **value = 5120, 6144, or 7168** - `VCPU` = 1 or 2
       * * **value = 8192** - `VCPU` = 1, 2, 4, or 8
       * * **value = 9216, 10240, 11264, 12288, 13312, 14336, or 15360** - `VCPU` = 2 or 4
       * * **value = 16384** - `VCPU` = 2, 4, or 8
       * * **value = 17408, 18432, 19456, 21504, 22528, 23552, 25600, 26624, 27648, 29696, or
       * 30720** - `VCPU` = 4
       * * **value = 20480, 24576, or 28672** - `VCPU` = 4 or 8
       * * **value = 36864, 45056, 53248, or 61440** - `VCPU` = 8
       * * **value = 32768, 40960, 49152, or 57344** - `VCPU` = 8 or 16
       * * **value = 65536, 73728, 81920, 90112, 98304, 106496, 114688, or 122880** - `VCPU` = 16
       * * **type="VCPU"** - The number of vCPUs reserved for the container. This parameter maps to
       * `CpuShares` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/#create-a-container)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.23/) and the
       * `--cpu-shares` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Each vCPU is
       * equivalent to 1,024 CPU shares. For EC2 resources, you must specify at least one vCPU. This is
       * required but can be specified in several places; it must be specified for each node at least
       * once.
       *
       * The default for the Fargate On-Demand vCPU resource count quota is 6 vCPUs. For more
       * information about Fargate quotas, see [AWS Fargate
       * quotas](https://docs.aws.amazon.com/general/latest/gr/ecs-service.html#service-quotas-fargate)
       * in the *AWS General Reference* .
       *
       * For jobs that are running on Fargate resources, then `value` must match one of the
       * supported values and the `MEMORY` values must be one of the values supported for that `VCPU`
       * value. The supported values are 0.25, 0.5, 1, 2, 4, 8, and 16
       *
       * * **value = 0.25** - `MEMORY` = 512, 1024, or 2048
       * * **value = 0.5** - `MEMORY` = 1024, 2048, 3072, or 4096
       * * **value = 1** - `MEMORY` = 2048, 3072, 4096, 5120, 6144, 7168, or 8192
       * * **value = 2** - `MEMORY` = 4096, 5120, 6144, 7168, 8192, 9216, 10240, 11264, 12288,
       * 13312, 14336, 15360, or 16384
       * * **value = 4** - `MEMORY` = 8192, 9216, 10240, 11264, 12288, 13312, 14336, 15360, 16384,
       * 17408, 18432, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, or
       * 30720
       * * **value = 8** - `MEMORY` = 16384, 20480, 24576, 28672, 32768, 36864, 40960, 45056, 49152,
       * 53248, 57344, or 61440
       * * **value = 16** - `MEMORY` = 32768, 40960, 49152, 57344, 65536, 73728, 81920, 90112,
       * 98304, 106496, 114688, or 122880
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchresourcerequirement.html#cfn-pipes-pipe-batchresourcerequirement-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchResourceRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty):
          BatchResourceRequirementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchResourceRequirementProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty
    }
  }

  public interface PipeSourceParametersProperty {
    /**
     * The parameters for using an Active MQ broker as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-activemqbrokerparameters)
     */
    public fun activeMqBrokerParameters(): Any? = unwrap(this).getActiveMqBrokerParameters()

    /**
     * The parameters for using a DynamoDB stream as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-dynamodbstreamparameters)
     */
    public fun dynamoDbStreamParameters(): Any? = unwrap(this).getDynamoDbStreamParameters()

    /**
     * The collection of event patterns used to filter events.
     *
     * To remove a filter, specify a `FilterCriteria` object with an empty array of `Filter`
     * objects.
     *
     * For more information, see [Events and Event
     * Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-filtercriteria)
     */
    public fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

    /**
     * The parameters for using a Kinesis stream as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-kinesisstreamparameters)
     */
    public fun kinesisStreamParameters(): Any? = unwrap(this).getKinesisStreamParameters()

    /**
     * The parameters for using an MSK stream as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-managedstreamingkafkaparameters)
     */
    public fun managedStreamingKafkaParameters(): Any? =
        unwrap(this).getManagedStreamingKafkaParameters()

    /**
     * The parameters for using a Rabbit MQ broker as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-rabbitmqbrokerparameters)
     */
    public fun rabbitMqBrokerParameters(): Any? = unwrap(this).getRabbitMqBrokerParameters()

    /**
     * The parameters for using a stream as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-selfmanagedkafkaparameters)
     */
    public fun selfManagedKafkaParameters(): Any? = unwrap(this).getSelfManagedKafkaParameters()

    /**
     * The parameters for using a Amazon SQS stream as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-sqsqueueparameters)
     */
    public fun sqsQueueParameters(): Any? = unwrap(this).getSqsQueueParameters()

    /**
     * A builder for [PipeSourceParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param activeMqBrokerParameters The parameters for using an Active MQ broker as a source.
       */
      public fun activeMqBrokerParameters(activeMqBrokerParameters: IResolvable)

      /**
       * @param activeMqBrokerParameters The parameters for using an Active MQ broker as a source.
       */
      public
          fun activeMqBrokerParameters(activeMqBrokerParameters: PipeSourceActiveMQBrokerParametersProperty)

      /**
       * @param activeMqBrokerParameters The parameters for using an Active MQ broker as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8287546ecb6620e76ceb93abb8a4ea23122e522c333d115ea3bbffc26c64d85")
      public
          fun activeMqBrokerParameters(activeMqBrokerParameters: PipeSourceActiveMQBrokerParametersProperty.Builder.() -> Unit)

      /**
       * @param dynamoDbStreamParameters The parameters for using a DynamoDB stream as a source.
       */
      public fun dynamoDbStreamParameters(dynamoDbStreamParameters: IResolvable)

      /**
       * @param dynamoDbStreamParameters The parameters for using a DynamoDB stream as a source.
       */
      public
          fun dynamoDbStreamParameters(dynamoDbStreamParameters: PipeSourceDynamoDBStreamParametersProperty)

      /**
       * @param dynamoDbStreamParameters The parameters for using a DynamoDB stream as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97099f3124232ec6d7f1787f80bd6720daf9805f529c6b1339e187c01206f326")
      public
          fun dynamoDbStreamParameters(dynamoDbStreamParameters: PipeSourceDynamoDBStreamParametersProperty.Builder.() -> Unit)

      /**
       * @param filterCriteria The collection of event patterns used to filter events.
       * To remove a filter, specify a `FilterCriteria` object with an empty array of `Filter`
       * objects.
       *
       * For more information, see [Events and Event
       * Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
       * in the *Amazon EventBridge User Guide* .
       */
      public fun filterCriteria(filterCriteria: IResolvable)

      /**
       * @param filterCriteria The collection of event patterns used to filter events.
       * To remove a filter, specify a `FilterCriteria` object with an empty array of `Filter`
       * objects.
       *
       * For more information, see [Events and Event
       * Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
       * in the *Amazon EventBridge User Guide* .
       */
      public fun filterCriteria(filterCriteria: FilterCriteriaProperty)

      /**
       * @param filterCriteria The collection of event patterns used to filter events.
       * To remove a filter, specify a `FilterCriteria` object with an empty array of `Filter`
       * objects.
       *
       * For more information, see [Events and Event
       * Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
       * in the *Amazon EventBridge User Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("088445f312dece32ace69952411dd034cb1bf64c579ebde89c4d02363c742852")
      public fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit)

      /**
       * @param kinesisStreamParameters The parameters for using a Kinesis stream as a source.
       */
      public fun kinesisStreamParameters(kinesisStreamParameters: IResolvable)

      /**
       * @param kinesisStreamParameters The parameters for using a Kinesis stream as a source.
       */
      public
          fun kinesisStreamParameters(kinesisStreamParameters: PipeSourceKinesisStreamParametersProperty)

      /**
       * @param kinesisStreamParameters The parameters for using a Kinesis stream as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfd4620d80d86ac5b93462071d780d967286984fada2a1d258c3e2fe91399bd9")
      public
          fun kinesisStreamParameters(kinesisStreamParameters: PipeSourceKinesisStreamParametersProperty.Builder.() -> Unit)

      /**
       * @param managedStreamingKafkaParameters The parameters for using an MSK stream as a source.
       */
      public fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: IResolvable)

      /**
       * @param managedStreamingKafkaParameters The parameters for using an MSK stream as a source.
       */
      public
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: PipeSourceManagedStreamingKafkaParametersProperty)

      /**
       * @param managedStreamingKafkaParameters The parameters for using an MSK stream as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d039ae200df9f5fc50d6fe42b14ed33f45dc091ba4903b72758bd3789964dfe")
      public
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: PipeSourceManagedStreamingKafkaParametersProperty.Builder.() -> Unit)

      /**
       * @param rabbitMqBrokerParameters The parameters for using a Rabbit MQ broker as a source.
       */
      public fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: IResolvable)

      /**
       * @param rabbitMqBrokerParameters The parameters for using a Rabbit MQ broker as a source.
       */
      public
          fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: PipeSourceRabbitMQBrokerParametersProperty)

      /**
       * @param rabbitMqBrokerParameters The parameters for using a Rabbit MQ broker as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59665e351317af0417d24881a7683600b5ea7d08d8efaaf705e55ef7e8d62139")
      public
          fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: PipeSourceRabbitMQBrokerParametersProperty.Builder.() -> Unit)

      /**
       * @param selfManagedKafkaParameters The parameters for using a stream as a source.
       */
      public fun selfManagedKafkaParameters(selfManagedKafkaParameters: IResolvable)

      /**
       * @param selfManagedKafkaParameters The parameters for using a stream as a source.
       */
      public
          fun selfManagedKafkaParameters(selfManagedKafkaParameters: PipeSourceSelfManagedKafkaParametersProperty)

      /**
       * @param selfManagedKafkaParameters The parameters for using a stream as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc7c2eb898cf64ad061c5d11e2ae61bf1e56548d691fa7599e2d78c81aa8bdf6")
      public
          fun selfManagedKafkaParameters(selfManagedKafkaParameters: PipeSourceSelfManagedKafkaParametersProperty.Builder.() -> Unit)

      /**
       * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a source.
       */
      public fun sqsQueueParameters(sqsQueueParameters: IResolvable)

      /**
       * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a source.
       */
      public fun sqsQueueParameters(sqsQueueParameters: PipeSourceSqsQueueParametersProperty)

      /**
       * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("362cd4d1875965ad5a3b782fb1bc7e3cece0fefbac02273cb81d124996eb25e5")
      public
          fun sqsQueueParameters(sqsQueueParameters: PipeSourceSqsQueueParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty.builder()

      /**
       * @param activeMqBrokerParameters The parameters for using an Active MQ broker as a source.
       */
      override fun activeMqBrokerParameters(activeMqBrokerParameters: IResolvable) {
        cdkBuilder.activeMqBrokerParameters(activeMqBrokerParameters.let(IResolvable::unwrap))
      }

      /**
       * @param activeMqBrokerParameters The parameters for using an Active MQ broker as a source.
       */
      override
          fun activeMqBrokerParameters(activeMqBrokerParameters: PipeSourceActiveMQBrokerParametersProperty) {
        cdkBuilder.activeMqBrokerParameters(activeMqBrokerParameters.let(PipeSourceActiveMQBrokerParametersProperty::unwrap))
      }

      /**
       * @param activeMqBrokerParameters The parameters for using an Active MQ broker as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8287546ecb6620e76ceb93abb8a4ea23122e522c333d115ea3bbffc26c64d85")
      override
          fun activeMqBrokerParameters(activeMqBrokerParameters: PipeSourceActiveMQBrokerParametersProperty.Builder.() -> Unit):
          Unit =
          activeMqBrokerParameters(PipeSourceActiveMQBrokerParametersProperty(activeMqBrokerParameters))

      /**
       * @param dynamoDbStreamParameters The parameters for using a DynamoDB stream as a source.
       */
      override fun dynamoDbStreamParameters(dynamoDbStreamParameters: IResolvable) {
        cdkBuilder.dynamoDbStreamParameters(dynamoDbStreamParameters.let(IResolvable::unwrap))
      }

      /**
       * @param dynamoDbStreamParameters The parameters for using a DynamoDB stream as a source.
       */
      override
          fun dynamoDbStreamParameters(dynamoDbStreamParameters: PipeSourceDynamoDBStreamParametersProperty) {
        cdkBuilder.dynamoDbStreamParameters(dynamoDbStreamParameters.let(PipeSourceDynamoDBStreamParametersProperty::unwrap))
      }

      /**
       * @param dynamoDbStreamParameters The parameters for using a DynamoDB stream as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97099f3124232ec6d7f1787f80bd6720daf9805f529c6b1339e187c01206f326")
      override
          fun dynamoDbStreamParameters(dynamoDbStreamParameters: PipeSourceDynamoDBStreamParametersProperty.Builder.() -> Unit):
          Unit =
          dynamoDbStreamParameters(PipeSourceDynamoDBStreamParametersProperty(dynamoDbStreamParameters))

      /**
       * @param filterCriteria The collection of event patterns used to filter events.
       * To remove a filter, specify a `FilterCriteria` object with an empty array of `Filter`
       * objects.
       *
       * For more information, see [Events and Event
       * Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
       * in the *Amazon EventBridge User Guide* .
       */
      override fun filterCriteria(filterCriteria: IResolvable) {
        cdkBuilder.filterCriteria(filterCriteria.let(IResolvable::unwrap))
      }

      /**
       * @param filterCriteria The collection of event patterns used to filter events.
       * To remove a filter, specify a `FilterCriteria` object with an empty array of `Filter`
       * objects.
       *
       * For more information, see [Events and Event
       * Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
       * in the *Amazon EventBridge User Guide* .
       */
      override fun filterCriteria(filterCriteria: FilterCriteriaProperty) {
        cdkBuilder.filterCriteria(filterCriteria.let(FilterCriteriaProperty::unwrap))
      }

      /**
       * @param filterCriteria The collection of event patterns used to filter events.
       * To remove a filter, specify a `FilterCriteria` object with an empty array of `Filter`
       * objects.
       *
       * For more information, see [Events and Event
       * Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
       * in the *Amazon EventBridge User Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("088445f312dece32ace69952411dd034cb1bf64c579ebde89c4d02363c742852")
      override fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit): Unit =
          filterCriteria(FilterCriteriaProperty(filterCriteria))

      /**
       * @param kinesisStreamParameters The parameters for using a Kinesis stream as a source.
       */
      override fun kinesisStreamParameters(kinesisStreamParameters: IResolvable) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisStreamParameters The parameters for using a Kinesis stream as a source.
       */
      override
          fun kinesisStreamParameters(kinesisStreamParameters: PipeSourceKinesisStreamParametersProperty) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters.let(PipeSourceKinesisStreamParametersProperty::unwrap))
      }

      /**
       * @param kinesisStreamParameters The parameters for using a Kinesis stream as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfd4620d80d86ac5b93462071d780d967286984fada2a1d258c3e2fe91399bd9")
      override
          fun kinesisStreamParameters(kinesisStreamParameters: PipeSourceKinesisStreamParametersProperty.Builder.() -> Unit):
          Unit =
          kinesisStreamParameters(PipeSourceKinesisStreamParametersProperty(kinesisStreamParameters))

      /**
       * @param managedStreamingKafkaParameters The parameters for using an MSK stream as a source.
       */
      override fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: IResolvable) {
        cdkBuilder.managedStreamingKafkaParameters(managedStreamingKafkaParameters.let(IResolvable::unwrap))
      }

      /**
       * @param managedStreamingKafkaParameters The parameters for using an MSK stream as a source.
       */
      override
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: PipeSourceManagedStreamingKafkaParametersProperty) {
        cdkBuilder.managedStreamingKafkaParameters(managedStreamingKafkaParameters.let(PipeSourceManagedStreamingKafkaParametersProperty::unwrap))
      }

      /**
       * @param managedStreamingKafkaParameters The parameters for using an MSK stream as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d039ae200df9f5fc50d6fe42b14ed33f45dc091ba4903b72758bd3789964dfe")
      override
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: PipeSourceManagedStreamingKafkaParametersProperty.Builder.() -> Unit):
          Unit =
          managedStreamingKafkaParameters(PipeSourceManagedStreamingKafkaParametersProperty(managedStreamingKafkaParameters))

      /**
       * @param rabbitMqBrokerParameters The parameters for using a Rabbit MQ broker as a source.
       */
      override fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: IResolvable) {
        cdkBuilder.rabbitMqBrokerParameters(rabbitMqBrokerParameters.let(IResolvable::unwrap))
      }

      /**
       * @param rabbitMqBrokerParameters The parameters for using a Rabbit MQ broker as a source.
       */
      override
          fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: PipeSourceRabbitMQBrokerParametersProperty) {
        cdkBuilder.rabbitMqBrokerParameters(rabbitMqBrokerParameters.let(PipeSourceRabbitMQBrokerParametersProperty::unwrap))
      }

      /**
       * @param rabbitMqBrokerParameters The parameters for using a Rabbit MQ broker as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59665e351317af0417d24881a7683600b5ea7d08d8efaaf705e55ef7e8d62139")
      override
          fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: PipeSourceRabbitMQBrokerParametersProperty.Builder.() -> Unit):
          Unit =
          rabbitMqBrokerParameters(PipeSourceRabbitMQBrokerParametersProperty(rabbitMqBrokerParameters))

      /**
       * @param selfManagedKafkaParameters The parameters for using a stream as a source.
       */
      override fun selfManagedKafkaParameters(selfManagedKafkaParameters: IResolvable) {
        cdkBuilder.selfManagedKafkaParameters(selfManagedKafkaParameters.let(IResolvable::unwrap))
      }

      /**
       * @param selfManagedKafkaParameters The parameters for using a stream as a source.
       */
      override
          fun selfManagedKafkaParameters(selfManagedKafkaParameters: PipeSourceSelfManagedKafkaParametersProperty) {
        cdkBuilder.selfManagedKafkaParameters(selfManagedKafkaParameters.let(PipeSourceSelfManagedKafkaParametersProperty::unwrap))
      }

      /**
       * @param selfManagedKafkaParameters The parameters for using a stream as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc7c2eb898cf64ad061c5d11e2ae61bf1e56548d691fa7599e2d78c81aa8bdf6")
      override
          fun selfManagedKafkaParameters(selfManagedKafkaParameters: PipeSourceSelfManagedKafkaParametersProperty.Builder.() -> Unit):
          Unit =
          selfManagedKafkaParameters(PipeSourceSelfManagedKafkaParametersProperty(selfManagedKafkaParameters))

      /**
       * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a source.
       */
      override fun sqsQueueParameters(sqsQueueParameters: IResolvable) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters.let(IResolvable::unwrap))
      }

      /**
       * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a source.
       */
      override fun sqsQueueParameters(sqsQueueParameters: PipeSourceSqsQueueParametersProperty) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters.let(PipeSourceSqsQueueParametersProperty::unwrap))
      }

      /**
       * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("362cd4d1875965ad5a3b782fb1bc7e3cece0fefbac02273cb81d124996eb25e5")
      override
          fun sqsQueueParameters(sqsQueueParameters: PipeSourceSqsQueueParametersProperty.Builder.() -> Unit):
          Unit = sqsQueueParameters(PipeSourceSqsQueueParametersProperty(sqsQueueParameters))

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceParametersProperty {
      /**
       * The parameters for using an Active MQ broker as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-activemqbrokerparameters)
       */
      override fun activeMqBrokerParameters(): Any? = unwrap(this).getActiveMqBrokerParameters()

      /**
       * The parameters for using a DynamoDB stream as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-dynamodbstreamparameters)
       */
      override fun dynamoDbStreamParameters(): Any? = unwrap(this).getDynamoDbStreamParameters()

      /**
       * The collection of event patterns used to filter events.
       *
       * To remove a filter, specify a `FilterCriteria` object with an empty array of `Filter`
       * objects.
       *
       * For more information, see [Events and Event
       * Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
       * in the *Amazon EventBridge User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-filtercriteria)
       */
      override fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

      /**
       * The parameters for using a Kinesis stream as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-kinesisstreamparameters)
       */
      override fun kinesisStreamParameters(): Any? = unwrap(this).getKinesisStreamParameters()

      /**
       * The parameters for using an MSK stream as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-managedstreamingkafkaparameters)
       */
      override fun managedStreamingKafkaParameters(): Any? =
          unwrap(this).getManagedStreamingKafkaParameters()

      /**
       * The parameters for using a Rabbit MQ broker as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-rabbitmqbrokerparameters)
       */
      override fun rabbitMqBrokerParameters(): Any? = unwrap(this).getRabbitMqBrokerParameters()

      /**
       * The parameters for using a stream as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-selfmanagedkafkaparameters)
       */
      override fun selfManagedKafkaParameters(): Any? = unwrap(this).getSelfManagedKafkaParameters()

      /**
       * The parameters for using a Amazon SQS stream as a source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceparameters.html#cfn-pipes-pipe-pipesourceparameters-sqsqueueparameters)
       */
      override fun sqsQueueParameters(): Any? = unwrap(this).getSqsQueueParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipeSourceParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty):
          PipeSourceParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty
    }
  }

  public interface SageMakerPipelineParameterProperty {
    /**
     * Name of parameter to start execution of a SageMaker Model Building Pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-sagemakerpipelineparameter.html#cfn-pipes-pipe-sagemakerpipelineparameter-name)
     */
    public fun name(): String

    /**
     * Value of parameter to start execution of a SageMaker Model Building Pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-sagemakerpipelineparameter.html#cfn-pipes-pipe-sagemakerpipelineparameter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [SageMakerPipelineParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name Name of parameter to start execution of a SageMaker Model Building Pipeline. 
       */
      public fun name(name: String)

      /**
       * @param value Value of parameter to start execution of a SageMaker Model Building Pipeline. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty.builder()

      /**
       * @param name Name of parameter to start execution of a SageMaker Model Building Pipeline. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value Value of parameter to start execution of a SageMaker Model Building Pipeline. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty,
    ) : CdkObject(cdkObject), SageMakerPipelineParameterProperty {
      /**
       * Name of parameter to start execution of a SageMaker Model Building Pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-sagemakerpipelineparameter.html#cfn-pipes-pipe-sagemakerpipelineparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Value of parameter to start execution of a SageMaker Model Building Pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-sagemakerpipelineparameter.html#cfn-pipes-pipe-sagemakerpipelineparameter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SageMakerPipelineParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty):
          SageMakerPipelineParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerPipelineParameterProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty
    }
  }

  public interface SelfManagedKafkaAccessConfigurationVpcProperty {
    /**
     * Specifies the security groups associated with the stream.
     *
     * These security groups must all be in the same VPC. You can specify as many as five security
     * groups. If you do not specify a security group, the default security group for the VPC is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationvpc.html#cfn-pipes-pipe-selfmanagedkafkaaccessconfigurationvpc-securitygroup)
     */
    public fun securityGroup(): List<String> = unwrap(this).getSecurityGroup() ?: emptyList()

    /**
     * Specifies the subnets associated with the stream.
     *
     * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationvpc.html#cfn-pipes-pipe-selfmanagedkafkaaccessconfigurationvpc-subnets)
     */
    public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    /**
     * A builder for [SelfManagedKafkaAccessConfigurationVpcProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroup Specifies the security groups associated with the stream.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      public fun securityGroup(securityGroup: List<String>)

      /**
       * @param securityGroup Specifies the security groups associated with the stream.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      public fun securityGroup(vararg securityGroup: String)

      /**
       * @param subnets Specifies the subnets associated with the stream.
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets Specifies the subnets associated with the stream.
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty.builder()

      /**
       * @param securityGroup Specifies the security groups associated with the stream.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      override fun securityGroup(securityGroup: List<String>) {
        cdkBuilder.securityGroup(securityGroup)
      }

      /**
       * @param securityGroup Specifies the security groups associated with the stream.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      override fun securityGroup(vararg securityGroup: String): Unit =
          securityGroup(securityGroup.toList())

      /**
       * @param subnets Specifies the subnets associated with the stream.
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets Specifies the subnets associated with the stream.
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty,
    ) : CdkObject(cdkObject), SelfManagedKafkaAccessConfigurationVpcProperty {
      /**
       * Specifies the security groups associated with the stream.
       *
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationvpc.html#cfn-pipes-pipe-selfmanagedkafkaaccessconfigurationvpc-securitygroup)
       */
      override fun securityGroup(): List<String> = unwrap(this).getSecurityGroup() ?: emptyList()

      /**
       * Specifies the subnets associated with the stream.
       *
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationvpc.html#cfn-pipes-pipe-selfmanagedkafkaaccessconfigurationvpc-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SelfManagedKafkaAccessConfigurationVpcProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty):
          SelfManagedKafkaAccessConfigurationVpcProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedKafkaAccessConfigurationVpcProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty
    }
  }

  public interface PipeTargetBatchJobParametersProperty {
    /**
     * The array properties for the submitted job, such as the size of the array.
     *
     * The array size can be between 2 and 10,000. If you specify array properties for a job, it
     * becomes an array job. This parameter is used only if the target is an AWS Batch job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-arrayproperties)
     */
    public fun arrayProperties(): Any? = unwrap(this).getArrayProperties()

    /**
     * The overrides that are sent to a container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-containeroverrides)
     */
    public fun containerOverrides(): Any? = unwrap(this).getContainerOverrides()

    /**
     * A list of dependencies for the job.
     *
     * A job can depend upon a maximum of 20 jobs. You can specify a `SEQUENTIAL` type dependency
     * without specifying a job ID for array jobs so that each child array job completes sequentially,
     * starting at index 0. You can also specify an `N_TO_N` type dependency with a job ID for array
     * jobs. In that case, each index child of this job must wait for the corresponding index child of
     * each dependency to complete before it can begin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-dependson)
     */
    public fun dependsOn(): Any? = unwrap(this).getDependsOn()

    /**
     * The job definition used by this job.
     *
     * This value can be one of `name` , `name:revision` , or the Amazon Resource Name (ARN) for the
     * job definition. If name is specified without a revision then the latest active revision is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-jobdefinition)
     */
    public fun jobDefinition(): String

    /**
     * The name of the job.
     *
     * It can be up to 128 letters long. The first character must be alphanumeric, can contain
     * uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-jobname)
     */
    public fun jobName(): String

    /**
     * Additional parameters passed to the job that replace parameter substitution placeholders that
     * are set in the job definition.
     *
     * Parameters are specified as a key and value pair mapping. Parameters included here override
     * any corresponding parameter defaults from the job definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The retry strategy to use for failed jobs.
     *
     * When a retry strategy is specified here, it overrides the retry strategy defined in the job
     * definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-retrystrategy)
     */
    public fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()

    /**
     * A builder for [PipeTargetBatchJobParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arrayProperties The array properties for the submitted job, such as the size of the
       * array.
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       */
      public fun arrayProperties(arrayProperties: IResolvable)

      /**
       * @param arrayProperties The array properties for the submitted job, such as the size of the
       * array.
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       */
      public fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty)

      /**
       * @param arrayProperties The array properties for the submitted job, such as the size of the
       * array.
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee017bbeaa5a9ef21edffcbce56ca39aa77f6306f049c4bb9842786a7480d718")
      public fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty.Builder.() -> Unit)

      /**
       * @param containerOverrides The overrides that are sent to a container.
       */
      public fun containerOverrides(containerOverrides: IResolvable)

      /**
       * @param containerOverrides The overrides that are sent to a container.
       */
      public fun containerOverrides(containerOverrides: BatchContainerOverridesProperty)

      /**
       * @param containerOverrides The overrides that are sent to a container.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33706522c31b6d00099ad806ab4ea4c3a0b2372b2b46f3f1782c1b59d78492d9")
      public
          fun containerOverrides(containerOverrides: BatchContainerOverridesProperty.Builder.() -> Unit)

      /**
       * @param dependsOn A list of dependencies for the job.
       * A job can depend upon a maximum of 20 jobs. You can specify a `SEQUENTIAL` type dependency
       * without specifying a job ID for array jobs so that each child array job completes
       * sequentially, starting at index 0. You can also specify an `N_TO_N` type dependency with a job
       * ID for array jobs. In that case, each index child of this job must wait for the corresponding
       * index child of each dependency to complete before it can begin.
       */
      public fun dependsOn(dependsOn: IResolvable)

      /**
       * @param dependsOn A list of dependencies for the job.
       * A job can depend upon a maximum of 20 jobs. You can specify a `SEQUENTIAL` type dependency
       * without specifying a job ID for array jobs so that each child array job completes
       * sequentially, starting at index 0. You can also specify an `N_TO_N` type dependency with a job
       * ID for array jobs. In that case, each index child of this job must wait for the corresponding
       * index child of each dependency to complete before it can begin.
       */
      public fun dependsOn(dependsOn: List<Any>)

      /**
       * @param dependsOn A list of dependencies for the job.
       * A job can depend upon a maximum of 20 jobs. You can specify a `SEQUENTIAL` type dependency
       * without specifying a job ID for array jobs so that each child array job completes
       * sequentially, starting at index 0. You can also specify an `N_TO_N` type dependency with a job
       * ID for array jobs. In that case, each index child of this job must wait for the corresponding
       * index child of each dependency to complete before it can begin.
       */
      public fun dependsOn(vararg dependsOn: Any)

      /**
       * @param jobDefinition The job definition used by this job. 
       * This value can be one of `name` , `name:revision` , or the Amazon Resource Name (ARN) for
       * the job definition. If name is specified without a revision then the latest active revision is
       * used.
       */
      public fun jobDefinition(jobDefinition: String)

      /**
       * @param jobName The name of the job. 
       * It can be up to 128 letters long. The first character must be alphanumeric, can contain
       * uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
       */
      public fun jobName(jobName: String)

      /**
       * @param parameters Additional parameters passed to the job that replace parameter
       * substitution placeholders that are set in the job definition.
       * Parameters are specified as a key and value pair mapping. Parameters included here override
       * any corresponding parameter defaults from the job definition.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters Additional parameters passed to the job that replace parameter
       * substitution placeholders that are set in the job definition.
       * Parameters are specified as a key and value pair mapping. Parameters included here override
       * any corresponding parameter defaults from the job definition.
       */
      public fun parameters(parameters: Map<String, String>)

      /**
       * @param retryStrategy The retry strategy to use for failed jobs.
       * When a retry strategy is specified here, it overrides the retry strategy defined in the job
       * definition.
       */
      public fun retryStrategy(retryStrategy: IResolvable)

      /**
       * @param retryStrategy The retry strategy to use for failed jobs.
       * When a retry strategy is specified here, it overrides the retry strategy defined in the job
       * definition.
       */
      public fun retryStrategy(retryStrategy: BatchRetryStrategyProperty)

      /**
       * @param retryStrategy The retry strategy to use for failed jobs.
       * When a retry strategy is specified here, it overrides the retry strategy defined in the job
       * definition.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98fc3a4d7335ae32d18386b6d01abb467445b94a9dfa4182e352180dde8135b")
      public fun retryStrategy(retryStrategy: BatchRetryStrategyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty.builder()

      /**
       * @param arrayProperties The array properties for the submitted job, such as the size of the
       * array.
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       */
      override fun arrayProperties(arrayProperties: IResolvable) {
        cdkBuilder.arrayProperties(arrayProperties.let(IResolvable::unwrap))
      }

      /**
       * @param arrayProperties The array properties for the submitted job, such as the size of the
       * array.
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       */
      override fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty) {
        cdkBuilder.arrayProperties(arrayProperties.let(BatchArrayPropertiesProperty::unwrap))
      }

      /**
       * @param arrayProperties The array properties for the submitted job, such as the size of the
       * array.
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee017bbeaa5a9ef21edffcbce56ca39aa77f6306f049c4bb9842786a7480d718")
      override
          fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty.Builder.() -> Unit):
          Unit = arrayProperties(BatchArrayPropertiesProperty(arrayProperties))

      /**
       * @param containerOverrides The overrides that are sent to a container.
       */
      override fun containerOverrides(containerOverrides: IResolvable) {
        cdkBuilder.containerOverrides(containerOverrides.let(IResolvable::unwrap))
      }

      /**
       * @param containerOverrides The overrides that are sent to a container.
       */
      override fun containerOverrides(containerOverrides: BatchContainerOverridesProperty) {
        cdkBuilder.containerOverrides(containerOverrides.let(BatchContainerOverridesProperty::unwrap))
      }

      /**
       * @param containerOverrides The overrides that are sent to a container.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33706522c31b6d00099ad806ab4ea4c3a0b2372b2b46f3f1782c1b59d78492d9")
      override
          fun containerOverrides(containerOverrides: BatchContainerOverridesProperty.Builder.() -> Unit):
          Unit = containerOverrides(BatchContainerOverridesProperty(containerOverrides))

      /**
       * @param dependsOn A list of dependencies for the job.
       * A job can depend upon a maximum of 20 jobs. You can specify a `SEQUENTIAL` type dependency
       * without specifying a job ID for array jobs so that each child array job completes
       * sequentially, starting at index 0. You can also specify an `N_TO_N` type dependency with a job
       * ID for array jobs. In that case, each index child of this job must wait for the corresponding
       * index child of each dependency to complete before it can begin.
       */
      override fun dependsOn(dependsOn: IResolvable) {
        cdkBuilder.dependsOn(dependsOn.let(IResolvable::unwrap))
      }

      /**
       * @param dependsOn A list of dependencies for the job.
       * A job can depend upon a maximum of 20 jobs. You can specify a `SEQUENTIAL` type dependency
       * without specifying a job ID for array jobs so that each child array job completes
       * sequentially, starting at index 0. You can also specify an `N_TO_N` type dependency with a job
       * ID for array jobs. In that case, each index child of this job must wait for the corresponding
       * index child of each dependency to complete before it can begin.
       */
      override fun dependsOn(dependsOn: List<Any>) {
        cdkBuilder.dependsOn(dependsOn)
      }

      /**
       * @param dependsOn A list of dependencies for the job.
       * A job can depend upon a maximum of 20 jobs. You can specify a `SEQUENTIAL` type dependency
       * without specifying a job ID for array jobs so that each child array job completes
       * sequentially, starting at index 0. You can also specify an `N_TO_N` type dependency with a job
       * ID for array jobs. In that case, each index child of this job must wait for the corresponding
       * index child of each dependency to complete before it can begin.
       */
      override fun dependsOn(vararg dependsOn: Any): Unit = dependsOn(dependsOn.toList())

      /**
       * @param jobDefinition The job definition used by this job. 
       * This value can be one of `name` , `name:revision` , or the Amazon Resource Name (ARN) for
       * the job definition. If name is specified without a revision then the latest active revision is
       * used.
       */
      override fun jobDefinition(jobDefinition: String) {
        cdkBuilder.jobDefinition(jobDefinition)
      }

      /**
       * @param jobName The name of the job. 
       * It can be up to 128 letters long. The first character must be alphanumeric, can contain
       * uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
       */
      override fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
      }

      /**
       * @param parameters Additional parameters passed to the job that replace parameter
       * substitution placeholders that are set in the job definition.
       * Parameters are specified as a key and value pair mapping. Parameters included here override
       * any corresponding parameter defaults from the job definition.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters Additional parameters passed to the job that replace parameter
       * substitution placeholders that are set in the job definition.
       * Parameters are specified as a key and value pair mapping. Parameters included here override
       * any corresponding parameter defaults from the job definition.
       */
      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param retryStrategy The retry strategy to use for failed jobs.
       * When a retry strategy is specified here, it overrides the retry strategy defined in the job
       * definition.
       */
      override fun retryStrategy(retryStrategy: IResolvable) {
        cdkBuilder.retryStrategy(retryStrategy.let(IResolvable::unwrap))
      }

      /**
       * @param retryStrategy The retry strategy to use for failed jobs.
       * When a retry strategy is specified here, it overrides the retry strategy defined in the job
       * definition.
       */
      override fun retryStrategy(retryStrategy: BatchRetryStrategyProperty) {
        cdkBuilder.retryStrategy(retryStrategy.let(BatchRetryStrategyProperty::unwrap))
      }

      /**
       * @param retryStrategy The retry strategy to use for failed jobs.
       * When a retry strategy is specified here, it overrides the retry strategy defined in the job
       * definition.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98fc3a4d7335ae32d18386b6d01abb467445b94a9dfa4182e352180dde8135b")
      override fun retryStrategy(retryStrategy: BatchRetryStrategyProperty.Builder.() -> Unit): Unit
          = retryStrategy(BatchRetryStrategyProperty(retryStrategy))

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetBatchJobParametersProperty {
      /**
       * The array properties for the submitted job, such as the size of the array.
       *
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-arrayproperties)
       */
      override fun arrayProperties(): Any? = unwrap(this).getArrayProperties()

      /**
       * The overrides that are sent to a container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-containeroverrides)
       */
      override fun containerOverrides(): Any? = unwrap(this).getContainerOverrides()

      /**
       * A list of dependencies for the job.
       *
       * A job can depend upon a maximum of 20 jobs. You can specify a `SEQUENTIAL` type dependency
       * without specifying a job ID for array jobs so that each child array job completes
       * sequentially, starting at index 0. You can also specify an `N_TO_N` type dependency with a job
       * ID for array jobs. In that case, each index child of this job must wait for the corresponding
       * index child of each dependency to complete before it can begin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-dependson)
       */
      override fun dependsOn(): Any? = unwrap(this).getDependsOn()

      /**
       * The job definition used by this job.
       *
       * This value can be one of `name` , `name:revision` , or the Amazon Resource Name (ARN) for
       * the job definition. If name is specified without a revision then the latest active revision is
       * used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-jobdefinition)
       */
      override fun jobDefinition(): String = unwrap(this).getJobDefinition()

      /**
       * The name of the job.
       *
       * It can be up to 128 letters long. The first character must be alphanumeric, can contain
       * uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-jobname)
       */
      override fun jobName(): String = unwrap(this).getJobName()

      /**
       * Additional parameters passed to the job that replace parameter substitution placeholders
       * that are set in the job definition.
       *
       * Parameters are specified as a key and value pair mapping. Parameters included here override
       * any corresponding parameter defaults from the job definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The retry strategy to use for failed jobs.
       *
       * When a retry strategy is specified here, it overrides the retry strategy defined in the job
       * definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetbatchjobparameters.html#cfn-pipes-pipe-pipetargetbatchjobparameters-retrystrategy)
       */
      override fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetBatchJobParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty):
          PipeTargetBatchJobParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetBatchJobParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty
    }
  }

  public interface FirehoseLogDestinationProperty {
    /**
     * The Amazon Resource Name (ARN) of the Firehose delivery stream to which EventBridge delivers
     * the pipe log records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-firehoselogdestination.html#cfn-pipes-pipe-firehoselogdestination-deliverystreamarn)
     */
    public fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()

    /**
     * A builder for [FirehoseLogDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryStreamArn The Amazon Resource Name (ARN) of the Firehose delivery stream to
       * which EventBridge delivers the pipe log records.
       */
      public fun deliveryStreamArn(deliveryStreamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty.builder()

      /**
       * @param deliveryStreamArn The Amazon Resource Name (ARN) of the Firehose delivery stream to
       * which EventBridge delivers the pipe log records.
       */
      override fun deliveryStreamArn(deliveryStreamArn: String) {
        cdkBuilder.deliveryStreamArn(deliveryStreamArn)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty,
    ) : CdkObject(cdkObject), FirehoseLogDestinationProperty {
      /**
       * The Amazon Resource Name (ARN) of the Firehose delivery stream to which EventBridge
       * delivers the pipe log records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-firehoselogdestination.html#cfn-pipes-pipe-firehoselogdestination-deliverystreamarn)
       */
      override fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty):
          FirehoseLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseLogDestinationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty
    }
  }

  public interface PipeTargetParametersProperty {
    /**
     * The parameters for using an AWS Batch job as a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-batchjobparameters)
     */
    public fun batchJobParameters(): Any? = unwrap(this).getBatchJobParameters()

    /**
     * The parameters for using an CloudWatch Logs log stream as a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-cloudwatchlogsparameters)
     */
    public fun cloudWatchLogsParameters(): Any? = unwrap(this).getCloudWatchLogsParameters()

    /**
     * The parameters for using an Amazon ECS task as a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-ecstaskparameters)
     */
    public fun ecsTaskParameters(): Any? = unwrap(this).getEcsTaskParameters()

    /**
     * The parameters for using an EventBridge event bus as a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-eventbridgeeventbusparameters)
     */
    public fun eventBridgeEventBusParameters(): Any? =
        unwrap(this).getEventBridgeEventBusParameters()

    /**
     * These are custom parameter to be used when the target is an API Gateway REST APIs or
     * EventBridge ApiDestinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-httpparameters)
     */
    public fun httpParameters(): Any? = unwrap(this).getHttpParameters()

    /**
     * Valid JSON text passed to the target.
     *
     * In this case, nothing from the event itself is passed to the target. For more information,
     * see [The JavaScript Object Notation (JSON) Data Interchange
     * Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt) .
     *
     * To remove an input template, specify an empty string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-inputtemplate)
     */
    public fun inputTemplate(): String? = unwrap(this).getInputTemplate()

    /**
     * The parameters for using a Kinesis stream as a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-kinesisstreamparameters)
     */
    public fun kinesisStreamParameters(): Any? = unwrap(this).getKinesisStreamParameters()

    /**
     * The parameters for using a Lambda function as a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-lambdafunctionparameters)
     */
    public fun lambdaFunctionParameters(): Any? = unwrap(this).getLambdaFunctionParameters()

    /**
     * These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke
     * the Amazon Redshift Data API BatchExecuteStatement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-redshiftdataparameters)
     */
    public fun redshiftDataParameters(): Any? = unwrap(this).getRedshiftDataParameters()

    /**
     * The parameters for using a SageMaker pipeline as a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-sagemakerpipelineparameters)
     */
    public fun sageMakerPipelineParameters(): Any? = unwrap(this).getSageMakerPipelineParameters()

    /**
     * The parameters for using a Amazon SQS stream as a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-sqsqueueparameters)
     */
    public fun sqsQueueParameters(): Any? = unwrap(this).getSqsQueueParameters()

    /**
     * The parameters for using a Step Functions state machine as a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-stepfunctionstatemachineparameters)
     */
    public fun stepFunctionStateMachineParameters(): Any? =
        unwrap(this).getStepFunctionStateMachineParameters()

    /**
     * A builder for [PipeTargetParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchJobParameters The parameters for using an AWS Batch job as a target.
       */
      public fun batchJobParameters(batchJobParameters: IResolvable)

      /**
       * @param batchJobParameters The parameters for using an AWS Batch job as a target.
       */
      public fun batchJobParameters(batchJobParameters: PipeTargetBatchJobParametersProperty)

      /**
       * @param batchJobParameters The parameters for using an AWS Batch job as a target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdaf15f5e96b52ffa23847a4ceac42195e4993caf7b5d539406df36ef64fd297")
      public
          fun batchJobParameters(batchJobParameters: PipeTargetBatchJobParametersProperty.Builder.() -> Unit)

      /**
       * @param cloudWatchLogsParameters The parameters for using an CloudWatch Logs log stream as a
       * target.
       */
      public fun cloudWatchLogsParameters(cloudWatchLogsParameters: IResolvable)

      /**
       * @param cloudWatchLogsParameters The parameters for using an CloudWatch Logs log stream as a
       * target.
       */
      public
          fun cloudWatchLogsParameters(cloudWatchLogsParameters: PipeTargetCloudWatchLogsParametersProperty)

      /**
       * @param cloudWatchLogsParameters The parameters for using an CloudWatch Logs log stream as a
       * target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d94b1dca2737581a33c6d8a82a05839a568009d24dea8855bac1f0a056356861")
      public
          fun cloudWatchLogsParameters(cloudWatchLogsParameters: PipeTargetCloudWatchLogsParametersProperty.Builder.() -> Unit)

      /**
       * @param ecsTaskParameters The parameters for using an Amazon ECS task as a target.
       */
      public fun ecsTaskParameters(ecsTaskParameters: IResolvable)

      /**
       * @param ecsTaskParameters The parameters for using an Amazon ECS task as a target.
       */
      public fun ecsTaskParameters(ecsTaskParameters: PipeTargetEcsTaskParametersProperty)

      /**
       * @param ecsTaskParameters The parameters for using an Amazon ECS task as a target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b56b9f235c7f227fdecbf99946f8a4d55051de254773c79eda188c4371f362d8")
      public
          fun ecsTaskParameters(ecsTaskParameters: PipeTargetEcsTaskParametersProperty.Builder.() -> Unit)

      /**
       * @param eventBridgeEventBusParameters The parameters for using an EventBridge event bus as a
       * target.
       */
      public fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: IResolvable)

      /**
       * @param eventBridgeEventBusParameters The parameters for using an EventBridge event bus as a
       * target.
       */
      public
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: PipeTargetEventBridgeEventBusParametersProperty)

      /**
       * @param eventBridgeEventBusParameters The parameters for using an EventBridge event bus as a
       * target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5a979d38b6badf433e4697081dcf5ebaa01f03a54b50a27ec403d89398fda36")
      public
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: PipeTargetEventBridgeEventBusParametersProperty.Builder.() -> Unit)

      /**
       * @param httpParameters These are custom parameter to be used when the target is an API
       * Gateway REST APIs or EventBridge ApiDestinations.
       */
      public fun httpParameters(httpParameters: IResolvable)

      /**
       * @param httpParameters These are custom parameter to be used when the target is an API
       * Gateway REST APIs or EventBridge ApiDestinations.
       */
      public fun httpParameters(httpParameters: PipeTargetHttpParametersProperty)

      /**
       * @param httpParameters These are custom parameter to be used when the target is an API
       * Gateway REST APIs or EventBridge ApiDestinations.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60a10dc2e3a6d4149db45ceb008014cdb486663706bf2fc975bbb4dff2fdcdc0")
      public fun httpParameters(httpParameters: PipeTargetHttpParametersProperty.Builder.() -> Unit)

      /**
       * @param inputTemplate Valid JSON text passed to the target.
       * In this case, nothing from the event itself is passed to the target. For more information,
       * see [The JavaScript Object Notation (JSON) Data Interchange
       * Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt) .
       *
       * To remove an input template, specify an empty string.
       */
      public fun inputTemplate(inputTemplate: String)

      /**
       * @param kinesisStreamParameters The parameters for using a Kinesis stream as a target.
       */
      public fun kinesisStreamParameters(kinesisStreamParameters: IResolvable)

      /**
       * @param kinesisStreamParameters The parameters for using a Kinesis stream as a target.
       */
      public
          fun kinesisStreamParameters(kinesisStreamParameters: PipeTargetKinesisStreamParametersProperty)

      /**
       * @param kinesisStreamParameters The parameters for using a Kinesis stream as a target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7041253f54d2a8022b5edf392192de92458f27517c4b2fcd22920caf60d7f86")
      public
          fun kinesisStreamParameters(kinesisStreamParameters: PipeTargetKinesisStreamParametersProperty.Builder.() -> Unit)

      /**
       * @param lambdaFunctionParameters The parameters for using a Lambda function as a target.
       */
      public fun lambdaFunctionParameters(lambdaFunctionParameters: IResolvable)

      /**
       * @param lambdaFunctionParameters The parameters for using a Lambda function as a target.
       */
      public
          fun lambdaFunctionParameters(lambdaFunctionParameters: PipeTargetLambdaFunctionParametersProperty)

      /**
       * @param lambdaFunctionParameters The parameters for using a Lambda function as a target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b22e1eff3837d34aa5bff40756eaeec651842e77f84128fd3688e7cbe3afe51")
      public
          fun lambdaFunctionParameters(lambdaFunctionParameters: PipeTargetLambdaFunctionParametersProperty.Builder.() -> Unit)

      /**
       * @param redshiftDataParameters These are custom parameters to be used when the target is a
       * Amazon Redshift cluster to invoke the Amazon Redshift Data API BatchExecuteStatement.
       */
      public fun redshiftDataParameters(redshiftDataParameters: IResolvable)

      /**
       * @param redshiftDataParameters These are custom parameters to be used when the target is a
       * Amazon Redshift cluster to invoke the Amazon Redshift Data API BatchExecuteStatement.
       */
      public
          fun redshiftDataParameters(redshiftDataParameters: PipeTargetRedshiftDataParametersProperty)

      /**
       * @param redshiftDataParameters These are custom parameters to be used when the target is a
       * Amazon Redshift cluster to invoke the Amazon Redshift Data API BatchExecuteStatement.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6683ea8aeb687b4449f257a8375f98b755ace2518160fcfb7749e987f381d6c3")
      public
          fun redshiftDataParameters(redshiftDataParameters: PipeTargetRedshiftDataParametersProperty.Builder.() -> Unit)

      /**
       * @param sageMakerPipelineParameters The parameters for using a SageMaker pipeline as a
       * target.
       */
      public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable)

      /**
       * @param sageMakerPipelineParameters The parameters for using a SageMaker pipeline as a
       * target.
       */
      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: PipeTargetSageMakerPipelineParametersProperty)

      /**
       * @param sageMakerPipelineParameters The parameters for using a SageMaker pipeline as a
       * target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09c82decebfa4d802c5bd64ec0a261aaee817f9f37480bd0fc326e0af8da78d7")
      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: PipeTargetSageMakerPipelineParametersProperty.Builder.() -> Unit)

      /**
       * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a target.
       */
      public fun sqsQueueParameters(sqsQueueParameters: IResolvable)

      /**
       * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a target.
       */
      public fun sqsQueueParameters(sqsQueueParameters: PipeTargetSqsQueueParametersProperty)

      /**
       * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbe15509195fccf35855a8fbbc2b4a87d242b141ac82c4214512ebc00a21128d")
      public
          fun sqsQueueParameters(sqsQueueParameters: PipeTargetSqsQueueParametersProperty.Builder.() -> Unit)

      /**
       * @param stepFunctionStateMachineParameters The parameters for using a Step Functions state
       * machine as a target.
       */
      public fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: IResolvable)

      /**
       * @param stepFunctionStateMachineParameters The parameters for using a Step Functions state
       * machine as a target.
       */
      public
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: PipeTargetStateMachineParametersProperty)

      /**
       * @param stepFunctionStateMachineParameters The parameters for using a Step Functions state
       * machine as a target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c98c038add2c0bc4e1ab167709d03310995337108c405ec86f15195d3bfad285")
      public
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: PipeTargetStateMachineParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty.builder()

      /**
       * @param batchJobParameters The parameters for using an AWS Batch job as a target.
       */
      override fun batchJobParameters(batchJobParameters: IResolvable) {
        cdkBuilder.batchJobParameters(batchJobParameters.let(IResolvable::unwrap))
      }

      /**
       * @param batchJobParameters The parameters for using an AWS Batch job as a target.
       */
      override fun batchJobParameters(batchJobParameters: PipeTargetBatchJobParametersProperty) {
        cdkBuilder.batchJobParameters(batchJobParameters.let(PipeTargetBatchJobParametersProperty::unwrap))
      }

      /**
       * @param batchJobParameters The parameters for using an AWS Batch job as a target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdaf15f5e96b52ffa23847a4ceac42195e4993caf7b5d539406df36ef64fd297")
      override
          fun batchJobParameters(batchJobParameters: PipeTargetBatchJobParametersProperty.Builder.() -> Unit):
          Unit = batchJobParameters(PipeTargetBatchJobParametersProperty(batchJobParameters))

      /**
       * @param cloudWatchLogsParameters The parameters for using an CloudWatch Logs log stream as a
       * target.
       */
      override fun cloudWatchLogsParameters(cloudWatchLogsParameters: IResolvable) {
        cdkBuilder.cloudWatchLogsParameters(cloudWatchLogsParameters.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLogsParameters The parameters for using an CloudWatch Logs log stream as a
       * target.
       */
      override
          fun cloudWatchLogsParameters(cloudWatchLogsParameters: PipeTargetCloudWatchLogsParametersProperty) {
        cdkBuilder.cloudWatchLogsParameters(cloudWatchLogsParameters.let(PipeTargetCloudWatchLogsParametersProperty::unwrap))
      }

      /**
       * @param cloudWatchLogsParameters The parameters for using an CloudWatch Logs log stream as a
       * target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d94b1dca2737581a33c6d8a82a05839a568009d24dea8855bac1f0a056356861")
      override
          fun cloudWatchLogsParameters(cloudWatchLogsParameters: PipeTargetCloudWatchLogsParametersProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLogsParameters(PipeTargetCloudWatchLogsParametersProperty(cloudWatchLogsParameters))

      /**
       * @param ecsTaskParameters The parameters for using an Amazon ECS task as a target.
       */
      override fun ecsTaskParameters(ecsTaskParameters: IResolvable) {
        cdkBuilder.ecsTaskParameters(ecsTaskParameters.let(IResolvable::unwrap))
      }

      /**
       * @param ecsTaskParameters The parameters for using an Amazon ECS task as a target.
       */
      override fun ecsTaskParameters(ecsTaskParameters: PipeTargetEcsTaskParametersProperty) {
        cdkBuilder.ecsTaskParameters(ecsTaskParameters.let(PipeTargetEcsTaskParametersProperty::unwrap))
      }

      /**
       * @param ecsTaskParameters The parameters for using an Amazon ECS task as a target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b56b9f235c7f227fdecbf99946f8a4d55051de254773c79eda188c4371f362d8")
      override
          fun ecsTaskParameters(ecsTaskParameters: PipeTargetEcsTaskParametersProperty.Builder.() -> Unit):
          Unit = ecsTaskParameters(PipeTargetEcsTaskParametersProperty(ecsTaskParameters))

      /**
       * @param eventBridgeEventBusParameters The parameters for using an EventBridge event bus as a
       * target.
       */
      override fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: IResolvable) {
        cdkBuilder.eventBridgeEventBusParameters(eventBridgeEventBusParameters.let(IResolvable::unwrap))
      }

      /**
       * @param eventBridgeEventBusParameters The parameters for using an EventBridge event bus as a
       * target.
       */
      override
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: PipeTargetEventBridgeEventBusParametersProperty) {
        cdkBuilder.eventBridgeEventBusParameters(eventBridgeEventBusParameters.let(PipeTargetEventBridgeEventBusParametersProperty::unwrap))
      }

      /**
       * @param eventBridgeEventBusParameters The parameters for using an EventBridge event bus as a
       * target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5a979d38b6badf433e4697081dcf5ebaa01f03a54b50a27ec403d89398fda36")
      override
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: PipeTargetEventBridgeEventBusParametersProperty.Builder.() -> Unit):
          Unit =
          eventBridgeEventBusParameters(PipeTargetEventBridgeEventBusParametersProperty(eventBridgeEventBusParameters))

      /**
       * @param httpParameters These are custom parameter to be used when the target is an API
       * Gateway REST APIs or EventBridge ApiDestinations.
       */
      override fun httpParameters(httpParameters: IResolvable) {
        cdkBuilder.httpParameters(httpParameters.let(IResolvable::unwrap))
      }

      /**
       * @param httpParameters These are custom parameter to be used when the target is an API
       * Gateway REST APIs or EventBridge ApiDestinations.
       */
      override fun httpParameters(httpParameters: PipeTargetHttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters.let(PipeTargetHttpParametersProperty::unwrap))
      }

      /**
       * @param httpParameters These are custom parameter to be used when the target is an API
       * Gateway REST APIs or EventBridge ApiDestinations.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60a10dc2e3a6d4149db45ceb008014cdb486663706bf2fc975bbb4dff2fdcdc0")
      override
          fun httpParameters(httpParameters: PipeTargetHttpParametersProperty.Builder.() -> Unit):
          Unit = httpParameters(PipeTargetHttpParametersProperty(httpParameters))

      /**
       * @param inputTemplate Valid JSON text passed to the target.
       * In this case, nothing from the event itself is passed to the target. For more information,
       * see [The JavaScript Object Notation (JSON) Data Interchange
       * Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt) .
       *
       * To remove an input template, specify an empty string.
       */
      override fun inputTemplate(inputTemplate: String) {
        cdkBuilder.inputTemplate(inputTemplate)
      }

      /**
       * @param kinesisStreamParameters The parameters for using a Kinesis stream as a target.
       */
      override fun kinesisStreamParameters(kinesisStreamParameters: IResolvable) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisStreamParameters The parameters for using a Kinesis stream as a target.
       */
      override
          fun kinesisStreamParameters(kinesisStreamParameters: PipeTargetKinesisStreamParametersProperty) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters.let(PipeTargetKinesisStreamParametersProperty::unwrap))
      }

      /**
       * @param kinesisStreamParameters The parameters for using a Kinesis stream as a target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7041253f54d2a8022b5edf392192de92458f27517c4b2fcd22920caf60d7f86")
      override
          fun kinesisStreamParameters(kinesisStreamParameters: PipeTargetKinesisStreamParametersProperty.Builder.() -> Unit):
          Unit =
          kinesisStreamParameters(PipeTargetKinesisStreamParametersProperty(kinesisStreamParameters))

      /**
       * @param lambdaFunctionParameters The parameters for using a Lambda function as a target.
       */
      override fun lambdaFunctionParameters(lambdaFunctionParameters: IResolvable) {
        cdkBuilder.lambdaFunctionParameters(lambdaFunctionParameters.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaFunctionParameters The parameters for using a Lambda function as a target.
       */
      override
          fun lambdaFunctionParameters(lambdaFunctionParameters: PipeTargetLambdaFunctionParametersProperty) {
        cdkBuilder.lambdaFunctionParameters(lambdaFunctionParameters.let(PipeTargetLambdaFunctionParametersProperty::unwrap))
      }

      /**
       * @param lambdaFunctionParameters The parameters for using a Lambda function as a target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b22e1eff3837d34aa5bff40756eaeec651842e77f84128fd3688e7cbe3afe51")
      override
          fun lambdaFunctionParameters(lambdaFunctionParameters: PipeTargetLambdaFunctionParametersProperty.Builder.() -> Unit):
          Unit =
          lambdaFunctionParameters(PipeTargetLambdaFunctionParametersProperty(lambdaFunctionParameters))

      /**
       * @param redshiftDataParameters These are custom parameters to be used when the target is a
       * Amazon Redshift cluster to invoke the Amazon Redshift Data API BatchExecuteStatement.
       */
      override fun redshiftDataParameters(redshiftDataParameters: IResolvable) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters.let(IResolvable::unwrap))
      }

      /**
       * @param redshiftDataParameters These are custom parameters to be used when the target is a
       * Amazon Redshift cluster to invoke the Amazon Redshift Data API BatchExecuteStatement.
       */
      override
          fun redshiftDataParameters(redshiftDataParameters: PipeTargetRedshiftDataParametersProperty) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters.let(PipeTargetRedshiftDataParametersProperty::unwrap))
      }

      /**
       * @param redshiftDataParameters These are custom parameters to be used when the target is a
       * Amazon Redshift cluster to invoke the Amazon Redshift Data API BatchExecuteStatement.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6683ea8aeb687b4449f257a8375f98b755ace2518160fcfb7749e987f381d6c3")
      override
          fun redshiftDataParameters(redshiftDataParameters: PipeTargetRedshiftDataParametersProperty.Builder.() -> Unit):
          Unit =
          redshiftDataParameters(PipeTargetRedshiftDataParametersProperty(redshiftDataParameters))

      /**
       * @param sageMakerPipelineParameters The parameters for using a SageMaker pipeline as a
       * target.
       */
      override fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(IResolvable::unwrap))
      }

      /**
       * @param sageMakerPipelineParameters The parameters for using a SageMaker pipeline as a
       * target.
       */
      override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: PipeTargetSageMakerPipelineParametersProperty) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(PipeTargetSageMakerPipelineParametersProperty::unwrap))
      }

      /**
       * @param sageMakerPipelineParameters The parameters for using a SageMaker pipeline as a
       * target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09c82decebfa4d802c5bd64ec0a261aaee817f9f37480bd0fc326e0af8da78d7")
      override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: PipeTargetSageMakerPipelineParametersProperty.Builder.() -> Unit):
          Unit =
          sageMakerPipelineParameters(PipeTargetSageMakerPipelineParametersProperty(sageMakerPipelineParameters))

      /**
       * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a target.
       */
      override fun sqsQueueParameters(sqsQueueParameters: IResolvable) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters.let(IResolvable::unwrap))
      }

      /**
       * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a target.
       */
      override fun sqsQueueParameters(sqsQueueParameters: PipeTargetSqsQueueParametersProperty) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters.let(PipeTargetSqsQueueParametersProperty::unwrap))
      }

      /**
       * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbe15509195fccf35855a8fbbc2b4a87d242b141ac82c4214512ebc00a21128d")
      override
          fun sqsQueueParameters(sqsQueueParameters: PipeTargetSqsQueueParametersProperty.Builder.() -> Unit):
          Unit = sqsQueueParameters(PipeTargetSqsQueueParametersProperty(sqsQueueParameters))

      /**
       * @param stepFunctionStateMachineParameters The parameters for using a Step Functions state
       * machine as a target.
       */
      override
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: IResolvable) {
        cdkBuilder.stepFunctionStateMachineParameters(stepFunctionStateMachineParameters.let(IResolvable::unwrap))
      }

      /**
       * @param stepFunctionStateMachineParameters The parameters for using a Step Functions state
       * machine as a target.
       */
      override
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: PipeTargetStateMachineParametersProperty) {
        cdkBuilder.stepFunctionStateMachineParameters(stepFunctionStateMachineParameters.let(PipeTargetStateMachineParametersProperty::unwrap))
      }

      /**
       * @param stepFunctionStateMachineParameters The parameters for using a Step Functions state
       * machine as a target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c98c038add2c0bc4e1ab167709d03310995337108c405ec86f15195d3bfad285")
      override
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: PipeTargetStateMachineParametersProperty.Builder.() -> Unit):
          Unit =
          stepFunctionStateMachineParameters(PipeTargetStateMachineParametersProperty(stepFunctionStateMachineParameters))

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetParametersProperty {
      /**
       * The parameters for using an AWS Batch job as a target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-batchjobparameters)
       */
      override fun batchJobParameters(): Any? = unwrap(this).getBatchJobParameters()

      /**
       * The parameters for using an CloudWatch Logs log stream as a target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-cloudwatchlogsparameters)
       */
      override fun cloudWatchLogsParameters(): Any? = unwrap(this).getCloudWatchLogsParameters()

      /**
       * The parameters for using an Amazon ECS task as a target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-ecstaskparameters)
       */
      override fun ecsTaskParameters(): Any? = unwrap(this).getEcsTaskParameters()

      /**
       * The parameters for using an EventBridge event bus as a target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-eventbridgeeventbusparameters)
       */
      override fun eventBridgeEventBusParameters(): Any? =
          unwrap(this).getEventBridgeEventBusParameters()

      /**
       * These are custom parameter to be used when the target is an API Gateway REST APIs or
       * EventBridge ApiDestinations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-httpparameters)
       */
      override fun httpParameters(): Any? = unwrap(this).getHttpParameters()

      /**
       * Valid JSON text passed to the target.
       *
       * In this case, nothing from the event itself is passed to the target. For more information,
       * see [The JavaScript Object Notation (JSON) Data Interchange
       * Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt) .
       *
       * To remove an input template, specify an empty string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-inputtemplate)
       */
      override fun inputTemplate(): String? = unwrap(this).getInputTemplate()

      /**
       * The parameters for using a Kinesis stream as a target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-kinesisstreamparameters)
       */
      override fun kinesisStreamParameters(): Any? = unwrap(this).getKinesisStreamParameters()

      /**
       * The parameters for using a Lambda function as a target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-lambdafunctionparameters)
       */
      override fun lambdaFunctionParameters(): Any? = unwrap(this).getLambdaFunctionParameters()

      /**
       * These are custom parameters to be used when the target is a Amazon Redshift cluster to
       * invoke the Amazon Redshift Data API BatchExecuteStatement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-redshiftdataparameters)
       */
      override fun redshiftDataParameters(): Any? = unwrap(this).getRedshiftDataParameters()

      /**
       * The parameters for using a SageMaker pipeline as a target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-sagemakerpipelineparameters)
       */
      override fun sageMakerPipelineParameters(): Any? =
          unwrap(this).getSageMakerPipelineParameters()

      /**
       * The parameters for using a Amazon SQS stream as a target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-sqsqueueparameters)
       */
      override fun sqsQueueParameters(): Any? = unwrap(this).getSqsQueueParameters()

      /**
       * The parameters for using a Step Functions state machine as a target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html#cfn-pipes-pipe-pipetargetparameters-stepfunctionstatemachineparameters)
       */
      override fun stepFunctionStateMachineParameters(): Any? =
          unwrap(this).getStepFunctionStateMachineParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipeTargetParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty):
          PipeTargetParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty
    }
  }

  public interface PipeLogConfigurationProperty {
    /**
     * The logging configuration settings for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipelogconfiguration.html#cfn-pipes-pipe-pipelogconfiguration-cloudwatchlogslogdestination)
     */
    public fun cloudwatchLogsLogDestination(): Any? = unwrap(this).getCloudwatchLogsLogDestination()

    /**
     * The Amazon Data Firehose logging configuration settings for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipelogconfiguration.html#cfn-pipes-pipe-pipelogconfiguration-firehoselogdestination)
     */
    public fun firehoseLogDestination(): Any? = unwrap(this).getFirehoseLogDestination()

    /**
     * Whether the execution data (specifically, the `payload` , `awsRequest` , and `awsResponse`
     * fields) is included in the log messages for this pipe.
     *
     * This applies to all log destinations for the pipe.
     *
     * For more information, see [Including execution data in
     * logs](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data)
     * in the *Amazon EventBridge User Guide* .
     *
     * *Allowed values:* `ALL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipelogconfiguration.html#cfn-pipes-pipe-pipelogconfiguration-includeexecutiondata)
     */
    public fun includeExecutionData(): List<String> = unwrap(this).getIncludeExecutionData() ?:
        emptyList()

    /**
     * The level of logging detail to include.
     *
     * This applies to all log destinations for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipelogconfiguration.html#cfn-pipes-pipe-pipelogconfiguration-level)
     */
    public fun level(): String? = unwrap(this).getLevel()

    /**
     * The Amazon S3 logging configuration settings for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipelogconfiguration.html#cfn-pipes-pipe-pipelogconfiguration-s3logdestination)
     */
    public fun s3LogDestination(): Any? = unwrap(this).getS3LogDestination()

    /**
     * A builder for [PipeLogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudwatchLogsLogDestination The logging configuration settings for the pipe.
       */
      public fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: IResolvable)

      /**
       * @param cloudwatchLogsLogDestination The logging configuration settings for the pipe.
       */
      public
          fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: CloudwatchLogsLogDestinationProperty)

      /**
       * @param cloudwatchLogsLogDestination The logging configuration settings for the pipe.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2868d9599846bb0f80a69232e538e1e3f52d7a455e0dfbcbe2b41e0481de7f10")
      public
          fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: CloudwatchLogsLogDestinationProperty.Builder.() -> Unit)

      /**
       * @param firehoseLogDestination The Amazon Data Firehose logging configuration settings for
       * the pipe.
       */
      public fun firehoseLogDestination(firehoseLogDestination: IResolvable)

      /**
       * @param firehoseLogDestination The Amazon Data Firehose logging configuration settings for
       * the pipe.
       */
      public fun firehoseLogDestination(firehoseLogDestination: FirehoseLogDestinationProperty)

      /**
       * @param firehoseLogDestination The Amazon Data Firehose logging configuration settings for
       * the pipe.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ccd62478289f6030d7ca6615926381df28db347b2571aae07bf10d0a25c0d64")
      public
          fun firehoseLogDestination(firehoseLogDestination: FirehoseLogDestinationProperty.Builder.() -> Unit)

      /**
       * @param includeExecutionData Whether the execution data (specifically, the `payload` ,
       * `awsRequest` , and `awsResponse` fields) is included in the log messages for this pipe.
       * This applies to all log destinations for the pipe.
       *
       * For more information, see [Including execution data in
       * logs](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data)
       * in the *Amazon EventBridge User Guide* .
       *
       * *Allowed values:* `ALL`
       */
      public fun includeExecutionData(includeExecutionData: List<String>)

      /**
       * @param includeExecutionData Whether the execution data (specifically, the `payload` ,
       * `awsRequest` , and `awsResponse` fields) is included in the log messages for this pipe.
       * This applies to all log destinations for the pipe.
       *
       * For more information, see [Including execution data in
       * logs](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data)
       * in the *Amazon EventBridge User Guide* .
       *
       * *Allowed values:* `ALL`
       */
      public fun includeExecutionData(vararg includeExecutionData: String)

      /**
       * @param level The level of logging detail to include.
       * This applies to all log destinations for the pipe.
       */
      public fun level(level: String)

      /**
       * @param s3LogDestination The Amazon S3 logging configuration settings for the pipe.
       */
      public fun s3LogDestination(s3LogDestination: IResolvable)

      /**
       * @param s3LogDestination The Amazon S3 logging configuration settings for the pipe.
       */
      public fun s3LogDestination(s3LogDestination: S3LogDestinationProperty)

      /**
       * @param s3LogDestination The Amazon S3 logging configuration settings for the pipe.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bc0940a20a9c9176130427adbc51573008b4daed153833bdef9e024cda4add7")
      public fun s3LogDestination(s3LogDestination: S3LogDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty.builder()

      /**
       * @param cloudwatchLogsLogDestination The logging configuration settings for the pipe.
       */
      override fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: IResolvable) {
        cdkBuilder.cloudwatchLogsLogDestination(cloudwatchLogsLogDestination.let(IResolvable::unwrap))
      }

      /**
       * @param cloudwatchLogsLogDestination The logging configuration settings for the pipe.
       */
      override
          fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: CloudwatchLogsLogDestinationProperty) {
        cdkBuilder.cloudwatchLogsLogDestination(cloudwatchLogsLogDestination.let(CloudwatchLogsLogDestinationProperty::unwrap))
      }

      /**
       * @param cloudwatchLogsLogDestination The logging configuration settings for the pipe.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2868d9599846bb0f80a69232e538e1e3f52d7a455e0dfbcbe2b41e0481de7f10")
      override
          fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: CloudwatchLogsLogDestinationProperty.Builder.() -> Unit):
          Unit =
          cloudwatchLogsLogDestination(CloudwatchLogsLogDestinationProperty(cloudwatchLogsLogDestination))

      /**
       * @param firehoseLogDestination The Amazon Data Firehose logging configuration settings for
       * the pipe.
       */
      override fun firehoseLogDestination(firehoseLogDestination: IResolvable) {
        cdkBuilder.firehoseLogDestination(firehoseLogDestination.let(IResolvable::unwrap))
      }

      /**
       * @param firehoseLogDestination The Amazon Data Firehose logging configuration settings for
       * the pipe.
       */
      override fun firehoseLogDestination(firehoseLogDestination: FirehoseLogDestinationProperty) {
        cdkBuilder.firehoseLogDestination(firehoseLogDestination.let(FirehoseLogDestinationProperty::unwrap))
      }

      /**
       * @param firehoseLogDestination The Amazon Data Firehose logging configuration settings for
       * the pipe.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ccd62478289f6030d7ca6615926381df28db347b2571aae07bf10d0a25c0d64")
      override
          fun firehoseLogDestination(firehoseLogDestination: FirehoseLogDestinationProperty.Builder.() -> Unit):
          Unit = firehoseLogDestination(FirehoseLogDestinationProperty(firehoseLogDestination))

      /**
       * @param includeExecutionData Whether the execution data (specifically, the `payload` ,
       * `awsRequest` , and `awsResponse` fields) is included in the log messages for this pipe.
       * This applies to all log destinations for the pipe.
       *
       * For more information, see [Including execution data in
       * logs](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data)
       * in the *Amazon EventBridge User Guide* .
       *
       * *Allowed values:* `ALL`
       */
      override fun includeExecutionData(includeExecutionData: List<String>) {
        cdkBuilder.includeExecutionData(includeExecutionData)
      }

      /**
       * @param includeExecutionData Whether the execution data (specifically, the `payload` ,
       * `awsRequest` , and `awsResponse` fields) is included in the log messages for this pipe.
       * This applies to all log destinations for the pipe.
       *
       * For more information, see [Including execution data in
       * logs](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data)
       * in the *Amazon EventBridge User Guide* .
       *
       * *Allowed values:* `ALL`
       */
      override fun includeExecutionData(vararg includeExecutionData: String): Unit =
          includeExecutionData(includeExecutionData.toList())

      /**
       * @param level The level of logging detail to include.
       * This applies to all log destinations for the pipe.
       */
      override fun level(level: String) {
        cdkBuilder.level(level)
      }

      /**
       * @param s3LogDestination The Amazon S3 logging configuration settings for the pipe.
       */
      override fun s3LogDestination(s3LogDestination: IResolvable) {
        cdkBuilder.s3LogDestination(s3LogDestination.let(IResolvable::unwrap))
      }

      /**
       * @param s3LogDestination The Amazon S3 logging configuration settings for the pipe.
       */
      override fun s3LogDestination(s3LogDestination: S3LogDestinationProperty) {
        cdkBuilder.s3LogDestination(s3LogDestination.let(S3LogDestinationProperty::unwrap))
      }

      /**
       * @param s3LogDestination The Amazon S3 logging configuration settings for the pipe.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bc0940a20a9c9176130427adbc51573008b4daed153833bdef9e024cda4add7")
      override fun s3LogDestination(s3LogDestination: S3LogDestinationProperty.Builder.() -> Unit):
          Unit = s3LogDestination(S3LogDestinationProperty(s3LogDestination))

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty,
    ) : CdkObject(cdkObject), PipeLogConfigurationProperty {
      /**
       * The logging configuration settings for the pipe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipelogconfiguration.html#cfn-pipes-pipe-pipelogconfiguration-cloudwatchlogslogdestination)
       */
      override fun cloudwatchLogsLogDestination(): Any? =
          unwrap(this).getCloudwatchLogsLogDestination()

      /**
       * The Amazon Data Firehose logging configuration settings for the pipe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipelogconfiguration.html#cfn-pipes-pipe-pipelogconfiguration-firehoselogdestination)
       */
      override fun firehoseLogDestination(): Any? = unwrap(this).getFirehoseLogDestination()

      /**
       * Whether the execution data (specifically, the `payload` , `awsRequest` , and `awsResponse`
       * fields) is included in the log messages for this pipe.
       *
       * This applies to all log destinations for the pipe.
       *
       * For more information, see [Including execution data in
       * logs](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data)
       * in the *Amazon EventBridge User Guide* .
       *
       * *Allowed values:* `ALL`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipelogconfiguration.html#cfn-pipes-pipe-pipelogconfiguration-includeexecutiondata)
       */
      override fun includeExecutionData(): List<String> = unwrap(this).getIncludeExecutionData() ?:
          emptyList()

      /**
       * The level of logging detail to include.
       *
       * This applies to all log destinations for the pipe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipelogconfiguration.html#cfn-pipes-pipe-pipelogconfiguration-level)
       */
      override fun level(): String? = unwrap(this).getLevel()

      /**
       * The Amazon S3 logging configuration settings for the pipe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipelogconfiguration.html#cfn-pipes-pipe-pipelogconfiguration-s3logdestination)
       */
      override fun s3LogDestination(): Any? = unwrap(this).getS3LogDestination()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipeLogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty):
          PipeLogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeLogConfigurationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty
    }
  }

  public interface BatchJobDependencyProperty {
    /**
     * The job ID of the AWS Batch job that's associated with this dependency.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchjobdependency.html#cfn-pipes-pipe-batchjobdependency-jobid)
     */
    public fun jobId(): String? = unwrap(this).getJobId()

    /**
     * The type of the job dependency.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchjobdependency.html#cfn-pipes-pipe-batchjobdependency-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [BatchJobDependencyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param jobId The job ID of the AWS Batch job that's associated with this dependency.
       */
      public fun jobId(jobId: String)

      /**
       * @param type The type of the job dependency.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty.builder()

      /**
       * @param jobId The job ID of the AWS Batch job that's associated with this dependency.
       */
      override fun jobId(jobId: String) {
        cdkBuilder.jobId(jobId)
      }

      /**
       * @param type The type of the job dependency.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty,
    ) : CdkObject(cdkObject), BatchJobDependencyProperty {
      /**
       * The job ID of the AWS Batch job that's associated with this dependency.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchjobdependency.html#cfn-pipes-pipe-batchjobdependency-jobid)
       */
      override fun jobId(): String? = unwrap(this).getJobId()

      /**
       * The type of the job dependency.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchjobdependency.html#cfn-pipes-pipe-batchjobdependency-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchJobDependencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty):
          BatchJobDependencyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchJobDependencyProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty
    }
  }

  public interface PipeTargetHttpParametersProperty {
    /**
     * The headers that need to be sent as part of request invoking the API Gateway REST API or
     * EventBridge ApiDestination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargethttpparameters.html#cfn-pipes-pipe-pipetargethttpparameters-headerparameters)
     */
    public fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

    /**
     * The path parameter values to be used to populate API Gateway REST API or EventBridge
     * ApiDestination path wildcards ("*").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargethttpparameters.html#cfn-pipes-pipe-pipetargethttpparameters-pathparametervalues)
     */
    public fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
        emptyList()

    /**
     * The query string keys/values that need to be sent as part of request invoking the API Gateway
     * REST API or EventBridge ApiDestination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargethttpparameters.html#cfn-pipes-pipe-pipetargethttpparameters-querystringparameters)
     */
    public fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()

    /**
     * A builder for [PipeTargetHttpParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headerParameters The headers that need to be sent as part of request invoking the
       * API Gateway REST API or EventBridge ApiDestination.
       */
      public fun headerParameters(headerParameters: IResolvable)

      /**
       * @param headerParameters The headers that need to be sent as part of request invoking the
       * API Gateway REST API or EventBridge ApiDestination.
       */
      public fun headerParameters(headerParameters: Map<String, String>)

      /**
       * @param pathParameterValues The path parameter values to be used to populate API Gateway
       * REST API or EventBridge ApiDestination path wildcards ("*").
       */
      public fun pathParameterValues(pathParameterValues: List<String>)

      /**
       * @param pathParameterValues The path parameter values to be used to populate API Gateway
       * REST API or EventBridge ApiDestination path wildcards ("*").
       */
      public fun pathParameterValues(vararg pathParameterValues: String)

      /**
       * @param queryStringParameters The query string keys/values that need to be sent as part of
       * request invoking the API Gateway REST API or EventBridge ApiDestination.
       */
      public fun queryStringParameters(queryStringParameters: IResolvable)

      /**
       * @param queryStringParameters The query string keys/values that need to be sent as part of
       * request invoking the API Gateway REST API or EventBridge ApiDestination.
       */
      public fun queryStringParameters(queryStringParameters: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty.builder()

      /**
       * @param headerParameters The headers that need to be sent as part of request invoking the
       * API Gateway REST API or EventBridge ApiDestination.
       */
      override fun headerParameters(headerParameters: IResolvable) {
        cdkBuilder.headerParameters(headerParameters.let(IResolvable::unwrap))
      }

      /**
       * @param headerParameters The headers that need to be sent as part of request invoking the
       * API Gateway REST API or EventBridge ApiDestination.
       */
      override fun headerParameters(headerParameters: Map<String, String>) {
        cdkBuilder.headerParameters(headerParameters)
      }

      /**
       * @param pathParameterValues The path parameter values to be used to populate API Gateway
       * REST API or EventBridge ApiDestination path wildcards ("*").
       */
      override fun pathParameterValues(pathParameterValues: List<String>) {
        cdkBuilder.pathParameterValues(pathParameterValues)
      }

      /**
       * @param pathParameterValues The path parameter values to be used to populate API Gateway
       * REST API or EventBridge ApiDestination path wildcards ("*").
       */
      override fun pathParameterValues(vararg pathParameterValues: String): Unit =
          pathParameterValues(pathParameterValues.toList())

      /**
       * @param queryStringParameters The query string keys/values that need to be sent as part of
       * request invoking the API Gateway REST API or EventBridge ApiDestination.
       */
      override fun queryStringParameters(queryStringParameters: IResolvable) {
        cdkBuilder.queryStringParameters(queryStringParameters.let(IResolvable::unwrap))
      }

      /**
       * @param queryStringParameters The query string keys/values that need to be sent as part of
       * request invoking the API Gateway REST API or EventBridge ApiDestination.
       */
      override fun queryStringParameters(queryStringParameters: Map<String, String>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetHttpParametersProperty {
      /**
       * The headers that need to be sent as part of request invoking the API Gateway REST API or
       * EventBridge ApiDestination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargethttpparameters.html#cfn-pipes-pipe-pipetargethttpparameters-headerparameters)
       */
      override fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

      /**
       * The path parameter values to be used to populate API Gateway REST API or EventBridge
       * ApiDestination path wildcards ("*").
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargethttpparameters.html#cfn-pipes-pipe-pipetargethttpparameters-pathparametervalues)
       */
      override fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
          emptyList()

      /**
       * The query string keys/values that need to be sent as part of request invoking the API
       * Gateway REST API or EventBridge ApiDestination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargethttpparameters.html#cfn-pipes-pipe-pipetargethttpparameters-querystringparameters)
       */
      override fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipeTargetHttpParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty):
          PipeTargetHttpParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetHttpParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty
    }
  }

  public interface PipeTargetEcsTaskParametersProperty {
    /**
     * The capacity provider strategy to use for the task.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or launchType is specified, the `defaultCapacityProviderStrategy`
     * for the cluster is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-capacityproviderstrategy)
     */
    public fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

    /**
     * Specifies whether to enable Amazon ECS managed tags for the task.
     *
     * For more information, see [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
     * the Amazon Elastic Container Service Developer Guide.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-enableecsmanagedtags)
     */
    public fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

    /**
     * Whether or not to enable the execute command functionality for the containers in this task.
     *
     * If true, this enables execute command functionality on all containers in the task.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-enableexecutecommand)
     */
    public fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

    /**
     * Specifies an Amazon ECS task group for the task.
     *
     * The maximum length is 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-group)
     */
    public fun group(): String? = unwrap(this).getGroup()

    /**
     * Specifies the launch type on which your task is running.
     *
     * The launch type that you specify here must match one of the launch type (compatibilities) of
     * the target task. The `FARGATE` value is supported only in the Regions where AWS Fargate with
     * Amazon ECS is supported. For more information, see [AWS Fargate on Amazon
     * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-launchtype)
     */
    public fun launchType(): String? = unwrap(this).getLaunchType()

    /**
     * Use this structure if the Amazon ECS task uses the `awsvpc` network mode.
     *
     * This structure specifies the VPC subnets and security groups associated with the task, and
     * whether a public IP address is to be used. This structure is required if `LaunchType` is
     * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
     *
     * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
     * network mode, the task fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-networkconfiguration)
     */
    public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    /**
     * The overrides that are associated with a task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-overrides)
     */
    public fun overrides(): Any? = unwrap(this).getOverrides()

    /**
     * An array of placement constraint objects to use for the task.
     *
     * You can specify up to 10 constraints per task (including constraints in the task definition
     * and those specified at runtime).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-placementconstraints)
     */
    public fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

    /**
     * The placement strategy objects to use for the task.
     *
     * You can specify a maximum of five strategy rules per task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-placementstrategy)
     */
    public fun placementStrategy(): Any? = unwrap(this).getPlacementStrategy()

    /**
     * Specifies the platform version for the task.
     *
     * Specify only the numeric portion of the platform version, such as `1.1.0` .
     *
     * This structure is used only if `LaunchType` is `FARGATE` . For more information about valid
     * platform versions, see [AWS Fargate Platform
     * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-platformversion)
     */
    public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated. Tags can only be propagated to the
     * task during task creation. To add tags to a task after task creation, use the `TagResource` API
     * action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-propagatetags)
     */
    public fun propagateTags(): String? = unwrap(this).getPropagateTags()

    /**
     * The reference ID to use for the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-referenceid)
     */
    public fun referenceId(): String? = unwrap(this).getReferenceId()

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define. To learn more,
     * see
     * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
     * in the Amazon ECS API Reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The number of tasks to create based on `TaskDefinition` .
     *
     * The default is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-taskcount)
     */
    public fun taskCount(): Number? = unwrap(this).getTaskCount()

    /**
     * The ARN of the task definition to use if the event target is an Amazon ECS task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-taskdefinitionarn)
     */
    public fun taskDefinitionArn(): String

    /**
     * A builder for [PipeTargetEcsTaskParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       */
      public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable)

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       */
      public fun capacityProviderStrategy(capacityProviderStrategy: List<Any>)

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       */
      public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any)

      /**
       * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
       * task.
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the Amazon Elastic Container Service Developer Guide.
       */
      public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

      /**
       * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
       * task.
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the Amazon Elastic Container Service Developer Guide.
       */
      public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable)

      /**
       * @param enableExecuteCommand Whether or not to enable the execute command functionality for
       * the containers in this task.
       * If true, this enables execute command functionality on all containers in the task.
       */
      public fun enableExecuteCommand(enableExecuteCommand: Boolean)

      /**
       * @param enableExecuteCommand Whether or not to enable the execute command functionality for
       * the containers in this task.
       * If true, this enables execute command functionality on all containers in the task.
       */
      public fun enableExecuteCommand(enableExecuteCommand: IResolvable)

      /**
       * @param group Specifies an Amazon ECS task group for the task.
       * The maximum length is 255 characters.
       */
      public fun group(group: String)

      /**
       * @param launchType Specifies the launch type on which your task is running.
       * The launch type that you specify here must match one of the launch type (compatibilities)
       * of the target task. The `FARGATE` value is supported only in the Regions where AWS Fargate
       * with Amazon ECS is supported. For more information, see [AWS Fargate on Amazon
       * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       */
      public fun launchType(launchType: String)

      /**
       * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
       * network mode.
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       */
      public fun networkConfiguration(networkConfiguration: IResolvable)

      /**
       * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
       * network mode.
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       */
      public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

      /**
       * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
       * network mode.
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c7e89dc9b6033d1ae9fbfb05a091dcfe0b1ddf5eabb920fc47493dc171114b0")
      public
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

      /**
       * @param overrides The overrides that are associated with a task.
       */
      public fun overrides(overrides: IResolvable)

      /**
       * @param overrides The overrides that are associated with a task.
       */
      public fun overrides(overrides: EcsTaskOverrideProperty)

      /**
       * @param overrides The overrides that are associated with a task.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe7b5a319437fa5477d5c6c3f363bf105c7bae2e5d6013e31153919a513fb440")
      public fun overrides(overrides: EcsTaskOverrideProperty.Builder.() -> Unit)

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      public fun placementConstraints(placementConstraints: IResolvable)

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      public fun placementConstraints(placementConstraints: List<Any>)

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      public fun placementConstraints(vararg placementConstraints: Any)

      /**
       * @param placementStrategy The placement strategy objects to use for the task.
       * You can specify a maximum of five strategy rules per task.
       */
      public fun placementStrategy(placementStrategy: IResolvable)

      /**
       * @param placementStrategy The placement strategy objects to use for the task.
       * You can specify a maximum of five strategy rules per task.
       */
      public fun placementStrategy(placementStrategy: List<Any>)

      /**
       * @param placementStrategy The placement strategy objects to use for the task.
       * You can specify a maximum of five strategy rules per task.
       */
      public fun placementStrategy(vararg placementStrategy: Any)

      /**
       * @param platformVersion Specifies the platform version for the task.
       * Specify only the numeric portion of the platform version, such as `1.1.0` .
       *
       * This structure is used only if `LaunchType` is `FARGATE` . For more information about valid
       * platform versions, see [AWS Fargate Platform
       * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun platformVersion(platformVersion: String)

      /**
       * @param propagateTags Specifies whether to propagate the tags from the task definition to
       * the task.
       * If no value is specified, the tags are not propagated. Tags can only be propagated to the
       * task during task creation. To add tags to a task after task creation, use the `TagResource`
       * API action.
       */
      public fun propagateTags(propagateTags: String)

      /**
       * @param referenceId The reference ID to use for the task.
       */
      public fun referenceId(referenceId: String)

      /**
       * @param tags The metadata that you apply to the task to help you categorize and organize
       * them.
       * Each tag consists of a key and an optional value, both of which you define. To learn more,
       * see
       * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
       * in the Amazon ECS API Reference.
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags The metadata that you apply to the task to help you categorize and organize
       * them.
       * Each tag consists of a key and an optional value, both of which you define. To learn more,
       * see
       * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
       * in the Amazon ECS API Reference.
       */
      public fun tags(vararg tags: CfnTag)

      /**
       * @param taskCount The number of tasks to create based on `TaskDefinition` .
       * The default is 1.
       */
      public fun taskCount(taskCount: Number)

      /**
       * @param taskDefinitionArn The ARN of the task definition to use if the event target is an
       * Amazon ECS task. 
       */
      public fun taskDefinitionArn(taskDefinitionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty.builder()

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       */
      override fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.let(IResolvable::unwrap))
      }

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       */
      override fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
      }

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       */
      override fun capacityProviderStrategy(vararg capacityProviderStrategy: Any): Unit =
          capacityProviderStrategy(capacityProviderStrategy.toList())

      /**
       * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
       * task.
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the Amazon Elastic Container Service Developer Guide.
       */
      override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
      }

      /**
       * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
       * task.
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the Amazon Elastic Container Service Developer Guide.
       */
      override fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags.let(IResolvable::unwrap))
      }

      /**
       * @param enableExecuteCommand Whether or not to enable the execute command functionality for
       * the containers in this task.
       * If true, this enables execute command functionality on all containers in the task.
       */
      override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
      }

      /**
       * @param enableExecuteCommand Whether or not to enable the execute command functionality for
       * the containers in this task.
       * If true, this enables execute command functionality on all containers in the task.
       */
      override fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand.let(IResolvable::unwrap))
      }

      /**
       * @param group Specifies an Amazon ECS task group for the task.
       * The maximum length is 255 characters.
       */
      override fun group(group: String) {
        cdkBuilder.group(group)
      }

      /**
       * @param launchType Specifies the launch type on which your task is running.
       * The launch type that you specify here must match one of the launch type (compatibilities)
       * of the target task. The `FARGATE` value is supported only in the Regions where AWS Fargate
       * with Amazon ECS is supported. For more information, see [AWS Fargate on Amazon
       * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       */
      override fun launchType(launchType: String) {
        cdkBuilder.launchType(launchType)
      }

      /**
       * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
       * network mode.
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       */
      override fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
       * network mode.
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       */
      override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
      }

      /**
       * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
       * network mode.
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c7e89dc9b6033d1ae9fbfb05a091dcfe0b1ddf5eabb920fc47493dc171114b0")
      override
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
          Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

      /**
       * @param overrides The overrides that are associated with a task.
       */
      override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
      }

      /**
       * @param overrides The overrides that are associated with a task.
       */
      override fun overrides(overrides: EcsTaskOverrideProperty) {
        cdkBuilder.overrides(overrides.let(EcsTaskOverrideProperty::unwrap))
      }

      /**
       * @param overrides The overrides that are associated with a task.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe7b5a319437fa5477d5c6c3f363bf105c7bae2e5d6013e31153919a513fb440")
      override fun overrides(overrides: EcsTaskOverrideProperty.Builder.() -> Unit): Unit =
          overrides(EcsTaskOverrideProperty(overrides))

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      override fun placementConstraints(placementConstraints: IResolvable) {
        cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
      }

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      override fun placementConstraints(placementConstraints: List<Any>) {
        cdkBuilder.placementConstraints(placementConstraints)
      }

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      override fun placementConstraints(vararg placementConstraints: Any): Unit =
          placementConstraints(placementConstraints.toList())

      /**
       * @param placementStrategy The placement strategy objects to use for the task.
       * You can specify a maximum of five strategy rules per task.
       */
      override fun placementStrategy(placementStrategy: IResolvable) {
        cdkBuilder.placementStrategy(placementStrategy.let(IResolvable::unwrap))
      }

      /**
       * @param placementStrategy The placement strategy objects to use for the task.
       * You can specify a maximum of five strategy rules per task.
       */
      override fun placementStrategy(placementStrategy: List<Any>) {
        cdkBuilder.placementStrategy(placementStrategy)
      }

      /**
       * @param placementStrategy The placement strategy objects to use for the task.
       * You can specify a maximum of five strategy rules per task.
       */
      override fun placementStrategy(vararg placementStrategy: Any): Unit =
          placementStrategy(placementStrategy.toList())

      /**
       * @param platformVersion Specifies the platform version for the task.
       * Specify only the numeric portion of the platform version, such as `1.1.0` .
       *
       * This structure is used only if `LaunchType` is `FARGATE` . For more information about valid
       * platform versions, see [AWS Fargate Platform
       * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
      }

      /**
       * @param propagateTags Specifies whether to propagate the tags from the task definition to
       * the task.
       * If no value is specified, the tags are not propagated. Tags can only be propagated to the
       * task during task creation. To add tags to a task after task creation, use the `TagResource`
       * API action.
       */
      override fun propagateTags(propagateTags: String) {
        cdkBuilder.propagateTags(propagateTags)
      }

      /**
       * @param referenceId The reference ID to use for the task.
       */
      override fun referenceId(referenceId: String) {
        cdkBuilder.referenceId(referenceId)
      }

      /**
       * @param tags The metadata that you apply to the task to help you categorize and organize
       * them.
       * Each tag consists of a key and an optional value, both of which you define. To learn more,
       * see
       * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
       * in the Amazon ECS API Reference.
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      /**
       * @param tags The metadata that you apply to the task to help you categorize and organize
       * them.
       * Each tag consists of a key and an optional value, both of which you define. To learn more,
       * see
       * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
       * in the Amazon ECS API Reference.
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      /**
       * @param taskCount The number of tasks to create based on `TaskDefinition` .
       * The default is 1.
       */
      override fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
      }

      /**
       * @param taskDefinitionArn The ARN of the task definition to use if the event target is an
       * Amazon ECS task. 
       */
      override fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetEcsTaskParametersProperty {
      /**
       * The capacity provider strategy to use for the task.
       *
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-capacityproviderstrategy)
       */
      override fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

      /**
       * Specifies whether to enable Amazon ECS managed tags for the task.
       *
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the Amazon Elastic Container Service Developer Guide.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-enableecsmanagedtags)
       */
      override fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

      /**
       * Whether or not to enable the execute command functionality for the containers in this task.
       *
       * If true, this enables execute command functionality on all containers in the task.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-enableexecutecommand)
       */
      override fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

      /**
       * Specifies an Amazon ECS task group for the task.
       *
       * The maximum length is 255 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-group)
       */
      override fun group(): String? = unwrap(this).getGroup()

      /**
       * Specifies the launch type on which your task is running.
       *
       * The launch type that you specify here must match one of the launch type (compatibilities)
       * of the target task. The `FARGATE` value is supported only in the Regions where AWS Fargate
       * with Amazon ECS is supported. For more information, see [AWS Fargate on Amazon
       * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-launchtype)
       */
      override fun launchType(): String? = unwrap(this).getLaunchType()

      /**
       * Use this structure if the Amazon ECS task uses the `awsvpc` network mode.
       *
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-networkconfiguration)
       */
      override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

      /**
       * The overrides that are associated with a task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-overrides)
       */
      override fun overrides(): Any? = unwrap(this).getOverrides()

      /**
       * An array of placement constraint objects to use for the task.
       *
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-placementconstraints)
       */
      override fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

      /**
       * The placement strategy objects to use for the task.
       *
       * You can specify a maximum of five strategy rules per task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-placementstrategy)
       */
      override fun placementStrategy(): Any? = unwrap(this).getPlacementStrategy()

      /**
       * Specifies the platform version for the task.
       *
       * Specify only the numeric portion of the platform version, such as `1.1.0` .
       *
       * This structure is used only if `LaunchType` is `FARGATE` . For more information about valid
       * platform versions, see [AWS Fargate Platform
       * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-platformversion)
       */
      override fun platformVersion(): String? = unwrap(this).getPlatformVersion()

      /**
       * Specifies whether to propagate the tags from the task definition to the task.
       *
       * If no value is specified, the tags are not propagated. Tags can only be propagated to the
       * task during task creation. To add tags to a task after task creation, use the `TagResource`
       * API action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-propagatetags)
       */
      override fun propagateTags(): String? = unwrap(this).getPropagateTags()

      /**
       * The reference ID to use for the task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-referenceid)
       */
      override fun referenceId(): String? = unwrap(this).getReferenceId()

      /**
       * The metadata that you apply to the task to help you categorize and organize them.
       *
       * Each tag consists of a key and an optional value, both of which you define. To learn more,
       * see
       * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
       * in the Amazon ECS API Reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

      /**
       * The number of tasks to create based on `TaskDefinition` .
       *
       * The default is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-taskcount)
       */
      override fun taskCount(): Number? = unwrap(this).getTaskCount()

      /**
       * The ARN of the task definition to use if the event target is an Amazon ECS task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetecstaskparameters.html#cfn-pipes-pipe-pipetargetecstaskparameters-taskdefinitionarn)
       */
      override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetEcsTaskParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty):
          PipeTargetEcsTaskParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetEcsTaskParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty
    }
  }

  public interface CloudwatchLogsLogDestinationProperty {
    /**
     * The AWS Resource Name (ARN) for the CloudWatch log group to which EventBridge sends the log
     * records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-cloudwatchlogslogdestination.html#cfn-pipes-pipe-cloudwatchlogslogdestination-loggrouparn)
     */
    public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    /**
     * A builder for [CloudwatchLogsLogDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupArn The AWS Resource Name (ARN) for the CloudWatch log group to which
       * EventBridge sends the log records.
       */
      public fun logGroupArn(logGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty.builder()

      /**
       * @param logGroupArn The AWS Resource Name (ARN) for the CloudWatch log group to which
       * EventBridge sends the log records.
       */
      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty,
    ) : CdkObject(cdkObject), CloudwatchLogsLogDestinationProperty {
      /**
       * The AWS Resource Name (ARN) for the CloudWatch log group to which EventBridge sends the log
       * records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-cloudwatchlogslogdestination.html#cfn-pipes-pipe-cloudwatchlogslogdestination-loggrouparn)
       */
      override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudwatchLogsLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty):
          CloudwatchLogsLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchLogsLogDestinationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty
    }
  }

  public interface PlacementStrategyProperty {
    /**
     * The field to apply the placement strategy against.
     *
     * For the spread placement strategy, valid values are instanceId (or host, which has the same
     * effect), or any platform or custom attribute that is applied to a container instance, such as
     * attribute:ecs.availability-zone. For the binpack placement strategy, valid values are cpu and
     * memory. For the random placement strategy, this field is not used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-placementstrategy.html#cfn-pipes-pipe-placementstrategy-field)
     */
    public fun `field`(): String? = unwrap(this).getField()

    /**
     * The type of placement strategy.
     *
     * The random placement strategy randomly places tasks on available candidates. The spread
     * placement strategy spreads placement across available candidates evenly based on the field
     * parameter. The binpack strategy places tasks on available candidates that have the least
     * available amount of the resource that is specified with the field parameter. For example, if you
     * binpack on memory, a task is placed on the instance with the least amount of remaining memory
     * (but still enough to run the task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-placementstrategy.html#cfn-pipes-pipe-placementstrategy-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [PlacementStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param field The field to apply the placement strategy against.
       * For the spread placement strategy, valid values are instanceId (or host, which has the same
       * effect), or any platform or custom attribute that is applied to a container instance, such as
       * attribute:ecs.availability-zone. For the binpack placement strategy, valid values are cpu and
       * memory. For the random placement strategy, this field is not used.
       */
      public fun `field`(`field`: String)

      /**
       * @param type The type of placement strategy.
       * The random placement strategy randomly places tasks on available candidates. The spread
       * placement strategy spreads placement across available candidates evenly based on the field
       * parameter. The binpack strategy places tasks on available candidates that have the least
       * available amount of the resource that is specified with the field parameter. For example, if
       * you binpack on memory, a task is placed on the instance with the least amount of remaining
       * memory (but still enough to run the task).
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty.builder()

      /**
       * @param field The field to apply the placement strategy against.
       * For the spread placement strategy, valid values are instanceId (or host, which has the same
       * effect), or any platform or custom attribute that is applied to a container instance, such as
       * attribute:ecs.availability-zone. For the binpack placement strategy, valid values are cpu and
       * memory. For the random placement strategy, this field is not used.
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      /**
       * @param type The type of placement strategy.
       * The random placement strategy randomly places tasks on available candidates. The spread
       * placement strategy spreads placement across available candidates evenly based on the field
       * parameter. The binpack strategy places tasks on available candidates that have the least
       * available amount of the resource that is specified with the field parameter. For example, if
       * you binpack on memory, a task is placed on the instance with the least amount of remaining
       * memory (but still enough to run the task).
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty,
    ) : CdkObject(cdkObject), PlacementStrategyProperty {
      /**
       * The field to apply the placement strategy against.
       *
       * For the spread placement strategy, valid values are instanceId (or host, which has the same
       * effect), or any platform or custom attribute that is applied to a container instance, such as
       * attribute:ecs.availability-zone. For the binpack placement strategy, valid values are cpu and
       * memory. For the random placement strategy, this field is not used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-placementstrategy.html#cfn-pipes-pipe-placementstrategy-field)
       */
      override fun `field`(): String? = unwrap(this).getField()

      /**
       * The type of placement strategy.
       *
       * The random placement strategy randomly places tasks on available candidates. The spread
       * placement strategy spreads placement across available candidates evenly based on the field
       * parameter. The binpack strategy places tasks on available candidates that have the least
       * available amount of the resource that is specified with the field parameter. For example, if
       * you binpack on memory, a task is placed on the instance with the least amount of remaining
       * memory (but still enough to run the task).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-placementstrategy.html#cfn-pipes-pipe-placementstrategy-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty):
          PlacementStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementStrategyProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty
    }
  }

  public interface PipeTargetRedshiftDataParametersProperty {
    /**
     * The name of the database.
     *
     * Required when authenticating using temporary credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html#cfn-pipes-pipe-pipetargetredshiftdataparameters-database)
     */
    public fun database(): String

    /**
     * The database user name.
     *
     * Required when authenticating using temporary credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html#cfn-pipes-pipe-pipetargetredshiftdataparameters-dbuser)
     */
    public fun dbUser(): String? = unwrap(this).getDbUser()

    /**
     * The name or ARN of the secret that enables access to the database.
     *
     * Required when authenticating using Secrets Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html#cfn-pipes-pipe-pipetargetredshiftdataparameters-secretmanagerarn)
     */
    public fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

    /**
     * The SQL statement text to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html#cfn-pipes-pipe-pipetargetredshiftdataparameters-sqls)
     */
    public fun sqls(): List<String>

    /**
     * The name of the SQL statement.
     *
     * You can name the SQL statement when you create it to identify the query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html#cfn-pipes-pipe-pipetargetredshiftdataparameters-statementname)
     */
    public fun statementName(): String? = unwrap(this).getStatementName()

    /**
     * Indicates whether to send an event back to EventBridge after the SQL statement runs.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html#cfn-pipes-pipe-pipetargetredshiftdataparameters-withevent)
     */
    public fun withEvent(): Any? = unwrap(this).getWithEvent()

    /**
     * A builder for [PipeTargetRedshiftDataParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param database The name of the database. 
       * Required when authenticating using temporary credentials.
       */
      public fun database(database: String)

      /**
       * @param dbUser The database user name.
       * Required when authenticating using temporary credentials.
       */
      public fun dbUser(dbUser: String)

      /**
       * @param secretManagerArn The name or ARN of the secret that enables access to the database.
       * Required when authenticating using Secrets Manager .
       */
      public fun secretManagerArn(secretManagerArn: String)

      /**
       * @param sqls The SQL statement text to run. 
       */
      public fun sqls(sqls: List<String>)

      /**
       * @param sqls The SQL statement text to run. 
       */
      public fun sqls(vararg sqls: String)

      /**
       * @param statementName The name of the SQL statement.
       * You can name the SQL statement when you create it to identify the query.
       */
      public fun statementName(statementName: String)

      /**
       * @param withEvent Indicates whether to send an event back to EventBridge after the SQL
       * statement runs.
       */
      public fun withEvent(withEvent: Boolean)

      /**
       * @param withEvent Indicates whether to send an event back to EventBridge after the SQL
       * statement runs.
       */
      public fun withEvent(withEvent: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty.builder()

      /**
       * @param database The name of the database. 
       * Required when authenticating using temporary credentials.
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param dbUser The database user name.
       * Required when authenticating using temporary credentials.
       */
      override fun dbUser(dbUser: String) {
        cdkBuilder.dbUser(dbUser)
      }

      /**
       * @param secretManagerArn The name or ARN of the secret that enables access to the database.
       * Required when authenticating using Secrets Manager .
       */
      override fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
      }

      /**
       * @param sqls The SQL statement text to run. 
       */
      override fun sqls(sqls: List<String>) {
        cdkBuilder.sqls(sqls)
      }

      /**
       * @param sqls The SQL statement text to run. 
       */
      override fun sqls(vararg sqls: String): Unit = sqls(sqls.toList())

      /**
       * @param statementName The name of the SQL statement.
       * You can name the SQL statement when you create it to identify the query.
       */
      override fun statementName(statementName: String) {
        cdkBuilder.statementName(statementName)
      }

      /**
       * @param withEvent Indicates whether to send an event back to EventBridge after the SQL
       * statement runs.
       */
      override fun withEvent(withEvent: Boolean) {
        cdkBuilder.withEvent(withEvent)
      }

      /**
       * @param withEvent Indicates whether to send an event back to EventBridge after the SQL
       * statement runs.
       */
      override fun withEvent(withEvent: IResolvable) {
        cdkBuilder.withEvent(withEvent.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetRedshiftDataParametersProperty {
      /**
       * The name of the database.
       *
       * Required when authenticating using temporary credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html#cfn-pipes-pipe-pipetargetredshiftdataparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * The database user name.
       *
       * Required when authenticating using temporary credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html#cfn-pipes-pipe-pipetargetredshiftdataparameters-dbuser)
       */
      override fun dbUser(): String? = unwrap(this).getDbUser()

      /**
       * The name or ARN of the secret that enables access to the database.
       *
       * Required when authenticating using Secrets Manager .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html#cfn-pipes-pipe-pipetargetredshiftdataparameters-secretmanagerarn)
       */
      override fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

      /**
       * The SQL statement text to run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html#cfn-pipes-pipe-pipetargetredshiftdataparameters-sqls)
       */
      override fun sqls(): List<String> = unwrap(this).getSqls()

      /**
       * The name of the SQL statement.
       *
       * You can name the SQL statement when you create it to identify the query.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html#cfn-pipes-pipe-pipetargetredshiftdataparameters-statementname)
       */
      override fun statementName(): String? = unwrap(this).getStatementName()

      /**
       * Indicates whether to send an event back to EventBridge after the SQL statement runs.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html#cfn-pipes-pipe-pipetargetredshiftdataparameters-withevent)
       */
      override fun withEvent(): Any? = unwrap(this).getWithEvent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetRedshiftDataParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty):
          PipeTargetRedshiftDataParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetRedshiftDataParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty
    }
  }

  public interface PipeSourceDynamoDBStreamParametersProperty {
    /**
     * The maximum number of records to include in each batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-batchsize)
     */
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * Define the target queue to send dead-letter queue events to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-deadletterconfig)
     */
    public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    /**
     * The maximum length of a time to wait for events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-maximumbatchingwindowinseconds)
     */
    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    /**
     * (Streams only) Discard records older than the specified age.
     *
     * The default value is -1, which sets the maximum age to infinite. When the value is set to
     * infinite, EventBridge never discards old records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-maximumrecordageinseconds)
     */
    public fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

    /**
     * (Streams only) Discard records after the specified number of retries.
     *
     * The default value is -1, which sets the maximum number of retries to infinite. When
     * MaximumRetryAttempts is infinite, EventBridge retries failed records until the record expires in
     * the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-maximumretryattempts)
     */
    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    /**
     * (Streams only) Define how to handle item process failures.
     *
     * `AUTOMATIC_BISECT` halves each batch and retry each half until all the records are processed
     * or there is one failed message left in the batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-onpartialbatchitemfailure)
     */
    public fun onPartialBatchItemFailure(): String? = unwrap(this).getOnPartialBatchItemFailure()

    /**
     * (Streams only) The number of batches to process concurrently from each shard.
     *
     * The default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-parallelizationfactor)
     */
    public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    /**
     * (Streams only) The position in a stream from which to start reading.
     *
     * *Valid values* : `TRIM_HORIZON | LATEST`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-startingposition)
     */
    public fun startingPosition(): String

    /**
     * A builder for [PipeSourceDynamoDBStreamParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      public fun batchSize(batchSize: Number)

      /**
       * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
       */
      public fun deadLetterConfig(deadLetterConfig: IResolvable)

      /**
       * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
       */
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty)

      /**
       * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dacbe92b58839d5ce155c2659703438633ee0c027e107cab3c824896ba6d547e")
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit)

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      /**
       * @param maximumRecordAgeInSeconds (Streams only) Discard records older than the specified
       * age.
       * The default value is -1, which sets the maximum age to infinite. When the value is set to
       * infinite, EventBridge never discards old records.
       */
      public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number)

      /**
       * @param maximumRetryAttempts (Streams only) Discard records after the specified number of
       * retries.
       * The default value is -1, which sets the maximum number of retries to infinite. When
       * MaximumRetryAttempts is infinite, EventBridge retries failed records until the record expires
       * in the event source.
       */
      public fun maximumRetryAttempts(maximumRetryAttempts: Number)

      /**
       * @param onPartialBatchItemFailure (Streams only) Define how to handle item process failures.
       * `AUTOMATIC_BISECT` halves each batch and retry each half until all the records are
       * processed or there is one failed message left in the batch.
       */
      public fun onPartialBatchItemFailure(onPartialBatchItemFailure: String)

      /**
       * @param parallelizationFactor (Streams only) The number of batches to process concurrently
       * from each shard.
       * The default value is 1.
       */
      public fun parallelizationFactor(parallelizationFactor: Number)

      /**
       * @param startingPosition (Streams only) The position in a stream from which to start
       * reading. 
       * *Valid values* : `TRIM_HORIZON | LATEST`
       */
      public fun startingPosition(startingPosition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty.builder()

      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      /**
       * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
       */
      override fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable::unwrap))
      }

      /**
       * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
       */
      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty::unwrap))
      }

      /**
       * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dacbe92b58839d5ce155c2659703438633ee0c027e107cab3c824896ba6d547e")
      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit):
          Unit = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      /**
       * @param maximumRecordAgeInSeconds (Streams only) Discard records older than the specified
       * age.
       * The default value is -1, which sets the maximum age to infinite. When the value is set to
       * infinite, EventBridge never discards old records.
       */
      override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
      }

      /**
       * @param maximumRetryAttempts (Streams only) Discard records after the specified number of
       * retries.
       * The default value is -1, which sets the maximum number of retries to infinite. When
       * MaximumRetryAttempts is infinite, EventBridge retries failed records until the record expires
       * in the event source.
       */
      override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      /**
       * @param onPartialBatchItemFailure (Streams only) Define how to handle item process failures.
       * `AUTOMATIC_BISECT` halves each batch and retry each half until all the records are
       * processed or there is one failed message left in the batch.
       */
      override fun onPartialBatchItemFailure(onPartialBatchItemFailure: String) {
        cdkBuilder.onPartialBatchItemFailure(onPartialBatchItemFailure)
      }

      /**
       * @param parallelizationFactor (Streams only) The number of batches to process concurrently
       * from each shard.
       * The default value is 1.
       */
      override fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
      }

      /**
       * @param startingPosition (Streams only) The position in a stream from which to start
       * reading. 
       * *Valid values* : `TRIM_HORIZON | LATEST`
       */
      override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceDynamoDBStreamParametersProperty {
      /**
       * The maximum number of records to include in each batch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-batchsize)
       */
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      /**
       * Define the target queue to send dead-letter queue events to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-deadletterconfig)
       */
      override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

      /**
       * The maximum length of a time to wait for events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-maximumbatchingwindowinseconds)
       */
      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      /**
       * (Streams only) Discard records older than the specified age.
       *
       * The default value is -1, which sets the maximum age to infinite. When the value is set to
       * infinite, EventBridge never discards old records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-maximumrecordageinseconds)
       */
      override fun maximumRecordAgeInSeconds(): Number? =
          unwrap(this).getMaximumRecordAgeInSeconds()

      /**
       * (Streams only) Discard records after the specified number of retries.
       *
       * The default value is -1, which sets the maximum number of retries to infinite. When
       * MaximumRetryAttempts is infinite, EventBridge retries failed records until the record expires
       * in the event source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-maximumretryattempts)
       */
      override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

      /**
       * (Streams only) Define how to handle item process failures.
       *
       * `AUTOMATIC_BISECT` halves each batch and retry each half until all the records are
       * processed or there is one failed message left in the batch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-onpartialbatchitemfailure)
       */
      override fun onPartialBatchItemFailure(): String? =
          unwrap(this).getOnPartialBatchItemFailure()

      /**
       * (Streams only) The number of batches to process concurrently from each shard.
       *
       * The default value is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-parallelizationfactor)
       */
      override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

      /**
       * (Streams only) The position in a stream from which to start reading.
       *
       * *Valid values* : `TRIM_HORIZON | LATEST`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcedynamodbstreamparameters.html#cfn-pipes-pipe-pipesourcedynamodbstreamparameters-startingposition)
       */
      override fun startingPosition(): String = unwrap(this).getStartingPosition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceDynamoDBStreamParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty):
          PipeSourceDynamoDBStreamParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceDynamoDBStreamParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty
    }
  }

  public interface PipeSourceSelfManagedKafkaParametersProperty {
    /**
     * An array of server URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-additionalbootstrapservers)
     */
    public fun additionalBootstrapServers(): List<String> =
        unwrap(this).getAdditionalBootstrapServers() ?: emptyList()

    /**
     * The maximum number of records to include in each batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-batchsize)
     */
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * The name of the destination queue to consume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-consumergroupid)
     */
    public fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    /**
     * The credentials needed to access the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-credentials)
     */
    public fun credentials(): Any? = unwrap(this).getCredentials()

    /**
     * The maximum length of a time to wait for events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-maximumbatchingwindowinseconds)
     */
    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    /**
     * The ARN of the Secrets Manager secret used for certification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-serverrootcacertificate)
     */
    public fun serverRootCaCertificate(): String? = unwrap(this).getServerRootCaCertificate()

    /**
     * (Streams only) The position in a stream from which to start reading.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-startingposition)
     */
    public fun startingPosition(): String? = unwrap(this).getStartingPosition()

    /**
     * The name of the topic that the pipe will read from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-topicname)
     */
    public fun topicName(): String

    /**
     * This structure specifies the VPC subnets and security groups for the stream, and whether a
     * public IP address is to be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-vpc)
     */
    public fun vpc(): Any? = unwrap(this).getVpc()

    /**
     * A builder for [PipeSourceSelfManagedKafkaParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalBootstrapServers An array of server URLs.
       */
      public fun additionalBootstrapServers(additionalBootstrapServers: List<String>)

      /**
       * @param additionalBootstrapServers An array of server URLs.
       */
      public fun additionalBootstrapServers(vararg additionalBootstrapServers: String)

      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      public fun batchSize(batchSize: Number)

      /**
       * @param consumerGroupId The name of the destination queue to consume.
       */
      public fun consumerGroupId(consumerGroupId: String)

      /**
       * @param credentials The credentials needed to access the resource.
       */
      public fun credentials(credentials: IResolvable)

      /**
       * @param credentials The credentials needed to access the resource.
       */
      public fun credentials(credentials: SelfManagedKafkaAccessConfigurationCredentialsProperty)

      /**
       * @param credentials The credentials needed to access the resource.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("608c4a62fa714f76e72b281f90139567a11defec495b6cac7eb485ac50212b54")
      public
          fun credentials(credentials: SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder.() -> Unit)

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      /**
       * @param serverRootCaCertificate The ARN of the Secrets Manager secret used for
       * certification.
       */
      public fun serverRootCaCertificate(serverRootCaCertificate: String)

      /**
       * @param startingPosition (Streams only) The position in a stream from which to start
       * reading.
       */
      public fun startingPosition(startingPosition: String)

      /**
       * @param topicName The name of the topic that the pipe will read from. 
       */
      public fun topicName(topicName: String)

      /**
       * @param vpc This structure specifies the VPC subnets and security groups for the stream, and
       * whether a public IP address is to be used.
       */
      public fun vpc(vpc: IResolvable)

      /**
       * @param vpc This structure specifies the VPC subnets and security groups for the stream, and
       * whether a public IP address is to be used.
       */
      public fun vpc(vpc: SelfManagedKafkaAccessConfigurationVpcProperty)

      /**
       * @param vpc This structure specifies the VPC subnets and security groups for the stream, and
       * whether a public IP address is to be used.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3254ea480089933b424f01c7d30a3cfb1bafc805fd199f9254325c45c1a3b863")
      public fun vpc(vpc: SelfManagedKafkaAccessConfigurationVpcProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty.builder()

      /**
       * @param additionalBootstrapServers An array of server URLs.
       */
      override fun additionalBootstrapServers(additionalBootstrapServers: List<String>) {
        cdkBuilder.additionalBootstrapServers(additionalBootstrapServers)
      }

      /**
       * @param additionalBootstrapServers An array of server URLs.
       */
      override fun additionalBootstrapServers(vararg additionalBootstrapServers: String): Unit =
          additionalBootstrapServers(additionalBootstrapServers.toList())

      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      /**
       * @param consumerGroupId The name of the destination queue to consume.
       */
      override fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
      }

      /**
       * @param credentials The credentials needed to access the resource.
       */
      override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
      }

      /**
       * @param credentials The credentials needed to access the resource.
       */
      override
          fun credentials(credentials: SelfManagedKafkaAccessConfigurationCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(SelfManagedKafkaAccessConfigurationCredentialsProperty::unwrap))
      }

      /**
       * @param credentials The credentials needed to access the resource.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("608c4a62fa714f76e72b281f90139567a11defec495b6cac7eb485ac50212b54")
      override
          fun credentials(credentials: SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder.() -> Unit):
          Unit = credentials(SelfManagedKafkaAccessConfigurationCredentialsProperty(credentials))

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      /**
       * @param serverRootCaCertificate The ARN of the Secrets Manager secret used for
       * certification.
       */
      override fun serverRootCaCertificate(serverRootCaCertificate: String) {
        cdkBuilder.serverRootCaCertificate(serverRootCaCertificate)
      }

      /**
       * @param startingPosition (Streams only) The position in a stream from which to start
       * reading.
       */
      override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      /**
       * @param topicName The name of the topic that the pipe will read from. 
       */
      override fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
      }

      /**
       * @param vpc This structure specifies the VPC subnets and security groups for the stream, and
       * whether a public IP address is to be used.
       */
      override fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc.let(IResolvable::unwrap))
      }

      /**
       * @param vpc This structure specifies the VPC subnets and security groups for the stream, and
       * whether a public IP address is to be used.
       */
      override fun vpc(vpc: SelfManagedKafkaAccessConfigurationVpcProperty) {
        cdkBuilder.vpc(vpc.let(SelfManagedKafkaAccessConfigurationVpcProperty::unwrap))
      }

      /**
       * @param vpc This structure specifies the VPC subnets and security groups for the stream, and
       * whether a public IP address is to be used.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3254ea480089933b424f01c7d30a3cfb1bafc805fd199f9254325c45c1a3b863")
      override fun vpc(vpc: SelfManagedKafkaAccessConfigurationVpcProperty.Builder.() -> Unit): Unit
          = vpc(SelfManagedKafkaAccessConfigurationVpcProperty(vpc))

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceSelfManagedKafkaParametersProperty {
      /**
       * An array of server URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-additionalbootstrapservers)
       */
      override fun additionalBootstrapServers(): List<String> =
          unwrap(this).getAdditionalBootstrapServers() ?: emptyList()

      /**
       * The maximum number of records to include in each batch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-batchsize)
       */
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      /**
       * The name of the destination queue to consume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-consumergroupid)
       */
      override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

      /**
       * The credentials needed to access the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-credentials)
       */
      override fun credentials(): Any? = unwrap(this).getCredentials()

      /**
       * The maximum length of a time to wait for events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-maximumbatchingwindowinseconds)
       */
      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      /**
       * The ARN of the Secrets Manager secret used for certification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-serverrootcacertificate)
       */
      override fun serverRootCaCertificate(): String? = unwrap(this).getServerRootCaCertificate()

      /**
       * (Streams only) The position in a stream from which to start reading.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-startingposition)
       */
      override fun startingPosition(): String? = unwrap(this).getStartingPosition()

      /**
       * The name of the topic that the pipe will read from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-topicname)
       */
      override fun topicName(): String = unwrap(this).getTopicName()

      /**
       * This structure specifies the VPC subnets and security groups for the stream, and whether a
       * public IP address is to be used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourceselfmanagedkafkaparameters.html#cfn-pipes-pipe-pipesourceselfmanagedkafkaparameters-vpc)
       */
      override fun vpc(): Any? = unwrap(this).getVpc()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceSelfManagedKafkaParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty):
          PipeSourceSelfManagedKafkaParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceSelfManagedKafkaParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty
    }
  }

  public interface PipeSourceKinesisStreamParametersProperty {
    /**
     * The maximum number of records to include in each batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-batchsize)
     */
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * Define the target queue to send dead-letter queue events to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-deadletterconfig)
     */
    public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    /**
     * The maximum length of a time to wait for events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-maximumbatchingwindowinseconds)
     */
    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    /**
     * (Streams only) Discard records older than the specified age.
     *
     * The default value is -1, which sets the maximum age to infinite. When the value is set to
     * infinite, EventBridge never discards old records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-maximumrecordageinseconds)
     */
    public fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

    /**
     * (Streams only) Discard records after the specified number of retries.
     *
     * The default value is -1, which sets the maximum number of retries to infinite. When
     * MaximumRetryAttempts is infinite, EventBridge retries failed records until the record expires in
     * the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-maximumretryattempts)
     */
    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    /**
     * (Streams only) Define how to handle item process failures.
     *
     * `AUTOMATIC_BISECT` halves each batch and retry each half until all the records are processed
     * or there is one failed message left in the batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-onpartialbatchitemfailure)
     */
    public fun onPartialBatchItemFailure(): String? = unwrap(this).getOnPartialBatchItemFailure()

    /**
     * (Streams only) The number of batches to process concurrently from each shard.
     *
     * The default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-parallelizationfactor)
     */
    public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    /**
     * (Streams only) The position in a stream from which to start reading.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-startingposition)
     */
    public fun startingPosition(): String

    /**
     * With `StartingPosition` set to `AT_TIMESTAMP` , the time from which to start reading, in Unix
     * time seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-startingpositiontimestamp)
     */
    public fun startingPositionTimestamp(): String? = unwrap(this).getStartingPositionTimestamp()

    /**
     * A builder for [PipeSourceKinesisStreamParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      public fun batchSize(batchSize: Number)

      /**
       * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
       */
      public fun deadLetterConfig(deadLetterConfig: IResolvable)

      /**
       * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
       */
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty)

      /**
       * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("330804005739bdc46bcac3eab99716eee99837d9c978725c43669bb3a4b7adba")
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit)

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

      /**
       * @param maximumRecordAgeInSeconds (Streams only) Discard records older than the specified
       * age.
       * The default value is -1, which sets the maximum age to infinite. When the value is set to
       * infinite, EventBridge never discards old records.
       */
      public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number)

      /**
       * @param maximumRetryAttempts (Streams only) Discard records after the specified number of
       * retries.
       * The default value is -1, which sets the maximum number of retries to infinite. When
       * MaximumRetryAttempts is infinite, EventBridge retries failed records until the record expires
       * in the event source.
       */
      public fun maximumRetryAttempts(maximumRetryAttempts: Number)

      /**
       * @param onPartialBatchItemFailure (Streams only) Define how to handle item process failures.
       * `AUTOMATIC_BISECT` halves each batch and retry each half until all the records are
       * processed or there is one failed message left in the batch.
       */
      public fun onPartialBatchItemFailure(onPartialBatchItemFailure: String)

      /**
       * @param parallelizationFactor (Streams only) The number of batches to process concurrently
       * from each shard.
       * The default value is 1.
       */
      public fun parallelizationFactor(parallelizationFactor: Number)

      /**
       * @param startingPosition (Streams only) The position in a stream from which to start
       * reading. 
       */
      public fun startingPosition(startingPosition: String)

      /**
       * @param startingPositionTimestamp With `StartingPosition` set to `AT_TIMESTAMP` , the time
       * from which to start reading, in Unix time seconds.
       */
      public fun startingPositionTimestamp(startingPositionTimestamp: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty.builder()

      /**
       * @param batchSize The maximum number of records to include in each batch.
       */
      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      /**
       * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
       */
      override fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable::unwrap))
      }

      /**
       * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
       */
      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty::unwrap))
      }

      /**
       * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("330804005739bdc46bcac3eab99716eee99837d9c978725c43669bb3a4b7adba")
      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit):
          Unit = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

      /**
       * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
       */
      override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      /**
       * @param maximumRecordAgeInSeconds (Streams only) Discard records older than the specified
       * age.
       * The default value is -1, which sets the maximum age to infinite. When the value is set to
       * infinite, EventBridge never discards old records.
       */
      override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
      }

      /**
       * @param maximumRetryAttempts (Streams only) Discard records after the specified number of
       * retries.
       * The default value is -1, which sets the maximum number of retries to infinite. When
       * MaximumRetryAttempts is infinite, EventBridge retries failed records until the record expires
       * in the event source.
       */
      override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      /**
       * @param onPartialBatchItemFailure (Streams only) Define how to handle item process failures.
       * `AUTOMATIC_BISECT` halves each batch and retry each half until all the records are
       * processed or there is one failed message left in the batch.
       */
      override fun onPartialBatchItemFailure(onPartialBatchItemFailure: String) {
        cdkBuilder.onPartialBatchItemFailure(onPartialBatchItemFailure)
      }

      /**
       * @param parallelizationFactor (Streams only) The number of batches to process concurrently
       * from each shard.
       * The default value is 1.
       */
      override fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
      }

      /**
       * @param startingPosition (Streams only) The position in a stream from which to start
       * reading. 
       */
      override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      /**
       * @param startingPositionTimestamp With `StartingPosition` set to `AT_TIMESTAMP` , the time
       * from which to start reading, in Unix time seconds.
       */
      override fun startingPositionTimestamp(startingPositionTimestamp: String) {
        cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty,
    ) : CdkObject(cdkObject), PipeSourceKinesisStreamParametersProperty {
      /**
       * The maximum number of records to include in each batch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-batchsize)
       */
      override fun batchSize(): Number? = unwrap(this).getBatchSize()

      /**
       * Define the target queue to send dead-letter queue events to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-deadletterconfig)
       */
      override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

      /**
       * The maximum length of a time to wait for events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-maximumbatchingwindowinseconds)
       */
      override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      /**
       * (Streams only) Discard records older than the specified age.
       *
       * The default value is -1, which sets the maximum age to infinite. When the value is set to
       * infinite, EventBridge never discards old records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-maximumrecordageinseconds)
       */
      override fun maximumRecordAgeInSeconds(): Number? =
          unwrap(this).getMaximumRecordAgeInSeconds()

      /**
       * (Streams only) Discard records after the specified number of retries.
       *
       * The default value is -1, which sets the maximum number of retries to infinite. When
       * MaximumRetryAttempts is infinite, EventBridge retries failed records until the record expires
       * in the event source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-maximumretryattempts)
       */
      override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

      /**
       * (Streams only) Define how to handle item process failures.
       *
       * `AUTOMATIC_BISECT` halves each batch and retry each half until all the records are
       * processed or there is one failed message left in the batch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-onpartialbatchitemfailure)
       */
      override fun onPartialBatchItemFailure(): String? =
          unwrap(this).getOnPartialBatchItemFailure()

      /**
       * (Streams only) The number of batches to process concurrently from each shard.
       *
       * The default value is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-parallelizationfactor)
       */
      override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

      /**
       * (Streams only) The position in a stream from which to start reading.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-startingposition)
       */
      override fun startingPosition(): String = unwrap(this).getStartingPosition()

      /**
       * With `StartingPosition` set to `AT_TIMESTAMP` , the time from which to start reading, in
       * Unix time seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html#cfn-pipes-pipe-pipesourcekinesisstreamparameters-startingpositiontimestamp)
       */
      override fun startingPositionTimestamp(): String? =
          unwrap(this).getStartingPositionTimestamp()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceKinesisStreamParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty):
          PipeSourceKinesisStreamParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceKinesisStreamParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty
    }
  }

  public interface FilterProperty {
    /**
     * The event pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-filter.html#cfn-pipes-pipe-filter-pattern)
     */
    public fun pattern(): String? = unwrap(this).getPattern()

    /**
     * A builder for [FilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pattern The event pattern.
       */
      public fun pattern(pattern: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty.builder()

      /**
       * @param pattern The event pattern.
       */
      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      /**
       * The event pattern.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-filter.html#cfn-pipes-pipe-filter-pattern)
       */
      override fun pattern(): String? = unwrap(this).getPattern()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty
    }
  }

  public interface BatchArrayPropertiesProperty {
    /**
     * The size of the array, if this is an array batch job.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batcharrayproperties.html#cfn-pipes-pipe-batcharrayproperties-size)
     */
    public fun size(): Number? = unwrap(this).getSize()

    /**
     * A builder for [BatchArrayPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param size The size of the array, if this is an array batch job.
       */
      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty.builder()

      /**
       * @param size The size of the array, if this is an array batch job.
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty,
    ) : CdkObject(cdkObject), BatchArrayPropertiesProperty {
      /**
       * The size of the array, if this is an array batch job.
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batcharrayproperties.html#cfn-pipes-pipe-batcharrayproperties-size)
       */
      override fun size(): Number? = unwrap(this).getSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchArrayPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty):
          BatchArrayPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchArrayPropertiesProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty
    }
  }

  public interface PipeTargetStateMachineParametersProperty {
    /**
     * Specify whether to invoke the Step Functions state machine synchronously or asynchronously.
     *
     * * `REQUEST_RESPONSE` (default) - Invoke synchronously. For more information, see
     * [StartSyncExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartSyncExecution.html)
     * in the *AWS Step Functions API Reference* .
     *
     *
     * `REQUEST_RESPONSE` is not supported for `STANDARD` state machine workflows.
     *
     *
     * * `FIRE_AND_FORGET` - Invoke asynchronously. For more information, see
     * [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     * in the *AWS Step Functions API Reference* .
     *
     * For more information, see [Invocation
     * types](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-invocation)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetstatemachineparameters.html#cfn-pipes-pipe-pipetargetstatemachineparameters-invocationtype)
     */
    public fun invocationType(): String? = unwrap(this).getInvocationType()

    /**
     * A builder for [PipeTargetStateMachineParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param invocationType Specify whether to invoke the Step Functions state machine
       * synchronously or asynchronously.
       * * `REQUEST_RESPONSE` (default) - Invoke synchronously. For more information, see
       * [StartSyncExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartSyncExecution.html)
       * in the *AWS Step Functions API Reference* .
       *
       *
       * `REQUEST_RESPONSE` is not supported for `STANDARD` state machine workflows.
       *
       *
       * * `FIRE_AND_FORGET` - Invoke asynchronously. For more information, see
       * [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
       * in the *AWS Step Functions API Reference* .
       *
       * For more information, see [Invocation
       * types](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-invocation)
       * in the *Amazon EventBridge User Guide* .
       */
      public fun invocationType(invocationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty.builder()

      /**
       * @param invocationType Specify whether to invoke the Step Functions state machine
       * synchronously or asynchronously.
       * * `REQUEST_RESPONSE` (default) - Invoke synchronously. For more information, see
       * [StartSyncExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartSyncExecution.html)
       * in the *AWS Step Functions API Reference* .
       *
       *
       * `REQUEST_RESPONSE` is not supported for `STANDARD` state machine workflows.
       *
       *
       * * `FIRE_AND_FORGET` - Invoke asynchronously. For more information, see
       * [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
       * in the *AWS Step Functions API Reference* .
       *
       * For more information, see [Invocation
       * types](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-invocation)
       * in the *Amazon EventBridge User Guide* .
       */
      override fun invocationType(invocationType: String) {
        cdkBuilder.invocationType(invocationType)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetStateMachineParametersProperty {
      /**
       * Specify whether to invoke the Step Functions state machine synchronously or asynchronously.
       *
       * * `REQUEST_RESPONSE` (default) - Invoke synchronously. For more information, see
       * [StartSyncExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartSyncExecution.html)
       * in the *AWS Step Functions API Reference* .
       *
       *
       * `REQUEST_RESPONSE` is not supported for `STANDARD` state machine workflows.
       *
       *
       * * `FIRE_AND_FORGET` - Invoke asynchronously. For more information, see
       * [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
       * in the *AWS Step Functions API Reference* .
       *
       * For more information, see [Invocation
       * types](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-invocation)
       * in the *Amazon EventBridge User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetstatemachineparameters.html#cfn-pipes-pipe-pipetargetstatemachineparameters-invocationtype)
       */
      override fun invocationType(): String? = unwrap(this).getInvocationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetStateMachineParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty):
          PipeTargetStateMachineParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetStateMachineParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty
    }
  }

  public interface EcsTaskOverrideProperty {
    /**
     * One or more container overrides that are sent to a task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-containeroverrides)
     */
    public fun containerOverrides(): Any? = unwrap(this).getContainerOverrides()

    /**
     * The cpu override for the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-cpu)
     */
    public fun cpu(): String? = unwrap(this).getCpu()

    /**
     * The ephemeral storage setting override for the task.
     *
     *
     * This parameter is only supported for tasks hosted on Fargate that use the following platform
     * versions:
     *
     * * Linux platform version `1.4.0` or later.
     * * Windows platform version `1.0.0` or later.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-ephemeralstorage)
     */
    public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    /**
     * The Amazon Resource Name (ARN) of the task execution IAM role override for the task.
     *
     * For more information, see [Amazon ECS task execution IAM
     * role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-executionrolearn)
     */
    public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /**
     * The Elastic Inference accelerator override for the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-inferenceacceleratoroverrides)
     */
    public fun inferenceAcceleratorOverrides(): Any? =
        unwrap(this).getInferenceAcceleratorOverrides()

    /**
     * The memory override for the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-memory)
     */
    public fun memory(): String? = unwrap(this).getMemory()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume.
     *
     * All containers in this task are granted the permissions that are specified in this role. For
     * more information, see [IAM Role for
     * Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-taskrolearn)
     */
    public fun taskRoleArn(): String? = unwrap(this).getTaskRoleArn()

    /**
     * A builder for [EcsTaskOverrideProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerOverrides One or more container overrides that are sent to a task.
       */
      public fun containerOverrides(containerOverrides: IResolvable)

      /**
       * @param containerOverrides One or more container overrides that are sent to a task.
       */
      public fun containerOverrides(containerOverrides: List<Any>)

      /**
       * @param containerOverrides One or more container overrides that are sent to a task.
       */
      public fun containerOverrides(vararg containerOverrides: Any)

      /**
       * @param cpu The cpu override for the task.
       */
      public fun cpu(cpu: String)

      /**
       * @param ephemeralStorage The ephemeral storage setting override for the task.
       *
       * This parameter is only supported for tasks hosted on Fargate that use the following
       * platform versions:
       *
       * * Linux platform version `1.4.0` or later.
       * * Windows platform version `1.0.0` or later.
       */
      public fun ephemeralStorage(ephemeralStorage: IResolvable)

      /**
       * @param ephemeralStorage The ephemeral storage setting override for the task.
       *
       * This parameter is only supported for tasks hosted on Fargate that use the following
       * platform versions:
       *
       * * Linux platform version `1.4.0` or later.
       * * Windows platform version `1.0.0` or later.
       */
      public fun ephemeralStorage(ephemeralStorage: EcsEphemeralStorageProperty)

      /**
       * @param ephemeralStorage The ephemeral storage setting override for the task.
       *
       * This parameter is only supported for tasks hosted on Fargate that use the following
       * platform versions:
       *
       * * Linux platform version `1.4.0` or later.
       * * Windows platform version `1.0.0` or later.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e66a1eef9e548aa48d8ef188ff03eefebd35f5fd3a521a9c9624ebde2ebe12b")
      public fun ephemeralStorage(ephemeralStorage: EcsEphemeralStorageProperty.Builder.() -> Unit)

      /**
       * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution IAM role
       * override for the task.
       * For more information, see [Amazon ECS task execution IAM
       * role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun executionRoleArn(executionRoleArn: String)

      /**
       * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the
       * task.
       */
      public fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: IResolvable)

      /**
       * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the
       * task.
       */
      public fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: List<Any>)

      /**
       * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the
       * task.
       */
      public fun inferenceAcceleratorOverrides(vararg inferenceAcceleratorOverrides: Any)

      /**
       * @param memory The memory override for the task.
       */
      public fun memory(memory: String)

      /**
       * @param taskRoleArn The Amazon Resource Name (ARN) of the IAM role that containers in this
       * task can assume.
       * All containers in this task are granted the permissions that are specified in this role.
       * For more information, see [IAM Role for
       * Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       */
      public fun taskRoleArn(taskRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty.builder()

      /**
       * @param containerOverrides One or more container overrides that are sent to a task.
       */
      override fun containerOverrides(containerOverrides: IResolvable) {
        cdkBuilder.containerOverrides(containerOverrides.let(IResolvable::unwrap))
      }

      /**
       * @param containerOverrides One or more container overrides that are sent to a task.
       */
      override fun containerOverrides(containerOverrides: List<Any>) {
        cdkBuilder.containerOverrides(containerOverrides)
      }

      /**
       * @param containerOverrides One or more container overrides that are sent to a task.
       */
      override fun containerOverrides(vararg containerOverrides: Any): Unit =
          containerOverrides(containerOverrides.toList())

      /**
       * @param cpu The cpu override for the task.
       */
      override fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
      }

      /**
       * @param ephemeralStorage The ephemeral storage setting override for the task.
       *
       * This parameter is only supported for tasks hosted on Fargate that use the following
       * platform versions:
       *
       * * Linux platform version `1.4.0` or later.
       * * Windows platform version `1.0.0` or later.
       */
      override fun ephemeralStorage(ephemeralStorage: IResolvable) {
        cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
      }

      /**
       * @param ephemeralStorage The ephemeral storage setting override for the task.
       *
       * This parameter is only supported for tasks hosted on Fargate that use the following
       * platform versions:
       *
       * * Linux platform version `1.4.0` or later.
       * * Windows platform version `1.0.0` or later.
       */
      override fun ephemeralStorage(ephemeralStorage: EcsEphemeralStorageProperty) {
        cdkBuilder.ephemeralStorage(ephemeralStorage.let(EcsEphemeralStorageProperty::unwrap))
      }

      /**
       * @param ephemeralStorage The ephemeral storage setting override for the task.
       *
       * This parameter is only supported for tasks hosted on Fargate that use the following
       * platform versions:
       *
       * * Linux platform version `1.4.0` or later.
       * * Windows platform version `1.0.0` or later.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e66a1eef9e548aa48d8ef188ff03eefebd35f5fd3a521a9c9624ebde2ebe12b")
      override
          fun ephemeralStorage(ephemeralStorage: EcsEphemeralStorageProperty.Builder.() -> Unit):
          Unit = ephemeralStorage(EcsEphemeralStorageProperty(ephemeralStorage))

      /**
       * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution IAM role
       * override for the task.
       * For more information, see [Amazon ECS task execution IAM
       * role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
      }

      /**
       * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the
       * task.
       */
      override fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: IResolvable) {
        cdkBuilder.inferenceAcceleratorOverrides(inferenceAcceleratorOverrides.let(IResolvable::unwrap))
      }

      /**
       * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the
       * task.
       */
      override fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: List<Any>) {
        cdkBuilder.inferenceAcceleratorOverrides(inferenceAcceleratorOverrides)
      }

      /**
       * @param inferenceAcceleratorOverrides The Elastic Inference accelerator override for the
       * task.
       */
      override fun inferenceAcceleratorOverrides(vararg inferenceAcceleratorOverrides: Any): Unit =
          inferenceAcceleratorOverrides(inferenceAcceleratorOverrides.toList())

      /**
       * @param memory The memory override for the task.
       */
      override fun memory(memory: String) {
        cdkBuilder.memory(memory)
      }

      /**
       * @param taskRoleArn The Amazon Resource Name (ARN) of the IAM role that containers in this
       * task can assume.
       * All containers in this task are granted the permissions that are specified in this role.
       * For more information, see [IAM Role for
       * Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       */
      override fun taskRoleArn(taskRoleArn: String) {
        cdkBuilder.taskRoleArn(taskRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty,
    ) : CdkObject(cdkObject), EcsTaskOverrideProperty {
      /**
       * One or more container overrides that are sent to a task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-containeroverrides)
       */
      override fun containerOverrides(): Any? = unwrap(this).getContainerOverrides()

      /**
       * The cpu override for the task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-cpu)
       */
      override fun cpu(): String? = unwrap(this).getCpu()

      /**
       * The ephemeral storage setting override for the task.
       *
       *
       * This parameter is only supported for tasks hosted on Fargate that use the following
       * platform versions:
       *
       * * Linux platform version `1.4.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-ephemeralstorage)
       */
      override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

      /**
       * The Amazon Resource Name (ARN) of the task execution IAM role override for the task.
       *
       * For more information, see [Amazon ECS task execution IAM
       * role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-executionrolearn)
       */
      override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

      /**
       * The Elastic Inference accelerator override for the task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-inferenceacceleratoroverrides)
       */
      override fun inferenceAcceleratorOverrides(): Any? =
          unwrap(this).getInferenceAcceleratorOverrides()

      /**
       * The memory override for the task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-memory)
       */
      override fun memory(): String? = unwrap(this).getMemory()

      /**
       * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume.
       *
       * All containers in this task are granted the permissions that are specified in this role.
       * For more information, see [IAM Role for
       * Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecstaskoverride.html#cfn-pipes-pipe-ecstaskoverride-taskrolearn)
       */
      override fun taskRoleArn(): String? = unwrap(this).getTaskRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsTaskOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty):
          EcsTaskOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsTaskOverrideProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty
    }
  }

  public interface PipeEnrichmentHttpParametersProperty {
    /**
     * The headers that need to be sent as part of request invoking the API Gateway REST API or
     * EventBridge ApiDestination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmenthttpparameters.html#cfn-pipes-pipe-pipeenrichmenthttpparameters-headerparameters)
     */
    public fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

    /**
     * The path parameter values to be used to populate API Gateway REST API or EventBridge
     * ApiDestination path wildcards ("*").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmenthttpparameters.html#cfn-pipes-pipe-pipeenrichmenthttpparameters-pathparametervalues)
     */
    public fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
        emptyList()

    /**
     * The query string keys/values that need to be sent as part of request invoking the API Gateway
     * REST API or EventBridge ApiDestination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmenthttpparameters.html#cfn-pipes-pipe-pipeenrichmenthttpparameters-querystringparameters)
     */
    public fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()

    /**
     * A builder for [PipeEnrichmentHttpParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headerParameters The headers that need to be sent as part of request invoking the
       * API Gateway REST API or EventBridge ApiDestination.
       */
      public fun headerParameters(headerParameters: IResolvable)

      /**
       * @param headerParameters The headers that need to be sent as part of request invoking the
       * API Gateway REST API or EventBridge ApiDestination.
       */
      public fun headerParameters(headerParameters: Map<String, String>)

      /**
       * @param pathParameterValues The path parameter values to be used to populate API Gateway
       * REST API or EventBridge ApiDestination path wildcards ("*").
       */
      public fun pathParameterValues(pathParameterValues: List<String>)

      /**
       * @param pathParameterValues The path parameter values to be used to populate API Gateway
       * REST API or EventBridge ApiDestination path wildcards ("*").
       */
      public fun pathParameterValues(vararg pathParameterValues: String)

      /**
       * @param queryStringParameters The query string keys/values that need to be sent as part of
       * request invoking the API Gateway REST API or EventBridge ApiDestination.
       */
      public fun queryStringParameters(queryStringParameters: IResolvable)

      /**
       * @param queryStringParameters The query string keys/values that need to be sent as part of
       * request invoking the API Gateway REST API or EventBridge ApiDestination.
       */
      public fun queryStringParameters(queryStringParameters: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty.builder()

      /**
       * @param headerParameters The headers that need to be sent as part of request invoking the
       * API Gateway REST API or EventBridge ApiDestination.
       */
      override fun headerParameters(headerParameters: IResolvable) {
        cdkBuilder.headerParameters(headerParameters.let(IResolvable::unwrap))
      }

      /**
       * @param headerParameters The headers that need to be sent as part of request invoking the
       * API Gateway REST API or EventBridge ApiDestination.
       */
      override fun headerParameters(headerParameters: Map<String, String>) {
        cdkBuilder.headerParameters(headerParameters)
      }

      /**
       * @param pathParameterValues The path parameter values to be used to populate API Gateway
       * REST API or EventBridge ApiDestination path wildcards ("*").
       */
      override fun pathParameterValues(pathParameterValues: List<String>) {
        cdkBuilder.pathParameterValues(pathParameterValues)
      }

      /**
       * @param pathParameterValues The path parameter values to be used to populate API Gateway
       * REST API or EventBridge ApiDestination path wildcards ("*").
       */
      override fun pathParameterValues(vararg pathParameterValues: String): Unit =
          pathParameterValues(pathParameterValues.toList())

      /**
       * @param queryStringParameters The query string keys/values that need to be sent as part of
       * request invoking the API Gateway REST API or EventBridge ApiDestination.
       */
      override fun queryStringParameters(queryStringParameters: IResolvable) {
        cdkBuilder.queryStringParameters(queryStringParameters.let(IResolvable::unwrap))
      }

      /**
       * @param queryStringParameters The query string keys/values that need to be sent as part of
       * request invoking the API Gateway REST API or EventBridge ApiDestination.
       */
      override fun queryStringParameters(queryStringParameters: Map<String, String>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty,
    ) : CdkObject(cdkObject), PipeEnrichmentHttpParametersProperty {
      /**
       * The headers that need to be sent as part of request invoking the API Gateway REST API or
       * EventBridge ApiDestination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmenthttpparameters.html#cfn-pipes-pipe-pipeenrichmenthttpparameters-headerparameters)
       */
      override fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

      /**
       * The path parameter values to be used to populate API Gateway REST API or EventBridge
       * ApiDestination path wildcards ("*").
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmenthttpparameters.html#cfn-pipes-pipe-pipeenrichmenthttpparameters-pathparametervalues)
       */
      override fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
          emptyList()

      /**
       * The query string keys/values that need to be sent as part of request invoking the API
       * Gateway REST API or EventBridge ApiDestination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmenthttpparameters.html#cfn-pipes-pipe-pipeenrichmenthttpparameters-querystringparameters)
       */
      override fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeEnrichmentHttpParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty):
          PipeEnrichmentHttpParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeEnrichmentHttpParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty
    }
  }

  public interface MSKAccessCredentialsProperty {
    /**
     * The ARN of the Secrets Manager secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-mskaccesscredentials.html#cfn-pipes-pipe-mskaccesscredentials-clientcertificatetlsauth)
     */
    public fun clientCertificateTlsAuth(): String? = unwrap(this).getClientCertificateTlsAuth()

    /**
     * The ARN of the Secrets Manager secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-mskaccesscredentials.html#cfn-pipes-pipe-mskaccesscredentials-saslscram512auth)
     */
    public fun saslScram512Auth(): String? = unwrap(this).getSaslScram512Auth()

    /**
     * A builder for [MSKAccessCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientCertificateTlsAuth The ARN of the Secrets Manager secret.
       */
      public fun clientCertificateTlsAuth(clientCertificateTlsAuth: String)

      /**
       * @param saslScram512Auth The ARN of the Secrets Manager secret.
       */
      public fun saslScram512Auth(saslScram512Auth: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty.builder()

      /**
       * @param clientCertificateTlsAuth The ARN of the Secrets Manager secret.
       */
      override fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
        cdkBuilder.clientCertificateTlsAuth(clientCertificateTlsAuth)
      }

      /**
       * @param saslScram512Auth The ARN of the Secrets Manager secret.
       */
      override fun saslScram512Auth(saslScram512Auth: String) {
        cdkBuilder.saslScram512Auth(saslScram512Auth)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty,
    ) : CdkObject(cdkObject), MSKAccessCredentialsProperty {
      /**
       * The ARN of the Secrets Manager secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-mskaccesscredentials.html#cfn-pipes-pipe-mskaccesscredentials-clientcertificatetlsauth)
       */
      override fun clientCertificateTlsAuth(): String? = unwrap(this).getClientCertificateTlsAuth()

      /**
       * The ARN of the Secrets Manager secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-mskaccesscredentials.html#cfn-pipes-pipe-mskaccesscredentials-saslscram512auth)
       */
      override fun saslScram512Auth(): String? = unwrap(this).getSaslScram512Auth()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MSKAccessCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty):
          MSKAccessCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MSKAccessCredentialsProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty
    }
  }

  public interface EcsResourceRequirementProperty {
    /**
     * The type of resource to assign to a container.
     *
     * The supported values are `GPU` or `InferenceAccelerator` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsresourcerequirement.html#cfn-pipes-pipe-ecsresourcerequirement-type)
     */
    public fun type(): String

    /**
     * The value for the specified resource type.
     *
     * If the `GPU` type is used, the value is the number of physical `GPUs` the Amazon ECS
     * container agent reserves for the container. The number of GPUs that's reserved for all
     * containers in a task can't exceed the number of available GPUs on the container instance that
     * the task is launched on.
     *
     * If the `InferenceAccelerator` type is used, the `value` matches the `deviceName` for an
     * InferenceAccelerator specified in a task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsresourcerequirement.html#cfn-pipes-pipe-ecsresourcerequirement-value)
     */
    public fun `value`(): String

    /**
     * A builder for [EcsResourceRequirementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of resource to assign to a container. 
       * The supported values are `GPU` or `InferenceAccelerator` .
       */
      public fun type(type: String)

      /**
       * @param value The value for the specified resource type. 
       * If the `GPU` type is used, the value is the number of physical `GPUs` the Amazon ECS
       * container agent reserves for the container. The number of GPUs that's reserved for all
       * containers in a task can't exceed the number of available GPUs on the container instance that
       * the task is launched on.
       *
       * If the `InferenceAccelerator` type is used, the `value` matches the `deviceName` for an
       * InferenceAccelerator specified in a task definition.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty.builder()

      /**
       * @param type The type of resource to assign to a container. 
       * The supported values are `GPU` or `InferenceAccelerator` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The value for the specified resource type. 
       * If the `GPU` type is used, the value is the number of physical `GPUs` the Amazon ECS
       * container agent reserves for the container. The number of GPUs that's reserved for all
       * containers in a task can't exceed the number of available GPUs on the container instance that
       * the task is launched on.
       *
       * If the `InferenceAccelerator` type is used, the `value` matches the `deviceName` for an
       * InferenceAccelerator specified in a task definition.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty,
    ) : CdkObject(cdkObject), EcsResourceRequirementProperty {
      /**
       * The type of resource to assign to a container.
       *
       * The supported values are `GPU` or `InferenceAccelerator` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsresourcerequirement.html#cfn-pipes-pipe-ecsresourcerequirement-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The value for the specified resource type.
       *
       * If the `GPU` type is used, the value is the number of physical `GPUs` the Amazon ECS
       * container agent reserves for the container. The number of GPUs that's reserved for all
       * containers in a task can't exceed the number of available GPUs on the container instance that
       * the task is launched on.
       *
       * If the `InferenceAccelerator` type is used, the `value` matches the `deviceName` for an
       * InferenceAccelerator specified in a task definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsresourcerequirement.html#cfn-pipes-pipe-ecsresourcerequirement-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsResourceRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty):
          EcsResourceRequirementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsResourceRequirementProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty
    }
  }

  public interface PipeTargetCloudWatchLogsParametersProperty {
    /**
     * The name of the log stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetcloudwatchlogsparameters.html#cfn-pipes-pipe-pipetargetcloudwatchlogsparameters-logstreamname)
     */
    public fun logStreamName(): String? = unwrap(this).getLogStreamName()

    /**
     * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetcloudwatchlogsparameters.html#cfn-pipes-pipe-pipetargetcloudwatchlogsparameters-timestamp)
     */
    public fun timestamp(): String? = unwrap(this).getTimestamp()

    /**
     * A builder for [PipeTargetCloudWatchLogsParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logStreamName The name of the log stream.
       */
      public fun logStreamName(logStreamName: String)

      /**
       * @param timestamp The time the event occurred, expressed as the number of milliseconds after
       * Jan 1, 1970 00:00:00 UTC.
       */
      public fun timestamp(timestamp: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty.builder()

      /**
       * @param logStreamName The name of the log stream.
       */
      override fun logStreamName(logStreamName: String) {
        cdkBuilder.logStreamName(logStreamName)
      }

      /**
       * @param timestamp The time the event occurred, expressed as the number of milliseconds after
       * Jan 1, 1970 00:00:00 UTC.
       */
      override fun timestamp(timestamp: String) {
        cdkBuilder.timestamp(timestamp)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty,
    ) : CdkObject(cdkObject), PipeTargetCloudWatchLogsParametersProperty {
      /**
       * The name of the log stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetcloudwatchlogsparameters.html#cfn-pipes-pipe-pipetargetcloudwatchlogsparameters-logstreamname)
       */
      override fun logStreamName(): String? = unwrap(this).getLogStreamName()

      /**
       * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970
       * 00:00:00 UTC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetcloudwatchlogsparameters.html#cfn-pipes-pipe-pipetargetcloudwatchlogsparameters-timestamp)
       */
      override fun timestamp(): String? = unwrap(this).getTimestamp()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetCloudWatchLogsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty):
          PipeTargetCloudWatchLogsParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetCloudWatchLogsParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty
    }
  }

  public interface NetworkConfigurationProperty {
    /**
     * Use this structure to specify the VPC subnets and security groups for the task, and whether a
     * public IP address is to be used.
     *
     * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-networkconfiguration.html#cfn-pipes-pipe-networkconfiguration-awsvpcconfiguration)
     */
    public fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()

    /**
     * A builder for [NetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsvpcConfiguration Use this structure to specify the VPC subnets and security
       * groups for the task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       */
      public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable)

      /**
       * @param awsvpcConfiguration Use this structure to specify the VPC subnets and security
       * groups for the task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       */
      public fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty)

      /**
       * @param awsvpcConfiguration Use this structure to specify the VPC subnets and security
       * groups for the task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("015d29762bcaa3c4aa1b0e65a21e6f6ddf4c669c51cab4b6634878489eedb96f")
      public
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty.builder()

      /**
       * @param awsvpcConfiguration Use this structure to specify the VPC subnets and security
       * groups for the task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       */
      override fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param awsvpcConfiguration Use this structure to specify the VPC subnets and security
       * groups for the task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       */
      override fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(AwsVpcConfigurationProperty::unwrap))
      }

      /**
       * @param awsvpcConfiguration Use this structure to specify the VPC subnets and security
       * groups for the task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("015d29762bcaa3c4aa1b0e65a21e6f6ddf4c669c51cab4b6634878489eedb96f")
      override
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsvpcConfiguration(AwsVpcConfigurationProperty(awsvpcConfiguration))

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkConfigurationProperty {
      /**
       * Use this structure to specify the VPC subnets and security groups for the task, and whether
       * a public IP address is to be used.
       *
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-networkconfiguration.html#cfn-pipes-pipe-networkconfiguration-awsvpcconfiguration)
       */
      override fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty
    }
  }
}