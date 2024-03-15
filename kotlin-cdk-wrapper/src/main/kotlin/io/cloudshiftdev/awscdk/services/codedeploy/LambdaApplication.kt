@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LambdaApplication internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codedeploy.LambdaApplication,
) : Resource(cdkObject), ILambdaApplication {
  public override fun applicationArn(): String = unwrap(this).getApplicationArn()

  public override fun applicationName(): String = unwrap(this).getApplicationName()

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.LambdaApplication.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaApplication.Builder.create(scope, id)

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaApplication =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromLambdaApplicationArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      lambdaApplicationArn: String,
    ): ILambdaApplication =
        software.amazon.awscdk.services.codedeploy.LambdaApplication.fromLambdaApplicationArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, lambdaApplicationArn).let(ILambdaApplication::wrap)

    public fun fromLambdaApplicationName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      lambdaApplicationName: String,
    ): ILambdaApplication =
        software.amazon.awscdk.services.codedeploy.LambdaApplication.fromLambdaApplicationName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, lambdaApplicationName).let(ILambdaApplication::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LambdaApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LambdaApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaApplication):
        LambdaApplication = LambdaApplication(cdkObject)

    internal fun unwrap(wrapped: LambdaApplication):
        software.amazon.awscdk.services.codedeploy.LambdaApplication = wrapped.cdkObject
  }
}
