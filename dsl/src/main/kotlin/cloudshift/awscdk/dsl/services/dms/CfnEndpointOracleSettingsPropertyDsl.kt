@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointOracleSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.OracleSettingsProperty.Builder =
      CfnEndpoint.OracleSettingsProperty.builder()

  private val _extraArchivedLogDestIds: MutableList<Number> = mutableListOf()

  public fun accessAlternateDirectly(accessAlternateDirectly: Boolean) {
    cdkBuilder.accessAlternateDirectly(accessAlternateDirectly)
  }

  public fun accessAlternateDirectly(accessAlternateDirectly: IResolvable) {
    cdkBuilder.accessAlternateDirectly(accessAlternateDirectly)
  }

  public fun addSupplementalLogging(addSupplementalLogging: Boolean) {
    cdkBuilder.addSupplementalLogging(addSupplementalLogging)
  }

  public fun addSupplementalLogging(addSupplementalLogging: IResolvable) {
    cdkBuilder.addSupplementalLogging(addSupplementalLogging)
  }

  public fun additionalArchivedLogDestId(additionalArchivedLogDestId: Number) {
    cdkBuilder.additionalArchivedLogDestId(additionalArchivedLogDestId)
  }

  public fun allowSelectNestedTables(allowSelectNestedTables: Boolean) {
    cdkBuilder.allowSelectNestedTables(allowSelectNestedTables)
  }

  public fun allowSelectNestedTables(allowSelectNestedTables: IResolvable) {
    cdkBuilder.allowSelectNestedTables(allowSelectNestedTables)
  }

  public fun archivedLogDestId(archivedLogDestId: Number) {
    cdkBuilder.archivedLogDestId(archivedLogDestId)
  }

  public fun archivedLogsOnly(archivedLogsOnly: Boolean) {
    cdkBuilder.archivedLogsOnly(archivedLogsOnly)
  }

  public fun archivedLogsOnly(archivedLogsOnly: IResolvable) {
    cdkBuilder.archivedLogsOnly(archivedLogsOnly)
  }

  public fun asmPassword(asmPassword: String) {
    cdkBuilder.asmPassword(asmPassword)
  }

  public fun asmServer(asmServer: String) {
    cdkBuilder.asmServer(asmServer)
  }

  public fun asmUser(asmUser: String) {
    cdkBuilder.asmUser(asmUser)
  }

  public fun charLengthSemantics(charLengthSemantics: String) {
    cdkBuilder.charLengthSemantics(charLengthSemantics)
  }

  public fun directPathNoLog(directPathNoLog: Boolean) {
    cdkBuilder.directPathNoLog(directPathNoLog)
  }

  public fun directPathNoLog(directPathNoLog: IResolvable) {
    cdkBuilder.directPathNoLog(directPathNoLog)
  }

  public fun directPathParallelLoad(directPathParallelLoad: Boolean) {
    cdkBuilder.directPathParallelLoad(directPathParallelLoad)
  }

  public fun directPathParallelLoad(directPathParallelLoad: IResolvable) {
    cdkBuilder.directPathParallelLoad(directPathParallelLoad)
  }

  public fun enableHomogenousTablespace(enableHomogenousTablespace: Boolean) {
    cdkBuilder.enableHomogenousTablespace(enableHomogenousTablespace)
  }

  public fun enableHomogenousTablespace(enableHomogenousTablespace: IResolvable) {
    cdkBuilder.enableHomogenousTablespace(enableHomogenousTablespace)
  }

  public fun extraArchivedLogDestIds(vararg extraArchivedLogDestIds: Number) {
    _extraArchivedLogDestIds.addAll(listOf(*extraArchivedLogDestIds))
  }

  public fun extraArchivedLogDestIds(extraArchivedLogDestIds: Collection<Number>) {
    _extraArchivedLogDestIds.addAll(extraArchivedLogDestIds)
  }

  public fun extraArchivedLogDestIds(extraArchivedLogDestIds: IResolvable) {
    cdkBuilder.extraArchivedLogDestIds(extraArchivedLogDestIds)
  }

  public fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean) {
    cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation)
  }

  public fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable) {
    cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation)
  }

  public fun numberDatatypeScale(numberDatatypeScale: Number) {
    cdkBuilder.numberDatatypeScale(numberDatatypeScale)
  }

  public fun oraclePathPrefix(oraclePathPrefix: String) {
    cdkBuilder.oraclePathPrefix(oraclePathPrefix)
  }

  public fun parallelAsmReadThreads(parallelAsmReadThreads: Number) {
    cdkBuilder.parallelAsmReadThreads(parallelAsmReadThreads)
  }

  public fun readAheadBlocks(readAheadBlocks: Number) {
    cdkBuilder.readAheadBlocks(readAheadBlocks)
  }

  public fun readTableSpaceName(readTableSpaceName: Boolean) {
    cdkBuilder.readTableSpaceName(readTableSpaceName)
  }

  public fun readTableSpaceName(readTableSpaceName: IResolvable) {
    cdkBuilder.readTableSpaceName(readTableSpaceName)
  }

  public fun replacePathPrefix(replacePathPrefix: Boolean) {
    cdkBuilder.replacePathPrefix(replacePathPrefix)
  }

  public fun replacePathPrefix(replacePathPrefix: IResolvable) {
    cdkBuilder.replacePathPrefix(replacePathPrefix)
  }

  public fun retryInterval(retryInterval: Number) {
    cdkBuilder.retryInterval(retryInterval)
  }

  public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
    cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
  }

  public fun secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn: String) {
    cdkBuilder.secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn)
  }

  public fun secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId: String) {
    cdkBuilder.secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId)
  }

  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  public fun securityDbEncryption(securityDbEncryption: String) {
    cdkBuilder.securityDbEncryption(securityDbEncryption)
  }

  public fun securityDbEncryptionName(securityDbEncryptionName: String) {
    cdkBuilder.securityDbEncryptionName(securityDbEncryptionName)
  }

  public
      fun spatialDataOptionToGeoJsonFunctionName(spatialDataOptionToGeoJsonFunctionName: String) {
    cdkBuilder.spatialDataOptionToGeoJsonFunctionName(spatialDataOptionToGeoJsonFunctionName)
  }

  public fun standbyDelayTime(standbyDelayTime: Number) {
    cdkBuilder.standbyDelayTime(standbyDelayTime)
  }

  public fun useAlternateFolderForOnline(useAlternateFolderForOnline: Boolean) {
    cdkBuilder.useAlternateFolderForOnline(useAlternateFolderForOnline)
  }

  public fun useAlternateFolderForOnline(useAlternateFolderForOnline: IResolvable) {
    cdkBuilder.useAlternateFolderForOnline(useAlternateFolderForOnline)
  }

  public fun useBFile(useBFile: Boolean) {
    cdkBuilder.useBFile(useBFile)
  }

  public fun useBFile(useBFile: IResolvable) {
    cdkBuilder.useBFile(useBFile)
  }

  public fun useDirectPathFullLoad(useDirectPathFullLoad: Boolean) {
    cdkBuilder.useDirectPathFullLoad(useDirectPathFullLoad)
  }

  public fun useDirectPathFullLoad(useDirectPathFullLoad: IResolvable) {
    cdkBuilder.useDirectPathFullLoad(useDirectPathFullLoad)
  }

  public fun useLogminerReader(useLogminerReader: Boolean) {
    cdkBuilder.useLogminerReader(useLogminerReader)
  }

  public fun useLogminerReader(useLogminerReader: IResolvable) {
    cdkBuilder.useLogminerReader(useLogminerReader)
  }

  public fun usePathPrefix(usePathPrefix: String) {
    cdkBuilder.usePathPrefix(usePathPrefix)
  }

  public fun build(): CfnEndpoint.OracleSettingsProperty {
    if(_extraArchivedLogDestIds.isNotEmpty())
        cdkBuilder.extraArchivedLogDestIds(_extraArchivedLogDestIds)
    return cdkBuilder.build()
  }
}
