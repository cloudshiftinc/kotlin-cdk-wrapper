@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.CnameRecord
import software.amazon.awscdk.services.route53.IHostedZone
import software.constructs.Construct

/**
 * A DNS CNAME record.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.certificatemanager.*;
 * import software.amazon.awscdk.services.route53.*;
 * // hosted zone and route53 features
 * String hostedZoneId;
 * String zoneName = "example.com";
 * String myDomainName = "api.example.com";
 * Certificate certificate = Certificate.Builder.create(this,
 * "cert").domainName(myDomainName).build();
 * SchemaFile schema = SchemaFile.Builder.create().filePath("mySchemaFile").build();
 * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
 * .name("myApi")
 * .schema(schema)
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
@CdkDslMarker
public class CnameRecordDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CnameRecord.Builder = CnameRecord.Builder.create(scope, id)

  /**
   * A comment to add on the record.
   *
   * Default: no comment
   *
   * @param comment A comment to add on the record. 
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * Whether to delete the same record set in the hosted zone if it already exists (dangerous!).
   *
   * This allows to deploy a new record set while minimizing the downtime because the
   * new record set will be created immediately after the existing one is deleted. It
   * also avoids "manual" actions to delete existing record sets.
   *
   *
   * **N.B.:** this feature is dangerous, use with caution! It can only be used safely when
   * `deleteExisting` is set to `true` as soon as the resource is added to the stack. Changing
   * an existing Record Set's `deleteExisting` property from `false -&gt; true` after deployment
   * will delete the record!
   *
   *
   * Default: false
   *
   * @param deleteExisting Whether to delete the same record set in the hosted zone if it already
   * exists (dangerous!). 
   */
  public fun deleteExisting(deleteExisting: Boolean) {
    cdkBuilder.deleteExisting(deleteExisting)
  }

  /**
   * The domain name of the target that this record should point to.
   *
   * @param domainName The domain name of the target that this record should point to. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * The subdomain name for this record. This should be relative to the zone root name.
   *
   * For example, if you want to create a record for acme.example.com, specify
   * "acme".
   *
   * You can also specify the fully qualified domain name which terminates with a
   * ".". For example, "acme.example.com.".
   *
   * Default: zone root
   *
   * @param recordName The subdomain name for this record. This should be relative to the zone root
   * name. 
   */
  public fun recordName(recordName: String) {
    cdkBuilder.recordName(recordName)
  }

  /**
   * The resource record cache time to live (TTL).
   *
   * Default: Duration.minutes(30)
   *
   * @param ttl The resource record cache time to live (TTL). 
   */
  public fun ttl(ttl: Duration) {
    cdkBuilder.ttl(ttl)
  }

  /**
   * The hosted zone in which to define the new record.
   *
   * @param zone The hosted zone in which to define the new record. 
   */
  public fun zone(zone: IHostedZone) {
    cdkBuilder.zone(zone)
  }

  public fun build(): CnameRecord = cdkBuilder.build()
}
