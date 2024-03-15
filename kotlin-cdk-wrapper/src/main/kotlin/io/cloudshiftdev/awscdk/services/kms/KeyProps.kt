@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface KeyProps {
  public fun admins(): List<IPrincipal> = unwrap(this).getAdmins()?.map(IPrincipal::wrap) ?:
      emptyList()

  public fun alias(): String? = unwrap(this).getAlias()

  public fun description(): String? = unwrap(this).getDescription()

  public fun enableKeyRotation(): Boolean? = unwrap(this).getEnableKeyRotation()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun keySpec(): KeySpec? = unwrap(this).getKeySpec()?.let(KeySpec::wrap)

  public fun keyUsage(): KeyUsage? = unwrap(this).getKeyUsage()?.let(KeyUsage::wrap)

  public fun pendingWindow(): Duration? = unwrap(this).getPendingWindow()?.let(Duration::wrap)

  public fun policy(): PolicyDocument? = unwrap(this).getPolicy()?.let(PolicyDocument::wrap)

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun admins(admins: List<IPrincipal>)

    public fun admins(vararg admins: IPrincipal)

    public fun alias(alias: String)

    public fun description(description: String)

    public fun enableKeyRotation(enableKeyRotation: Boolean)

    public fun enabled(enabled: Boolean)

    public fun keySpec(keySpec: KeySpec)

    public fun keyUsage(keyUsage: KeyUsage)

    public fun pendingWindow(pendingWindow: Duration)

    public fun policy(policy: PolicyDocument)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91d06a29a428f9db400977a007619b727c707abbeffd97a3576933f2faaa093f")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.KeyProps.Builder =
        software.amazon.awscdk.services.kms.KeyProps.builder()

    override fun admins(admins: List<IPrincipal>) {
      cdkBuilder.admins(admins.map(IPrincipal::unwrap))
    }

    override fun admins(vararg admins: IPrincipal): Unit = admins(admins.toList())

    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun keySpec(keySpec: KeySpec) {
      cdkBuilder.keySpec(keySpec.let(KeySpec::unwrap))
    }

    override fun keyUsage(keyUsage: KeyUsage) {
      cdkBuilder.keyUsage(keyUsage.let(KeyUsage::unwrap))
    }

    override fun pendingWindow(pendingWindow: Duration) {
      cdkBuilder.pendingWindow(pendingWindow.let(Duration::unwrap))
    }

    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91d06a29a428f9db400977a007619b727c707abbeffd97a3576933f2faaa093f")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kms.KeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kms.KeyProps,
  ) : CdkObject(cdkObject), KeyProps {
    override fun admins(): List<IPrincipal> = unwrap(this).getAdmins()?.map(IPrincipal::wrap) ?:
        emptyList()

    override fun alias(): String? = unwrap(this).getAlias()

    override fun description(): String? = unwrap(this).getDescription()

    override fun enableKeyRotation(): Boolean? = unwrap(this).getEnableKeyRotation()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun keySpec(): KeySpec? = unwrap(this).getKeySpec()?.let(KeySpec::wrap)

    override fun keyUsage(): KeyUsage? = unwrap(this).getKeyUsage()?.let(KeyUsage::wrap)

    override fun pendingWindow(): Duration? = unwrap(this).getPendingWindow()?.let(Duration::wrap)

    override fun policy(): PolicyDocument? = unwrap(this).getPolicy()?.let(PolicyDocument::wrap)

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.KeyProps): KeyProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyProps): software.amazon.awscdk.services.kms.KeyProps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.kms.KeyProps
  }
}
