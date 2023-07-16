@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cur

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cur.CfnReportDefinitionProps

@CdkDslMarker
public class CfnReportDefinitionPropsDsl {
  private val cdkBuilder: CfnReportDefinitionProps.Builder = CfnReportDefinitionProps.builder()

  private val _additionalArtifacts: MutableList<String> = mutableListOf()

  private val _additionalSchemaElements: MutableList<String> = mutableListOf()

  public fun additionalArtifacts(vararg additionalArtifacts: String) {
    _additionalArtifacts.addAll(listOf(*additionalArtifacts))
  }

  public fun additionalArtifacts(additionalArtifacts: Collection<String>) {
    _additionalArtifacts.addAll(additionalArtifacts)
  }

  public fun additionalSchemaElements(vararg additionalSchemaElements: String) {
    _additionalSchemaElements.addAll(listOf(*additionalSchemaElements))
  }

  public fun additionalSchemaElements(additionalSchemaElements: Collection<String>) {
    _additionalSchemaElements.addAll(additionalSchemaElements)
  }

  public fun billingViewArn(billingViewArn: String) {
    cdkBuilder.billingViewArn(billingViewArn)
  }

  public fun compression(compression: String) {
    cdkBuilder.compression(compression)
  }

  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  public fun refreshClosedReports(refreshClosedReports: Boolean) {
    cdkBuilder.refreshClosedReports(refreshClosedReports)
  }

  public fun refreshClosedReports(refreshClosedReports: IResolvable) {
    cdkBuilder.refreshClosedReports(refreshClosedReports)
  }

  public fun reportName(reportName: String) {
    cdkBuilder.reportName(reportName)
  }

  public fun reportVersioning(reportVersioning: String) {
    cdkBuilder.reportVersioning(reportVersioning)
  }

  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  public fun s3Prefix(s3Prefix: String) {
    cdkBuilder.s3Prefix(s3Prefix)
  }

  public fun s3Region(s3Region: String) {
    cdkBuilder.s3Region(s3Region)
  }

  public fun timeUnit(timeUnit: String) {
    cdkBuilder.timeUnit(timeUnit)
  }

  public fun build(): CfnReportDefinitionProps {
    if(_additionalArtifacts.isNotEmpty()) cdkBuilder.additionalArtifacts(_additionalArtifacts)
    if(_additionalSchemaElements.isNotEmpty())
        cdkBuilder.additionalSchemaElements(_additionalSchemaElements)
    return cdkBuilder.build()
  }
}
