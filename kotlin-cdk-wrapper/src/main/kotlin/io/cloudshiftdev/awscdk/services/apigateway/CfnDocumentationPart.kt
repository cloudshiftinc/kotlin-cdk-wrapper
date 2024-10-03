@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGateway::DocumentationPart` resource creates a documentation part for an API.
 *
 * For more information, see [Representation of API Documentation in API
 * Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api-content-representation.html)
 * in the *API Gateway Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnDocumentationPart cfnDocumentationPart = CfnDocumentationPart.Builder.create(this,
 * "MyCfnDocumentationPart")
 * .location(LocationProperty.builder()
 * .method("method")
 * .name("name")
 * .path("path")
 * .statusCode("statusCode")
 * .type("type")
 * .build())
 * .properties("properties")
 * .restApiId("restApiId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html)
 */
public open class CfnDocumentationPart(
  cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationPart,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDocumentationPartProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.CfnDocumentationPart(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDocumentationPartProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDocumentationPartProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDocumentationPartProps(props)
  )

  /**
   * The ID for the documentation part.
   */
  public open fun attrDocumentationPartId(): String = unwrap(this).getAttrDocumentationPartId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The location of the targeted API entity of the to-be-created documentation part.
   */
  public open fun location(): Any = unwrap(this).getLocation()

  /**
   * The location of the targeted API entity of the to-be-created documentation part.
   */
  public open fun location(`value`: IResolvable) {
    unwrap(this).setLocation(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The location of the targeted API entity of the to-be-created documentation part.
   */
  public open fun location(`value`: LocationProperty) {
    unwrap(this).setLocation(`value`.let(LocationProperty.Companion::unwrap))
  }

  /**
   * The location of the targeted API entity of the to-be-created documentation part.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f775ea8587d4f6b7d4e216b50506d59245e9132d1700eb472e40a5820ed0db66")
  public open fun location(`value`: LocationProperty.Builder.() -> Unit): Unit =
      location(LocationProperty(`value`))

  /**
   * The new documentation content map of the targeted API entity.
   */
  public open fun properties(): String = unwrap(this).getProperties()

  /**
   * The new documentation content map of the targeted API entity.
   */
  public open fun properties(`value`: String) {
    unwrap(this).setProperties(`value`)
  }

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(): String = unwrap(this).getRestApiId()

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnDocumentationPart].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The location of the targeted API entity of the to-be-created documentation part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
     * @param location The location of the targeted API entity of the to-be-created documentation
     * part. 
     */
    public fun location(location: IResolvable)

    /**
     * The location of the targeted API entity of the to-be-created documentation part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
     * @param location The location of the targeted API entity of the to-be-created documentation
     * part. 
     */
    public fun location(location: LocationProperty)

    /**
     * The location of the targeted API entity of the to-be-created documentation part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
     * @param location The location of the targeted API entity of the to-be-created documentation
     * part. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("007c62623872feb70c8fab744c082daa348ed138da9d3521c1388ee6a20b895f")
    public fun location(location: LocationProperty.Builder.() -> Unit)

    /**
     * The new documentation content map of the targeted API entity.
     *
     * Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be
     * exported and, hence, published.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-properties)
     * @param properties The new documentation content map of the targeted API entity. 
     */
    public fun properties(properties: String)

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnDocumentationPart.Builder
        = software.amazon.awscdk.services.apigateway.CfnDocumentationPart.Builder.create(scope, id)

    /**
     * The location of the targeted API entity of the to-be-created documentation part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
     * @param location The location of the targeted API entity of the to-be-created documentation
     * part. 
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable.Companion::unwrap))
    }

    /**
     * The location of the targeted API entity of the to-be-created documentation part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
     * @param location The location of the targeted API entity of the to-be-created documentation
     * part. 
     */
    override fun location(location: LocationProperty) {
      cdkBuilder.location(location.let(LocationProperty.Companion::unwrap))
    }

    /**
     * The location of the targeted API entity of the to-be-created documentation part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
     * @param location The location of the targeted API entity of the to-be-created documentation
     * part. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("007c62623872feb70c8fab744c082daa348ed138da9d3521c1388ee6a20b895f")
    override fun location(location: LocationProperty.Builder.() -> Unit): Unit =
        location(LocationProperty(location))

    /**
     * The new documentation content map of the targeted API entity.
     *
     * Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be
     * exported and, hence, published.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-properties)
     * @param properties The new documentation content map of the targeted API entity. 
     */
    override fun properties(properties: String) {
      cdkBuilder.properties(properties)
    }

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDocumentationPart =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnDocumentationPart.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDocumentationPart {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDocumentationPart(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationPart):
        CfnDocumentationPart = CfnDocumentationPart(cdkObject)

    internal fun unwrap(wrapped: CfnDocumentationPart):
        software.amazon.awscdk.services.apigateway.CfnDocumentationPart = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.CfnDocumentationPart
  }

  /**
   * The `Location` property specifies the location of the Amazon API Gateway API entity that the
   * documentation applies to.
   *
   * `Location` is a property of the
   * [AWS::ApiGateway::DocumentationPart](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html)
   * resource.
   *
   *
   * For more information about each property, including constraints and valid values, see
   * [DocumentationPart](https://docs.aws.amazon.com/apigateway/latest/api/API_DocumentationPartLocation.html)
   * in the *Amazon API Gateway REST API Reference* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * LocationProperty locationProperty = LocationProperty.builder()
   * .method("method")
   * .name("name")
   * .path("path")
   * .statusCode("statusCode")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html)
   */
  public interface LocationProperty {
    /**
     * The HTTP verb of a method.
     *
     * It is a valid field for the API entity types of `METHOD` , `PATH_PARAMETER` ,
     * `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and
     * `RESPONSE_BODY` . The default value is `*` for any method. When an applicable child entity
     * inherits the content of an entity of the same type with more general specifications of the other
     * `location` attributes, the child entity's `method` attribute must match that of the parent
     * entity exactly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-method)
     */
    public fun method(): String? = unwrap(this).getMethod()

    /**
     * The name of the targeted API entity.
     *
     * It is a valid and required field for the API entity types of `AUTHORIZER` , `MODEL` ,
     * `PATH_PARAMETER` , `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` and `RESPONSE_HEADER` .
     * It is an invalid field for any other entity type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The URL path of the target.
     *
     * It is a valid field for the API entity types of `RESOURCE` , `METHOD` , `PATH_PARAMETER` ,
     * `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and
     * `RESPONSE_BODY` . The default value is `/` for the root resource. When an applicable child
     * entity inherits the content of another entity of the same type with more general specifications
     * of the other `location` attributes, the child entity's `path` attribute must match that of the
     * parent entity as a prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * The HTTP status code of a response.
     *
     * It is a valid field for the API entity types of `RESPONSE` , `RESPONSE_HEADER` , and
     * `RESPONSE_BODY` . The default value is `*` for any status code. When an applicable child entity
     * inherits the content of an entity of the same type with more general specifications of the other
     * `location` attributes, the child entity's `statusCode` attribute must match that of the parent
     * entity exactly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-statuscode)
     */
    public fun statusCode(): String? = unwrap(this).getStatusCode()

    /**
     * The type of API entity to which the documentation content applies.
     *
     * Valid values are `API` , `AUTHORIZER` , `MODEL` , `RESOURCE` , `METHOD` , `PATH_PARAMETER` ,
     * `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and
     * `RESPONSE_BODY` . Content inheritance does not apply to any entity of the `API` , `AUTHORIZER` ,
     * `METHOD` , `MODEL` , `REQUEST_BODY` , or `RESOURCE` type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param method The HTTP verb of a method.
       * It is a valid field for the API entity types of `METHOD` , `PATH_PARAMETER` ,
       * `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and
       * `RESPONSE_BODY` . The default value is `*` for any method. When an applicable child entity
       * inherits the content of an entity of the same type with more general specifications of the
       * other `location` attributes, the child entity's `method` attribute must match that of the
       * parent entity exactly.
       */
      public fun method(method: String)

      /**
       * @param name The name of the targeted API entity.
       * It is a valid and required field for the API entity types of `AUTHORIZER` , `MODEL` ,
       * `PATH_PARAMETER` , `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` and `RESPONSE_HEADER`
       * . It is an invalid field for any other entity type.
       */
      public fun name(name: String)

      /**
       * @param path The URL path of the target.
       * It is a valid field for the API entity types of `RESOURCE` , `METHOD` , `PATH_PARAMETER` ,
       * `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and
       * `RESPONSE_BODY` . The default value is `/` for the root resource. When an applicable child
       * entity inherits the content of another entity of the same type with more general
       * specifications of the other `location` attributes, the child entity's `path` attribute must
       * match that of the parent entity as a prefix.
       */
      public fun path(path: String)

      /**
       * @param statusCode The HTTP status code of a response.
       * It is a valid field for the API entity types of `RESPONSE` , `RESPONSE_HEADER` , and
       * `RESPONSE_BODY` . The default value is `*` for any status code. When an applicable child
       * entity inherits the content of an entity of the same type with more general specifications of
       * the other `location` attributes, the child entity's `statusCode` attribute must match that of
       * the parent entity exactly.
       */
      public fun statusCode(statusCode: String)

      /**
       * @param type The type of API entity to which the documentation content applies.
       * Valid values are `API` , `AUTHORIZER` , `MODEL` , `RESOURCE` , `METHOD` , `PATH_PARAMETER`
       * , `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and
       * `RESPONSE_BODY` . Content inheritance does not apply to any entity of the `API` , `AUTHORIZER`
       * , `METHOD` , `MODEL` , `REQUEST_BODY` , or `RESOURCE` type.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty.builder()

      /**
       * @param method The HTTP verb of a method.
       * It is a valid field for the API entity types of `METHOD` , `PATH_PARAMETER` ,
       * `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and
       * `RESPONSE_BODY` . The default value is `*` for any method. When an applicable child entity
       * inherits the content of an entity of the same type with more general specifications of the
       * other `location` attributes, the child entity's `method` attribute must match that of the
       * parent entity exactly.
       */
      override fun method(method: String) {
        cdkBuilder.method(method)
      }

      /**
       * @param name The name of the targeted API entity.
       * It is a valid and required field for the API entity types of `AUTHORIZER` , `MODEL` ,
       * `PATH_PARAMETER` , `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` and `RESPONSE_HEADER`
       * . It is an invalid field for any other entity type.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param path The URL path of the target.
       * It is a valid field for the API entity types of `RESOURCE` , `METHOD` , `PATH_PARAMETER` ,
       * `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and
       * `RESPONSE_BODY` . The default value is `/` for the root resource. When an applicable child
       * entity inherits the content of another entity of the same type with more general
       * specifications of the other `location` attributes, the child entity's `path` attribute must
       * match that of the parent entity as a prefix.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param statusCode The HTTP status code of a response.
       * It is a valid field for the API entity types of `RESPONSE` , `RESPONSE_HEADER` , and
       * `RESPONSE_BODY` . The default value is `*` for any status code. When an applicable child
       * entity inherits the content of an entity of the same type with more general specifications of
       * the other `location` attributes, the child entity's `statusCode` attribute must match that of
       * the parent entity exactly.
       */
      override fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
      }

      /**
       * @param type The type of API entity to which the documentation content applies.
       * Valid values are `API` , `AUTHORIZER` , `MODEL` , `RESOURCE` , `METHOD` , `PATH_PARAMETER`
       * , `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and
       * `RESPONSE_BODY` . Content inheritance does not apply to any entity of the `API` , `AUTHORIZER`
       * , `METHOD` , `MODEL` , `REQUEST_BODY` , or `RESOURCE` type.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty,
    ) : CdkObject(cdkObject),
        LocationProperty {
      /**
       * The HTTP verb of a method.
       *
       * It is a valid field for the API entity types of `METHOD` , `PATH_PARAMETER` ,
       * `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and
       * `RESPONSE_BODY` . The default value is `*` for any method. When an applicable child entity
       * inherits the content of an entity of the same type with more general specifications of the
       * other `location` attributes, the child entity's `method` attribute must match that of the
       * parent entity exactly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-method)
       */
      override fun method(): String? = unwrap(this).getMethod()

      /**
       * The name of the targeted API entity.
       *
       * It is a valid and required field for the API entity types of `AUTHORIZER` , `MODEL` ,
       * `PATH_PARAMETER` , `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` and `RESPONSE_HEADER`
       * . It is an invalid field for any other entity type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The URL path of the target.
       *
       * It is a valid field for the API entity types of `RESOURCE` , `METHOD` , `PATH_PARAMETER` ,
       * `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and
       * `RESPONSE_BODY` . The default value is `/` for the root resource. When an applicable child
       * entity inherits the content of another entity of the same type with more general
       * specifications of the other `location` attributes, the child entity's `path` attribute must
       * match that of the parent entity as a prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-path)
       */
      override fun path(): String? = unwrap(this).getPath()

      /**
       * The HTTP status code of a response.
       *
       * It is a valid field for the API entity types of `RESPONSE` , `RESPONSE_HEADER` , and
       * `RESPONSE_BODY` . The default value is `*` for any status code. When an applicable child
       * entity inherits the content of an entity of the same type with more general specifications of
       * the other `location` attributes, the child entity's `statusCode` attribute must match that of
       * the parent entity exactly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-statuscode)
       */
      override fun statusCode(): String? = unwrap(this).getStatusCode()

      /**
       * The type of API entity to which the documentation content applies.
       *
       * Valid values are `API` , `AUTHORIZER` , `MODEL` , `RESOURCE` , `METHOD` , `PATH_PARAMETER`
       * , `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and
       * `RESPONSE_BODY` . Content inheritance does not apply to any entity of the `API` , `AUTHORIZER`
       * , `METHOD` , `MODEL` , `REQUEST_BODY` , or `RESOURCE` type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty):
          LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty
    }
  }
}
