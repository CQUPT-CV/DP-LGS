-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('upload', '2000', '1', '/platform/upload', 'C', '0', 'platform:upload:view', '#', 'admin', sysdate(), '', null, 'upload菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('upload查询', @parentId, '1',  '#',  'F', '0', 'platform:upload:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('upload新增', @parentId, '2',  '#',  'F', '0', 'platform:upload:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('upload修改', @parentId, '3',  '#',  'F', '0', 'platform:upload:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('upload删除', @parentId, '4',  '#',  'F', '0', 'platform:upload:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('upload导出', @parentId, '5',  '#',  'F', '0', 'platform:upload:export',       '#', 'admin', sysdate(), '', null, '');
