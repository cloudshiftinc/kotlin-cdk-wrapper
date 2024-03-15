@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface StageProps {
  public fun env(): Environment? = unwrap(this).getEnv()?.let(Environment::wrap)

  public fun outdir(): String? = unwrap(this).getOutdir()

  public fun permissionsBoundary(): PermissionsBoundary? =
      unwrap(this).getPermissionsBoundary()?.let(PermissionsBoundary::wrap)

  public fun policyValidationBeta1(): List<IPolicyValidationPluginBeta1> =
      unwrap(this).getPolicyValidationBeta1()?.map(IPolicyValidationPluginBeta1::wrap) ?:
      emptyList()

  public fun stageName(): String? = unwrap(this).getStageName()

  @CdkDslMarker
  public interface Builder {
    public fun env(env: Environment)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d5d98f94c57171b02019bdc4ddef1b892e8c2707d946056f79dfbd7b0be7b3a")
    public fun env(env: Environment.Builder.() -> Unit)

    public fun outdir(outdir: String)

    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary)

    public fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>)

    public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1)

    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.StageProps.Builder =
        software.amazon.awscdk.StageProps.builder()

    override fun env(env: Environment) {
      cdkBuilder.env(env.let(Environment::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d5d98f94c57171b02019bdc4ddef1b892e8c2707d946056f79dfbd7b0be7b3a")
    override fun env(env: Environment.Builder.() -> Unit): Unit = env(Environment(env))

    override fun outdir(outdir: String) {
      cdkBuilder.outdir(outdir)
    }

    override fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(PermissionsBoundary::unwrap))
    }

    override fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>) {
      cdkBuilder.policyValidationBeta1(policyValidationBeta1.map(IPolicyValidationPluginBeta1::unwrap))
    }

    override fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1):
        Unit = policyValidationBeta1(policyValidationBeta1.toList())

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.StageProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.StageProps,
  ) : CdkObject(cdkObject), StageProps {
    override fun env(): Environment? = unwrap(this).getEnv()?.let(Environment::wrap)

    override fun outdir(): String? = unwrap(this).getOutdir()

    override fun permissionsBoundary(): PermissionsBoundary? =
        unwrap(this).getPermissionsBoundary()?.let(PermissionsBoundary::wrap)

    override fun policyValidationBeta1(): List<IPolicyValidationPluginBeta1> =
        unwrap(this).getPolicyValidationBeta1()?.map(IPolicyValidationPluginBeta1::wrap) ?:
        emptyList()

    override fun stageName(): String? = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.StageProps): StageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageProps): software.amazon.awscdk.StageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.StageProps
  }
}
