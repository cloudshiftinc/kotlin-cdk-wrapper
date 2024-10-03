@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.AddToPrincipalPolicyResult
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.iam.PrincipalPolicyFragment
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Service Account.
 *
 * Example:
 *
 * ```
 * // or create a new one using an existing issuer url
 * String issuerUrl;
 * // you can import an existing provider
 * IOpenIdConnectProvider provider = OpenIdConnectProvider.fromOpenIdConnectProviderArn(this,
 * "Provider", "arn:aws:iam::123456:oidc-provider/oidc.eks.eu-west-1.amazonaws.com/id/AB123456ABC");
 * OpenIdConnectProvider provider2 = OpenIdConnectProvider.Builder.create(this, "Provider")
 * .url(issuerUrl)
 * .build();
 * ICluster cluster = Cluster.fromClusterAttributes(this, "MyCluster", ClusterAttributes.builder()
 * .clusterName("Cluster")
 * .openIdConnectProvider(provider)
 * .kubectlRoleArn("arn:aws:iam::123456:role/service-role/k8sservicerole")
 * .build());
 * ServiceAccount serviceAccount = cluster.addServiceAccount("MyServiceAccount");
 * Bucket bucket = new Bucket(this, "Bucket");
 * bucket.grantReadWrite(serviceAccount);
 * ```
 */
public open class ServiceAccount(
  cdkObject: software.amazon.awscdk.services.eks.ServiceAccount,
) : CloudshiftdevConstructsConstruct(cdkObject),
    IPrincipal {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServiceAccountProps,
  ) :
      this(software.amazon.awscdk.services.eks.ServiceAccount(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ServiceAccountProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServiceAccountProps.Builder.() -> Unit,
  ) : this(scope, id, ServiceAccountProps(props)
  )

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  public override fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult =
      unwrap(this).addToPrincipalPolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToPrincipalPolicyResult::wrap)

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
  public override fun addToPrincipalPolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(statement))

  /**
   * When this Principal is used in an AssumeRole policy, the action to use.
   */
  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  /**
   * The role which is linked to the service account.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * The name of the service account.
   */
  public open fun serviceAccountName(): String = unwrap(this).getServiceAccountName()

  /**
   * The namespace where the service account is located in.
   */
  public open fun serviceAccountNamespace(): String = unwrap(this).getServiceAccountNamespace()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.ServiceAccount].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Additional annotations of the service account.
     *
     * Default: - no additional annotations
     *
     * @param annotations Additional annotations of the service account. 
     */
    public fun annotations(annotations: Map<String, String>)

    /**
     * The cluster to apply the patch to.
     *
     * @param cluster The cluster to apply the patch to. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * The identity type to use for the service account.
     *
     * Default: IdentityType.IRSA
     *
     * @param identityType The identity type to use for the service account. 
     */
    public fun identityType(identityType: IdentityType)

    /**
     * Additional labels of the service account.
     *
     * Default: - no additional labels
     *
     * @param labels Additional labels of the service account. 
     */
    public fun labels(labels: Map<String, String>)

    /**
     * The name of the service account.
     *
     * The name of a ServiceAccount object must be a valid DNS subdomain name.
     * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     *
     * Default: - If no name is given, it will use the id of the resource.
     *
     * @param name The name of the service account. 
     */
    public fun name(name: String)

    /**
     * The namespace of the service account.
     *
     * All namespace names must be valid RFC 1123 DNS labels.
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/#namespaces-and-dns
     *
     * Default: "default"
     *
     * @param namespace The namespace of the service account. 
     */
    public fun namespace(namespace: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.ServiceAccount.Builder =
        software.amazon.awscdk.services.eks.ServiceAccount.Builder.create(scope, id)

    /**
     * Additional annotations of the service account.
     *
     * Default: - no additional annotations
     *
     * @param annotations Additional annotations of the service account. 
     */
    override fun annotations(annotations: Map<String, String>) {
      cdkBuilder.annotations(annotations)
    }

    /**
     * The cluster to apply the patch to.
     *
     * @param cluster The cluster to apply the patch to. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * The identity type to use for the service account.
     *
     * Default: IdentityType.IRSA
     *
     * @param identityType The identity type to use for the service account. 
     */
    override fun identityType(identityType: IdentityType) {
      cdkBuilder.identityType(identityType.let(IdentityType.Companion::unwrap))
    }

    /**
     * Additional labels of the service account.
     *
     * Default: - no additional labels
     *
     * @param labels Additional labels of the service account. 
     */
    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    /**
     * The name of the service account.
     *
     * The name of a ServiceAccount object must be a valid DNS subdomain name.
     * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     *
     * Default: - If no name is given, it will use the id of the resource.
     *
     * @param name The name of the service account. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The namespace of the service account.
     *
     * All namespace names must be valid RFC 1123 DNS labels.
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/#namespaces-and-dns
     *
     * Default: "default"
     *
     * @param namespace The namespace of the service account. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    public fun build(): software.amazon.awscdk.services.eks.ServiceAccount = cdkBuilder.build()
  }

  public companion object {
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
        = wrapped.cdkObject as software.amazon.awscdk.services.eks.ServiceAccount
  }
}
