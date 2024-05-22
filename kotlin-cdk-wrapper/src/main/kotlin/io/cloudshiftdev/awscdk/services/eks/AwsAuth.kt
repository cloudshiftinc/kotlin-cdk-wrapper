@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.IUser
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Manages mapping between IAM users and roles to Kubernetes RBAC configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * Cluster cluster;
 * AwsAuth awsAuth = AwsAuth.Builder.create(this, "MyAwsAuth")
 * .cluster(cluster)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/en_us/eks/latest/userguide/add-user-role.html)
 */
public open class AwsAuth(
  cdkObject: software.amazon.awscdk.services.eks.AwsAuth,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AwsAuthProps,
  ) :
      this(software.amazon.awscdk.services.eks.AwsAuth(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AwsAuthProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AwsAuthProps.Builder.() -> Unit,
  ) : this(scope, id, AwsAuthProps(props)
  )

  /**
   * Additional AWS account to add to the aws-auth configmap.
   *
   * @param accountId account number. 
   */
  public open fun addAccount(accountId: String) {
    unwrap(this).addAccount(accountId)
  }

  /**
   * Adds the specified IAM role to the `system:masters` RBAC group, which means that anyone that
   * can assume it will be able to administer this Kubernetes system.
   *
   * @param role The IAM role to add. 
   * @param username Optional user (defaults to the role ARN).
   */
  public open fun addMastersRole(role: IRole) {
    unwrap(this).addMastersRole(role.let(IRole.Companion::unwrap))
  }

  /**
   * Adds the specified IAM role to the `system:masters` RBAC group, which means that anyone that
   * can assume it will be able to administer this Kubernetes system.
   *
   * @param role The IAM role to add. 
   * @param username Optional user (defaults to the role ARN).
   */
  public open fun addMastersRole(role: IRole, username: String) {
    unwrap(this).addMastersRole(role.let(IRole.Companion::unwrap), username)
  }

  /**
   * Adds a mapping between an IAM role to a Kubernetes user and groups.
   *
   * @param role The IAM role to map. 
   * @param mapping Mapping to k8s user name and groups. 
   */
  public open fun addRoleMapping(role: IRole, mapping: AwsAuthMapping) {
    unwrap(this).addRoleMapping(role.let(IRole.Companion::unwrap),
        mapping.let(AwsAuthMapping.Companion::unwrap))
  }

  /**
   * Adds a mapping between an IAM role to a Kubernetes user and groups.
   *
   * @param role The IAM role to map. 
   * @param mapping Mapping to k8s user name and groups. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a52db5dc8c15ab681e9d888964518d8d8e8402c2b7ce4d2d96318aed32a1c66")
  public open fun addRoleMapping(role: IRole, mapping: AwsAuthMapping.Builder.() -> Unit): Unit =
      addRoleMapping(role, AwsAuthMapping(mapping))

  /**
   * Adds a mapping between an IAM user to a Kubernetes user and groups.
   *
   * @param user The IAM user to map. 
   * @param mapping Mapping to k8s user name and groups. 
   */
  public open fun addUserMapping(user: IUser, mapping: AwsAuthMapping) {
    unwrap(this).addUserMapping(user.let(IUser.Companion::unwrap),
        mapping.let(AwsAuthMapping.Companion::unwrap))
  }

  /**
   * Adds a mapping between an IAM user to a Kubernetes user and groups.
   *
   * @param user The IAM user to map. 
   * @param mapping Mapping to k8s user name and groups. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fd310a52b9ec3ac1d81b2bb078e8ff06c796ca1ad141c4d76a43d3185824b6f5")
  public open fun addUserMapping(user: IUser, mapping: AwsAuthMapping.Builder.() -> Unit): Unit =
      addUserMapping(user, AwsAuthMapping(mapping))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.AwsAuth].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The EKS cluster to apply this configuration to.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The EKS cluster to apply this configuration to. 
     */
    public fun cluster(cluster: Cluster)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AwsAuth.Builder =
        software.amazon.awscdk.services.eks.AwsAuth.Builder.create(scope, id)

    /**
     * The EKS cluster to apply this configuration to.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The EKS cluster to apply this configuration to. 
     */
    override fun cluster(cluster: Cluster) {
      cdkBuilder.cluster(cluster.let(Cluster.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.AwsAuth = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AwsAuth {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AwsAuth(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AwsAuth): AwsAuth =
        AwsAuth(cdkObject)

    internal fun unwrap(wrapped: AwsAuth): software.amazon.awscdk.services.eks.AwsAuth =
        wrapped.cdkObject as software.amazon.awscdk.services.eks.AwsAuth
  }
}
