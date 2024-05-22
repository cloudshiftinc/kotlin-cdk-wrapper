@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A CodeDeploy Application that deploys to EC2/on-premise instances.
 *
 * Example:
 *
 * ```
 * ServerApplication application = ServerApplication.Builder.create(this, "CodeDeployApplication")
 * .applicationName("MyApplication")
 * .build();
 * ```
 */
public open class ServerApplication(
  cdkObject: software.amazon.awscdk.services.codedeploy.ServerApplication,
) : Resource(cdkObject), IServerApplication {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.codedeploy.ServerApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServerApplicationProps,
  ) :
      this(software.amazon.awscdk.services.codedeploy.ServerApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ServerApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServerApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, ServerApplicationProps(props)
  )

  /**
   *
   */
  public override fun applicationArn(): String = unwrap(this).getApplicationArn()

  /**
   *
   */
  public override fun applicationName(): String = unwrap(this).getApplicationName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codedeploy.ServerApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the CodeDeploy Application.
     *
     * Default: an auto-generated name will be used
     *
     * @param applicationName The physical, human-readable name of the CodeDeploy Application. 
     */
    public fun applicationName(applicationName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.ServerApplication.Builder =
        software.amazon.awscdk.services.codedeploy.ServerApplication.Builder.create(scope, id)

    /**
     * The physical, human-readable name of the CodeDeploy Application.
     *
     * Default: an auto-generated name will be used
     *
     * @param applicationName The physical, human-readable name of the CodeDeploy Application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.ServerApplication =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromServerApplicationArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      serverApplicationArn: String,
    ): IServerApplication =
        software.amazon.awscdk.services.codedeploy.ServerApplication.fromServerApplicationArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, serverApplicationArn).let(IServerApplication::wrap)

    public fun fromServerApplicationName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      serverApplicationName: String,
    ): IServerApplication =
        software.amazon.awscdk.services.codedeploy.ServerApplication.fromServerApplicationName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, serverApplicationName).let(IServerApplication::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ServerApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ServerApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ServerApplication):
        ServerApplication = ServerApplication(cdkObject)

    internal fun unwrap(wrapped: ServerApplication):
        software.amazon.awscdk.services.codedeploy.ServerApplication = wrapped.cdkObject as
        software.amazon.awscdk.services.codedeploy.ServerApplication
  }
}
