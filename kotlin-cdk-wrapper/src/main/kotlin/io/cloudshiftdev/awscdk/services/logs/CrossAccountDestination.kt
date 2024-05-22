@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A new CloudWatch Logs Destination for use in cross-account scenarios.
 *
 * CrossAccountDestinations are used to subscribe a Kinesis stream in a
 * different account to a CloudWatch Subscription.
 *
 * Consumers will hardly ever need to use this class. Instead, directly
 * subscribe a Kinesis stream using the integration class in the
 * `aws-cdk-lib/aws-logs-destinations` package; if necessary, a
 * `CrossAccountDestination` will be created automatically.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * Role role;
 * CrossAccountDestination crossAccountDestination = CrossAccountDestination.Builder.create(this,
 * "MyCrossAccountDestination")
 * .role(role)
 * .targetArn("targetArn")
 * // the properties below are optional
 * .destinationName("destinationName")
 * .build();
 * ```
 */
public open class CrossAccountDestination(
  cdkObject: software.amazon.awscdk.services.logs.CrossAccountDestination,
) : Resource(cdkObject), ILogSubscriptionDestination {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CrossAccountDestinationProps,
  ) :
      this(software.amazon.awscdk.services.logs.CrossAccountDestination(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CrossAccountDestinationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CrossAccountDestinationProps.Builder.() -> Unit,
  ) : this(scope, id, CrossAccountDestinationProps(props)
  )

  /**
   * @param statement 
   */
  public open fun addToPolicy(statement: PolicyStatement) {
    unwrap(this).addToPolicy(statement.let(PolicyStatement.Companion::unwrap))
  }

  /**
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2eea211fe501e0e50683eae70fa3c2771f31519727d8e172bc0eb1dfa9f6b6cb")
  public open fun addToPolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToPolicy(PolicyStatement(statement))

  /**
   * Return the properties required to send subscription events to this destination.
   *
   * If necessary, the destination can use the properties of the SubscriptionFilter
   * object itself to configure its permissions to allow the subscription to write
   * to it.
   *
   * The destination may reconfigure its own permissions in response to this
   * function call.
   *
   * @param _scope 
   * @param _sourceLogGroup 
   */
  public override fun bind(scope: CloudshiftdevConstructsConstruct, sourceLogGroup: ILogGroup):
      LogSubscriptionDestinationConfig =
      unwrap(this).bind(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      sourceLogGroup.let(ILogGroup.Companion::unwrap)).let(LogSubscriptionDestinationConfig::wrap)

  /**
   * The ARN of this CrossAccountDestination object.
   */
  public open fun destinationArn(): String = unwrap(this).getDestinationArn()

  /**
   * The name of this CrossAccountDestination object.
   */
  public open fun destinationName(): String = unwrap(this).getDestinationName()

  /**
   * Policy object of this CrossAccountDestination object.
   */
  public open fun policyDocument(): PolicyDocument =
      unwrap(this).getPolicyDocument().let(PolicyDocument::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CrossAccountDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the log destination.
     *
     * Default: Automatically generated
     *
     * @param destinationName The name of the log destination. 
     */
    public fun destinationName(destinationName: String)

    /**
     * The role to assume that grants permissions to write to 'target'.
     *
     * The role must be assumable by 'logs.{REGION}.amazonaws.com'.
     *
     * @param role The role to assume that grants permissions to write to 'target'. 
     */
    public fun role(role: IRole)

    /**
     * The log destination target's ARN.
     *
     * @param targetArn The log destination target's ARN. 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CrossAccountDestination.Builder =
        software.amazon.awscdk.services.logs.CrossAccountDestination.Builder.create(scope, id)

    /**
     * The name of the log destination.
     *
     * Default: Automatically generated
     *
     * @param destinationName The name of the log destination. 
     */
    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    /**
     * The role to assume that grants permissions to write to 'target'.
     *
     * The role must be assumable by 'logs.{REGION}.amazonaws.com'.
     *
     * @param role The role to assume that grants permissions to write to 'target'. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The log destination target's ARN.
     *
     * @param targetArn The log destination target's ARN. 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.logs.CrossAccountDestination =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CrossAccountDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CrossAccountDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CrossAccountDestination):
        CrossAccountDestination = CrossAccountDestination(cdkObject)

    internal fun unwrap(wrapped: CrossAccountDestination):
        software.amazon.awscdk.services.logs.CrossAccountDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.CrossAccountDestination
  }
}
