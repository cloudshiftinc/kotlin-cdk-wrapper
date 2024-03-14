package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AccessKey internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.AccessKey,
) : Resource(cdkObject), IAccessKey {
  public override fun accessKeyId(): String = unwrap(this).getAccessKeyId()

  public override fun secretAccessKey(): SecretValue =
      unwrap(this).getSecretAccessKey().let(SecretValue::wrap)

  public interface Builder {
    public fun serial(serial: Number)

    public fun status(status: AccessKeyStatus)

    public fun user(user: IUser)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.AccessKey.Builder =
        software.amazon.awscdk.services.iam.AccessKey.Builder.create(scope, id)

    override fun serial(serial: Number) {
      cdkBuilder.serial(serial)
    }

    override fun status(status: AccessKeyStatus) {
      cdkBuilder.status(status.let(AccessKeyStatus::unwrap))
    }

    override fun user(user: IUser) {
      cdkBuilder.user(user.let(IUser::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.AccessKey = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AccessKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AccessKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AccessKey): AccessKey =
        AccessKey(cdkObject)

    internal fun unwrap(wrapped: AccessKey): software.amazon.awscdk.services.iam.AccessKey =
        wrapped.cdkObject
  }
}
