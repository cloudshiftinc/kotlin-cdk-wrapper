@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.IDependable
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * FileSystem configurations for the Lambda function.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * import software.constructs.*;
 * Connections connections;
 * IDependable dependable;
 * PolicyStatement policyStatement;
 * FileSystemConfig fileSystemConfig = FileSystemConfig.builder()
 * .arn("arn")
 * .localMountPath("localMountPath")
 * // the properties below are optional
 * .connections(connections)
 * .dependency(List.of(dependable))
 * .policies(List.of(policyStatement))
 * .build();
 * ```
 */
public interface FileSystemConfig {
  /**
   * ARN of the access point.
   */
  public fun arn(): String

  /**
   * connections object used to allow ingress traffic from lambda function.
   *
   * Default: - no connections required to add extra ingress rules for Lambda function
   */
  public fun connections(): Connections? = unwrap(this).getConnections()?.let(Connections::wrap)

  /**
   * array of IDependable that lambda function depends on.
   *
   * Default: - no dependency
   */
  public fun dependency(): List<IDependable> = unwrap(this).getDependency()?.map(IDependable::wrap)
      ?: emptyList()

  /**
   * mount path in the lambda runtime environment.
   */
  public fun localMountPath(): String

  /**
   * additional IAM policies required for the lambda function.
   *
   * Default: - no additional policies required
   */
  public fun policies(): List<PolicyStatement> =
      unwrap(this).getPolicies()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * A builder for [FileSystemConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arn ARN of the access point. 
     */
    public fun arn(arn: String)

    /**
     * @param connections connections object used to allow ingress traffic from lambda function.
     */
    public fun connections(connections: Connections)

    /**
     * @param connections connections object used to allow ingress traffic from lambda function.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5ebd5e04fa849f60402f17bfc35c14dd123c06f6ebf505342c0216705c69e79")
    public fun connections(connections: Connections.Builder.() -> Unit)

    /**
     * @param dependency array of IDependable that lambda function depends on.
     */
    public fun dependency(dependency: List<IDependable>)

    /**
     * @param dependency array of IDependable that lambda function depends on.
     */
    public fun dependency(vararg dependency: IDependable)

    /**
     * @param localMountPath mount path in the lambda runtime environment. 
     */
    public fun localMountPath(localMountPath: String)

    /**
     * @param policies additional IAM policies required for the lambda function.
     */
    public fun policies(policies: List<PolicyStatement>)

    /**
     * @param policies additional IAM policies required for the lambda function.
     */
    public fun policies(vararg policies: PolicyStatement)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FileSystemConfig.Builder =
        software.amazon.awscdk.services.lambda.FileSystemConfig.builder()

    /**
     * @param arn ARN of the access point. 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * @param connections connections object used to allow ingress traffic from lambda function.
     */
    override fun connections(connections: Connections) {
      cdkBuilder.connections(connections.let(Connections.Companion::unwrap))
    }

    /**
     * @param connections connections object used to allow ingress traffic from lambda function.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5ebd5e04fa849f60402f17bfc35c14dd123c06f6ebf505342c0216705c69e79")
    override fun connections(connections: Connections.Builder.() -> Unit): Unit =
        connections(Connections(connections))

    /**
     * @param dependency array of IDependable that lambda function depends on.
     */
    override fun dependency(dependency: List<IDependable>) {
      cdkBuilder.dependency(dependency.map(IDependable.Companion::unwrap))
    }

    /**
     * @param dependency array of IDependable that lambda function depends on.
     */
    override fun dependency(vararg dependency: IDependable): Unit = dependency(dependency.toList())

    /**
     * @param localMountPath mount path in the lambda runtime environment. 
     */
    override fun localMountPath(localMountPath: String) {
      cdkBuilder.localMountPath(localMountPath)
    }

    /**
     * @param policies additional IAM policies required for the lambda function.
     */
    override fun policies(policies: List<PolicyStatement>) {
      cdkBuilder.policies(policies.map(PolicyStatement.Companion::unwrap))
    }

    /**
     * @param policies additional IAM policies required for the lambda function.
     */
    override fun policies(vararg policies: PolicyStatement): Unit = policies(policies.toList())

    public fun build(): software.amazon.awscdk.services.lambda.FileSystemConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.FileSystemConfig,
  ) : CdkObject(cdkObject), FileSystemConfig {
    /**
     * ARN of the access point.
     */
    override fun arn(): String = unwrap(this).getArn()

    /**
     * connections object used to allow ingress traffic from lambda function.
     *
     * Default: - no connections required to add extra ingress rules for Lambda function
     */
    override fun connections(): Connections? = unwrap(this).getConnections()?.let(Connections::wrap)

    /**
     * array of IDependable that lambda function depends on.
     *
     * Default: - no dependency
     */
    override fun dependency(): List<IDependable> =
        unwrap(this).getDependency()?.map(IDependable::wrap) ?: emptyList()

    /**
     * mount path in the lambda runtime environment.
     */
    override fun localMountPath(): String = unwrap(this).getLocalMountPath()

    /**
     * additional IAM policies required for the lambda function.
     *
     * Default: - no additional policies required
     */
    override fun policies(): List<PolicyStatement> =
        unwrap(this).getPolicies()?.map(PolicyStatement::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FileSystemConfig):
        FileSystemConfig = CdkObjectWrappers.wrap(cdkObject) as? FileSystemConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemConfig):
        software.amazon.awscdk.services.lambda.FileSystemConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.FileSystemConfig
  }
}
