@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The properties to import an existing Api Destination.
 *
 * Example:
 *
 * ```
 * IConnection connection = Connection.fromEventBusArn(this, "Connection",
 * "arn:aws:events:us-east-1:123456789012:event-bus/EventBusName",
 * "arn:aws:secretsmanager:us-east-1:123456789012:secret:SecretName-f3gDy9");
 * String apiDestinationArn =
 * "arn:aws:events:us-east-1:123456789012:api-destination/DestinationName/11111111-1111-1111-1111-111111111111";
 * String apiDestinationArnForPolicy =
 * "arn:aws:events:us-east-1:123456789012:api-destination/DestinationName";
 * ApiDestination destination = ApiDestination.fromApiDestinationAttributes(this, "Destination",
 * ApiDestinationAttributes.builder()
 * .apiDestinationArn(apiDestinationArn)
 * .connection(connection)
 * .apiDestinationArnForPolicy(apiDestinationArnForPolicy)
 * .build());
 * Rule rule = Rule.Builder.create(this, "OtherRule")
 * .schedule(Schedule.rate(Duration.minutes(10)))
 * .targets(List.of(new ApiDestination(destination)))
 * .build();
 * ```
 */
public interface ApiDestinationAttributes {
  /**
   * The ARN of the Api Destination.
   */
  public fun apiDestinationArn(): String

  /**
   * The Amazon Resource Name (ARN) of an API destination in resource format.
   *
   * Default: undefined - Imported API destination does not have ARN in resource format
   */
  public fun apiDestinationArnForPolicy(): String? = unwrap(this).getApiDestinationArnForPolicy()

  /**
   * The Connection to associate with the Api Destination.
   */
  public fun connection(): IConnection

  /**
   * A builder for [ApiDestinationAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiDestinationArn The ARN of the Api Destination. 
     */
    public fun apiDestinationArn(apiDestinationArn: String)

    /**
     * @param apiDestinationArnForPolicy The Amazon Resource Name (ARN) of an API destination in
     * resource format.
     */
    public fun apiDestinationArnForPolicy(apiDestinationArnForPolicy: String)

    /**
     * @param connection The Connection to associate with the Api Destination. 
     */
    public fun connection(connection: IConnection)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.ApiDestinationAttributes.Builder
        = software.amazon.awscdk.services.events.ApiDestinationAttributes.builder()

    /**
     * @param apiDestinationArn The ARN of the Api Destination. 
     */
    override fun apiDestinationArn(apiDestinationArn: String) {
      cdkBuilder.apiDestinationArn(apiDestinationArn)
    }

    /**
     * @param apiDestinationArnForPolicy The Amazon Resource Name (ARN) of an API destination in
     * resource format.
     */
    override fun apiDestinationArnForPolicy(apiDestinationArnForPolicy: String) {
      cdkBuilder.apiDestinationArnForPolicy(apiDestinationArnForPolicy)
    }

    /**
     * @param connection The Connection to associate with the Api Destination. 
     */
    override fun connection(connection: IConnection) {
      cdkBuilder.connection(connection.let(IConnection.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.ApiDestinationAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.ApiDestinationAttributes,
  ) : CdkObject(cdkObject),
      ApiDestinationAttributes {
    /**
     * The ARN of the Api Destination.
     */
    override fun apiDestinationArn(): String = unwrap(this).getApiDestinationArn()

    /**
     * The Amazon Resource Name (ARN) of an API destination in resource format.
     *
     * Default: undefined - Imported API destination does not have ARN in resource format
     */
    override fun apiDestinationArnForPolicy(): String? =
        unwrap(this).getApiDestinationArnForPolicy()

    /**
     * The Connection to associate with the Api Destination.
     */
    override fun connection(): IConnection = unwrap(this).getConnection().let(IConnection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiDestinationAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.ApiDestinationAttributes):
        ApiDestinationAttributes = CdkObjectWrappers.wrap(cdkObject) as? ApiDestinationAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiDestinationAttributes):
        software.amazon.awscdk.services.events.ApiDestinationAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.ApiDestinationAttributes
  }
}
