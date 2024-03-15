@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import kotlin.String

/**
 * Specify a principal by the Amazon Resource Name (ARN).
 *
 * You can specify AWS accounts, IAM users, Federated SAML users, IAM roles, and specific
 * assumed-role sessions.
 * You cannot specify IAM groups or instance profiles as principals
 *
 * Example:
 *
 * ```
 * // Option 2: create your custom mastersRole with scoped assumeBy arn as the Cluster prop. Switch
 * to this role from the AWS console.
 * import io.cloudshiftdev.awscdk.cdk.lambdalayer.kubectl.v29.KubectlV29Layer;
 * Vpc vpc;
 * Role mastersRole = Role.Builder.create(this, "MastersRole")
 * .assumedBy(new ArnPrincipal("arn_for_trusted_principal"))
 * .build();
 * Cluster cluster = Cluster.Builder.create(this, "EksCluster")
 * .vpc(vpc)
 * .version(KubernetesVersion.V1_29)
 * .kubectlLayer(new KubectlV29Layer(this, "KubectlLayer"))
 * .mastersRole(mastersRole)
 * .build();
 * mastersRole.addToPolicy(PolicyStatement.Builder.create()
 * .actions(List.of("eks:AccessKubernetesApi", "eks:Describe*", "eks:List*"))
 * .resources(List.of(cluster.getClusterArn()))
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html)
 */
public open class ArnPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.ArnPrincipal,
) : PrincipalBase(cdkObject) {
  public constructor(arn: String) : this(software.amazon.awscdk.services.iam.ArnPrincipal(arn)
  )

  /**
   * Amazon Resource Name (ARN) of the principal entity (i.e.
   * arn:aws:iam::123456789012:user/user-name).
   */
  public open fun arn(): String = unwrap(this).getArn()

  /**
   * Return whether or not this principal is equal to the given principal.
   */
  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  /**
   * A convenience method for adding a condition that the principal is part of the specified AWS
   * Organization.
   *
   * @param organizationId 
   */
  public open fun inOrganization(organizationId: String): PrincipalBase =
      unwrap(this).inOrganization(organizationId).let(PrincipalBase::wrap)

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ArnPrincipal): ArnPrincipal =
        ArnPrincipal(cdkObject)

    internal fun unwrap(wrapped: ArnPrincipal): software.amazon.awscdk.services.iam.ArnPrincipal =
        wrapped.cdkObject
  }
}
