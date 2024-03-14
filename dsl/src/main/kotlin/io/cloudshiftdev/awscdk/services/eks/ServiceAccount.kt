package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.services.iam.AddToPrincipalPolicyResult
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.iam.PrincipalPolicyFragment
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ServiceAccount internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.ServiceAccount,
) : CloudshiftdevConstructsConstruct(cdkObject), IPrincipal {
  public override fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult =
      unwrap(this).addToPrincipalPolicy(statement.let(PolicyStatement::unwrap)).let(AddToPrincipalPolicyResult::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
  public override fun addToPrincipalPolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(statement))

  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public open fun serviceAccountName(): String = unwrap(this).getServiceAccountName()

  public open fun serviceAccountNamespace(): String = unwrap(this).getServiceAccountNamespace()

  public interface Builder {
    public fun annotations(annotations: Map<String, String>) {
    }

    public fun cluster(cluster: ICluster) {
    }

    public fun labels(labels: Map<String, String>) {
    }

    public fun name(name: String) {
    }

    public fun namespace(namespace: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.ServiceAccount.Builder =
        software.amazon.awscdk.services.eks.ServiceAccount.Builder.create(scope, id)

    public override fun annotations(annotations: Map<String, String>) {
      cdkBuilder.annotations(annotations)
    }

    public override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    public fun build(): software.amazon.awscdk.services.eks.ServiceAccount = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ServiceAccount {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ServiceAccount(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.ServiceAccount): ServiceAccount
        = ServiceAccount(cdkObject)

    internal fun unwrap(wrapped: ServiceAccount): software.amazon.awscdk.services.eks.ServiceAccount
        = wrapped.cdkObject
  }
}
