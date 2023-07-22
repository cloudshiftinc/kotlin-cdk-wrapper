@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.IHostedZone
import software.amazon.awscdk.services.route53.NsRecordProps

/**
 * Construction properties for a NSRecord.
 *
 * Example:
 *
 * ```
 * HostedZone myZone;
 * NsRecord.Builder.create(this, "NSRecord")
 * .zone(myZone)
 * .recordName("foo")
 * .values(List.of("ns-1.awsdns.co.uk.", "ns-2.awsdns.com."))
 * .ttl(Duration.minutes(90))
 * .build();
 * ```
 */
@CdkDslMarker
public class NsRecordPropsDsl {
  private val cdkBuilder: NsRecordProps.Builder = NsRecordProps.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param comment A comment to add on the record.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param deleteExisting Whether to delete the same record set in the hosted zone if it already
   * exists (dangerous!).
   * This allows to deploy a new record set while minimizing the downtime because the
   * new record set will be created immediately after the existing one is deleted. It
   * also avoids "manual" actions to delete existing record sets.
   *
   *
   * **N.B.:** this feature is dangerous, use with caution! It can only be used safely when
   * `deleteExisting` is set to `true` as soon as the resource is added to the stack. Changing
   * an existing Record Set's `deleteExisting` property from `false -&gt; true` after deployment
   * will delete the record!
   */
  public fun deleteExisting(deleteExisting: Boolean) {
    cdkBuilder.deleteExisting(deleteExisting)
  }

  /**
   * @param recordName The subdomain name for this record. This should be relative to the zone root
   * name.
   * For example, if you want to create a record for acme.example.com, specify
   * "acme".
   *
   * You can also specify the fully qualified domain name which terminates with a
   * ".". For example, "acme.example.com.".
   */
  public fun recordName(recordName: String) {
    cdkBuilder.recordName(recordName)
  }

  /**
   * @param ttl The resource record cache time to live (TTL).
   */
  public fun ttl(ttl: Duration) {
    cdkBuilder.ttl(ttl)
  }

  /**
   * @param values The NS values. 
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The NS values. 
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  /**
   * @param zone The hosted zone in which to define the new record. 
   */
  public fun zone(zone: IHostedZone) {
    cdkBuilder.zone(zone)
  }

  public fun build(): NsRecordProps {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
