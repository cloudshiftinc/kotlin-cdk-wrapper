@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Kinesis Stream Consumer.
 *
 * Example:
 *
 * ```
 * Role lambdaRole = Role.Builder.create(this, "Role")
 * .assumedBy(new ServicePrincipal("lambda.amazonaws.com"))
 * .description("Example role...")
 * .build();
 * Stream stream = Stream.Builder.create(this, "MyEncryptedStream")
 * .encryption(StreamEncryption.KMS)
 * .build();
 * StreamConsumer streamConsumer = StreamConsumer.Builder.create(this, "MyStreamConsumer")
 * .streamConsumerName("MyStreamConsumer")
 * .stream(stream)
 * .build();
 * // give lambda permissions to read stream via the stream consumer
 * streamConsumer.grantRead(lambdaRole);
 * ```
 */
public open class StreamConsumer(
  cdkObject: software.amazon.awscdk.services.kinesis.StreamConsumer,
) : Resource(cdkObject),
    IStreamConsumer {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StreamConsumerProps,
  ) :
      this(software.amazon.awscdk.services.kinesis.StreamConsumer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(StreamConsumerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StreamConsumerProps.Builder.() -> Unit,
  ) : this(scope, id, StreamConsumerProps(props)
  )

  /**
   * Adds a statement to the IAM resource policy associated with this stream consumer.
   *
   * If this stream consumer was created in this stack (`new StreamConsumer`), a resource policy
   * will be automatically created upon the first call to `addToResourcePolicy`. If
   * the stream is imported (`StreamConsumer.from`), then this is a no-op.
   *
   * @param statement 
   */
  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToResourcePolicyResult::wrap)

  /**
   * Adds a statement to the IAM resource policy associated with this stream consumer.
   *
   * If this stream consumer was created in this stack (`new StreamConsumer`), a resource policy
   * will be automatically created upon the first call to `addToResourcePolicy`. If
   * the stream is imported (`StreamConsumer.from`), then this is a no-op.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  /**
   * Grant the indicated permissions on this stream consumer to the given IAM principal
   * (Role/Group/User).
   *
   * @param grantee 
   * @param actions 
   */
  public override fun grant(grantee: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
      *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

  /**
   * Grant read permissions for this stream consumer and its associated stream to an IAM principal
   * (Role/Group/User).
   *
   * @param grantee 
   */
  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * The Kinesis data stream this consumer is associated with.
   */
  public override fun stream(): IStream = unwrap(this).getStream().let(IStream::wrap)

  /**
   * The Amazon Resource Name (ARN) of the stream consumer.
   */
  public override fun streamConsumerArn(): String = unwrap(this).getStreamConsumerArn()

  /**
   * The name of the stream consumer.
   */
  public override fun streamConsumerName(): String = unwrap(this).getStreamConsumerName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesis.StreamConsumer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Kinesis data stream to associate this consumer with.
     *
     * @param stream The Kinesis data stream to associate this consumer with. 
     */
    public fun stream(stream: IStream)

    /**
     * The name of the stream consumer.
     *
     * @param streamConsumerName The name of the stream consumer. 
     */
    public fun streamConsumerName(streamConsumerName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.StreamConsumer.Builder =
        software.amazon.awscdk.services.kinesis.StreamConsumer.Builder.create(scope, id)

    /**
     * The Kinesis data stream to associate this consumer with.
     *
     * @param stream The Kinesis data stream to associate this consumer with. 
     */
    override fun stream(stream: IStream) {
      cdkBuilder.stream(stream.let(IStream.Companion::unwrap))
    }

    /**
     * The name of the stream consumer.
     *
     * @param streamConsumerName The name of the stream consumer. 
     */
    override fun streamConsumerName(streamConsumerName: String) {
      cdkBuilder.streamConsumerName(streamConsumerName)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.StreamConsumer = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.kinesis.StreamConsumer.PROPERTY_INJECTION_ID

    public fun fromStreamConsumerArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      streamConsumerArn: String,
    ): IStreamConsumer =
        software.amazon.awscdk.services.kinesis.StreamConsumer.fromStreamConsumerArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, streamConsumerArn).let(IStreamConsumer::wrap)

    public fun fromStreamConsumerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: StreamConsumerAttributes,
    ): IStreamConsumer =
        software.amazon.awscdk.services.kinesis.StreamConsumer.fromStreamConsumerAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(StreamConsumerAttributes.Companion::unwrap)).let(IStreamConsumer::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99385d55941099fc8bec857652df88a1fe80095416e1c179a119c384cda2c64f")
    public fun fromStreamConsumerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: StreamConsumerAttributes.Builder.() -> Unit,
    ): IStreamConsumer = fromStreamConsumerAttributes(scope, id, StreamConsumerAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): StreamConsumer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return StreamConsumer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.StreamConsumer):
        StreamConsumer = StreamConsumer(cdkObject)

    internal fun unwrap(wrapped: StreamConsumer):
        software.amazon.awscdk.services.kinesis.StreamConsumer = wrapped.cdkObject as
        software.amazon.awscdk.services.kinesis.StreamConsumer
  }
}
