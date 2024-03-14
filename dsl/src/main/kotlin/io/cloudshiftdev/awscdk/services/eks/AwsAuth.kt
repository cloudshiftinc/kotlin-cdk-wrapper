package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.IUser
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AwsAuth internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.AwsAuth,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun addAccount(accountId: String) {
    unwrap(this).addAccount(accountId)
  }

  public open fun addMastersRole(role: IRole) {
    unwrap(this).addMastersRole(role.let(IRole::unwrap))
  }

  public open fun addMastersRole(role: IRole, username: String) {
    unwrap(this).addMastersRole(role.let(IRole::unwrap), username)
  }

  public open fun addRoleMapping(role: IRole, mapping: AwsAuthMapping) {
    unwrap(this).addRoleMapping(role.let(IRole::unwrap), mapping.let(AwsAuthMapping::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a52db5dc8c15ab681e9d888964518d8d8e8402c2b7ce4d2d96318aed32a1c66")
  public open fun addRoleMapping(role: IRole, mapping: AwsAuthMapping.Builder.() -> Unit): Unit =
      addRoleMapping(role, AwsAuthMapping(mapping))

  public open fun addUserMapping(user: IUser, mapping: AwsAuthMapping) {
    unwrap(this).addUserMapping(user.let(IUser::unwrap), mapping.let(AwsAuthMapping::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fd310a52b9ec3ac1d81b2bb078e8ff06c796ca1ad141c4d76a43d3185824b6f5")
  public open fun addUserMapping(user: IUser, mapping: AwsAuthMapping.Builder.() -> Unit): Unit =
      addUserMapping(user, AwsAuthMapping(mapping))

  public interface Builder {
    public fun cluster(cluster: Cluster) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AwsAuth.Builder =
        software.amazon.awscdk.services.eks.AwsAuth.Builder.create(scope, id)

    public override fun cluster(cluster: Cluster) {
      cdkBuilder.cluster(cluster.let(Cluster::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.AwsAuth = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        wrapped.cdkObject
  }
}
