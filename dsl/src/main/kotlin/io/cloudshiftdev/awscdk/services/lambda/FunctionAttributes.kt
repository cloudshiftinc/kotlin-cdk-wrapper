package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface FunctionAttributes {
  public fun architecture(): Architecture? = unwrap(this).getArchitecture()?.let(Architecture::wrap)

  public fun functionArn(): String

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun sameEnvironment(): Boolean? = unwrap(this).getSameEnvironment()

  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  public fun skipPermissions(): Boolean? = unwrap(this).getSkipPermissions()

  public interface Builder {
    public fun architecture(architecture: Architecture)

    public fun functionArn(functionArn: String)

    public fun role(role: IRole)

    public fun sameEnvironment(sameEnvironment: Boolean)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun skipPermissions(skipPermissions: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FunctionAttributes.Builder =
        software.amazon.awscdk.services.lambda.FunctionAttributes.builder()

    override fun architecture(architecture: Architecture) {
      cdkBuilder.architecture(architecture.let(Architecture::unwrap))
    }

    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun sameEnvironment(sameEnvironment: Boolean) {
      cdkBuilder.sameEnvironment(sameEnvironment)
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun skipPermissions(skipPermissions: Boolean) {
      cdkBuilder.skipPermissions(skipPermissions)
    }

    public fun build(): software.amazon.awscdk.services.lambda.FunctionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.FunctionAttributes,
  ) : FunctionAttributes {
    override fun architecture(): Architecture? =
        unwrap(this).getArchitecture()?.let(Architecture::wrap)

    override fun functionArn(): String = unwrap(this).getFunctionArn()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun sameEnvironment(): Boolean? = unwrap(this).getSameEnvironment()

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun skipPermissions(): Boolean? = unwrap(this).getSkipPermissions()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionAttributes):
        FunctionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionAttributes):
        software.amazon.awscdk.services.lambda.FunctionAttributes = (wrapped as Wrapper).cdkObject
  }
}
