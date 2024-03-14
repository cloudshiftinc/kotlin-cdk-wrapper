package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EcsApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codedeploy.EcsApplication,
) : Resource(cdkObject), IEcsApplication {
  public override fun applicationArn(): String = unwrap(this).getApplicationArn()

  public override fun applicationName(): String = unwrap(this).getApplicationName()

  public interface Builder {
    public fun applicationName(applicationName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.EcsApplication.Builder =
        software.amazon.awscdk.services.codedeploy.EcsApplication.Builder.create(scope, id)

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsApplication =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromEcsApplicationArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      ecsApplicationArn: String,
    ): IEcsApplication =
        software.amazon.awscdk.services.codedeploy.EcsApplication.fromEcsApplicationArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, ecsApplicationArn).let(IEcsApplication::wrap)

    public open fun fromEcsApplicationName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      ecsApplicationName: String,
    ): IEcsApplication =
        software.amazon.awscdk.services.codedeploy.EcsApplication.fromEcsApplicationName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, ecsApplicationName).let(IEcsApplication::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EcsApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EcsApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.EcsApplication):
        EcsApplication = EcsApplication(cdkObject)

    internal fun unwrap(wrapped: EcsApplication):
        software.amazon.awscdk.services.codedeploy.EcsApplication = wrapped.cdkObject
  }
}
