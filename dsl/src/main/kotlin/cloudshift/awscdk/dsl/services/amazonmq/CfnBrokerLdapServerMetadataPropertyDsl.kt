@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnBroker

@CdkDslMarker
public class CfnBrokerLdapServerMetadataPropertyDsl {
  private val cdkBuilder: CfnBroker.LdapServerMetadataProperty.Builder =
      CfnBroker.LdapServerMetadataProperty.builder()

  private val _hosts: MutableList<String> = mutableListOf()

  /**
   * @param hosts Specifies the location of the LDAP server such as AWS Directory Service for
   * Microsoft Active Directory . 
   * Optional failover server.
   */
  public fun hosts(vararg hosts: String) {
    _hosts.addAll(listOf(*hosts))
  }

  /**
   * @param hosts Specifies the location of the LDAP server such as AWS Directory Service for
   * Microsoft Active Directory . 
   * Optional failover server.
   */
  public fun hosts(hosts: Collection<String>) {
    _hosts.addAll(hosts)
  }

  /**
   * @param roleBase The distinguished name of the node in the directory information tree (DIT) to
   * search for roles or groups. 
   * For example, `ou=group` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
   */
  public fun roleBase(roleBase: String) {
    cdkBuilder.roleBase(roleBase)
  }

  /**
   * @param roleName The group name attribute in a role entry whose value is the name of that role.
   * For example, you can specify `cn` for a group entry's common name. If authentication succeeds,
   * then the user is assigned the the value of the `cn` attribute for each role entry that they are a
   * member of.
   */
  public fun roleName(roleName: String) {
    cdkBuilder.roleName(roleName)
  }

  /**
   * @param roleSearchMatching The LDAP search filter used to find roles within the roleBase. 
   * The distinguished name of the user matched by userSearchMatching is substituted into the `{0}`
   * placeholder in the search filter. The client's username is substituted into the `{1}` placeholder.
   * For example, if you set this option to `(member=uid={1})` for the user janedoe, the search filter
   * becomes `(member=uid=janedoe)` after string substitution. It matches all role entries that have a
   * member attribute equal to `uid=janedoe` under the subtree selected by the `RoleBases` .
   */
  public fun roleSearchMatching(roleSearchMatching: String) {
    cdkBuilder.roleSearchMatching(roleSearchMatching)
  }

  /**
   * @param roleSearchSubtree The directory search scope for the role.
   * If set to true, scope is to search the entire subtree.
   */
  public fun roleSearchSubtree(roleSearchSubtree: Boolean) {
    cdkBuilder.roleSearchSubtree(roleSearchSubtree)
  }

  /**
   * @param roleSearchSubtree The directory search scope for the role.
   * If set to true, scope is to search the entire subtree.
   */
  public fun roleSearchSubtree(roleSearchSubtree: IResolvable) {
    cdkBuilder.roleSearchSubtree(roleSearchSubtree)
  }

  /**
   * @param serviceAccountPassword Service account password. 
   * A service account is an account in your LDAP server that has access to initiate a connection.
   * For example, `cn=admin` , `dc=corp` , `dc=example` , `dc=com` .
   */
  public fun serviceAccountPassword(serviceAccountPassword: String) {
    cdkBuilder.serviceAccountPassword(serviceAccountPassword)
  }

  /**
   * @param serviceAccountUsername Service account username. 
   * A service account is an account in your LDAP server that has access to initiate a connection.
   * For example, `cn=admin` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
   */
  public fun serviceAccountUsername(serviceAccountUsername: String) {
    cdkBuilder.serviceAccountUsername(serviceAccountUsername)
  }

  /**
   * @param userBase Select a particular subtree of the directory information tree (DIT) to search
   * for user entries. 
   * The subtree is specified by a DN, which specifies the base node of the subtree. For example, by
   * setting this option to `ou=Users` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` , the search
   * for user entries is restricted to the subtree beneath `ou=Users` , `ou=corp` , `dc=corp` ,
   * `dc=example` , `dc=com` .
   */
  public fun userBase(userBase: String) {
    cdkBuilder.userBase(userBase)
  }

  /**
   * @param userRoleName The name of the LDAP attribute in the user's directory entry for the user's
   * group membership.
   * In some cases, user roles may be identified by the value of an attribute in the user's
   * directory entry. The `UserRoleName` option allows you to provide the name of this attribute.
   */
  public fun userRoleName(userRoleName: String) {
    cdkBuilder.userRoleName(userRoleName)
  }

  /**
   * @param userSearchMatching The LDAP search filter used to find users within the `userBase` . 
   * The client's username is substituted into the `{0}` placeholder in the search filter. For
   * example, if this option is set to `(uid={0})` and the received username is `janedoe` , the search
   * filter becomes `(uid=janedoe)` after string substitution. It will result in matching an entry like
   * `uid=janedoe` , `ou=Users` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
   */
  public fun userSearchMatching(userSearchMatching: String) {
    cdkBuilder.userSearchMatching(userSearchMatching)
  }

  /**
   * @param userSearchSubtree The directory search scope for the user.
   * If set to true, scope is to search the entire subtree.
   */
  public fun userSearchSubtree(userSearchSubtree: Boolean) {
    cdkBuilder.userSearchSubtree(userSearchSubtree)
  }

  /**
   * @param userSearchSubtree The directory search scope for the user.
   * If set to true, scope is to search the entire subtree.
   */
  public fun userSearchSubtree(userSearchSubtree: IResolvable) {
    cdkBuilder.userSearchSubtree(userSearchSubtree)
  }

  public fun build(): CfnBroker.LdapServerMetadataProperty {
    if(_hosts.isNotEmpty()) cdkBuilder.hosts(_hosts)
    return cdkBuilder.build()
  }
}
