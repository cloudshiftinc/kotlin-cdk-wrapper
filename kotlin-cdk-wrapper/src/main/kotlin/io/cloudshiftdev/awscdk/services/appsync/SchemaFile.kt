@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The Schema for a GraphQL Api.
 *
 * If no options are configured, schema will be generated
 * code-first.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * // hosted zone and route53 features
 * String hostedZoneId;
 * String zoneName = "example.com";
 * String myDomainName = "api.example.com";
 * Certificate certificate = Certificate.Builder.create(this,
 * "cert").domainName(myDomainName).build();
 * SchemaFile schema = SchemaFile.Builder.create().filePath("mySchemaFile").build();
 * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
 * .name("myApi")
 * .definition(Definition.fromSchema(schema))
 * .domainName(DomainOptions.builder()
 * .certificate(certificate)
 * .domainName(myDomainName)
 * .build())
 * .build();
 * // hosted zone for adding appsync domain
 * IHostedZone zone = HostedZone.fromHostedZoneAttributes(this, "HostedZone",
 * HostedZoneAttributes.builder()
 * .hostedZoneId(hostedZoneId)
 * .zoneName(zoneName)
 * .build());
 * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
 * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
 * CnameRecord.Builder.create(this, "CnameApiRecord")
 * .recordName("api")
 * .zone(zone)
 * .domainName(api.getAppSyncDomainName())
 * .build();
 * ```
 */
public open class SchemaFile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.SchemaFile,
) : CdkObject(cdkObject), ISchema {
  public constructor(options: SchemaProps) :
      this(software.amazon.awscdk.services.appsync.SchemaFile(options.let(SchemaProps::unwrap))
  )

  public constructor(options: SchemaProps.Builder.() -> Unit) : this(SchemaProps(options)
  )

  /**
   * Called when the GraphQL Api is initialized to allow this object to bind to the stack.
   *
   * @param api The binding GraphQL Api. 
   * @param _options
   */
  public override fun bind(api: IGraphqlApi): ISchemaConfig =
      unwrap(this).bind(api.let(IGraphqlApi::unwrap)).let(ISchemaConfig::wrap)

  /**
   * Called when the GraphQL Api is initialized to allow this object to bind to the stack.
   *
   * @param api The binding GraphQL Api. 
   * @param _options
   */
  public override fun bind(api: IGraphqlApi, options: SchemaBindOptions): ISchemaConfig =
      unwrap(this).bind(api.let(IGraphqlApi::unwrap),
      options.let(SchemaBindOptions::unwrap)).let(ISchemaConfig::wrap)

  /**
   * Called when the GraphQL Api is initialized to allow this object to bind to the stack.
   *
   * @param api The binding GraphQL Api. 
   * @param _options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3253a33994cbabdedb099d3bff4a9072399bc8fd0da1ebf43f0cb17424e01216")
  public override fun bind(api: IGraphqlApi, options: SchemaBindOptions.Builder.() -> Unit):
      ISchemaConfig = bind(api, SchemaBindOptions(options))

  /**
   * The definition for this schema.
   */
  public open fun definition(): String = unwrap(this).getDefinition()

  /**
   * The definition for this schema.
   */
  public open fun definition(`value`: String) {
    unwrap(this).setDefinition(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.SchemaFile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The file path for the schema.
     *
     * When this option is
     * configured, then the schema will be generated from an
     * existing file from disk.
     *
     * @param filePath The file path for the schema. 
     */
    public fun filePath(filePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SchemaFile.Builder =
        software.amazon.awscdk.services.appsync.SchemaFile.Builder.create()

    /**
     * The file path for the schema.
     *
     * When this option is
     * configured, then the schema will be generated from an
     * existing file from disk.
     *
     * @param filePath The file path for the schema. 
     */
    override fun filePath(filePath: String) {
      cdkBuilder.filePath(filePath)
    }

    public fun build(): software.amazon.awscdk.services.appsync.SchemaFile = cdkBuilder.build()
  }

  public companion object {
    public fun fromAsset(filePath: String): SchemaFile =
        software.amazon.awscdk.services.appsync.SchemaFile.fromAsset(filePath).let(SchemaFile::wrap)

    public operator fun invoke(block: Builder.() -> Unit = {}): SchemaFile {
      val builderImpl = BuilderImpl()
      return SchemaFile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SchemaFile): SchemaFile =
        SchemaFile(cdkObject)

    internal fun unwrap(wrapped: SchemaFile): software.amazon.awscdk.services.appsync.SchemaFile =
        wrapped.cdkObject
  }
}
