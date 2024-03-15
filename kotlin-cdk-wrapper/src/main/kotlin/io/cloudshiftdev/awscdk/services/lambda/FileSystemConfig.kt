@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.IDependable
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface FileSystemConfig {
  public fun arn(): String

  public fun connections(): Connections? = unwrap(this).getConnections()?.let(Connections::wrap)

  public fun dependency(): List<IDependable> = unwrap(this).getDependency()?.map(IDependable::wrap)
      ?: emptyList()

  public fun localMountPath(): String

  public fun policies(): List<PolicyStatement> =
      unwrap(this).getPolicies()?.map(PolicyStatement::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun arn(arn: String)

    public fun connections(connections: Connections)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5ebd5e04fa849f60402f17bfc35c14dd123c06f6ebf505342c0216705c69e79")
    public fun connections(connections: Connections.Builder.() -> Unit)

    public fun dependency(dependency: List<IDependable>)

    public fun dependency(vararg dependency: IDependable)

    public fun localMountPath(localMountPath: String)

    public fun policies(policies: List<PolicyStatement>)

    public fun policies(vararg policies: PolicyStatement)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FileSystemConfig.Builder =
        software.amazon.awscdk.services.lambda.FileSystemConfig.builder()

    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    override fun connections(connections: Connections) {
      cdkBuilder.connections(connections.let(Connections::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5ebd5e04fa849f60402f17bfc35c14dd123c06f6ebf505342c0216705c69e79")
    override fun connections(connections: Connections.Builder.() -> Unit): Unit =
        connections(Connections(connections))

    override fun dependency(dependency: List<IDependable>) {
      cdkBuilder.dependency(dependency.map(IDependable::unwrap))
    }

    override fun dependency(vararg dependency: IDependable): Unit = dependency(dependency.toList())

    override fun localMountPath(localMountPath: String) {
      cdkBuilder.localMountPath(localMountPath)
    }

    override fun policies(policies: List<PolicyStatement>) {
      cdkBuilder.policies(policies.map(PolicyStatement::unwrap))
    }

    override fun policies(vararg policies: PolicyStatement): Unit = policies(policies.toList())

    public fun build(): software.amazon.awscdk.services.lambda.FileSystemConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.FileSystemConfig,
  ) : CdkObject(cdkObject), FileSystemConfig {
    override fun arn(): String = unwrap(this).getArn()

    override fun connections(): Connections? = unwrap(this).getConnections()?.let(Connections::wrap)

    override fun dependency(): List<IDependable> =
        unwrap(this).getDependency()?.map(IDependable::wrap) ?: emptyList()

    override fun localMountPath(): String = unwrap(this).getLocalMountPath()

    override fun policies(): List<PolicyStatement> =
        unwrap(this).getPolicies()?.map(PolicyStatement::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FileSystemConfig):
        FileSystemConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemConfig):
        software.amazon.awscdk.services.lambda.FileSystemConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.FileSystemConfig
  }
}
