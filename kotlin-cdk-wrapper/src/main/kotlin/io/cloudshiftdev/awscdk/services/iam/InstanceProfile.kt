@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class InstanceProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.InstanceProfile,
) : Resource(cdkObject), IInstanceProfile {
  public override fun instanceProfileArn(): String = unwrap(this).getInstanceProfileArn()

  public override fun instanceProfileName(): String = unwrap(this).getInstanceProfileName()

  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun instanceProfileName(instanceProfileName: String)

    public fun path(path: String)

    public fun role(role: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.InstanceProfile.Builder =
        software.amazon.awscdk.services.iam.InstanceProfile.Builder.create(scope, id)

    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.InstanceProfile = cdkBuilder.build()
  }

  public companion object {
    public fun fromInstanceProfileArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      instanceProfileArn: String,
    ): IInstanceProfile =
        software.amazon.awscdk.services.iam.InstanceProfile.fromInstanceProfileArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, instanceProfileArn).let(IInstanceProfile::wrap)

    public fun fromInstanceProfileAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: InstanceProfileAttributes,
    ): IInstanceProfile =
        software.amazon.awscdk.services.iam.InstanceProfile.fromInstanceProfileAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(InstanceProfileAttributes::unwrap)).let(IInstanceProfile::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("461d32d27355084613f43815133d12090dc7e621f74293219d07f03997428f89")
    public fun fromInstanceProfileAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: InstanceProfileAttributes.Builder.() -> Unit,
    ): IInstanceProfile = fromInstanceProfileAttributes(scope, id, InstanceProfileAttributes(attrs))

    public fun fromInstanceProfileName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      instanceProfileName: String,
    ): IInstanceProfile =
        software.amazon.awscdk.services.iam.InstanceProfile.fromInstanceProfileName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, instanceProfileName).let(IInstanceProfile::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): InstanceProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return InstanceProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.InstanceProfile):
        InstanceProfile = InstanceProfile(cdkObject)

    internal fun unwrap(wrapped: InstanceProfile):
        software.amazon.awscdk.services.iam.InstanceProfile = wrapped.cdkObject
  }
}
