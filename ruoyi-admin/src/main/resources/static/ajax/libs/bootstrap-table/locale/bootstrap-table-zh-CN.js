/**
 * Bootstrap Table Chinese translation
 * Author: Zhixin Wen<wenzhixin2010@gmail.com>
 */
$.fn.bootstrapTable.locales['zh-CN'] = {
  formatShowSearch: function formatShowSearch() {
    return 'Hide/Show search';
  },
  formatPageGo: function formatPageGo() {
    return 'Jump';
  },
  formatCopyRows: function formatCopyRows() {
    return 'Copy the row';
  },
  formatPrint: function formatPrint() {
    return 'Print';
  },
  formatLoadingMessage: function formatLoadingMessage() {
    return 'Work is underway to load the data later';
  },
  formatRecordsPerPage: function formatRecordsPerPage(pageNumber) {
    return "Each page displays ".concat(pageNumber, " records");
  },
  formatShowingRows: function formatShowingRows(pageFrom, pageTo, totalRows, totalNotFiltered) {
    if (totalNotFiltered !== undefined && totalNotFiltered > 0 && totalNotFiltered > totalRows) {
      return "Displays ".concat(pageFrom, " to ").concat(pageTo, " records，in total ").concat(totalRows, " records（Filter from ").concat(totalNotFiltered, " the total records）");
    }
    return "Displays ".concat(pageFrom, " to ").concat(pageTo, " records，in total ").concat(totalRows, " records");
  },
  formatSRPaginationPreText: function formatSRPaginationPreText() {
    return 'Previous';
  },
  formatSRPaginationPageText: function formatSRPaginationPageText(page) {
    return "".concat(page, "");
  },
  formatSRPaginationNextText: function formatSRPaginationNextText() {
    return 'Next';
  },
  formatDetailPagination: function formatDetailPagination(totalRows) {
    return "In total ".concat(totalRows, " records");
  },
  formatClearSearch: function formatClearSearch() {
    return 'Clear';
  },
  formatSearch: function formatSearch() {
    return 'Search';
  },
  formatNoMatches: function formatNoMatches() {
    return 'No matching records were found';
  },
  formatPaginationSwitch: function formatPaginationSwitch() {
    return 'Hide/Show pagination';
  },
  formatPaginationSwitchDown: function formatPaginationSwitchDown() {
    return 'Show pagination';
  },
  formatPaginationSwitchUp: function formatPaginationSwitchUp() {
    return 'Hide pagination';
  },
  formatRefresh: function formatRefresh() {
    return 'Refresh';
  },
  formatToggle: function formatToggle() {
    return 'Switch';
  },
  formatToggleOn: function formatToggleOn() {
    return 'Show the card view';
  },
  formatToggleOff: function formatToggleOff() {
    return 'Hide the card view';
  },
  formatColumns: function formatColumns() {
    return 'Column';
  },
  formatColumnsToggleAll: function formatColumnsToggleAll() {
    return 'Toggle all';
  },
  formatFullscreen: function formatFullscreen() {
    return 'Full screen';
  },
  formatAllRows: function formatAllRows() {
    return 'All';
  },
  formatAutoRefresh: function formatAutoRefresh() {
    return 'Auto refresh';
  },
  formatExport: function formatExport() {
    return 'Export data';
  },
  formatJumpTo: function formatJumpTo() {
    return 'Jump';
  },
  formatAdvancedSearch: function formatAdvancedSearch() {
    return 'Advanced search';
  },
  formatAdvancedCloseButton: function formatAdvancedCloseButton() {
    return 'Close';
  },
  formatFilterControlSwitch: function formatFilterControlSwitch() {
    return 'Hide/Show filter';
  },
  formatFilterControlSwitchHide: function formatFilterControlSwitchHide() {
    return 'Hide filter';
  },
  formatFilterControlSwitchShow: function formatFilterControlSwitchShow() {
    return 'Show filter';
  }
};
$.extend($.fn.bootstrapTable.defaults, $.fn.bootstrapTable.locales['zh-CN']);
