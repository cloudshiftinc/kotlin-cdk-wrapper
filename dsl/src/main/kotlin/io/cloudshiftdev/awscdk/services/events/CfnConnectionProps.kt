package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConnectionProps {
  /**
   * A `CreateConnectionAuthRequestParameters` object that contains the authorization parameters to
   * use to authorize with the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authparameters)
   */
  public fun authParameters(): Any? = unwrap(this).getAuthParameters()

  /**
   * The type of authorization to use for the connection.
   *
   *
   * OAUTH tokens are refreshed when a 401 or 407 response is returned.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authorizationtype)
   */
  public fun authorizationType(): String

  /**
   * A description for the connection to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name for the connection to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [CfnConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authParameters A `CreateConnectionAuthRequestParameters` object that contains the
     * authorization parameters to use to authorize with the endpoint.
     */
    public fun authParameters(authParameters: IResolvable)

    /**
     * @param authParameters A `CreateConnectionAuthRequestParameters` object that contains the
     * authorization parameters to use to authorize with the endpoint.
     */
    public fun authParameters(authParameters: CfnConnection.AuthParametersProperty)

    /**
     * @param authParameters A `CreateConnectionAuthRequestParameters` object that contains the
     * authorization parameters to use to authorize with the endpoint.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf937ae1aa8f4c90c97e3448b625c5c03492ccadd908836c6f18632e7bbb3499")
    public
        fun authParameters(authParameters: CfnConnection.AuthParametersProperty.Builder.() -> Unit)

    /**
     * @param authorizationType The type of authorization to use for the connection. 
     *
     * OAUTH tokens are refreshed when a 401 or 407 response is returned.
     */
    public fun authorizationType(authorizationType: String)

    /**
     * @param description A description for the connection to create.
     */
    public fun description(description: String)

    /**
     * @param name The name for the connection to create.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnConnectionProps.Builder =
        software.amazon.awscdk.services.events.CfnConnectionProps.builder()

    /**
     * @param authParameters A `CreateConnectionAuthRequestParameters` object that contains the
     * authorization parameters to use to authorize with the endpoint.
     */
    override fun authParameters(authParameters: IResolvable) {
      cdkBuilder.authParameters(authParameters.let(IResolvable::unwrap))
    }

    /**
     * @param authParameters A `CreateConnectionAuthRequestParameters` object that contains the
     * authorization parameters to use to authorize with the endpoint.
     */
    override fun authParameters(authParameters: CfnConnection.AuthParametersProperty) {
      cdkBuilder.authParameters(authParameters.let(CfnConnection.AuthParametersProperty::unwrap))
    }

    /**
     * @param authParameters A `CreateConnectionAuthRequestParameters` object that contains the
     * authorization parameters to use to authorize with the endpoint.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf937ae1aa8f4c90c97e3448b625c5c03492ccadd908836c6f18632e7bbb3499")
    override
        fun authParameters(authParameters: CfnConnection.AuthParametersProperty.Builder.() -> Unit):
        Unit = authParameters(CfnConnection.AuthParametersProperty(authParameters))

    /**
     * @param authorizationType The type of authorization to use for the connection. 
     *
     * OAUTH tokens are refreshed when a 401 or 407 response is returned.
     */
    override fun authorizationType(authorizationType: String) {
      cdkBuilder.authorizationType(authorizationType)
    }

    /**
     * @param description A description for the connection to create.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name for the connection to create.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.CfnConnectionProps,
  ) : CdkObject(cdkObject), CfnConnectionProps {
    /**
     * A `CreateConnectionAuthRequestParameters` object that contains the authorization parameters
     * to use to authorize with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authparameters)
     */
    override fun authParameters(): Any? = unwrap(this).getAuthParameters()

    /**
     * The type of authorization to use for the connection.
     *
     *
     * OAUTH tokens are refreshed when a 401 or 407 response is returned.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-authorizationtype)
     */
    override fun authorizationType(): String = unwrap(this).getAuthorizationType()

    /**
     * A description for the connection to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name for the connection to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#cfn-events-connection-name)
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnectionProps):
        CfnConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionProps):
        software.amazon.awscdk.services.events.CfnConnectionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.CfnConnectionProps
  }
}
