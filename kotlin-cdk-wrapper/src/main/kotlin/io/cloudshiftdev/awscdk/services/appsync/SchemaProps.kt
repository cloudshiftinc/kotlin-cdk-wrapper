@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The options for configuring a schema from an existing file.
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
public interface SchemaProps {
  /**
   * The file path for the schema.
   *
   * When this option is
   * configured, then the schema will be generated from an
   * existing file from disk.
   */
  public fun filePath(): String

  /**
   * A builder for [SchemaProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param filePath The file path for the schema. 
     * When this option is
     * configured, then the schema will be generated from an
     * existing file from disk.
     */
    public fun filePath(filePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SchemaProps.Builder =
        software.amazon.awscdk.services.appsync.SchemaProps.builder()

    /**
     * @param filePath The file path for the schema. 
     * When this option is
     * configured, then the schema will be generated from an
     * existing file from disk.
     */
    override fun filePath(filePath: String) {
      cdkBuilder.filePath(filePath)
    }

    public fun build(): software.amazon.awscdk.services.appsync.SchemaProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.SchemaProps,
  ) : CdkObject(cdkObject), SchemaProps {
    /**
     * The file path for the schema.
     *
     * When this option is
     * configured, then the schema will be generated from an
     * existing file from disk.
     */
    override fun filePath(): String = unwrap(this).getFilePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SchemaProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SchemaProps): SchemaProps =
        CdkObjectWrappers.wrap(cdkObject) as? SchemaProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SchemaProps): software.amazon.awscdk.services.appsync.SchemaProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.SchemaProps
  }
}
